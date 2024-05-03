@Regression @TimeTracker
Feature: Creo un nuevo Workspace

Background:
  Given estoy en la landing page de clockify
  And clickeo el boton Log in
  And clickeo el boton " Log in manually "
  And ingreso un "email", un "password" y clikeo el boton Log In

@registroDeHoras @RegistroConFechayHora @Smoke
Scenario Outline: Creo un nuevo registro de horas trabajadas
When clickeo el boton "TIME TRACKER"
And clickeo sobre el boton "Manual"
And nombro mi proyecto <proyecto>
And clickeo sobre el boton "Today"
And añado la fecha <fecha>
And añado una hora de <inicio> del proyecto
And añado una hora de <final> del proyecto
And clickeo el boton "ADD"
Then se crea un nuevo "time entry"
Examples:
|proyecto   |fecha            |inicio     |final   |
|AA         | 22/04/2024      |  2300     | 0000   |
|BB         | 13/09/2023      |  1300     | 1500   |

