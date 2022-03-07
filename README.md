# Bachelorarbeit Wirtschaftsinformatik Hochschule Mainz

Dieses Repository enthält die Bachelorarbeit zu meinem Studium an der HS Mainz im Studiengang Wirtschaftsinformatik dual mit dem Titel: 

**Evaluation der Reinforcement Learning Algorithmen Sarsa und Q-Learning am Beispiel eines Strategiespiels**

Die fertige Bachelorarbeit als PDF kann [hier](https://github.com/JonasBingel/ThesisHSMZ-RLTicTacToe/blob/main/Bingel_Jonas_Bachelorarbeit.pdf) eingesehen werden.

## Management Summary
Die vorliegende Bachelorarbeit befasst sich mit Reinforcement Learning, das ein Teilgebiet
des Machine Learning ist. Reinforcement Learning und die zugehörigen Methoden zur Lösung
sequenzieller Entscheidungsprobleme werden erklärt und von den anderen Teilgebieten des
Machine Learning abgegrenzt. Der Fokus der Arbeit liegt auf dem Teilgebiet des Temporal-
Difference Learning und den Algorithmen Q-Learning und Sarsa. Die Arbeit erläutert das
Konzept von Temporal-Difference Learning. Basierend darauf werden Q-Learning und Sarsa
erklärt und miteinander verglichen. Zur weiteren Evaluation der Algorithmen werden diese für
das Strategiespiel Tic-Tac-Toe in Java implementiert. Es wird untersucht, ob beide Algorithmen
das Spiel durch Spiele gegen sich selbst erlernen können und welche Auswirkungen verschiedene
Hyperparameter auf das Training haben. Die trainierten Agenten werden auf Basis der Rate
optimaler Aktionen während des Trainings und der erreichten Spielstärke verglichen. Die
Auswertung zeigt, dass Q-Learning im Durchschnitt schneller konvergiert und eine höhere
Spielstärke erreicht als Sarsa.


## Konklusion
In dieser Bachelorarbeit wurden Reinforcement Learning und die zugehörigen Methoden zur
Lösung sequenzieller Entscheidungsprobleme erklärt. Der Fokus lag auf dem Teilgebiet des
Temporal-Difference Learning und den zugehörigen Algorithmen Q-Learning und Sarsa. Die
Funktionsweise der Algorithmen wurde erklärt und deren Gemeinsamkeiten sowie Unterschiede
aufgezeigt. Zur weiteren Untersuchung der Algorithmen und deren Hyperparametern wurden
beide für das simple Strategiespiel Tic-Tac-Toe in Java implementiert. Untersucht wurden
verschiedene Ausprägungen der Lernrate α, die im Rahmen von Vorexperimenten festgelegt
wurden. Zudem wurden die Agenten mit zwei verschiedenen Arten von Self-play trainiert.
Zusätzlich wurde das Konzept der Afterstates in Form einer W-Tabelle implementiert. Eine
mögliche Definition einer Rewardfunktion wurde erläutert und zum Training der Agenten
sowie der Quantifizierung der Spielstärke verwendet. Zur Auswertung der trainierten Agenten
wurde deren Konvergenz während des Trainings sowie deren Spielstärke gegen einen Minimax-
Algorithmus und Spieler mit Zufallstrategie erfasst und verglichen. Beide Algorithmen erreichten
mit der gleichen Hyperparameterkombination und Nutzung von Afterstates die jeweils besten
Agenten, die eine höhere Spielstärke besitzen als der Minimax-Algorithmus. Die Auswertung
ergab, dass Q-Learning im Durchschnitt schneller konvergiert und eine höhere Spielstärke
erreicht als Sarsa. Verwendet Sarsa keine Afterstates konnten leichte Schwächen für das Symbol
O festgestellt werden. Beide Agenten bewerteten die „Mitte“ als beste erste Aktion, was
konsistent zu anderen Experimenten ist.

## Verbundene Repositories

Neben diesem Repository, das meine Bachelorarbeit enthält, gibt es zwei weitere Repositories, die Source Code enthalten, der im Rahmen meiner Bachelorarbeit entstanden ist:
- [ThesisHSMZ-RLTicTacToe-Java](https://github.com/JonasBingel/ThesisHSMZ-RLTicTacToe-Java) Java-Anwendung zur Durchführung der Experimente
- [ThesisHSMZ-RLTicTacToe-Jupyter](https://github.com/JonasBingel/ThesisHSMZ-RLTicTacToe-Jupyter) Jupyter-Notebook zum Erstellen der Liniendiagramme mit Matplotlib
