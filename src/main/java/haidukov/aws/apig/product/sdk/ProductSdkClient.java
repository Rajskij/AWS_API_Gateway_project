/**

*/
package haidukov.aws.apig.product.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import haidukov.aws.apig.product.sdk.model.*;
import haidukov.aws.apig.product.sdk.model.transform.*;

/**
 * Client for accessing ProductSdk. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ProductSdkClient implements ProductSdk {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(haidukov.aws.apig.product.sdk.model.ProductSdkException.class));

    /**
     * Constructs a new client to invoke service methods on ProductSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    ProductSdkClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @sample ProductSdk.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/DeleteProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest) {
        HttpResponseHandler<DeleteProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new DeleteProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteProductRequest, DeleteProductResult>()
                .withMarshaller(new DeleteProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteProductRequest));
    }

    /**
     * @param getProductRequest
     * @return Result of the GetProduct operation returned by the service.
     * @sample ProductSdk.GetProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProductResult getProduct(GetProductRequest getProductRequest) {
        HttpResponseHandler<GetProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetProductRequest, GetProductResult>()
                .withMarshaller(new GetProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getProductRequest));
    }

    /**
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @sample ProductSdk.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProducts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProductsResult getProducts(GetProductsRequest getProductsRequest) {
        HttpResponseHandler<GetProductsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetProductsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetProductsRequest, GetProductsResult>()
                .withMarshaller(new GetProductsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getProductsRequest));
    }

    /**
     * @param patchUpdateRequest
     * @return Result of the PatchUpdate operation returned by the service.
     * @sample ProductSdk.PatchUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/PatchUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PatchUpdateResult patchUpdate(PatchUpdateRequest patchUpdateRequest) {
        HttpResponseHandler<PatchUpdateResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PatchUpdateResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PatchUpdateRequest, PatchUpdateResult>()
                .withMarshaller(new PatchUpdateRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(patchUpdateRequest));
    }

    /**
     * @param putUploadRequest
     * @return Result of the PutUpload operation returned by the service.
     * @sample ProductSdk.PutUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/PutUpload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutUploadResult putUpload(PutUploadRequest putUploadRequest) {
        HttpResponseHandler<PutUploadResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutUploadResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutUploadRequest, PutUploadResult>()
                .withMarshaller(new PutUploadRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putUploadRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
