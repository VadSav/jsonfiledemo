import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
           mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);

       Person person= mapper.readValue( new File("person.json"),Person.class);
        System.out.println(person);

    }
}
