package Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@AllArgsConstructor
public class GetModel {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    @JsonManagedReference
    List<User> data = new ArrayList<>();
    Map<String, Object> support = new HashMap<>();

    @Data
    @SuperBuilder
    @AllArgsConstructor
    public static class User{
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;
        @JsonBackReference
        private GetModel getModel;

        public User() {
        }
    }

    @Data
    @SuperBuilder
    @AllArgsConstructor
    public static class Support{
        private String url;
        private String text;
        @JsonBackReference
        private GetModel getModel;

        public Support() {
        }
    }

    public GetModel() {
    }
}
