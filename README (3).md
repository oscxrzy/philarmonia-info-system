# Информационно-справочная система филармонии

Курсовой проект по дисциплине **«Современные технологии программирования»**.  
Тема: **«Информационно-справочная система филармонии»**.

Проект представляет собой веб‑приложение для просмотра афиши (мероприятий), получения справочной информации и базового администрирования (CRUD для концертов).  
Стек: **Java + Spring Boot + Spring Security + Spring Data JPA (Hibernate) + Thymeleaf + MySQL/H2**.

---

## Функциональные возможности

### Пользователь (гость/пользователь)
- Просмотр афиши (список мероприятий)
- Просмотр страницы конкретного мероприятия (детали: название, описание, дата/время, зал, артисты)

### Администратор
- Добавление/редактирование/удаление мероприятий (CRUD)
- Управление справочниками (артисты, залы) — можно расширить

### Безопасность
- Аутентификация и авторизация через Spring Security
- Ролевой доступ (пример: `ADMIN`, `USER`, `STAFF`)

---

## Структура проекта

```text
webapp/
 ├─ src/main/java/com/example/filarmonic/
 │   ├─ Application.java
 │   ├─ config/          # конфигурации (SecurityConfig и др.)
 │   ├─ controller/      # MVC контроллеры
 │   ├─ model/           # JPA сущности (User, Role, UserRole, Concert, Artist, Hall, Ticket)
 │   ├─ repository/      # Spring Data репозитории
 │   └─ service/         # бизнес-логика (интерфейсы/реализации)
 ├─ src/main/resources/
 │   ├─ templates/       # Thymeleaf шаблоны
 │   ├─ static/          # css/js/img
 │   └─ application.properties
 └─ pom.xml
```

---

## Требования

- **Java 11+** (рекомендуется 11/17)
- **Maven** (для сборки и запуска)
- **MySQL** (для “боевого” варианта) или **H2** (для локального теста)

---

## Запуск (вариант 1 — H2, быстро)

Если в `application.properties` настроена H2:

```bash
cd webapp
mvn spring-boot:run
```

Открыть:
- Главная: `http://localhost:8080/`
- (если включено) H2 Console: `http://localhost:8080/h2-console`

---

## Запуск (вариант 2 — MySQL)

1) Создайте базу:

```sql
CREATE DATABASE filarmonic_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2) В `src/main/resources/application.properties` укажите:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/filarmonic_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=YOUR_USER
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
```

3) Запуск:

```bash
cd webapp
mvn spring-boot:run
```

---

## Демо-аккаунты (пример)

Если используются in‑memory пользователи (Spring Security), обычно:
- **admin / adminpass** — роль `ADMIN`

> Точные логины/пароли смотри в `SecurityConfig.java`.

---

## Мини‑чеклист тестирования

- Открыть главную страницу → афиша отображается
- Открыть страницу мероприятия → данные выводятся корректно
- Войти под admin → добавить концерт → он появляется в афише
- Проверить, что админ‑страницы недоступны без роли `ADMIN`

---

## Что сдаётся (типовой набор)

- Пояснительная записка в PDF (и при необходимости DOCX)
- Ссылка на репозиторий GitHub в приложении к записке
- Исходный код проекта (этот репозиторий)
- Презентация для защиты (если требует руководитель)

---

## Автор

**Тагиров Аскар Ильдарович**  
Группа: **ДЦПУП23-1**, курс: **3**

---

Учебный проект.
