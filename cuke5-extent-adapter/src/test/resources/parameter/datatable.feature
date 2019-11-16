Feature: DataTable to Object Collection Conversion

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
      
  Scenario: List<Dish> no headers -- TableRowTransformer
    Given Dishes in menu
      | Chicken Milanese     | APPETIZER |
      | Sausage Pappardelle  | PASTA     |
      | Chicken Alla Diavola | PIZZA     |

  Scenario: Menu Contents -- TableTransformer
    Given Menu dishes
      | dish                 | type      |
      | Chicken Milanese     | APPETIZER |
      | Sausage Pappardelle  | PASTA     |
      | Chicken Alla Diavola | PIZZA     |

