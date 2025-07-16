package 과제5연습.ProductController;

import 과제5연습.Model.ProductDao.ProductDao;
import 과제5연습.Model.ProductDto.ProductDto;

import java.util.ArrayList;

public class ProductController {
    private ProductController(){ }
    private static final ProductController productController = new ProductController();
    public static ProductController getInstance(){
        return productController;
    }

    private ProductDao productDao = ProductDao.getInstance();

    public boolean addProduct(String titile , String productName , int price ){
        boolean result = false;
        result = productDao.addProduct(titile , productName , price);
        return result;
    }

    public ArrayList<ProductDto> productDtoArrayList(){
        return productDao.getProductDtos();
    }
}
