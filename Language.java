public class Language{

protected String name;
protected int numSpeakers;
protected String regionsSpoken;
protected String wordOrder;

public Language(String languageName, int speakers, String region, String order){
 this.name = languageName;
 this.numSpeakers = speakers;
 this.regionsSpoken = region;
 this.wordOrder = order;
}
public void getInfo(){
 System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + "\n");
 System.out.println("");
 
}
public static void main(String[] args){

  Language firstLang = new Language("Spanish", 50000, "The Americas", "Subject-Verb-Object");
 firstLang.getInfo();
 
 Language secondLang = new Mayan("Mayan", 1000);
 secondLang.getInfo();

 Language thirdLang = new SinoTibetan("Tibeto-Burman", 5000);
 thirdLang.getInfo();

 Language fourthLang = new SinoTibetan("Mandarin Chinese", 1000000);
 fourthLang.getInfo();

  

}


  
}
