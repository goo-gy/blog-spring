package googy.blogspring.domain;

import javax.persistence.*;

@Entity
public class Posting extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Member owner;
}
