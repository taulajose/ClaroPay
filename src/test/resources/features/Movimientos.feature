Feature: Movimientos

  Scenario Outline: PCP-17509 - Seleccionar una etiqueta y aplicar filtro en la sección “Movimientos”

    Given Estoy logueado con usuario <username> y password <password>
    #And tiene realizado movimientos correspondientes al tag <filtro>
    When Hago click en boton Movimientos
    When Hago click en el boton de filtros
    When selecciona el filtro <filtro>
    Then la lista de movimientos debe mostrar solo los que contienen <titulo> en su título o descripción
    #And la etiqueta <filtro> debería mostrarse en color negro
    #And el filtro correspondiente a <filtro> debería estar activo


  Examples:
    | username | password | filtro | titulo |
    #| pruebaqamatias+50@gmail.com | Password1 | Envio |
    #| c.luna+inversionesob6@paisanos.io | Paisanos1 | "SUBE" | "Recargaste SUBE" |
    | c.luna+inversionesob6@paisanos.io | Paisanos1 | "Envío" | "Enviaste dinero" |
    #| leosartori86@gmail.com | Password1 |


