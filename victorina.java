
Конечно, вот пример простой викторины на JavaScript, которая может выполняться непосредственно в браузере пользователя:

<!DOCTYPE html>
<html>
<head>
    <title>JavaScript Викторина</title>
</head>
<body>
    <h1>JavaScript Викторина</h1>
    <div id="quiz"></div>
    <button id="submit">Проверить ответы</button>

    <script>
        // Вопросы и ответы
        const questions = [
            {
                question: "Какой язык программирования используется для создания динамических веб-страниц?",
                options: ["Java", "Python", "JavaScript", "C++"],
                answer: 2
            },
            {
                question: "Какой объект используется для вывода информации в консоль браузера?",
                options: ["console", "window", "document", "alert"],
                answer: 0
            },
            {
                question: "Как создать новый элемент HTML-страницы с помощью JavaScript?",
                options: ["create()", "newElement()", "createElement()", "add()"],
                answer: 2
            }
        ];

        // Инициализация викторины
        function initQuiz() {
            const quizContainer = document.getElementById("quiz");
            const submitButton = document.getElementById("submit");

            let output = [];

            questions.forEach((question, index) => {
                let options = [];

                for (let i = 0; i < question.options.length; i++) {
                    options.push(
                        <label>
                            <input type="radio" name="question${index}" value="${i}">
                            ${question.options[i]}
                        </label><br>
                    );
                }

                output.push(
                    <div class="question">
                        <h3>${index+1}. ${question.question}</h3>
                        ${options.join("")}
                    </div>
                );
            });

            quizContainer.innerHTML = output.join("");

            // Обработка нажатия кнопки "Проверить ответы"
            submitButton.addEventListener("click", showResults);
        }

        // Показать результаты
        function showResults() {
            const quizContainer = document.getElementById("quiz");
            const answerContainers = quizContainer.querySelectorAll(".question");

            let score = 0;

            questions.forEach((question, index) => {
                const answerContainer = answerContainers[index];
                const selectedOption = answerContainer.querySelector(input[name=question${index}]:checked);

                if (selectedOption.value == question.answer) {
                    score++;
                }

                answerContainer.style.color = "green";
            });

            // Отображение итогов
            quizContainer.innerHTML += <p>Вы ответили правильно на ${score} из ${questions.length} вопросов.</p>;
        }

        // Инициализация викторины после загрузки страницы
        window.addEventListener("load", initQuiz);
    </script>
</body>
</html>


Просто сохраните данный код в файле с расширением .html и откройте его в браузере. Викторина будет отображена, и вы сможете пройти ее, выбирая варианты ответов и нажимая на кнопку "Проверить ответы". Результаты будут отображены под вопросами.
