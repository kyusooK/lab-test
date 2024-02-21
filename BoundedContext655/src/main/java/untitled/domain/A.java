package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext655Application;
import untitled.domain.E;

@Entity
@Table(name = "A_table")
@Data
//<<< DDD / Aggregate Root
public class A {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        E e = new E(this);
        e.publishAfterCommit();
    }

    public static ARepository repository() {
        ARepository aRepository = BoundedContext655Application.applicationContext.getBean(
            ARepository.class
        );
        return aRepository;
    }
}
//>>> DDD / Aggregate Root
