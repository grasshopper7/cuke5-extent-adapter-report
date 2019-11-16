Feature: DataTable to Object Collection Conversion Mapper


  Scenario: Annonymous Parameters
    Given Table Number 4 orders 1 quantity "Chicken Carbonara"

  Scenario: List<OrderLine> -- TableEntryTransformer
    Given Customer orders the dishes
      | dish            | quantity |
      | Spicy Meatballs |        2 |
      | Fried Gnocchi   |        2 |
      | Espresso        |        3 |

  Scenario: Map<OrderLineId,OrderLine> -- TableCellTransformer, TableEntryTransformer
    Given Customer orders the below dishes
      |   | dish                   | quantity |
      | 1 | Spicy Meatballs        |        2 |
      | 2 | Fried Gnocchi          |        2 |
      | 3 | Spaghetti Aglio E Olio |        4 |

  Scenario: Map<Integer,OrderLine> -- TableEntryTransformer
    Given Customer orders the following dishes
      |   | dish                   | quantity |
      | 1 | Spicy Meatballs        |        2 |
      | 2 | Fried Gnocchi          |        2 |
      | 3 | Spaghetti Aglio E Olio |        4 |
      