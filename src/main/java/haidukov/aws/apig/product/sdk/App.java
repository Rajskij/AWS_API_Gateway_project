package haidukov.aws.apig.product.sdk;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import haidukov.aws.apig.product.sdk.model.*;

import java.util.List;

public class App {
    ProductSdk sdkClient;

    public App() {
        initSdk();
    }

    private void initSdk() {
        sdkClient = ProductSdk.builder()
                .connectionConfiguration(
                        new ConnectionConfiguration()
                                .maxConnections(100)
                                .connectionMaxIdleMillis(1000))
                .build();

    }

    public void shutdown() {
        sdkClient.shutdown();
    }

    public Product getProductById(String id) {
        GetProductResult result = sdkClient.getProduct(new GetProductRequest().id(id));
        return result.getProduct();
    }

    public List<ProductsElement> getProducts() {
        GetProductsResult result = sdkClient.getProducts(new GetProductsRequest());
        return result.getProducts();
    }

    public boolean saveProduct(Product product) {
        boolean result = true;

        try {
            sdkClient.putUpload(new PutUploadRequest().product(product));
        } catch (ProductSdkException e) {
            result = false;
        }
        return result;
    }

    public boolean updateProduct(String id, Product product) {
        boolean result = true;

        try {
            sdkClient.patchUpdate(new PatchUpdateRequest().id(id).product(product));
        } catch (ProductSdkException e) {
            result = false;
        }
        return result;
    }

    public boolean deleteProduct(String id) {
        boolean result = true;

        try {
            sdkClient.deleteProduct(new DeleteProductRequest().id(id));
        } catch (ProductSdkException e) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        App app = new App();
        Product product = new Product().id("3").productName("Xiaomi").pictureUrl("https://xiaomi.com").price("359");

        // Get product by id
        System.out.println("Get product:\n" + app.getProductById("1"));

        // Get all products
        System.out.println("\nGet product list:");
        List<ProductsElement> products = app.getProducts();

        for (ProductsElement p : products) {
            System.out.println(p);
        }

        // Save product
        System.out.println("\nNew product:\n" + product
                + "\nSave product result: " + app.saveProduct(product));

        // Update product by id
        product.productName("Motorola").pictureUrl("https://motorola.mobile.com").price("499");
        System.out.println("\nUpdated product:\n" + product
                + "\nUpdate product result: " + app.updateProduct("3", product));

        // Delete product
        System.out.println("\nDelete product:\n" + product
                + "\nDelete product result: " + app.deleteProduct("3"));
    }
}
