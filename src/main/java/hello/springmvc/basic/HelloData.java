package hello.springmvc.basic;

import lombok.Data;

@Data // Getter, Setter, toString 등등을 자동으로 만들어준다.
public class HelloData {
    private String username;
    private int age;
}
