package googy.blogspring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class KakaoMember extends Member {
    @NotNull
    @Column(unique = true)
    private String kakaoToken;
}