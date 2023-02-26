package googy.blogspring.domain;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Member owner;

    @ManyToOne
    @JoinColumn(name = "posting_id", nullable = false)
    private Posting posting;
}
