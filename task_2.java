@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("Ожидалось, что персона не будет взрослой, когда возраст меньше 18, но метод isAdult() вернул true.", false, isAdult);
}

@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Ожидалось, что персона будет взрослой, когда возраст точно равен 18, но метод isAdult() вернул false.", true, isAdult);
}