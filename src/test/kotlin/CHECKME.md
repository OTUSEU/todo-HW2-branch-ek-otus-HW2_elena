Домашнее задание № 2 
## Разработка тестов для ToDo приложения.
Задание не принято, несмотря на то, что все тесты дают зеленые галки:
2.В исходном todo в классе class TasksRepositoryMemory : TasksRepository() {
случайно оставлено val tasks = mutableListOf<Task>()
а должно быть private val tasks = mutableListOf<Task>()
Но все равно в тестах обращаться к нему напрямую не надо:
Так не надо taskTestRepository.tasks.add
Так надо taskTestRepository.addTask, т.к. мы тестируем API todo
Поставьте private val tasks = mutableListOf<Task>() и доделайте тесты
3. обратите внимание, что в задании 3 требуется:
   проверить корректность работы фильтра по завершенным задачам
В целом соображения правильные, но сделано как проще а не по заданию.
Задание в доработку.
4. в сборе проекта что-то было нарушено: не стартовали тесты
Проект заменен с чистого шаблона с текстом слушателя
Теперь все стартует



### Описание/Пошаговая инструкция выполнения домашнего задания:
Дано приложение с кодом для запуска из-под IntelliJ IDEA 2023.1.*
https://github.com/otus-qa-kotlin/todo.git
https://github.com/OTUSEU/lesson_1_todo.git
Написать три теста и сформировать отчеты в > test через MainKtTest

1. Возьмите (Fork, Clone, Zip), запустите и изучите код приложения ToDo
2. Сделать тест добавления задачи и появления ее в списке 
3. Завершить задачу и проверить корректность работы фильтра по завершенным задачам
4. Проверить сортировку задач по названию и сроку исполнения
5. Сформировать отчет с использованием библиотеки Allure Kotlin
6. Проверьте работоспособность написанного кода (запуском тестов из IntelliJ).
7. Код залейте на github. Название репозитория - otus-qa-kotlin-hw, ветка hw02-todo.
   В ДЗ отправьте ссылку на pull request или ссылку на репозиторий.
   Вам потребуется 90-120 минут на выполнения задания.
   Если возникнут сложности, вы всегда можете обсудить их с одногруппниками или задать вопрос преподавателю Slack

### Критерии оценки:
* Созданы тесты добавления, завершения, фильтрации и сортировки - 5.
* Подготовлен отчет в формате Allure - 3.
* Соблюдены правила форматирования, функции, классы и переменные назвали осмысленно - 2.
* Работа считается принятой, если оценка или более баллов.
* Максимальная оценка за работу - 10.
      
### Критерии приемки:
Результатом должен быть код теста, который заполняет пустой список задач тестовыми данными
и проверяет корректность текущего состояния списка при выполнении

