/**

*/
package haidukov.aws.apig.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ze7yzjj9y2-2022-03-30T15:52:53Z/__ProductsElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductsElement implements Serializable, Cloneable, StructuredPojo {

    private String id;

    private String pictureUrl;

    private String price;

    private String productName;

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductsElement id(String id) {
        setId(id);
        return this;
    }

    /**
     * @param pictureUrl
     */

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * @return
     */

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @param pictureUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductsElement pictureUrl(String pictureUrl) {
        setPictureUrl(pictureUrl);
        return this;
    }

    /**
     * @param price
     */

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return
     */

    public String getPrice() {
        return this.price;
    }

    /**
     * @param price
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductsElement price(String price) {
        setPrice(price);
        return this;
    }

    /**
     * @param productName
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * @param productName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductsElement productName(String productName) {
        setProductName(productName);
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
        sb.append("[");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPictureUrl() != null)
            sb.append("PictureUrl: ").append(getPictureUrl()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName());
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductsElement == false)
            return false;
        ProductsElement other = (ProductsElement) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPictureUrl() == null ^ this.getPictureUrl() == null)
            return false;
        if (other.getPictureUrl() != null && other.getPictureUrl().equals(this.getPictureUrl()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPictureUrl() == null) ? 0 : getPictureUrl().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        return hashCode;
    }

    @Override
    public ProductsElement clone() {
        try {
            return (ProductsElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        haidukov.aws.apig.product.sdk.model.transform.ProductsElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
