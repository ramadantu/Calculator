import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List emptyList;
    List oneElementList;
    List threeElementsList;
    List fullList;

    @BeforeEach
    void setup() {
        emptyList = new List();

        oneElementList = new List();
        oneElementList.add(5);

        threeElementsList = new List();
        threeElementsList.add(5);
        threeElementsList.add(4);
        threeElementsList.add(3);

        fullList = new List();
        fullList.add(4);
        fullList.add(3);
        fullList.add(2);
        fullList.add(1);
        fullList.add(0);
    }

    @Test
    void givenEmptyList_CheckSizeIsZero_ThenSuccess(){
        assertEquals(0, emptyList.size());
    }

    @Test
    void givenEmptyList_TryAddOneElement_ThenSuccess() {
        assertEquals(1,oneElementList.size());
    }

    @Test
    void givenThreeElementsList_TryRemoveOneElement_ThenSuccess() {
        threeElementsList.remove(4);
        assertEquals(2, threeElementsList.size);

    }

    @Test
    void givenFullList_TryAddOneElement_ThenFail() {
        assertThrows(IndexOutOfBoundsException.class, () -> fullList.add(5));
    }

}