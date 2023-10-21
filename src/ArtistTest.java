import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    @Test
    void testAddArtist_testCase1() {
        //Test Case 1_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase1Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertTrue(artistCase1Data1.addArtist());

        //Test Case 1_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase1Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertTrue(artistCase1Data2.addArtist());
    }

    @Test
    void testAddArtist_testCase2() {
        //Test Case 2_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase2Data1 = new Artist("769DDBD@#", "21 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase2Data1.addArtist());

        //Test Case 2_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase2Data2 = new Artist("277FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase2Data2.addArtist());
    }

    @Test
    void testAddArtist_testCase3() {
        //Test Case 3_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase3Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta|Georgia|USA", "223-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase3Data1.addArtist());

        //Test Case 3_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase3Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-101-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase3Data2.addArtist());
    }

    @Test
    void testAddArtist_testCase4() {
        //Test Case 4_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase4Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase4Data1.addArtist());

        //Test Case 4_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase4Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada|North America", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase4Data2.addArtist());
    }

    @Test
    void testAddArtist_testCase5() {
        //Test Case 5_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase5Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase5Data1.addArtist());

        //Test Case 5_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase5Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop. \n" +
                "This Canadian rapper, singer, and actor has not only given us chart-topping hits but has also redefined the hip-hop and pop music scene. As of 2023, Drake net worth stands impressively at $260 million.\n", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase5Data2.addArtist());
    }

    @Test
    void testAddArtist_testCase6() {
        //Test Case 6_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase6Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase6Data1.addArtist());

        //Test Case 6_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("pop", "rock"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase6Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase6Data2.addArtist());
    }

    @Test
    void testUpdateArtist_testCase1() {
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase1Data1 = new Artist("769DDBDD@#", "22 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertTrue(artistCase1Data1.updateArtist());

        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album"));
        Artist artistCase1Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|USA", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertTrue(artistCase1Data2.updateArtist());
    }

    @Test
    void testUpdateArtist_testCase2() {
        //Test Case 2_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase2Data1 = new Artist("769DDBD@#", "21 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase2Data1.updateArtist());

        //Test Case 2_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase2Data2 = new Artist("277FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase2Data2.updateArtist());
    }

    @Test
    void testUpdateArtist_testCase3() {
        //Test Case 3_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase3Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta|Georgia|USA", "223-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase3Data1.updateArtist());

        //Test Case 3_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase3Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada", "24-101-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase3Data2.updateArtist());
    }

    @Test
    void testUpdateArtist_testCase4() {
        //Test Case 4_Test Data 1
        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase4Data1 = new Artist("769DDBDD@#", "21 Savage", "Atlanta", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertFalse(artistCase4Data1.updateArtist());

        //Test Case 4_Test Data 2
        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album", "2019, Grammy Award for Best Rap Song"));
        Artist artistCase4Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|Canada|North America", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertFalse(artistCase4Data2.updateArtist());
    }

    @Test
    void testUpdateArtist_testCase5() {

        ArrayList<String> occupationsData1 = new ArrayList<>(List.of("Singer", "Rapper", "Composer"));
        ArrayList<String> genresData1 = new ArrayList<>(List.of("rap", "hip-hop"));
        ArrayList<String> awardsData1 = new ArrayList<>(List.of("2020, Grammy Award for Best Rap Song"));
        Artist artistCase1Data1 = new Artist("769DDBDD@#", "22 Savage", "Atlanta|Georgia|USA", "22-10-1992", "21 Savage was born in London, and moved to Atlanta, Georgia with his mother at age seven.", occupationsData1, genresData1, awardsData1);
        assertTrue(artistCase1Data1.updateArtist());

        ArrayList<String> occupationsData2 = new ArrayList<>(List.of("Producer", "Composer", "Rapper"));
        ArrayList<String> genresData2 = new ArrayList<>(List.of("blues", "hip-hop", "rap"));
        ArrayList<String> awardsData2 = new ArrayList<>(List.of("2013, Grammy Award for Best Rap Album"));
        Artist artistCase1Data2 = new Artist("977FALDS*^", "Drake", "Toronto|Ontario|USA", "24-10-1986", "An influential figure in contemporary popular music, Drake has been credited for popularizing singing and R&B sensibilities in hip hop.", occupationsData2, genresData2, awardsData2);
        assertTrue(artistCase1Data2.updateArtist());
    }


}