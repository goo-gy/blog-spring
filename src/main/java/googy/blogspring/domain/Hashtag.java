package googy.blogspring.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Hashtag extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull
    private String word;
}
