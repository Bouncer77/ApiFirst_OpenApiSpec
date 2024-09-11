package pro.kosenkov.open_api_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weapon {

    private String name;
    private String description;
    private int maxBullet;
}
