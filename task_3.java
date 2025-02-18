import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized; 
import static org.junit.Assert.assertEquals;
// Напиши аннотацию для параметризованных тестов

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result; // Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        {21, true},
        {20, true},
        
		{18, true},
        {17, false},
        
     
         // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }


  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
     // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
     assertEquals("Должно вернуться true, так как пользователь совершеннолетний", result, isAdult);
	}
}