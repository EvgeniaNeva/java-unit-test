@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Пользователю 18 лет или больше", true, isAdult);
	// Напиши код здесь
}