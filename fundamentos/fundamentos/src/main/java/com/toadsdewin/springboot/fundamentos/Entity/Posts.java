package com.toadsdewin.springboot.fundamentos.Entity;
import javax.persistence.*;

@Entity
@Table (name = "post")
public class Posts
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @ManyToOne
    private User user;

    public Posts()
    {}

    public Posts(String description, User user) {
        this.description = description;
        this.user = user;
    }
}
