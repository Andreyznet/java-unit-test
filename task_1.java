@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    assertEquals("Ожидалось, что персона будет взрослой (adult), когда возраст больше 18, но метод isAdult() вернул false.", true, isAdult);
}