import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.S3Event;

/**
 * Simple Lambda funtion that receives S3Event
 */
public final class App2 {
    public static String handleRequest(S3Event event, Context context) {
        System.out.println("event received");
        return "";
    }
}