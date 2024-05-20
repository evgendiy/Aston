package postRD;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {

    private Data data;
    private Headers headers;
    private Data json;
    private String url;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data{
        private String foo1;
        private String foo2;
    }
}
