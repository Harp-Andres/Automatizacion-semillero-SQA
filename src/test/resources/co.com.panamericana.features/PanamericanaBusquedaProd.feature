#language: en

Feature: Realizar tres tipos de busquedas en la pagina de panamericana.com.co

  Background:
    Given que ingreso a la pagina principal de panamericana

@Escenario1
  Scenario: Realizar busqueda por medio de la barra de busqueda de la pagina de panamericana.com.co
    When realizo la busqueda por medio de la barra de busqueda de la pagina
    Then valido que se muestre en pantalla la busqueda realizada

@Escenario2
  Scenario: Realizar busqueda por medio de la seleccion de categorias destacadas de la pagina panamericana.com.co
    When realizo la busqueda de un producto por medio de la seleccion de categoria LIBROS
    Then al seleccionar un producto en especifico por medio de categorias LIBROS valido el producto seleccionado 12 RELATOS IMPUROS

@Escenario3
  Scenario: Realizar busqueda de producto por medio de la opcion menu de la pagina panamericana.com.co
    When realizo la busqueda por la opcion menu hasta seleccionar un portatil
    Then valido que el portatil seleccionado sea PORTÁTIL ACER GAMING, INTEL CORE I5, RAM 8 GB, 512 GB SSD, AN515-55-54Y1, 15.6", NEGRO




