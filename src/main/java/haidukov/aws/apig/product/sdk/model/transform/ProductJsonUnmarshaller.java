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
 * Product JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductJsonUnmarshaller implements Unmarshaller<Product, JsonUnmarshallerContext> {

    public Product unmarshall(JsonUnmarshallerContext context) throws Exception {
        Product product = new Product();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    product.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("picture_url", targetDepth)) {
                    context.nextToken();
                    product.setPictureUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    product.setPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("product_name", targetDepth)) {
                    context.nextToken();
                    product.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return product;
    }

    private static ProductJsonUnmarshaller instance;

    public static ProductJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductJsonUnmarshaller();
        return instance;
    }
}
