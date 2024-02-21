package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext1203Application;

@Entity
@Table(name = "Agg_table")
@Data
//<<< DDD / Aggregate Root
public class Agg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static AggRepository repository() {
        AggRepository aggRepository = BoundedContext1203Application.applicationContext.getBean(
            AggRepository.class
        );
        return aggRepository;
    }
}
//>>> DDD / Aggregate Root
