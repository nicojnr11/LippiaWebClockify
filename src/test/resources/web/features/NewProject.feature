@Regression @NewProject
Feature: Creo un New project en clockify

Background:
Given estoy en la landing page de clockify
  And clickeo el boton Log in
  And clickeo el boton " Log in manually "
  And ingreso un "email", un "password" y clikeo el boton Log In
And clickeo el boton " Projects "

@NewProjectExitoso1 @Smoke
Scenario: Creo de un nuevo proyecto
When clickeo el boton " Create new "
And nombro mi proyecto "NuevoProyecto"
And clickeo el boton " Create "
Then se crea un nuevo "proyecto"

@NewProjectExitoso @StatusPrivate
Scenario: Creo de un nuevo proyecto en modo privado
When clickeo sobre el boton "CREATE NEW PROJECT"
And nombro mi proyecto "NuevoProyectoPrivado"
And clickeo sobre el checkbox de "Public" 
And clickeo el boton "CREATE"
Then se valida que se haya creado un nuevo proyecto privado

@NewProjectExitoso @ColorChange
Scenario: Creacion de un nuevo proyecto con color distinto al custom
When clickeo sobre el boton "CREATE NEW PROJECT"
And nombro mi proyecto "NuevoProyectoColor"
And clickeo sobre el cuadro con color
And clickeo el color "Verde"
And clickeo el boton "CREATE"
Then se valida que se haya creado un nuevo proyecto con el color elegido

@NewProjectExitoso @AddClient
Scenario: Creacion de un nuevo proyecto para un cliente elegido
When clickeo sobre el boton "CREATE NEW PROJECT"
And nombro mi proyecto "NuevoProyectoCliente"
And clickeo sobre el dropdown de "Select Client" 
And clickeo la opcion "Cliente1"
And clickeo el boton "CREATE"
Then se valida que se haya creado un nuevo proyecto para ese cliente

@NewProjectFallido @Smoke
Scenario: Creacion de un nuevo proyecto fallido
When clickeo sobre el boton "CREATE NEW PROJECT"
And nombro mi proyecto "@"
And clickeo el boton "CREATE"
Then se muestra un cartel "Project name has to be between 2 and 250 characters long"

@NewProjectFallido @proyectoRepetido
Scenario: Creacion de un nuevo proyecto repitiendo el nombre de uno existente
When clickeo sobre el boton "CREATE NEW PROJECT"
And nombro mi proyecto "NuevoProyecto"
And clickeo el boton "CREATE"
Then se muestra el cartel "project for client already exists."


