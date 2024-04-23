@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	// Инициализируй поля класса в конструкторе
      this.age = age;
      this.result = result;
  }

@Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        {17, false}, // Заполни массив тестовыми данными и ожидаемым результатом
        {18, true}, // Заполни массив тестовыми данными и ожидаемым результатом
        {19, true}, // Заполни массив тестовыми данными и ожидаемым результатом
        {21, true}, // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	int age = 36; // Передай сюда возраст пользователя
    boolean result = true;  
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст пользователя " + age + " лет. Ожидалось, что он будет взрослым.",result, isAdult);
	}
}