/**
 * Interface for the poll observers
 * @author Evan Scales
 */
import java.util.HashMap;
public interface Observer {
    public void update(HashMap<String, Integer> votes);
}
