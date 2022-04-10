/**

*/
package haidukov.aws.apig.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProduct" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

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

    public GetProductResult product(Product product) {
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

        if (obj instanceof GetProductResult == false)
            return false;
        GetProductResult other = (GetProductResult) obj;
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
    public GetProductResult clone() {
        try {
            return (GetProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
