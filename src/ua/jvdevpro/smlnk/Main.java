package ua.jvdevpro.smlnk;

public class Main {

    public static void main(String[] args) {

        // Создание обычной переменной класса и работа с ней.

        ByteSequence bs = new ByteSequence();
        bs.addStringToSequence("Hello");
        bs.addStringToSequence(" World");
        String text = bs.getString();
        System.out.println(text);

        ByteSequence bsAnonimus = new ByteSequence() {
            @Override
            public String getString() {
                return super.getString().substring(0, super.getString().length() / 2);
            }
        };

        // Использование объекта анонимного класса. Предположим, нам нужно создать один экземпляр класса ByteSequence,
        // который возвращал бы только половину строки. Для этого можно использовать анонимный класс.

        bsAnonimus.addStringToSequence("Hello");
        bsAnonimus.addStringToSequence(" World");
        String textOne = bsAnonimus.getString();
        System.out.println(textOne);
    }
}
