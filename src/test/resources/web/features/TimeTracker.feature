@Regression @TimeTracker
Feature: Creo un nuevo Workspace

Background: 
Given me encuentro el en home de usuarios logueado con una cuenta valida
And estoy en la url "https://app.clockify.me/tracker#"

@registroDeHoras @RegistroConFechayHora @Smoke
Scenario Outline: Creo un nuevo registro de horas trabajadas
When clickeo en la seccion "Manual" 
And nombro mi proyecto <proyecto>
And clickeo sobre el logo del calendario
And añado la fecha <fecha>
And añado una hora de inicio del proyecto <inicio>
And añado una hora de final del proyecto <final>
And clickeo el boton "ADD"
Then se habra creado un nuevo trackeo de tiempo con las horas 
Examples:
|proyecto   |fecha            |inicio     |final   |
|AA         | 22/04/2024      |  2300     | 0000   |
|BB         | 13/09/2023      |  1300     | 1500   |

