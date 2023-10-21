import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("SEF_Music App");
            System.out.println("1. Add Artist");
            System.out.println("2. Update Artist");
            System.out.println("3. Exit");
            System.out.print("Select an option (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Artist ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Artist Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Artist Address (City|State|Country): ");
                String address = scanner.nextLine();
                System.out.print("Enter Birthdate (DD-MM-YYYY): ");
                String birthdate = scanner.nextLine();
                System.out.print("Enter Artist Bio: ");
                String bio = scanner.nextLine();

                ArrayList<String> occupations = new ArrayList<>();
                System.out.print("Enter Artist Occupations (comma-separated, e.g., Singer, Songwriter): ");
                String occupationsInput = scanner.nextLine();
                String[] occupationArray = occupationsInput.split(", ");
                for (String occupation : occupationArray) {
                    occupations.add(occupation);
                }

                ArrayList<String> genres = new ArrayList<>();
                System.out.print("Enter Music Genres (comma-separated, e.g., pop, classical, jazz): ");
                String genresInput = scanner.nextLine();
                String[] genreArray = genresInput.split(", ");
                for (String genre : genreArray) {
                    genres.add(genre);
                }

                ArrayList<String> awards = new ArrayList<>();
                System.out.print("Enter Awards (Year, Title, semicolon-separated, e.g., 2022, Best Song Written For Visual Media): ");
                String awardsInput = scanner.nextLine();
                String[] awardArray = awardsInput.split("; ");
                for (String award : awardArray) {
                    awards.add(award);
                }

                Artist artist = new Artist(id, name, address, birthdate, bio, occupations, genres, awards);
                boolean added = artist.addArtist();
                if (added) {
                    System.out.println("Artist added successfully.");
                } else {
                    System.out.println("Failed to add the artist. Please check input data.");
                }
            } else if (choice == 2) {
                System.out.print("Enter Artist ID to update: ");
                String id = scanner.nextLine();
                System.out.print("Enter Updated Artist Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Updated Artist Address (City|State|Country): ");
                String address = scanner.nextLine();
                System.out.print("Enter Updated Birthdate (DD-MM-YYYY): ");
                String birthdate = scanner.nextLine();
                System.out.print("Enter Updated Artist Bio: ");
                String bio = scanner.nextLine();

                ArrayList<String> occupations = new ArrayList<>();
                System.out.print("Enter Updated Artist Occupations (comma-separated, e.g., Singer, Songwriter): ");
                String occupationsInput = scanner.nextLine();
                String[] occupationArray = occupationsInput.split(", ");
                for (String occupation : occupationArray) {
                    occupations.add(occupation);
                }

                ArrayList<String> genres = new ArrayList<>();
                System.out.print("Enter Updated Music Genres (comma-separated, e.g., pop, classical, jazz): ");
                String genresInput = scanner.nextLine();
                String[] genreArray = genresInput.split(", ");
                for (String genre : genreArray) {
                    genres.add(genre);
                }

                ArrayList<String> awards = new ArrayList<>();
                System.out.print("Enter Updated Awards (Year, Title, semicolon-separated, e.g., 2022, Best Song Written For Visual Media): ");
                String awardsInput = scanner.nextLine();
                String[] awardArray = awardsInput.split("; ");
                for (String award : awardArray) {
                    awards.add(award);
                }

                Artist artist = new Artist(id, name, address, birthdate, bio, occupations, genres, awards); // ID is the key for searching
                boolean artistFound = artist.updateArtist();
                if (artistFound) {
                    System.out.println("Artist found.");

                    boolean updateConditionsMet = artist.validateUpdateConditions();

                    if (updateConditionsMet) {
                        // Update the artist data
                        boolean updated = artist.updateArtist();

                        if (updated) {
                            System.out.println("Artist updated successfully.");
                        } else {
                            System.out.println("Failed to update the artist. Please check input data.");
                        }
                    } else {
                        System.out.println("Update does not meet the specified conditions. Artist data not updated.");
                    }
                } else {
                    System.out.println("Artist not found. Please check the provided ID.");
                }
            }   else if (choice == 3) {
                    System.out.println("Exiting SEF_Music App.");
                    break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }   scanner.close();
    }
}


