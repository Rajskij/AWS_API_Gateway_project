/**

*/
package haidukov.aws.apig.product.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import haidukov.aws.apig.product.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProductMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> PICTUREURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("picture_url").build();
    private static final MarshallingInfo<String> PRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("price").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("product_name").build();

    private static final ProductMarshaller instance = new ProductMarshaller();

    public static ProductMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Product product, ProtocolMarshaller protocolMarshaller) {

        if (product == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(product.getId(), ID_BINDING);
            protocolMarshaller.marshall(product.getPictureUrl(), PICTUREURL_BINDING);
            protocolMarshaller.marshall(product.getPrice(), PRICE_BINDING);
            protocolMarshaller.marshall(product.getProductName(), PRODUCTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
