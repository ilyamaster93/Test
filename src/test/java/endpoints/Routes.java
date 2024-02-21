package endpoints;

/*
https://reqres.in/

Get list of users (GET) -> https://reqres.in/api/users?page=2
Create a user (POST) -> https://reqres.in/api/users
Update user (PUT) -> https://reqres.in/api/users/2
Update user (PATCH) -> https://reqres.in/api/users/2
Remove user (DELETE) -> https://reqres.in/api/users/2
*/

public class Routes {
    public static String base_url = "https://reqres.in";

    public static String get_url = base_url + "/api/users?page=2";

    public static String post_url = base_url + "/api/users";

    public static String put_patch_delete_url = base_url + "/api/users/2";

}
