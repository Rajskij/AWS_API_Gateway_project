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
 * GetProductsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductsResultJsonUnmarshaller implements Unmarshaller<GetProductsResult, JsonUnmarshallerContext> {

    public GetProductsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProductsResult getProductsResult = new GetProductsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProductsResult;
        }

        while (true) {
            if (token == null)
                break;

            getProductsResult.setProducts(new ListUnmarshaller<ProductsElement>(ProductsElementJsonUnmarshaller.getInstance()).unmarshall(context));
            token = context.nextToken();
        }

        return getProductsResult;
    }

    private static GetProductsResultJsonUnmarshaller instance;

    public static GetProductsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProductsResultJsonUnmarshaller();
        return instance;
    }
}
