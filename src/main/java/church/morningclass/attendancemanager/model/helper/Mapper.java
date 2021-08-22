package church.morningclass.attendancemanager.model.helper;

import church.morningclass.attendancemanager.model.dto.UserDTO;
import church.morningclass.attendancemanager.model.entity.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mapper {
    public User mapUserDTO (UserDTO userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setSex(userDto.getSex());
        user.setPhoneNum(userDto.getPhoneNum());
        user.setEmailAddress(userDto.getEmailAddress());
        user.setRoles(userDto.getRoles());
        return user;
    }
}
