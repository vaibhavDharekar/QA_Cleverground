package tests;

import org.testng.annotations.Test;

public class Groups {

    // Group: Fruits
    @Test(groups = {"fruits"})
    public void testApple() {
        System.out.println("Fruit: Apple");
    }

    // Group: Countries
    @Test(groups = {"countries"})
    public void testIndia() {
        System.out.println("Country: India");
    }

    // Group: Animals
    @Test(groups = {"animals"})
    public void testLion() {
        System.out.println("Animal: Lion");
    }

    // Group: Fruits
    @Test(groups = {"fruits"})
    public void testBanana() {
        System.out.println("Fruit: Banana");
    }

    // Group: Countries
    @Test(groups = {"countries"})
    public void testUSA() {
        System.out.println("Country: USA");
    }

    // Group: Animals
    @Test(groups = {"animals"})
    public void testTiger() {
        System.out.println("Animal: Tiger");
    }

    // Group: Countries
    @Test(groups = {"countries"})
    public void testFrance() {
        System.out.println("Country: France");
    }

    // Group: Fruits
    @Test(groups = {"fruits"})
    public void testMango() {
        System.out.println("Fruit: Mango");
    }

    // Group: Animals
    @Test(groups = {"animals"})
    public void testElephant() {
        System.out.println("Animal: Elephant");
    }

    // Group: Countries
    @Test(groups = {"countries"})
    public void testJapan() {
        System.out.println("Country: Japan");
    }

    // Group: Fruits
    @Test(groups = {"fruits"})
    public void testGrapes() {
        System.out.println("Fruit: Grapes");
    }

    // Group: Animals
    @Test(groups = {"animals"})
    public void testGiraffe() {
        System.out.println("Animal: Giraffe");
    }

    // Group: Fruits
    @Test(groups = {"fruits"})
    public void testOrange() {
        System.out.println("Fruit: Orange");
    }

    // Group: Animals
    @Test(groups = {"animals"})
    public void testZebra() {
        System.out.println("Animal: Zebra");
    }

    // Group: Countries
    @Test(groups = {"countries"})
    public void testBrazil() {
        System.out.println("Country: Brazil");
    }
}
