import com.amazonaws.services.lambda.runtime.Context;

/**
 * Simple Lambda AWS function that recevices string arg and returns string
 */
public final class App {
    public static String handleRequest(String arg, Context context) {
        return arg;
    }

}

