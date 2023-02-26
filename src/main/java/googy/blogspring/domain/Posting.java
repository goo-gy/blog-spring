package googy.blogspring.domain;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "posting")
    private List<PostingHashtag> taggingList;

    @OneToMany(mappedBy = "posting")
    private List<Comment> commentList;
}
