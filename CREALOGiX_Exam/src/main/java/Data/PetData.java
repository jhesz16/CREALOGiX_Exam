package Data;

import POJO.Category;
import POJO.Pet;
import POJO.Tag;

import java.util.ArrayList;

public class PetData {

    public ArrayList<String> photoUrls = new ArrayList<>();
    public Category category;
    public ArrayList<Tag> tags = new ArrayList<>();
    public String status;
    public int id = 11;

    public Pet genericPet() {
        setStatus("available");
        photoUrls.add("test");
        category = new Category(id, "test");
        tags.add(new Tag(id, "test"));

        return new Pet(photoUrls, "Test_Dog", id, category, tags, status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
