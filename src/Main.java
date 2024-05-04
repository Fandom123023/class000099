public class Main {
    public static void main(String[] args){
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Некрасов");

        Books book1 = new Books("Хаджи Мурад", author1, 1912);
        Books book2 = new Books("На Волге", author2, 1860);

        System.out.println("Информация о книге 1:");
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println("\nИнформация о книге 2:");
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());

        book1.setPublicationYear(1996);
        System.out.println("\nОбновлённый год публикации первой книги \"" + book1.getTitle() + "\": " + book1.getPublicationYear());




    }

}