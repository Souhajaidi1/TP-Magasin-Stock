package tn.esprit.pidev.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String country;
    private String gouvernment;
    private boolean etat;
    private int phone;
    private boolean disponibilite;
    @Enumerated(EnumType.STRING)
    private Role role ;


    //@Transient
    @ManyToMany
    @JoinTable(
            name = "Orderc",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "idProduct"))
    private List <Product> productListOrder;


    @ManyToMany
    @JoinTable(
            name = "Cart",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "idProduct"))
    private List <Product> productListCart;


    @OneToMany(mappedBy = "userPost")
    private List<Post>posts;

     @OneToMany(mappedBy = "userComment")
     List<CommentPost>commentList;


    @OneToMany(mappedBy = "user")
    private List<Delivery>deliveryList;


    @OneToMany(mappedBy = "userclaim")
    private List<Claim> claimList;

    @OneToMany(mappedBy = "userRating")
    private List<RatingProduct> ratingProductList;


    @OneToMany(mappedBy = "userProduct")
    private List<Product> productListUser;

    
}
