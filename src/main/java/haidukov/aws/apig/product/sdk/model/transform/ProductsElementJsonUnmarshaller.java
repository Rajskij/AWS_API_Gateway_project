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
 * ProductsElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductsElementJsonUnmarshaller implements Unmarshaller<ProductsElement, JsonUnmarshallerContext> {

    public ProductsElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProductsElement productsElement = new ProductsElement();

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
                    productsElement.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("picture_url", targetDepth)) {
                    context.nextToken();
                    productsElement.setPictureUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    productsElement.setPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("product_name", targetDepth)) {
                    context.nextToken();
                    productsElement.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return productsElement;
    }

    private static ProductsElementJsonUnmarshaller instance;

    public static ProductsElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductsElementJsonUnmarshaller();
        return instance;
    }
}
