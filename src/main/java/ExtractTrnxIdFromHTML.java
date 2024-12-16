public class ExtractTrnxIdFromHTML {

    public static void main(String[] args) {

        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        int startIndex = html.indexOf("Transaction Id: ");
        if (startIndex != -1) {
            int endIndex = html.indexOf("</p>", startIndex);
            String trnxId = html.substring(startIndex, endIndex).trim();
            System.out.println(trnxId);
        } else {
            System.out.println("Transaction Id not found");
        }

    }

}
