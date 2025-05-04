classDiagram
class Cliente {
-String name
-Account account
-Feature[] features
-Card card
-News[] news
}

    class Account {
        -String number
        -String agency
        -Double balance
        -Double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Double limit
    }

    class News {
        -String icon
        -String description
    }

    Cliente "1" *-- "1" Account : composition
    Cliente "1" *-- "1" Card : composition
    Cliente "1" *-- "*" Feature : aggregation
    Cliente "1" *-- "*" News : aggregation