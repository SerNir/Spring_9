package service;

import lombok.RequiredArgsConstructor;
import model.Category;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }

    public Category findByTitle(String categoryTitle) {
        return categoryRepository.findByTitle(categoryTitle);
    }
}
