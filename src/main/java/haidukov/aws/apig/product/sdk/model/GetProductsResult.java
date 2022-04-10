/**

*/
package haidukov.aws.apig.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/GetProducts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductsResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private java.util.List<ProductsElement> products;

    /**
     * @return
     */

    public java.util.List<ProductsElement> getProducts() {
        return products;
    }

    /**
     * @param products
     */

    public void setProducts(java.util.Collection<ProductsElement> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new java.util.ArrayList<ProductsElement>(products);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProducts(java.util.Collection)} or {@link #withProducts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param products
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult products(ProductsElement... products) {
        if (this.products == null) {
            setProducts(new java.util.ArrayList<ProductsElement>(products.length));
        }
        for (ProductsElement ele : products) {
            this.products.add(ele);
        }
        return this;
    }

    /**
     * @param products
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductsResult products(java.util.Collection<ProductsElement> products) {
        setProducts(products);
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
        if (getProducts() != null)
            sb.append("Products: ").append(getProducts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProductsResult == false)
            return false;
        GetProductsResult other = (GetProductsResult) obj;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        return hashCode;
    }

    @Override
    public GetProductsResult clone() {
        try {
            return (GetProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
