package dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Product;

@Data
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String title;

    public CategoryDto(Product product){
        this.id = product.getCategory().getId();
        this.title = product.getCategory().getTitle();
    }
}
