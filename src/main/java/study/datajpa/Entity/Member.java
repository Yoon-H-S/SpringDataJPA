package study.datajpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String username;

    protected Member() { // JPA 표준 스펙에 Entity에는 기본 생성자가 있어야 한다. 외부 접근을 막기 위해 protected 선언
    }

    public Member(String username) {
        this.username = username;
    }
}
