public class Help {

    private String tekst ="Adolfsen,Joakim Moe\n" +
            "Andersen,Tobias Meyer\n" +
            "Andersson,Vegard\n" +
            "Bakken,Cato\n" +
            "Bastiansen,Hans Petter Årvik\n" +
            "Baugerud,Magnus\n" +
            "Berg,Henrik Mathias\n" +
            "Bergebakken,Tore\n" +
            "Bergquist,Jon Åby\n" +
            "Bjerke,Thomas\n" +
            "Blichfeldt,Victoria\n" +
            "Brevik,Magnus\n" +
            "Bright,Brigitt Gyamfi\n" +
            "Bui,Aria Thuy Dung\n" +
            "Carlsen,Alexander\n" +
            "Dalheim,William\n" +
            "Derouiche,Emir\n" +
            "Dokken,Nikolai Roede\n" +
            "Eggum,Randi\n" +
            "Eidsvaag,Mikael Nervik\n" +
            "Evangelista,Ian-Angelo Roman\n" +
            "Evje,Kjerand\n" +
            "Faksdal,Stine Olava\n" +
            "Fornes,Mia\n" +
            "Gjengedal,Helene\n" +
            "Grande,Trym\n" +
            "Granli,Hans Kristian Olsen\n" +
            "Gulaker,Kristian William Macdonald\n" +
            "Gultvedt,Even\n" +
            "Gundersen,Kasper Vedal\n" +
            "Harnes,Håkon Anthonsen\n" +
            "Harnes,Vetle Kristaver Widnes\n" +
            "Heggelund,Mathias Oppedal\n" +
            "Helgeland,Kevin Andre\n" +
            "Hemstad,Eirik\n" +
            "Hestmark,Bård Sørensen\n" +
            "Hollum,Jørgen\n" +
            "Holt-Seeland,Per\n" +
            "Høie,Svein Jakob\n" +
            "Ikin,Sebastian Anthony\n" +
            "Imran,Zaim Ul-Abrar\n" +
            "Jacobsen,Jonas Brager\n" +
            "Jarbeaux,William\n" +
            "Jonson,Helene Yuee\n" +
            "Kalleberg,Espen\n" +
            "Kallestad,Asbjørn Fiksdal\n" +
            "Kalstad,Mikael\n" +
            "Karlsen,Audun\n" +
            "Knutsen,Yair Day\n" +
            "Koch,Carl Egil\n" +
            "Kopperud,Pernille\n" +
            "Lande,Maria\n" +
            "Larsen,Juni Leirvik\n" +
            "Larsen,Michael Staff\n" +
            "Larsson,Jonas Brunvoll\n" +
            "Lauvvik,Torbjørn Bøe\n" +
            "Legendre,Patrick Øivind Helvik\n" +
            "Liahagen,Ole Jonas\n" +
            "Liland,Tiril Bjerkebakke\n" +
            "Loennechen,Jan\n" +
            "Luick,Andine\n" +
            "Madsen,Jakob Lønnerød\n" +
            "Mahmood,Dilawar\n" +
            "Markhus,Håvard Stavnås\n" +
            "Mcculloch,Maria Kleppestø\n" +
            "Moe,Thomas Bakken\n" +
            "Mohammad,Mahmoud Ibrahim\n" +
            "Mohammadi,Sara\n" +
            "Nayef,Mohammad Nayef Al\n" +
            "Nilsen,Martin Johannes\n" +
            "Olsen,Mathias Årstad\n" +
            "Pickel,Pascal\n" +
            "Plahte,Eirik\n" +
            "Riksvold,Christian\n" +
            "Rønning,Gaute Wierød\n" +
            "Røstgård,Kim Richard\n" +
            "Schau,Max Torre\n" +
            "Seivaag,Lasse Ivar\n" +
            "Seljeseth,Sabine\n" +
            "Sevaldsen,Marcus\n" +
            "Solvoll,Kenneth\n" +
            "Steig,Jørgen\n" +
            "Sundfær,Torstein Holmberget\n" +
            "Thorkildsen,Torje Dahll-Larssøn\n" +
            "Tolnes,Andreas\n" +
            "Torbjørnsen,Marius\n" +
            "Tronstad,Henrik Wanderås\n" +
            "Trømborg,Steffen\n" +
            "Tverfjell,Julie Isabelle Malmedal\n" +
            "Utne,Sivert\n" +
            "Vanebo,Kristoffer\n" +
            "Willa,Lisa\n" +
            "Yogalingam,Abilash\n" +
            "Younger,Eric\n" +
            "Østmo-Sæter,Lars Olsnes\n" +
            "Årdal,Simon";

    private String[] navn= tekst.split("\n");

    //make table for oppg. 1
    public String[] getNames(){
        return(navn);
    }
    //make table for oppg. 2
    public int[] getTable(int ant){
        int[] tab = new int[ant];
        for(int i = 0; i<ant; i++){
            tab[i] = (int)(Math.random()*100000);
        }
        return(tab);
    }


}
