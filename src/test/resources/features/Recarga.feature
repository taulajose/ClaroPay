Feature: Recargas


Scenario Outline: Realizar una recarga
  #Given Estoy logueado con usuario <username> y password <password>
  When Hago click en boton Recarga
  #When Realizo una recarga
  #Then se muestra la pantalla de recarga exitosa
  #When Cierro la sesion



  Examples:
    | username   | password |
  #| evela+3@vates.com | Password1 |
    | pruebaqamatias+50@gmail.com | Password1 |
  #| leosartori86@gmail.com | Password1 |

