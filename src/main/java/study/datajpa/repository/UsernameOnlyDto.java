package study.datajpa.repository;

public class UsernameOnlyDto {
    private final String username;

    public UsernameOnlyDto(String username) { // 생성자의 이름으로 Projections 매칭
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
