@Regression @NewWorkspace
Feature: Creo un nuevo Workspace

Background: 
Given estoy logueado con mi cuenta en clockify 
And estoy en la url "https://app.clockify.me/workspaces"

@NuevoWorkspaceExitoso @Smoke
Scenario: Creo un nuevo workspace
When clickeo el boton "CREATE NEW WORKSPACE"
And nombro mi nuevo workspace "Espacio de trabajo"
And clickeo el boton "CREATE"
Then se valida que se haya creado ese nuevo workspace

@NuevoWorkspaceFallido @Smoke
Scenario: Creacion un nuevo workspace fallido
When clickeo el boton "CREATE NEW WORKSPACE"
And nombro mi nuevo workspace "@"
Then se muestra el cartel "Workspace name has to be between 2 and 250 characters long"
