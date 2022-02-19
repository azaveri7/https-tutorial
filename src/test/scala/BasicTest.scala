final class BasicTest extends TestSuite {


  "BasicTest List" should {
    "List test head should pass " in {
      val fruit = List("apple", "kiwi", "orange", "banana")
      assert(true, fruit.head == "apple")
    }

    "List test size should pass " in {
      val fruit = List("apple", "kiwi", "orange", "banana")
      assert(fruit.size == 4)
    }

    "throw an IndexOutOfBoundsException when trying to access any element" in {
      val fruit = List("apple", "kiwi", "orange", "banana")
      assertThrows[IndexOutOfBoundsException]{
        fruit(5)
      }
    }
  }

  "A Matcher" should {
    "let us check equality" in {
      val number = 24
      number should equal (24)
      number shouldEqual 24
    }

    "let us check equality using be" in {
      val number = 24
      number should be (24)
      number shouldBe 24
    }
  }



}
