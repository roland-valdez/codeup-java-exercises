public class ServerNameGenerator {

    static void generateRandom(){
        String[] adjectives = {"alive", "better", "careful", "clever", "dead", "easy", "famous", "gifted", "hallowed", "helpful"};
        String [] nouns = {"time", "person", "year" ,"way" ,"day", "thing", "man" ,"world" ,"life" ,"hand"};
        String randomAdjective = adjectives[(int) Math.ceil(Math.random()*(adjectives.length - 1))];
        String randomNoun = nouns[(int) Math.ceil(Math.random()*(adjectives.length - 1))];
        System.out.println("Your auto generated server name is:");
        System.out.println(randomAdjective + "-" + randomNoun);

    }

    public static void main(String[] arg){

        generateRandom();

    }

}
