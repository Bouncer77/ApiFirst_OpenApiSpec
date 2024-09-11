package pro.kosenkov.open_api_generator.controller.v1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.open_api_generator.entity.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/weapons")
@AllArgsConstructor
public class WeaponController {

    private static final Map<Long, Weapon> weaponMap = new HashMap<>() {{
        put(1L, new Weapon("MR-133", "Гладкоствольное помповое ружье", 8));
        put(2L, new Weapon("MR-155", "Гладкоствольное полуавтоматическое ружье", 8));
        put(3L, new Weapon("MP5", "Нарезной карабин пистолетного калибра", 30));
    }};

    @GetMapping
    public List<Weapon> getWeapons() {
        return new ArrayList<>(weaponMap.values());
    }
}
