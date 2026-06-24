import java.io.*;
import java.util.HashMap;

public class EmailDomainCounter {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("emails.txt"));

            HashMap<String, Integer> domainCount =
                    new HashMap<>();

            String email;

            while ((email = br.readLine()) != null) {

                int index = email.indexOf("@");

                String domain =
                        email.substring(index + 1);

                domainCount.put(
                        domain,
                        domainCount.getOrDefault(domain, 0) + 1);
            }

            br.close();

            System.out.println("Domain Counts:");

            for (String domain : domainCount.keySet()) {

                System.out.println(
                        domain + " = " +
                        domainCount.get(domain));
            }

        } catch (IOException e) {

            System.out.println(
                    "Error reading file");
        }
    }
}