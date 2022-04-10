/**

*/
package haidukov.aws.apig.product.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import haidukov.aws.apig.product.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PatchUpdateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchUpdateResultJsonUnmarshaller implements Unmarshaller<PatchUpdateResult, JsonUnmarshallerContext> {

    public PatchUpdateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PatchUpdateResult patchUpdateResult = new PatchUpdateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return patchUpdateResult;
        }

        while (true) {
            if (token == null)
                break;

            patchUpdateResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return patchUpdateResult;
    }

    private static PatchUpdateResultJsonUnmarshaller instance;

    public static PatchUpdateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchUpdateResultJsonUnmarshaller();
        return instance;
    }
}
