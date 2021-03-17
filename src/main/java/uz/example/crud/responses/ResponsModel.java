package uz.example.crud.responses;

import lombok.Data;
import uz.example.crud.entities.User;

@Data
public class ResponsModel {
    String message;
    Object object;

    public ResponsModel(String message, Object object) {
    }
}
