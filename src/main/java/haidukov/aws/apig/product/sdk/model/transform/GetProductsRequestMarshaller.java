/**

*/
package haidukov.aws.apig.product.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import haidukov.aws.apig.product.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetProductsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetProductsRequestMarshaller {

    private static final GetProductsRequestMarshaller instance = new GetProductsRequestMarshaller();

    public static GetProductsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetProductsRequest getProductsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getProductsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
