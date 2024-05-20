package post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Map;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {

    private Map<String, Object> args;
    private Data data;
    private Map<String, Object> files;
    private Map<String, Object> form;
    private Headers headers;
    private Object json;
    private String url;

    @Getter
    @Setter
    public static class Data{
        private String test;
    }
}
