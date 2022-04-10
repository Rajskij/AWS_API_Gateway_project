/**

*/
package haidukov.aws.apig.product.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import haidukov.aws.apig.product.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PatchUpdateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PatchUpdateRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PatchUpdateRequestMarshaller instance = new PatchUpdateRequestMarshaller();

    public static PatchUpdateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PatchUpdateRequest patchUpdateRequest, ProtocolMarshaller protocolMarshaller) {

        if (patchUpdateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(patchUpdateRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(patchUpdateRequest.getProduct(), PRODUCT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
