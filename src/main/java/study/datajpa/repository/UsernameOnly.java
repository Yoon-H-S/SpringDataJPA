package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {
    @Value("#{target.username + ' ' + target.age}") // 이렇게 지정해주면 username과 age를 합쳐서 저장해줌.
    String getUsername();
}
