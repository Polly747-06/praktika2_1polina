package zadanie1;

public class Author {

    public Author() {
    }

    public Author(String polly, String s, char f) {
    }

    public static void main(String[] args) {
        Author author1 = new Author("Polly", "polinakuznetcova198@gmail.com", 'f');
        Author author2 = new Author("Enny", "enny@mail.ru", 'f');
        Author author3 = new Author("Nike", "nike228@ya.ru", 'm');

        System.out.println(author3);
        author1.out();
        author2.out();
        author3.out();
        System.out.println();
    }

    private void out() {
    }
}

