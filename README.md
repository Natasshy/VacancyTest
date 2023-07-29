
# Проект по автоматизации тестирования для компании [Level.Travel]([https://www.x5.ru/ru/](https://career.level.travel/middle_qa))

> Level.Travel — первый в России сервис бронирования туров онлайн.

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

* <a href="https://www.jetbrains.com/idea/"><img src="media/logo/idea.png" width="50" height="50"  alt="IDEA"/></a>    
* <a href="https://junit.org/junit5/"><img src="media/logo/junit5.png" width="50" height="50"  alt="JUnit 5"/></a>  
* <a href="https://gradle.org/"><img src="media/logo/gradle.png" width="50" height="50"  alt="Gradle"/></a>  
* <a href="https://selenide.org/"><img src="media/logo/selenide.png" width="50" height="50"  alt="Selenide"/></a>  
* <a href="https://aerokube.com/selenoid/"><img src="media/logo/selenoid.png" width="50" height="50"  alt="Selenoid"/></a>  
* <a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="media/logo/allure.png" width="50" height="50"  alt="Allure"/></a> 
* <a href="https://www.jenkins.io/"><img src="media/logo/jenkins.png" width="50" height="50"  alt="Jenkins"/></a>  

</p>


____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *Проверка наличия лого на странице*
- ✓ *Проверка наименования вакансии*
- ✓ *Проверка наличия описания вакансии на странице*
- ✓ *Проверка наличия описания компании на странице'*
- ✓ *Проверка наличия контактов на странице'*



____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/logo/jenkins.png" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/qa_guru_20_jenkins_nataliaHavana_jenkins_vacancy_test/29/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/"><img src="media/sreen/jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *browser (браузер, по умолчанию chrome)*
- *browserVersion (версия браузера, по умолчанию 100.0)*
- *browserSize (размер окна браузера, по умолчанию 1920x1080)*
- *baseUrl (адрес тестируемого веб-сайта)*
- *remoteUrl (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean simple_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean
simple_test
"-Dselenide.remote=https://user1:1234@selenoid.autotests.cloud/wd/hub"
-DbaseUrl=${BASE_URL}
-Dselenoid=${SELENOID}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-Denvironment=${ENVIRONMENT}

```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="media/logo/allure.png" width="25"/></a> <a name="Allure"></a>Allure [отчет]([https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/allure/](https://jenkins.autotests.cloud/job/qa_guru_20_jenkins_nataliaHavana_jenkins_vacancy_test/29/allure/))</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/sreen/allure_main.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="media/sreen/allure.png" width="850">  
</p>

### *Графики*

  <p align="center">  
 

<img title="Allure Graphics" src="media/sreen/allure_graphs.png" width="850">  
</p>

____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="media/logo/telegram.png" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/sreen/telegram.png" width="550">  
</p>

____
 
