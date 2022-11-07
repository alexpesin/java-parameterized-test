package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

// Напиши аннотацию для параметризованных тестов
@RunWith(Parameterized.class)
public class ProgramTest{

    private final int age;
    private final boolean result;

    public ProgramTest(int age, boolean result){
        // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    // Пометь метод аннотацией для параметров
    @Parameterized.Parameters
    public static Object[][] getTextData(){
        return new Object[][]{
                // Заполни массив тестовыми данными и ожидаемым результатом
                {0, false},
                {17, false},
                {18, true},
                {19, true},
                {20, true},
                {21, true},
                {22, true},

        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult(){
        //Program program = new Program();
        // Передай сюда возраст пользователя

        //boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Совершеннолетний должен быть старше 18", result, new Program().checkIsAdult(age));
    }
}