Feature: Perfil


Scenario Outline: PPAY-321 - TC_[MI PERFIL]-Editar Alias Desde Mi Perfil_Ok
  #Given Estoy logueado con usuario <username> y password <password>
    #And el usuario no ha cambiado su alias en las últimas 24 horas
  When el usuario ingresa a Mi Perfil
  When el usuario hace click en el botón "Mi CVU"
  When el usuario hace click en el botón "Editar alias"
  When el usuario ingresa nuevo alias válido
  When el usuario hace click en el botón "Continuar"
  Then se visualiza mensaje "Tu alias fue cambiada con éxito"
  #Then el alias del servicio se editó exitosamente


  Examples:
    | username   | password |
    #| evela+3@vates.com | Password1 |
    | pruebaqamatias+50@gmail.com | Password1 |
    #| leosartori86@gmail.com | Password1 |

  Scenario Outline: PPAY-2033 - ErrorEditarAlias_Dentro24horas
    Given Estoy logueado con usuario <username> y password <password>
    #And el usuario no ha cambiado su alias en las últimas 24 horas
    When el usuario ingresa a Mi Perfil
    When el usuario hace click en el botón "Mi CVU"
    When el usuario hace click en el botón "Editar alias"
    When el usuario ingresa nuevo alias válido
    When el usuario hace click en el botón "Continuar"
    Then se visualiza mensaje "Tu alias fue cambiada con éxito"
    When el usuario hace click en el botón "Editar alias"
    When el usuario ingresa nuevo alias válido
    When el usuario hace click en el botón "Continuar"
    Then se visualiza mensaje "Tenés que esperar 24hs para cambiar tu alias nuevamente"


    Examples:
      | username   | password |
    #| evela+3@vates.com | Password1 |
          # | pruebaqamatias+53@gmail.com | Password1 |
      #| c.luna+inversionesob6@paisanos.io | Paisanos1 |
    #| leosartori86@gmail.com | Password1 |