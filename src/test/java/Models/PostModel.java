package Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PostModel {
    private String name;
    private String job;
    private int id;
    private Date createdAt;

    public PostModel() {
    }
}
