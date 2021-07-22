<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Форма ввода</h2>
<br><br>
<div>
    <form action="allPeople" method="post">
        <label>
            <input type="text" name="peopleName"
                   placeholder="Имя">
        </label>
        <br>
        <label>
            <input type="text" name="lastName"
                   placeholder="Фамилия">
        </label>
        <br>
        <label>
            <input type="text" name="patronymic"
                   placeholder="Отчество">
        </label>
        <br>
        <label>
            <input type="text" name="birthday"
                   placeholder="Дата рождения  ГГГГ.ММ.ДД">
        </label>
        <br>
        <label>
            <input type="text" name="sex"
                   placeholder="Пол">
        </label>
        <br>
        <h4>Паспорт</h4>
        <br>
        <label>
            <input type="text" name="seriesPas"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberPas"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="datePas"
                   placeholder="Дата выдачи">
        </label>
        <br>
        <h4>СНИЛС</h4>
        <br>
        <label>
            <input type="text" name="seriesSnils"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberSnils"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="dateSnils"
                   placeholder="Дата выдачи">
        </label>
        <br>
        <h4>ИНН</h4>
        <br>
        <label>
            <input type="text" name="seriesInn"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberInn"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="dateInn"
                   placeholder="Дата выдачи">
        </label>
        <br>
        <h4>Водительское удостоверение</h4>
        <br>
        <label>
            <input type="text" name="seriesPrav"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberPrav"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="datePrav"
                   placeholder="Дата выдачи">
        </label>
        <br>
        <h4>Приписное свидетельство</h4>
        <br>
        <label>
            <input type="text" name="seriesPrip"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberPrip"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="datePrip"
                   placeholder="Дата выдачи">
        </label>
        <br>
        <h4>Военный билет</h4>
        <br>
        <label>
            <input type="text" name="seriesVoen"
                   placeholder="Серия">
        </label>
        <label>
            <input type="text" name="numberVoen"
                   placeholder="Номер">
        </label>
        <label>
            <input type="text" name="dateVoen"
                   placeholder="Дата выдачи">
        </label>
        <br>

        <input type="submit" value="Сохранить">
    </form>
</div>
</body>
</html>
