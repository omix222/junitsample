package hiromitest.sample;

import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsIncludedIn extends BaseMatcher<Status> {

    private final List<Status> statuses;
    private Object actual;

    public IsIncludedIn(List<Status> statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean matches(Object actual) {
        this.actual = actual;
        if(!(actual instanceof Status)) {
            return false;
        }
        for(Status status : this.statuses) {
            if(status == actual) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void describeTo(Description description) {
        if(this.actual != null) {
            description.appendValue(this.actual);
            description.appendText(" is not included in ");
        }
        description.appendValueList("[ ", ", ", " ]", statuses);
    }

    public static Matcher<Status> includedIn(List<Status> statuses) {
        return new IsIncludedIn(statuses);
    }
}