package pan.edu;

public class Main {
    public static void main(String[] args) {
        String harryPotterText = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much. They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense.\n" +
                "Mr. Dursley was the director of a firm called Grunnings, which made\n" +
                "drills. He was a big, beefy man with hardly any neck, although he did\n" +
                "have a very large mustache. Mrs. Dursley was thin and blonde and had\n" +
                "nearly twice the usual amount of neck, which came in very useful as she\n" +
                "spent so much of her time craning over garden fences, spying on the\n" +
                "neighbors. The Dursleys had a small son called Dudley and in their\n" +
                "opinion there was no finer boy anywhere.\n" +
                "The Dursleys had everything they wanted, but they also had a secret, and\n" +
                "their greatest fear was that somebody would discover it. They didn't\n" +
                "think they could bear it if anyone found out about the Potters. Mrs.\n" +
                "Potter was Mrs. Dursley's sister, but they hadn't met for several years;\n" +
                "in fact, Mrs. Dursley pretended she didn't have a sister, because her\n" +
                "sister and her good-for-nothing husband were as unDursleyish as it was\n" +
                "possible to be. The Dursleys shuddered to think what the neighbors would\n" +
                "say if the Potters arrived in the street. The Dursleys knew that the\n" +
                "Potters had a small son, too, but they had never even seen him. This boy\n" +
                "was another good reason for keeping the Potters away; they didn't want\n" +
                "Dudley mixing with a child like that.\n" +
                "When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story\n" +
                "starts, there was nothing about the cloudy sky outside to suggest that\n" +
                "strange and mysterious things would soon be happening all over the\n" +
                "country. Mr. Dursley hummed as he picked out his most boring tie for\n" +
                "work, and Mrs. Dursley gossiped away happily as she wrestled a screaming\n" +
                "Dudley into his high chair.\n" +
                "None of them noticed a large, tawny owl flutter past the window.\n" +
                "At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs.\n" +
                "Dursley on the cheek, and tried to kiss Dudley good-bye but missed,\n" +
                "because Dudley was now having a tantrum and throwing his cereal at the\n" +
                "walls. \"Little tyke,\" chortled Mr. Dursley as he left the house. He got\n" +
                "into his car and backed out of number four's drive.\n" +
                "It was on the corner of the street that he noticed the first sign of\n" +
                "something peculiar — a cat reading a map. For a second, Mr. Dursley\n" +
                "didn't realize what he had seen — then he jerked his head around to\n" +
                "look again. There was a tabby cat standing on the corner of Privet\n" +
                "Drive, but there wasn't a map in sight. What could he have been thinking\n" +
                "of? It must have been a trick of the light. Mr. Dursley blinked and\n" +
                "stared at the cat. It stared back. As Mr. Dursley drove around the\n" +
                "corner and up the road, he watched the cat in his mirror. It was now\n" +
                "reading the sign that said Privet Drive — no, looking at the sign;";
        String[] words = harryPotterText.split(" ");
        for (int i = 0; i < words.length; i++) {
            Character character = words[i].charAt(0);
            if (words[i].length()==3 || Character.isUpperCase(character)){
                System.out.println(words[i]);
            }
        }

    }
}
