package execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice(){


        int numbersOfItems = invoice.getSize();

        assertEquals(3, numbersOfItems);
    }


    @Test
    public void shouldGetExistingItem(){



        Item result = invoice.getItem(2);

        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);


    }

    public void shouldReturnNullWhenPassingOutOfRangeIndex(){



        Item result = invoice.getItem(7);
        assertNull(result);
    }

    @Test

    public void shouldClearInvoice(){


        int invoiceSizeBeforeClear = invoice.getSize();

        invoice.clear();

        assertEquals(0, invoice.getSize());
        assertEquals(3, invoiceSizeBeforeClear);

    }

    @BeforeEach
    public void initializeInvoice(){
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }
    @AfterEach
    public void resetValues(){
        System.out.println("resetting all values... ");
    }

    @BeforeAll
    public static void introMessage(){
        System.out.println("Starting testing");

    }
    @AfterAll
    public static void goodbyeMessage(){
        System.out.println("Finishing testing");
    }

}