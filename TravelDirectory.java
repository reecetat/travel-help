/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.directory;

import java.util.Scanner;

/**
 *
 * @author 641775
 */
public class TravelDirectory {

    private static InfoGuide ig; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    System.out.println("Hello, thank you for visitng the European travel guide! How may we direct you?");
    System.out.println("\t1. Italy\n\t2. United Kingdom\n\t3. Greece\n\t4. Germany\n\t5. Turkey"); 
    String option = kb.nextLine();
     if (option.equals("1")) {
         System.out.println("Which city are you flying into?");
         System.out.println("\t1. Rome\n\t2. Milan\n\t3. Venice\n\t4. Naples\n\t5. Florence");
         option = kb.nextLine();
            if (option.equals("1")) {
         System.out.println("Detroit, USA to Rome, Italy through American Airlines costs $1,798 economy round-trip and takes 17 hours 11 minutes");
            }
            else if (option.equals("2")) {
             System.out.println("Detroit, USA to Milan, Italy through Air Canada costs $2,194 economy round-trip and takes 10 hours 0 minutes");
            }
            else if (option.equals("3")) {
             System.out.println("Detroit, USA to Venice, Italy through American Airlines costs $1,920 economy round-trip and is 14 hours 6 minutes");
            }
            else if (option.equals("4")) {
             System.out.println("Detroit, USA to Naples, Italy through United UA costs $2.214 economy round-trip and is 13 hours 10 minutes"); 
            }
            else if (option.equals("5")) {
             System.out.println("Detroit, USA to Florence, Italy through Air Canada costs $2,240 economy round-trip and is 12 hours 55 minutes");
            }
     }
     else if (option.equals("2")) {
         System.out.println("Which city are you flying into?");
         System.out.println("\t1. London\n\t2. Manchester\n\t3. Edinburgh\n\t4. Birmingham\n\t5. Glasgow");
         option = kb.nextLine();
            if (option.equals("1")) {
         System.out.println("Detroit, USA to London, England through American Airlines costs $1,527 economy round-trip and takes 10 hours 55 minutes");
            }
         if (option.equals("2")) {
             System.out.println("Detroit, USA to Manchester, England through American Airlines costs $2,091 economy round-trip and takes 17 hours 15 minutes");
         }
             if (option.equals("3")) {
             System.out.println("Detroit, USA to Edinburgh, England through American Airlines costs $2,084 economy round-trip and is 10 hours 19 minutes");
             }
             if (option.equals("4")) {
             System.out.println("Detroit, USA to Birmingham, England through Delta costs $2,127 economy round-trip and is 14 hours 3 minutes");
             }
             if (option.equals("5")) {
             System.out.println("Detroit, USA to Glasgow, England through JetBlue costs $1,565 economy round-trip and is 16 hours 7 minutes");
             }
     }
     else if (option.equals("3")) {
         System.out.println("Which city are you flying into?");
         System.out.println("\t1. Athens\n\t2. Mykonos\n\t3. Corfu\n\t4. Heraklion\n\t5. Kos");
         option = kb.nextLine();
            if (option.equals("1")) {
         System.out.println("Detroit, USA to Athens, Greece through Air France costs $1,665 economy round-trip and takes 26 hours 51 minutes");
            }
         if (option.equals("2")) {
             System.out.println("Detroit, USA to Mykonos, Greece through Lufthansa costs $4,281 economy round-trip and takes 18 hours 25 minutes");
         }
             if (option.equals("3")) {
             System.out.println("Detroit, USA to Corfu, Greece through Air Canada costs $3,553 economy round-trip and is 36 hours 20 minutes");
             }
             if (option.equals("4")) {
             System.out.println("Detroit, USA to Heraklion, Greece through Air Canada costs $5,174 economy round-trip and is 20 hours 15 minutes");
             }
             if (option.equals("5")) {
             System.out.println("Detroit, USA to Kos, Greece through Air Canada costs $8,594 economy round-trip and is 21 hours 35 minutes");
             }
     }
     else if (option.equals("4")) {
         System.out.println("Which city are you flying into?");
         System.out.println("\t1. Frankfurt\n\t2. Munich\n\t3. Berlin\n\t4. Stuttgart\n\t5. Hamburg");
         option = kb.nextLine();
            if (option.equals("1")) {
         System.out.println("Detroit, USA to Frankfurt, Germany through Lufthansa costs $1,522 economy round-trip and takes 15 hours 55 minutes");
            }
         if (option.equals("2")) {
             System.out.println("Detroit, USA to Munich, Germany through United UA costs $1,612 economy round-trip and takes 17 hours 40 minutes");
         }
             if (option.equals("3")) {
             System.out.println("Detroit, USA to Berlin, Germany through United UA costs $1,274 economy round-trip and is 24 hours 4 minutes");
             }
             if (option.equals("4")) {
             System.out.println("Detroit, USA to Stuttgart, Germany through American Airlines costs $1,516 economy round-trip and is 18 hours 52 minutes");
             }
             if (option.equals("5")) {
             System.out.println("Detroit, USA to Hamburg, Germany through SAS costs $1,512 economy round-trip and is 17 hours 35 minutes");
             }

     }
     else if (option.equals("5")) {
         System.out.println("Which city are you flying into?");
         System.out.println("\t1. Istanbul\n\t2. Izmir\n\t3. Antalya\n\t4. Ankara\n\t5. Kayseri");
         option = kb.nextLine();
            if (option.equals("1")) {
         System.out.println("Detroit, USA to Istanbul, Turkey through Turkish Airlines costs $1,578 economy round-trip and takes 15 hours 50 minutes");
            }
         if (option.equals("2")) {
             System.out.println("Detroit, USA to Izmir, Turkey through Turkish Airlines costs $1,966 economy round-trip and takes 18 hours 24 minutes");
         }
             if (option.equals("3")) {
             System.out.println("Detroit, USA to Antalya, Turkey through JetBlue costs $1,274 economy round-trip and is 24 hours 4 minutes");
             }
             if (option.equals("4")) {
             System.out.println("Detroit, USA to Ankara, Turkey through Air Canada costs $1,741 economy round-trip and is 21 hours 44 minutes");
             }
             if (option.equals("5")) {
             System.out.println("Detroit, USA to Kayseri, Turkey through Turkish Airlines costs $1,905 economy round-trip and is 24 hours 45 minutes");
             }           
             }
     else {
     }
            System.out.println("");
            System.out.println("Is there anything else we can help you with?");
    System.out.println("\t1. Yes\n\t2. No"); 
    option = kb.nextLine();
     if (option.equals("1")) {
          System.out.println("Please choose from the following.");   
          System.out.println("\t1. Things to do\n\t2. Hotels\n\t3. Exchange Rates");
         option = kb.nextLine();
            if (option.equals("1")) {
        System.out.println("Which country are you interested in?");
         System.out.println("\t1. Italy\n\t2. United Kingdom\n\t3. Greece\n\t4. Germany\n\t5. Turkey"); 
         option = kb.nextLine();
         if (option.equals("1")) {
              System.out.println("Are you more interested in sight seeing or thrilling attractions?");   
         System.out.println("\t1. Sight seeing\n\t2. Attractions"); 
         option = kb.nextLine();
         if (option.equals("1")) {
             System.out.println("Italy is a beautiful European country with lots to see!");
             System.out.println("");
             System.out.println("Some things to see in Italy are:");
             System.out.println("");
             System.out.println("The Leaning Tower of Pisa - Pisa, Italy");
             System.out.println("Trevi Fountain - Rome, Italy");
             System.out.println("Colosseum Amphitheatre - Rome, Italy");
             System.out.println("Cathedral of Santa Maria del Fiore - Florence, Italy");
             System.out.println("Pantheon Roman Temple - Rome, Italy");
         }
         else if (option.equals("2")) {
             System.out.println("Italy has plenty of thrilling attractions that will be sure to get your blood pumping!");
             System.out.println("");
             System.out.println("Some exciting things to do in Italy are:");
             System.out.println("");
             System.out.println("Movieland Amusement/Water Park - Lazise, Italy");
             System.out.println("Sky Experience Paragliding - Rome, Italy");
             System.out.println("Ferarri Test Drive - Maranello, Italy");
             System.out.println("Corrado Conca Rock Climbing - Sassari, Italy");
             System.out.println("LaoRaft River Rafting - Scalea, Italy");
         }
     }
         else if (option.equals("2")) {
             System.out.println("Are you more interested in sight seeing or thrilling attractions?");   
         System.out.println("\t1. Sight seeing\n\t2. Attractions"); 
         option = kb.nextLine();
         if (option.equals("1")) {
             System.out.println("The United Kingdom has plenty of sightseeing opportunities!");
             System.out.println("");
             System.out.println("Some of the best thigs to see in the UK are:");
             System.out.println("");
             System.out.println("Big Ben - London, England");
             System.out.println("Tower of London - London, England");
             System.out.println("Edinburgh Castle - Edinburgh, Scotland");
             System.out.println("Stonehedge - Belgravia, UK");
             System.out.println("Gaint's Causeway - Belfast, Ireland");
         }
          else if (option.equals("2")) {
             System.out.println("The United Kingdom has plenty of thrilling attractions that will be sure to get your blood pumping!");
             System.out.println("");
             System.out.println("Some exciting things to do in the UK are:");
             System.out.println("");
             System.out.println("North London Skydiving - London, Englnd");
             System.out.println("Crags Adventures -Windermere, England");
             System.out.println("Interactive Harry Potter Tour - Edinburgh, Scotland");
             System.out.println("Camera Obscura and World of Illusions - Edinburgh, Scotland");
             System.out.println("Titanic Live Escape Game - Belfast, Northern Ireland");
         }
         }
          else if (option.equals("3")) {
             System.out.println("Are you more interested in sight seeing or thrilling attractions?");   
         System.out.println("\t1. Sight seeing\n\t2. Attractions"); 
         option = kb.nextLine();
         if (option.equals("1")) {
             System.out.println("Greece has plenty of beautiful sightseeing opportunities!");
             System.out.println("");
             System.out.println("Some of the best thigs to see in Greece are:");
             System.out.println("");
             System.out.println("Temple of Olympian Zeus - Athens, Greece");
             System.out.println("The Parthenon Temple - Athens, Greece");
             System.out.println("Meteora - Kalabaka, Greece");
             System.out.println("Knossos - Crete, Greece");
             System.out.println("Elafonisi Island - Crete, Greece");
     }
         else if (option.equals("2")) {
             System.out.println("Greece has plenty of thrilling attractions that will be sure to get your blood pumping!");
             System.out.println("");
             System.out.println("Some exciting things to do in Greece are:");
             System.out.println("");
             System.out.println("Rhodes Faliraki Water Park - Faliraki, Greece");
             System.out.println("Zakynthos Water Village - Sarakinado, Greece");
             System.out.println("Labyrinth - Crete, Greece");
             System.out.println("High Speed Boat to Lindos - Rodos, Greece");
             System.out.println("Skydive Athens - Athens, Greece");
          } 
          }
         else if (option.equals("4")) {
             System.out.println("Are you more interested in sight seeing or thrilling attractions?");   
         System.out.println("\t1. Sight seeing\n\t2. Attractions"); 
         option = kb.nextLine();
         if (option.equals("1")) {
             System.out.println("Germany has plenty of beautiful sightseeing opportunities!");
             System.out.println("");
             System.out.println("Some of the best thigs to see in Germany are:");
             System.out.println("");
             System.out.println("Neuschwanstein Castle - Munich, Germany");
             System.out.println("Sachsenhausen Concentration Camp Memorial - Berlin, Germany");
             System.out.println("Third Reich Memorial - Berlin Germany");
             System.out.println("Old Town - Nuremberg, Germany");
             System.out.println("Rhine Valley - Frankfurt, Germany");
     }
         else if (option.equals("2")) {
             System.out.println("Germany has plenty of thrilling attractions that will be sure to get your blood pumping!");
             System.out.println("");
             System.out.println("Some exciting things to do in Germany are:");
             System.out.println("");
             System.out.println("Europa-Park - Baden-Wurttemberg, Germany");
             System.out.println("Miniatur Wonderland - Hamburg, Germany");
             System.out.println("Fly Royal Paragliding - Fussen, Germany");
             System.out.println("RSRNurburg Racing - Nuerburg, Germany");
             System.out.println("Pullout Skydive - Gießen, Germany");
          } 
         }
          else if (option.equals("5")) {
             System.out.println("Are you more interested in sight seeing or thrilling attractions?");   
         System.out.println("\t1. Sight seeing\n\t2. Attractions"); 
         option = kb.nextLine();
         if (option.equals("1")) {
             System.out.println("Turkey has plenty of interesting sightseeing opportunities!");
             System.out.println("");
             System.out.println("Some of the best thigs to see in Turkey are:");
             System.out.println("");
             System.out.println("Aya Sofya Museum - Istanbul, Turkey");
             System.out.println("Ephesus - Ephesus, Turkey");
             System.out.println("Cappadocia - Nyssa, Turkey");
             System.out.println("Pamukkale Natural Hot Spring - Denizli, Turkey");
             System.out.println("Mount Nemrut -  Kayadibi/Kâhta, Turkey");
     }
         else if (option.equals("2")) {
             System.out.println("Turkey has plenty of thrilling attractions that will be sure to get your blood pumping!");
             System.out.println("");
             System.out.println("Some exciting things to do in Turkey are:");
             System.out.println("");
             System.out.println("AquaDream Waterpark - Marmaris, Turkey");
             System.out.println("Jeep Safari - Alanya, Turkey");
             System.out.println("Hip-Notics Cable Ski -  Manavgat, Turkey");
             System.out.println("Adaland - Kusadasi, Turkey");
             System.out.println("Mediterranean Divers - Antalya, Turkey");
         }
            }
            }
            else if (option.equals("2")) {
                System.out.println("Which country are you interested in?");
         System.out.println("\t1. Italy\n\t2. United Kingdom\n\t3. Greece\n\t4. Germany\n\t5. Turkey"); 
         option = kb.nextLine();
         if (option.equals("1")) {
            System.out.println("Some of the top hotels in Italy and their average room cost (ARC) are:"); 
            System.out.println("");
            System.out.println("Cavalieri - Rome, Italy - ARC: $227");
            System.out.println("Grand Hotel Convento di Amalfi - Amalfi, Italy - ARC: $245");
            System.out.println("Four Seasons Firenze - Florence, Italy - ARC: $660");
            System.out.println("Excelsior Vittoria - Sorrento, Italy - ARC: $381");
            System.out.println("Papadopoli Venezia - Venice, Italy - ARC: $176");
            }
          else if (option.equals("2")) {
            System.out.println("Some of the top hotels in the UK and their average room cost (ARC) are:"); 
            System.out.println("");
            System.out.println("St Brides - Pembrokeshire, Wales - ARC: $192");
            System.out.println("Swinfen Hall - Lichfield, England - ARC: $164");
            System.out.println("Powerscourt - Wicklow, Ireland - ARC: $185");
            System.out.println("Swan at Lavenham - Lavenham, England - ARC: $172");
            System.out.println("The Marcliffe - Pitfodels, Scotland - ARC: $172");
                      }
         else if (option.equals("3")) {
            System.out.println("Some of the top hotels in Greece and their average room cost (ARC) are:"); 
            System.out.println("");
            System.out.println("Moni Emvasis Luxury - Monemvasia, Greece - ARC: $169");
            System.out.println("Asteras Villas - Santorini, Greece - ARC: $141");
            System.out.println("A-Luxury Villas - Gimnastiriou, Greece - ARC: $162");
            System.out.println("Grande Bretagne - Athina, Greece - ARC: $238");
            System.out.println("Melissi Villas - Melissi, Greece - ARC: $143");
            }
          else if (option.equals("4")) {
            System.out.println("Some of the top hotels in Germany and their average room cost (ARC) are:"); 
            System.out.println("");
            System.out.println("Taschenbergpalais Kempinski Dresden - Dresden, Germany - ARC: $203");
            System.out.println("Sofitel Frankfurt Opera - Frankfurt, Germany - ARC: $248");
            System.out.println("The Fontenay - Hamburg, Germany - ARC: $276");
            System.out.println("The Ritz-Carlton - Wolfsburg, Germany - ARC: $368");
            System.out.println("Sofitel Munich Bayerpost - München, Germany - ARC: $219");
          }
         else if (option.equals("5")) {
            System.out.println("Some of the top hotels in Turkey and their average room cost (ARC) are:"); 
            System.out.println("");
            System.out.println("Hilton Izmir - Konak/Izmir, Turkey - ARC: $61");
            System.out.println("TASİGO Eskişehir - Odunpazari, Turkey - ARC: $81");
            System.out.println("Asteria Kremlin Palace - Aksu, Turkey - ARC: $77");
            System.out.println("Crowne Plaza - Antalya, Turkey - ARC: $30");
            System.out.println("Titanic Mardan Palace - Antalya, Turkey - ARC: $169");
         }
     }
            else if (option.equals("3")) {
                System.out.println("Which country are you interested in?");
         System.out.println("\t1. Italy\n\t2. United Kingdom\n\t3. Greece\n\t4. Germany\n\t5. Turkey"); 
         option = kb.nextLine();
         if (option.equals("1")) {       
            System.out.println("Please enter amount of American dollars");
            int cost = kb.nextInt();
            double answer = calculateEuro (cost);
            System.out.println(answer + " Euro");
        }
         if (option.equals("2")) {       
            System.out.println("Please enter amount of American dollars");
            int cost = kb.nextInt();
            double answer = calculatePound (cost);
            System.out.println(answer + " Pound Sterling");
     }
         if (option.equals("3")) {       
            System.out.println("Please enter amount of American dollars");
            int cost = kb.nextInt();
            double answer = calculateEuro (cost);
            System.out.println(answer + " Euro");
     }
         if (option.equals("4")) {       
            System.out.println("Please enter amount of American dollars");
            int cost = kb.nextInt();
            double answer = calculateEuro (cost);
            System.out.println(answer + " Euro");
     }
         if (option.equals("5")) {       
            System.out.println("Please enter amount of American dollars");
            int cost = kb.nextInt();
            double answer = calculateLira (cost);
            System.out.println(answer + " Turkish lira");
     }
            }
     }
     else if (option.equals("2")){
                System.out.println("Thank you for using Travel Directory, have a great day!");
    }
    }
   public static double calculateEuro (int cost) {
        double euro = (double) cost * 0.9;
        return euro;
    }
    public static double calculatePound (int cost) {
        double pound = (double) cost * 1.33;
        return pound;
    }
     public static double calculateLira (int cost) {
        double lira = (double) cost * 5.85;
        return lira;
    }
}

    


    
            
 
            