# Задание 1

Мы пишем программу для учета наших расходов. 
Основным объектом нашей программы должен быть класс `Expense` коорый будет содержать в себе информацию 
о каждом расходе - amount, name, category.
У нас есть 5 основных категорий расходов - `FOOD, LIFE, PURCHASE, TRANSPORT, OTHER`.
Каждый расход мы регистрируем через командную строку в формате 
```
    amount:name:CATEGORY
```
На каждый подобный ввод должен создаваться новый объект `Expense`.
Наша задача распарсить строку и создать из неё новый объект `Expense`.
Например при вводе
```
    25:pizza:FOOD
```
должен создать расход в 25 евро категории FOOD и с именем pizza.
Если ввод не в правильном формате, программа должна бросать понятную ошибку, но при этом не умирать.

На данном этапе с созданными `Expense` ничего делать не надо, на данном этапа мы лишь должны 
предоставить рабочую функциональность ввода расходов.
Желательно, чтоб категории были в виде `enum`. 
Других ограничений нит.