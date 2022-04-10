/**

*/
package haidukov.aws.apig.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/PutUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutUploadRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Product product;

    /**
     * @param product
     */

    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return
     */

    public Product getProduct() {
        return this.product;
    }

    /**
     * @param product
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUploadRequest product(Product product) {
        setProduct(product);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutUploadRequest == false)
            return false;
        PutUploadRequest other = (PutUploadRequest) obj;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        return hashCode;
    }

    @Override
    public PutUploadRequest clone() {
        return (PutUploadRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PutUploadRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
