package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Ev extends AbstractEvent {

    private Long id;

    public Ev(Agg aggregate) {
        super(aggregate);
    }

    public Ev() {
        super();
    }
}
//>>> DDD / Domain Event
