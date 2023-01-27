package stepdefinitions.api;

import io.cucumber.java.DataTableType;
import pojos.GenericResponse;
import pojos.Pet;
import pojos.Store;
import pojos.User;

import java.util.Map;

public class DataTableTypes {

    @DataTableType
    public Pet petEntry(Map<String, String> entry) {
        return new Pet(
                entry.get("id"),
                entry.get("name"),
                entry.get("status"));
    }

    @DataTableType
    public Store storeEntry(Map<String, String> entry) {
        return new Store(
                entry.get("id"),
                entry.get("petId"),
                entry.get("quantity"),
                entry.get("shipDate"),
                entry.get("status"),
                entry.get("complete"));
    }

    @DataTableType
    public User userEntry(Map<String, String> entry) {
        return new User(
                entry.get("id"),
                entry.get("username"),
                entry.get("firstName"),
                entry.get("lastName"),
                entry.get("email"),
                entry.get("password"),
                entry.get("phone"),
                entry.get("userStatus"));
    }

    @DataTableType
    public GenericResponse genericResponseEntry(Map<String, String> entry) {
        return new GenericResponse(
                entry.get("code"),
                entry.get("type"),
                entry.get("message"));
    }
}