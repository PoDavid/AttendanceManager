package church.morningclass.attendancemanager.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Roles {
    UNKNOWN(0),
    TEACHER(1),
    STUDENT(2);

    private int value;
}
