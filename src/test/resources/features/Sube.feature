Feature: Recarga SUBE


Scenario Outline: Validar pantalla de error de recarga SUBE
  Given Estoy logueado con usuario <username> y password <password>
  When Realizo una recarga SUBE
  Then Visualizo la pantalla de error de recarga SUBE
  When Cierro la sesion

  Examples:
    | username   | password |
    #| evela+3@vates.com | Password1 |
    | pruebaqamatias+50@gmail.com | Password1 |
    #| leosartori86@gmail.com | Password1 |
