package naver.tpdms0159.ecsspring;

import java.util.ArrayList; import java.util.HashMap; import java.util.List; import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RestController;
@RestController
public class FrontController {
    @GetMapping("/")
    public Map<String, Object> uploadFile() {
        Map<String, Object>data = new HashMap<String, Object>(); data.put("result", "success");
        @SuppressWarnings("rawtypes")
        List <Map> list = new ArrayList<Map>();
        Map<String, String> map1 = new HashMap<>(); map1.put("id", "itstudy");
        map1.put("name", "군계");
        Map<String, String> map2 = new HashMap<>(); map2.put("id", "itggangpae");
        map2.put("name", "아담");
        list.add(map1); list.add(map2);
        data.put("data", list);
        return data; }
}