package Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PatchModel {
    private String name;
    private String job;
    private Date updatedAt;

    public PatchModel() {
    }
}
