package study.datajpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 상속 관계를 만들어줌. 이 어노테이션이 붙지 않으면 가짜 상속관계가 만들어짐.
public class JpaBaseEntity {
    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @PrePersist // Persist하기 전에 발생하는 이벤트
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = now;
        updatedDate = now;
    }

    @PreUpdate // update될 때 발생하는 이벤트
    public void preUpdate() {
        updatedDate = LocalDateTime.now();
    }
}
