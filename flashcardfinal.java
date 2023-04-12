import java.util.*;

public class flashcardfinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] questions = {
            "Security is ______",
            "What are the three security goals?",
            "Denial-Of-Service is an attack on _________",
            "This system uses two keys per user. Only one key is distributed so that there are n keys for n users. It provides encryption and digital signatures.",
            "The availability of plans, methodologies, and algorithms for community analysis and feedback is part of the security best practices defined in __________",
            "When performing an exhaustive and brute force attack on a password, the most important factor for keeping it secure is ___________",
            "\"Hi Bob, this is John. I'm here with Jack in the middle of a presentation. He's actually on stage right now. His wi-fi is not working well and he asked me to call you to see if you could reset his VPN password to his date of birth. Do you think you can help him out?\" This is an example of __________",
            "A manhole inside a bank vault is vulnerable to what kind of attack?",
            "A device used to steal credit card information by copying the data on the magnetic stripe is called a ____________.",
            "When a user is first created, it should have only the necessary access to perform its functions. When a browser is installed, it should not allow for plugin code execution. When an operating system is installed, the firewall should be turned on. These are examples of ____________.",
            "This ethical, non-malicious subject tests his own network against vulnerabilities and stays within legal boundaries.",
            "This malicious subject breaks laws, violates security policies and performs destructive attacks.",
            "This subject has no idea what is going on, simply uses tools created by other hackers.",
            "This subject hacks for political, social or religious reasons, simply to send a message.",
            "This type of malware uses human assisted replication and infects existing files.",
            "This type of malware propagates automatically and exists on its own.",
            "This type of malware is undetectable by the operating system.",
            "This type of malware provides desirable functionality and hides its real intent.",
            "This program performs malicious actions based on certain logic conditions.",
            "This program encrypts your files and asks for money in exchange for the password.",
            "In a packet switching network, a path is defined before transmission and all packets follow this path to the destination.",
            "ARP Spoofing works by:",
            "When asking for a DNS server for the Authority on a certain subdomain, the expected response would be:",
            "A system where a signature or profile is created from the observation of usage over time. This signature is used as a baseline to detect intrusions.",
            "The recommended way to secure a wireless network is to use:",
            "In order to better secure sensitive information when sending HTTP requests, it is better to use this method to enclose the query parameters in the message body:",
            "The top digital certificate in a hierarchy is called the:",
            "JavaScript is a scripting language that runs on the web server.",
            "Monitoring network traffic to intercept a cookie with authentication information is an attempt to perform this type of attack.",
            "One common way to protect yourself against SQL Injection attacks is to:",
            "In this type of attack, the cryptanalyst takes a plaintext message and observes the output cipher-text in order to figure out the key being used. The cryptanalyst can try several different plaintext messages and observe how the cipher-text changes and make adjustments on the fly.",
            "Computer are ___________, so they are a very __________ source of random seed generation.",
            "When using public key cryptography to digitally sign a document, Alice encrypts the document with _______________. Bob then uses _____________ to decrypt it.",
            "When running the strings \"Love\" and \"Hate\" through a hash function h(), the following digest is produced: x8&aF@B9tz5df. Which property is this function breaking?",
            "Using public key cryptography, Bob wants to send an encrypted message to Alice. Bob will encrypt the message with ___________________, and Alice will decrypt the message with _____________________.",
            "One way to obtain protected information from a database is by matching data from different sources based on a common attribute. This is called ___________________.",
            "Impersonation attacks in PGP can be prevented by having the ______________ digitally signed with the ______________.",
            "A computer that can forward emails from anyone and to anyone is called _______________.",
            "This SPAM fighting technique refuses all email at first, alerting the sender that he must try again later."
        };
        String[] answers = {
            "The state of being free from danger or threat",
            "Confidentiality, Integrity, Availability",
            "Availability",
            "Public Key Cryptography",
            "Open Design",
            "Length",
            "Pretexting",
            "Side Channel",
            "Skimmer",
            "Fail-Safe Defaults",
            "White Hat Hacker",
            "Black Hat Hacker",
            "Script Kiddie",
            "Hacktivist",
            "Virus",
            "Worm",
            "Rootkit",
            "Trojan",
            "Logic Bomb",
            "Ransomware",
            "False",
            "Sending ARP replies even when no question has been asked. These ARP packets spoof the MAC addresses of the target hosts.",
            "NS Record",
            "Statistical Intrusion Detection",
            "WPA2",
            "POST",
            "Root Certificate",
            "False",
            "Session Hijacking",
            "Sanitize all inputs",
            "Chosen-Plaintext",
            "Deterministic, unreliable",
            "Block Cipher, Electronic Code Book",
            "Alice's Private Key, Alice's Public Key",
            "Collision Resistance",
            "Alice's Public Key, Alice's Private Key",
            "Inference Attack",
            "Sender's public key, Introducer's private key",
            "Open Relay",
            "Graylisting"
        };
        int[] indices = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39};
        System.out.println("Welcome to the Flashcard Quiz!");
        System.out.println("Type 'quit' at any time to end the quiz.\n");
        while (true) {
            System.out.println("Press enter to start the quiz or type 'quit' to exit:");
            String input = sc.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("The quiz has started!\n");
            Collections.shuffle(Arrays.asList(indices));
            int score = 0;
            for (int i = 0; i < indices.length; i++) {
                System.out.println("Question " + (i+1) + ": " + questions[indices[i]]);
                List<String> choicesList = new ArrayList<String>(Arrays.asList(answers));
                choicesList.remove(answers[indices[i]]); // remove the correct answer from the choices list
                Collections.shuffle(choicesList); // shuffle the remaining answers
                choicesList = choicesList.subList(0, 3); // take the first three answers
                choicesList.add(answers[indices[i]]); // add the correct answer back in
                String[] choices = choicesList.toArray(new String[0]); // convert the list back to an array
                Collections.shuffle(Arrays.asList(choices));
                for (int j = 0; j < 4; j++) {
                    System.out.println((char)('a' + j) + ") " + choices[j]);
                }                
                System.out.print("\nEnter your answer (a, b, c, or d): ");
                String userAnswer = sc.nextLine().toLowerCase();
                if (userAnswer.equals("quit")) {
                    System.out.println("\nThanks for playing!\n");
                    System.out.println("\nYour final score is " + score + "/" + indices.length + ".\n");
                    return;
                }
                if (userAnswer.equals(String.valueOf((char)('a' + Arrays.asList(choices).indexOf(answers[indices[i]]))))) {
                    System.out.println("\nCorrect!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer was: " + answers[indices[i]]);
                }
                System.out.println();
            }
            System.out.println("Your final score is " + score + "/" + indices.length + ".");
            System.out.println("Type 'quit' to exit or press enter to play again.");
        }
        System.out.println("Thanks for playing!");
    }
}