package co.medellin.eventos.dto;

public class UserSummary {
    private Long id;
    private String name;
    private String username;
    private String email;
    private String role;

    public UserSummary() {}
    public UserSummary(Long id, String name, String username, String email, String role) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
