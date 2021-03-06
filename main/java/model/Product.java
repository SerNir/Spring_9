package model;



import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @CreationTimestamp
    @JoinColumn(name="createdAt")
    private LocalDateTime createdAT;

    @UpdateTimestamp
    @JoinColumn(name = "updateAT")
    private LocalDateTime updateAT;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
