package church.morningclass.attendancemanager.controller;

import java.net.URI;
import java.util.Optional;

import church.morningclass.attendancemanager.model.dto.UserDTO;
import church.morningclass.attendancemanager.model.entity.User;
import church.morningclass.attendancemanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/user")
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        return "Hello";
    }

    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        Optional<User> user = userService.getUser(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity<Iterable<User>> getUsers() {
        Iterable<User> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<User> createUser(@RequestBody UserDTO request) {
        User user = userService.createUser(request);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).body(user);

    }


}
