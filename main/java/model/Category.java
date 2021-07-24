package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @CreationTimestamp
    @JoinColumn(name="createdAt")
    private LocalDateTime createdAT;

    @UpdateTimestamp
    @JoinColumn(name = "updateAT")
    private LocalDateTime updateAT;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
