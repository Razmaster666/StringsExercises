public class Task6 {

//    Task 6 – org.w3c.dom.Text Block
//    Use this String and print it like this:
//
//    String html = "<html>\n"+
//            "\t<body>\n"+
//            "\t\t<h1>Book Store</h1>\n"+
//            "\t\t<ul>\n"+
//            "\t\t\t<li>The Iliad</li>\n"+
//            "\t\t</ul>\n"+
//            "\t</body>\n"+
//            "</html>\n";
//     System.out.println(html);
//
//    Now use a Text Block instead that creates the same output. You should be able to use the features
//    of multiline string and the indentation of the Text Block.


    public static void main(String[] args) {

        String html = "<html>\n"+
                "\t<body>\n"+
                "\t\t<h1>Book Store</h1>\n"+
                "\t\t<ul>\n"+
                "\t\t\t<li>The Iliad</li>\n"+
                "\t\t</ul>\n"+
                "\t</body>\n"+
                "</html>\n";
        System.out.println(html);

        System.out.println();

        System.out.println("""
<html>
    <body>
        <h1>Book Store</h1>
        <ul>
            <li>The Iliad</li>
        </ul>
    </body>
</html>""");
    }
}
