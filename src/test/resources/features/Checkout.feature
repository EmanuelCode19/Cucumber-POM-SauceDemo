Feature: Funcionalidad de Checkout

 Scenario Outline: Login fallido
        Given que el usuario está en la página de inicio de sesión
        When inicia sesión con el usuario "<user>" y la contraseña "<password>"
        Then el usuario deberia ver mensaje "Epic sadface: Username and password do not match any user in this service"

  Examples:
    | user    | password   |
    | mario   | xyz        |
    | pedro   | 0000       |
    | luis    | 123abc     |

  Scenario Outline: Flujo exitoso de compra
    Given que el usuario está en la página de inicio de sesión
    When inicia sesión con el usuario "standard_user" y la contraseña "secret_sauce"
      And agrega al carrito el producto "<product>"
      And navega al carrito de compras
      And verifico que el producto sea "<product>" y su precio "<productPrice>"
      And procede al checkout
      And completa el formulario con nombre "<name>", apellido "<lastName>" y código postal "<postalCode>"
      And finaliza la compra
    Then se muestra el mensaje "Thank you for your order!"

  Examples:
     | product                    | productPrice | name       | lastName  | postalCode |
     |  Sauce Labs Backpack       |  $29.99      | Joelis     | Adon      |  15181     |
     |  Sauce Labs Onesie         |  $7.99       | Emanuel    | de jesus  |  10001     |
     |  Sauce Labs Fleece Jacket  |  $49.99      | Wander     |  Beltran  |  25871     |
