## Урок 2. Основы Spring. Spring Boot
### Базовое задание:
Добавить в простое CRUD веб-приложение, которое было разработано на семинаре функцию 
удаления данных о пользователе:
1) В класс UserRepository добавить метод public void deleteById(int id) -
удаления записи пользователя из БД по ID.
2) В класс UserService добавить метод public void deleteById(int id) -
удаление пользователя через репозиторий.
3) В класс UserController добавить метод public String deleteUser(@PathVariable("id") int id)
(с аннотацией: @GetMapping("user-delete/{id}")) - перехват команды на удаление студента от браузера.

Если задание выполнено верно, то при запуске приложения 
по адресу http://localhost:8080/users будет работать кнопка удаления пользователя по ID.

Приложение в папке:
[Ссылка](https://github.com/PavelLogeiko/Spring_HW02/tree/main/CRUDSpringWeb)

Скрины работы приложения:

1) Создание пользователей
![1](https://github.com/PavelLogeiko/Spring_HW02/blob/main/CRUDSpringWeb/images/1.png)

2) Удаление пользователей

![2](https://github.com/PavelLogeiko/Spring_HW02/blob/main/CRUDSpringWeb/images/2.png)

![3](https://github.com/PavelLogeiko/Spring_HW02/blob/main/CRUDSpringWeb/images/3.png)
