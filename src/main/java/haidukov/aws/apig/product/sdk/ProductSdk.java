/**

*/
package haidukov.aws.apig.product.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import haidukov.aws.apig.product.sdk.model.*;

/**
 * Interface for accessing ProductSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ProductSdk {

    /**
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @sample ProductSdk.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/DeleteProduct"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest);

    /**
     * @param getProductRequest
     * @return Result of the GetProduct operation returned by the service.
     * @sample ProductSdk.GetProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProduct"
     *      target="_top">AWS API Documentation</a>
     */
    GetProductResult getProduct(GetProductRequest getProductRequest);

    /**
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @sample ProductSdk.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProducts"
     *      target="_top">AWS API Documentation</a>
     */
    GetProductsResult getProducts(GetProductsRequest getProductsRequest);

    /**
     * @param patchUpdateRequest
     * @return Result of the PatchUpdate operation returned by the service.
     * @sample ProductSdk.PatchUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/PatchUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    PatchUpdateResult patchUpdate(PatchUpdateRequest patchUpdateRequest);

    /**
     * @param putUploadRequest
     * @return Result of the PutUpload operation returned by the service.
     * @sample ProductSdk.PutUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/PutUpload" target="_top">AWS
     *      API Documentation</a>
     */
    PutUploadResult putUpload(PutUploadRequest putUploadRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ProductSdkClientBuilder builder() {
        return new ProductSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
