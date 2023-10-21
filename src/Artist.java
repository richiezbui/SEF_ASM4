import java.io.*;
import java.util.ArrayList;

public class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList<String> Occupations;
    private ArrayList<String> Genres;
    private ArrayList<String> Awards;

    public Artist(String id, String name, String address, String birthdate, String bio,
                  ArrayList<String> occupations, ArrayList<String> genres, ArrayList<String> awards) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
    }

    public boolean addArtist() {
        if (!validateArtistData()) {
            return false;
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("artists.txt", true));
            writer.write(toString());
            writer.newLine();
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateArtist() {

        if (!validateUpdateConditions()) {
            return false;
        }

        ArrayList<String> updatedArtists = new ArrayList<>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("artists.txt"));
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(ID)) {
                    updatedArtists.add(toString());
                } else {
                    updatedArtists.add(line);
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("artists.txt"));
            for (String updatedArtist : updatedArtists) {
                writer.write(updatedArtist);
                writer.newLine();
            }
            writer.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean validateArtistData() {
        System.out.println("ID: " + ID);
        // Condition 1: Artist ID should be exactly 10 characters long
        if (ID == null || ID.length() != 10) {
            System.out.println("The Artist ID length is incorrect.");
            return false;
        }

        // Check first three characters are numbers between 5 and 9
        for (int i = 0; i < 3; i++) {
            char c = ID.charAt(i);
            if (c < '5' || c > '9') {
                System.out.println("The Artist ID first three characters must be numbers between 5 and 9.");
                return false;
            }
        }

        // Check characters 4th to 8th should be upper case letters (A - Z)
        for (int i = 3; i < 8; i++) {
            char c = ID.charAt(i);
            if (c < 'A' || c > 'Z') {
                System.out.println("The Artist ID characters 4th to 8th must be upper case letters.");
                return false;
            }
        }

        // Check last two characters should be a special character
        char secondLast = ID.charAt(8);
        char last = ID.charAt(9);
        if (!isSpecialCharacter(secondLast) || !isSpecialCharacter(last)) {
            System.out.println("The Artist ID last two characters must be special characters.");
            return false;
        }

        // Condition 2: Birthdate format DD-MM-YYYY
        if (!Birthdate.matches("\\d{2}-\\d{2}-\\d{4}")) {
            System.out.println("The Artist birth date must have a DD-MM-YYYY format.");
            return false;
        }

        // Condition 3: Address format City|State|Country
        if (!Address.matches("[a-zA-Z ]+\\|[a-zA-Z ]+\\|[a-zA-Z ]+")) {
            System.out.println("The Artist address must have a City|State|Country format.");
            return false;
        }

        // Condition 4: Bio should be between 10 to 30 words
        String[] bioWords = Bio.split("\\s+");
        if (bioWords.length < 10 || bioWords.length > 30) {
            System.out.println("The Artist bio should be between 10 to 30 words. The total number of words were given are " + bioWords.length);
            return false;
        }

        // Condition 5: Artist should have at least one occupation and a maximum of five
        if (Occupations.isEmpty() || Occupations.size() > 5) {
            System.out.println("The Artist should have at least one occupation and a maximum of five.");
            return false;
        }

        // Condition 6: Artist can have zero to a maximum of three awards
        for (String award : Awards) {
            String[] parts = award.split(",");
            if (parts.length != 2) {
                System.out.println("The Artist award should have both year and name");
                return false;
            }
//            int awardYear = Integer.parseInt(parts[0].trim());
            if (Awards.size() > 3) {
                System.out.println("The Artist award should only have year and name.");
                return false;
            }

            int awardWords = parts[1].split("\\s").length;
            if (awardWords < 4 || awardWords > 10) {
                System.out.println("The Artist award name should be between 4 and 10 words. The total number of words were given are " + parts[1].length());
                return false;
            }
        }

        // Condition 7: Artist should be active in at least two music genres and a maximum of five genres
        if (Genres.size() < 2 || Genres.size() > 5 || (Genres.contains("pop") && Genres.contains("rock"))) {
            System.out.println("The Artist should be active in at least two music genres and a maximum of five genres.");
            return false;
        }
//        System.out.println("Artist added successfully.");
        return true;
    }

    private boolean isSpecialCharacter(char c) {
        // Define the special characters or use a regex pattern as needed
        String specialCharacters = "!@#$%^&*()_-+[]{};:'\"<>,.?/|\\";
        return specialCharacters.contains(String.valueOf(c));
    }

    protected boolean validateUpdateConditions() {
        // Condition 1: Validate the artist's data as in the addArtist function
        if (!validateArtistData()) {
            return false;
        }

        // Condition 2: If an artist was born before 2000, their occupation cannot be changed
        int birthYear = Integer.parseInt(Birthdate.substring(Birthdate.lastIndexOf('-') + 1));
        System.out.println(birthYear);

//        if (birthYear < 2000 && !Occupations.isEmpty()) {
//            return false;
//        }

        // Condition 3: Awards that were given before 2000 cannot be changed
        ArrayList<String> currentAwards = new ArrayList<>();
        for (String award : Awards) {
            String[] parts = award.split(",");
            if (parts.length != 2) {
                return false;
            }
            int awardYear = Integer.parseInt(parts[0].trim());
            if (awardYear < 2000) {
                currentAwards.add(award);
            }
        }
        if (!currentAwards.isEmpty()) {
            // If there are awards given before 2000, they cannot be changed
            return currentAwards.equals(Awards);
        }

        return true;
    }

    @Override
    public String toString() {
        return ID + "|" + Name + "|" + Address + "|" + Birthdate + "|" + Bio + "|" +
                String.join(",", Occupations) + "|" + String.join(",", Genres) + "|" +
                String.join(";", Awards);
    }
}