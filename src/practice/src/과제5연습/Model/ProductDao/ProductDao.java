package 과제5연습.Model.ProductDao;

import 과제5연습.Model.ProductDto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao() { }
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance() {
        return instance;
    }
    private ArrayList<ProductDto> productDtos = new ArrayList<>();

    public boolean addProduct(String title, String productName, int price){
        boolean result = false;
        ProductDto productDto = new ProductDto(title , productName , price);
        productDtos.add(productDto);
        result = true;
        return true;
    }

    public ArrayList<ProductDto> getProductDtos(){
        return productDtos;
    }
}
