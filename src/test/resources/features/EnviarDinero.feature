Feature: Envio de dinero

  

  Scenario Outline:PPAY-1168 - TC_[ENVIAR DINERO]-CuentaBancaria_OtrasCuentas_Favs_Ok
  PPAY-530 - TC_[ENVIAR DINERO]-Enviar de dinero a una cuenta bancaria externa - Saldo Claro Pay- OK
  PPAY-336 - TC_[ENVIAR DINERO]-ClaroPayFavs_Ok
  PPAY-1764 - TC_[ENVIAR DINERO]-Enviar dinero a un CVU agregando nueva cuenta - Saldo Claro Pay - OK
  PPAY-845 - TC_[ENVIAR DINERO]-Envio de dinero a cuenta bancaria - Saldo Claro Pay.
  PPAY-1393 - TC_[ENVIAR DINERO]-RealizarEnvio_CuentaAgendada
  PPAY-844 - TC_[ENVIAR DINERO]-Envio de dinero a cuenta bancaria propia - Saldo Claro Pay- OK

    Given Estoy logueado con usuario <username> y password <password>
    When Hago click en el boton Enviar
    When Hago click en Con Alias CBU o CVU
    When Hago click en una cuenta asociada
    When Ingreso el monto $2000
    When Hago click en el boton Continuar
    When Hago Click en el boton Enviar
    When Ingreso el PIN 1357
    Then se visualiza la pantalla de operacion exitosa

    Examples:
      | username   | password |
      #No linea claro
      #| userclaropay+damian@gmail.com | Password1 |
      #DESA
      | c.luna+inversionesob6@paisanos.io | Paisanos1 |
      # Con tarjeta de debito UAT
      #| leosartori86+7002@gmail.com | Password1 |

  Scenario Outline: PPAY-2235 - TC_[ENVIAR DINERO]- Visualizar comprobante exitoso al enviar dinero
    Given Estoy logueado con usuario <username> y password <password>
    When Hago click en el boton Enviar
    When Hago click en Con Alias CBU o CVU
    When Hago click en una cuenta asociada
    When Ingreso el monto $3000
    When Hago click en el boton Continuar
    When Hago Click en el boton Enviar
    When Ingreso el PIN 1357
    Then se visualiza la pantalla de operacion exitosa
    When Hago click en el boton ver comprobante
    Then Se visualiza el comprobante


    Examples:
      | username                      | password  |
      #No linea claro
      #| userclaropay+damian@gmail.com | Password1 |
      #
      | userclaropay+damian@gmail.com | Password1 |
      #DESA
      #| c.luna+inversionesob6@paisanos.io | Paisanos1 |
      #| leosartori86@gmail.com | Password1 |

  @Demo
  Scenario Outline: PPAY-846 TC_[ENVIAR DINERO]-Envio de dinero con numero de telefono - Saldo Claro Pay -OK
  PPAY-528 - TC_[ENVIAR DINERO]-ClaroPay_TusContactos
  PPAY-772 - TC_[ENVIAR DINERO]-Envio de dinero con numero de telefono - pantalla "Tus contactos".

    Given Estoy logueado con usuario <username> y password <password>
    When Hago click en el boton Enviar
    When Hago click en Con Numero de telefono
    When Hago click en Nuevo contacto
    When Ingreso el numero telefonico "3512075852"
    When Hago click en el boton siguiente de la pantalla agregar Nuevo contacto
    When Ingreso el nombre del contacto
    When Hago click en el boton siguiente de la pantalla agregar Nuevo contacto
    When Ingreso el monto $3000
    When Hago click en el boton Continuar
    When Hago Click en el boton Enviar
    When Ingreso el PIN 1357
    Then se visualiza la pantalla de operacion exitosa


    Examples:
      | username                      | password  |
      #No linea claro
      #| userclaropay+damian@gmail.com | Password1 |
      #
      | userclaropay+damian@gmail.com | Password1 |
      #DESA
      #| c.luna+inversionesob6@paisanos.io | Paisanos1 |
      #| leosartori86@gmail.com | Password1 |

  Scenario Outline: PPAY-459 - TC_[ENVIAR DINERO]-CuentaBancaria_PINinvalido_Ok
    Given Estoy logueado con usuario <username> y password <password>
    When Hago click en el boton Enviar
    When Hago click en Con Numero de telefono
    When Hago click en Nuevo contacto
    When Ingreso el numero telefonico "3512075852"
    When Hago click en el boton siguiente de la pantalla agregar Nuevo contacto
    When Ingreso el nombre del contacto
    When Hago click en el boton siguiente de la pantalla agregar Nuevo contacto
    When Ingreso el monto $3000
    When Hago click en el boton Continuar
    When Hago Click en el boton Enviar
    When Ingreso el PIN 1888
    Then se visualiza el mensaje de PIN incorrecto


    Examples:
      | username                      | password  |
      #No linea claro
      #| userclaropay+damian@gmail.com | Password1 |
      #
      | userclaropay+damian@gmail.com | Password1 |
      #DESA
      #| c.luna+inversionesob6@paisanos.io | Paisanos1 |
      #| leosartori86@gmail.com | Password1 |

  Scenario: PPAY-313 - TC_[ENVIAR DINERO]-CuentaBancaria_AgregarCuenta_Ok

  Scenario: PPAY-1511 - Envío de dinero a un nuevo contacto no agregándole alias

  Scenario: PPAY-164 - Iniciar sesion exitosamente

  Scenario: PPAY-1167 - TC_[ENVIAR DINERO]-Envio de dindero a CVU/CBU/alias invalido.

  Scenario Outline:PPAY-1168 - TC_[ENVIAR DINERO]-CuentaBancaria_OtrasCuentas_Favs_Ok
  PPAY-530 - TC_[ENVIAR DINERO]-Enviar de dinero a una cuenta bancaria externa - Saldo Claro Pay- OK
  PPAY-336 - TC_[ENVIAR DINERO]-ClaroPayFavs_Ok
  PPAY-1764 - TC_[ENVIAR DINERO]-Enviar dinero a un CVU agregando nueva cuenta - Saldo Claro Pay - OK
  PPAY-845 - TC_[ENVIAR DINERO]-Envio de dinero a cuenta bancaria - Saldo Claro Pay.
  PPAY-1393 - TC_[ENVIAR DINERO]-RealizarEnvio_CuentaAgendada
  PPAY-844 - TC_[ENVIAR DINERO]-Envio de dinero a cuenta bancaria propia - Saldo Claro Pay- OK

    Given Estoy logueado con usuario <username> y password <password>
    When Hago click en el boton Enviar
    When Hago click en Con Numero de telefono
    When Ingreso el monto $3000
    When Hago click en el boton Continuar
    When Hago click en boton Ingresar dinero en la pantalla de confirmacion
    Then se visualiza la pantalla de operacion exitosa

    Examples:
      | username   | password |
      #No linea claro
      #| userclaropay+damian@gmail.com | Password1 |
      #DESA
      #| c.luna+inversionesob6@paisanos.io | Paisanos1 |
      # Con tarjeta de debito UAT
      | leosartori86+7002@gmail.com | Password1 |