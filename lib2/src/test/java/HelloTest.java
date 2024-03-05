import com.gradle.sample.Lib2;
import org.junit.jupiter.api.Test;

public class HelloTest {

    private final Lib2 underTest = new Lib2();

    @Test
    void foo() {
        underTest.hello();
    }

}
