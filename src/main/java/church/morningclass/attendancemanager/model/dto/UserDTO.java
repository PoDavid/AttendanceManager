package church.morningclass.attendancemanager.model.dto;

import church.morningclass.attendancemanager.model.entity.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private String name;

    private String sex;

    private String phoneNum;

    private String emailAddress;

    private Roles roles;
}
