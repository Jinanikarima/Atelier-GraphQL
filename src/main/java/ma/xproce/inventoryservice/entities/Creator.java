package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String email;
    @OneToMany(mappedBy = "creator")
    private List<Video> videos;  //
}
