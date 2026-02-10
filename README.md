# Лабораторная работа №5 — Jetpack Compose: контейнеры, ARGB-модель и Material Design

[![Android](https://img.shields.io/badge/Platform-Android-brightgreen)](https://developer.android.com/jetpack/compose)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue)](https://kotlinlang.org/)
[![API 25+](https://img.shields.io/badge/Min_API-25+-orange)](https://developer.android.com/about/versions/nougat)

## Цель работы
Повторить основы разработки пользовательского интерфейса на Jetpack Compose, работу с контейнерами `Row` и `Column`, познакомиться с ARGB-моделью цветов, компонентом `Scaffold` и принципами Material Design.

## Содержание работы

### 1. Основы Jetpack Compose
- Создание структуры `MainActivity` с поддержкой Compose
- Использование `setContent{}` для определения UI
- Применение модификаторов (`padding`, `background`, `width`, `fillMaxSize`)
- Работа с текстовыми элементами (`Text`) и их стилизация

### 2. Контейнеры компоновки
- **`Column`** — вертикальное расположение элементов (сверху вниз)
- **`Row`** — горизонтальное расположение элементов (слева направо)
- Управление выравниванием через `horizontalArrangement` и `verticalArrangement`:
    - `Arrangement.SpaceAround`
    - `Arrangement.SpaceBetween`
    - `Arrangement.SpaceEvenly`
    - `Arrangement.Center`

### 3. Комбинированные контейнеры
- Вложение `Row` внутри `Column`
- Создание многострочных компоновок
- Использование `Spacer` для создания отступов между элементами
- Посимвольный вывод текста с фильтрацией (`filter { it.isLetter() }`)

### 4. ARGB-модель цветов
- Структура цвета: **A**lpha (прозрачность), **R**ed, **G**reen, **B**lue
- Форматы задания цветов:
    - Именованные: `Color.Red`, `Color.Blue`
    - Hex ARGB: `Color(0xFFFF0000)` — непрозрачный красный
    - Полупрозрачный: `Color(0x80FF0000)` — альфа-канал = 80 (50% прозрачности)
    - Десятичный: `Color(255, 0, 0, 128)`

### 5. Material Design и Scaffold
- Использование компонента `Scaffold` для построения стандартного экрана
- Слоты `Scaffold`:
    - `topBar` — верхняя панель навигации (`TopAppBar`)
    - `content` — основное содержимое
    - `floatingActionButton` — плавающая кнопка действия
- Соблюдение гайдлайнов Material Design 3


## Используемые технологии

| Технология | Версия | Назначение |
|------------|--------|------------|
| Kotlin | 1.9.0+ | Язык программирования |
| Jetpack Compose | 1.5.0+ | Декларативный UI-фреймворк |
| Material Design 3 | 1.2.0+ | Дизайн-система Google |
| Android Gradle Plugin | 8.1.0+ | Сборка проекта |
| Минимальный SDK | API 25 | Android 7.0 Nougat |

## Автор
Щербаков Данил Николаевич
## Группа
ИСП-232

