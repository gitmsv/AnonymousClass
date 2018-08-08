package ua.jvdevpro.smlnk;


/**
 * Анонимный класс – это локальный класс без имени. Можно объявить анонимный (безымянный) класс, который может расширить
 * другой класс или реализовать (implements) интерфейс. Объявление  такого класса выполняется одновременно с созданием его
 * объекта посредством оператора new.
 * <p>
 * Анонимные классы обычно используются для реализации (переопределения) нескольких методов и создания собственных
 * методов объекта. Так же, когда локальный класс используется всего один раз, можно применить синтаксис анонимного класса,
 * который позволяет совместить определение и использование класса.
 * <p>
 * задача - принимать строки и хранить их в виде байтовой последовательности. Также есть возможность
 * вернуть накопленную строку.
 */

public class ByteSequence {

    private byte[] byteArray = new byte[0];
    private int n = 0;

    private void resize(int number) {
        this.n = byteArray.length;
        byte[] temp = new byte[this.byteArray.length + number];
        System.arraycopy(byteArray, 0, temp, 0, byteArray.length);
        byteArray = temp;
    }

    public void addStringToSequence(String text) {
        byte[] byteArrayFromString = text.getBytes();
        int number = byteArrayFromString.length;
        this.resize(number);
        System.arraycopy(byteArrayFromString, 0, byteArray, n, number);
    }

    public String getString() {
        String text = new String(this.byteArray);
        return text;
    }
}
