# ๐๋๋ง์ ๋ธ๋ก๊ทธ ๋ง๋ค๊ธฐ - Version 2
##  **๐กSpring Boot๋ฅผ ํ์ฉํ์ฌ ๋๋ง์ ๋ธ๋ก๊ทธ ๋ง๋ค๊ธฐ**

- **ํ๋ก์ ํธ ๊ธฐ๊ฐ : 2022.06.08~ 2022.06.18**
    
<br/>

## ๐ก ํ๋ก์ ํธ ๋ชฉํ
- ๋ธ๋ก๊ทธ version1 ์ ์ฝ๋๋ฅผ ๋ฆฌํฉํ ๋งํ์ฌ ์ค๋ณต๋๋ ์ฝ๋๋ฅผ ์ค์ด๊ณ  ๊ฐ๋์ฑ์ ๋์
- ๋ธ๋ก๊ทธ version1 ์์ ํ์ง ๋ชปํ๋ ์ถ๊ฐ ๊ธฐ๋ฅ ๊ตฌํ (๋๊ธ)
- ์ถ๊ฐ ๊ธฐ๋ฅ๊ตฌํ๋ณด๋ค๋ ์ฝ๋ ๋ฆฌํฉํ ๋ง์ ์ด์ ์ ๋ง์ถค
- [๋ธ๋ก๊ทธver1๊นํ๋ธ](https://github.com/emperor-juwon/blog_project_version_1)

<br/>

## ๐ก ๋ธ๋ก๊ทธ ver2 ์์ ์๊ทธ๋ ์ด๋ ๋ ๋ถ๋ถ
> ### API Controller ์ถ๊ฐ

- ๋ธ๋ก๊ทธ ver1 ์์๋ ํ์ด์ง๋ฅผ ๋ฆฌํดํ๋ @Controller ์์ ๋ฐ์ดํฐ๋ฅผ ๋ฆฌํดํ๋ ๊ฒฝ์ฐ๊ฐ ์๊ธธ ์์ @ResponseBody๋ฅผ ์ฌ์ฉํด์ ๋ฐ์ดํฐ๋ฅผ ๋ฆฌํดํ์
- ์ด๋ฒ์๋ ๋ฐ์ดํฐ๋ฅผ ๋ฆฌํดํ๋ ApiController(@RestController)๋ฅผ ๋ถ๋ฆฌํ์ฌ ๊ตฌํ
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก](https://blog.naver.com/fwangjuwon/222680204093)

> ### Global Exception์ฒ๋ฆฌ 
- ๋ด๊ฐ ์ ์ดํ  ์ ์๋ ์์น์์ ํฐ์ง๋ ์ค๋ฅ๋ฅผ ๋ง๋ฌ์ ๋, ๋ด๊ฐ ์ํ๋ ์์ธ ์ฒ๋ฆฌ๋ฅผ ํด์ฃผ๊ธฐ ์ํด ์ ์ญ์ ์ผ๋ก ์ฌ์ฉํ  ์ ์๋ Exception ์ฒ๋ฆฌ
- @ControllerAdvice๋ฅผ ์ฌ์ฉํ๋ฉด ๋ชจ๋  exception์ ๋์์ฑ ์ ์๊ณ , @ExceptionHandler ๋ก ํน์  ์์ธ์๋ง ๋์์ฑ๋๋ก ์ฒ๋ฆฌ
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก](https://blog.naver.com/fwangjuwon/222680270814)


> ### ajax ์ฌ์ฉ
- ํ์ด์ง ์ ์ฒด ๋ฆฌ๋ก๋ฉ์ด ์๋ ๋ถ๋ถ ๋ฆฌ๋ก๋ฉ์ด ๊ฐ๋ฅํ์ฌ ํต์ ํ ๊ฒฐ๊ณผ๋ฅผ ํตํด CSR(Client Side Rendering) ์ด ๊ฐ๋ฅ
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก](https://blog.naver.com/fwangjuwon/222754964393)

> ### throw ์ฌ์ฉ
- ๊ฐ์ ๋ก ํฐ์ง ํด๋น Exception์ ์๋ฌ ํธ๋ค๋ฌ๊ฐ ๋์์ฑ๋๋ก ์ฒ๋ฆฌ
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก](https://blog.naver.com/fwangjuwon/222682690840)

> ### interceptor๋ฅผ ์ฌ์ฉํ ์ธ์ฆ์ฒ๋ฆฌ
- ์ปจํธ๋กค๋ฌ ๋ฉ์๋์ ์ ์ฒ๋ฆฌ์ ํ์ฒ๋ฆฌ๋ฅผ ์ ์ดํ  ์ ์๋๋ก ์ธํฐ์ํฐ ํด๋์ค ์ ๊ณต
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก](https://blog.naver.com/fwangjuwon/222685109976)

> ### ๋๊ธ๊ธฐ๋ฅ ์ถ๊ฐ
- ๊ฒ์๊ธ ์์ธ๋ณด๊ธฐํ  ๋ ๋๊ธ๊ธฐ๋ฅ ์ถ๊ฐ
-> Post๋ฅผ SELECT ํ๋๋ฐ Comment๊น์ง ๊ฐ์ง๊ณ  ์ฌ ์ ์์ ๋ ์๋ฐฉํฅ ๋งคํ(@OneToMany) ์ฌ์ฉ
- ์๋ฐฉํฅ ๋งคํ์ ์ฌ์ฉํ๋ฉด MessageConverter๊ฐ getter๋ฅผ ๋๋ฆด ๋ ๋ฌดํ ๋ก๋ฉ ๋ฌธ์  ์๊น (n+1๋ฌธ์ )
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก1](https://blog.naver.com/fwangjuwon/222686540045)
- [๊ด๋ จ๊ณต๋ถ๊ธฐ๋ก2](https://blog.naver.com/fwangjuwon/222734758279)

<br/>

 ## ๐ก ์ฌ์ฉ ๊ธฐ์ 

<img src="https://img.shields.io/badge/-Java-007396"/>  <img src="https://img.shields.io/badge/-Spring-6DB33F"/>  <img src="https://img.shields.io/badge/-Apach%20Tomcat-F8DC75"/> <img src="https://img.shields.io/badge/-MariaDB-071D49"/> 
<img src="https://img.shields.io/badge/-HTML5-E34F26"/> <img src="https://img.shields.io/badge/-CSS-1572B6"/> <img src="https://img.shields.io/badge/-JavaScript-F7DF1E"/> <img src="https://img.shields.io/badge/-JQuery-0769AD"/> 
<img src="https://img.shields.io/badge/-Github-181717"/> <img src="https://img.shields.io/badge/-Git-F05032"/> <img src="https://img.shields.io/badge/-BootStrap-7952B3"/> 

- **๊ฐ๋ฐ ์ธ์ด**: Java 11, HTML 5, CSS, JavaScript
- **DataBase**: MariaDB 10.6

- **Library**
- ***Front***
    - Bootstrap 5.1.3, jQuery 3.5.1, Summernote, Mustache
- ***Back***
    - Spring Web, Spring Boot Devtools, Lombok, MariaDB Driver, Spring Data JPA
- **๊ฐ๋ฐ ํ๊ฒฝ** : VS Code, SpringBoot 2.5.12, Gradle, Lombok, JPA
<br/>
<br/>
  
## ๐ก****๋ธ๋ก๊ทธ ver.2 ์์ ์ถ๊ฐ๋ ๊ธฐ๋ฅ ****

### ๐  ****๋๊ธ ๊ด๋ จ ๊ธฐ๋ฅ****
- ๋๊ธ ์์ฑ ๋ฐ ์ญ์  ๊ธฐ๋ฅ

| ๋๊ธ ์์ฑ| ๋ณธ์ธ ๋๊ธ๋ง ์ญ์  |
|------|------|
|![commentwritereal](https://user-images.githubusercontent.com/104547351/173788224-13c82241-e3c6-44dd-9bb6-029e32671cc6.gif)|![commentwrite](https://user-images.githubusercontent.com/104547351/173788228-eb4d58f0-5aae-40cd-84d7-fadb45d39ad2.gif)|
<br/>

## ๐กERD
<img width="423" alt="Screenshot_28" src="https://user-images.githubusercontent.com/104547351/173792144-15834a49-0ce6-4e96-be1d-363e27c6e384.png">


<br/>

## ๐ก ํ๋ก์ ํธ ๋ฆฌ๋ทฐ ๋ฐ ๊ฐ์ ๋ฐฉํฅ
- RestController์ Controller๋ฅผ ๋๋์ด ์ฌ์ฉํ๋ ๋ถํ์ํ ์ฝ๋ (@Responsebody, @Requestbody ๋ฑ)๋ฅผ ์ค์ผ ์ ์์์
- exception์ฒ๋ฆฌ ๋ฐ throw์ฒ๋ฆฌ๋ก error ๋ฐ์์ ์ค์ผ ์ ์์์
- testํ๋ ์ฝ๋๋ค(ex- systemout, console.log) ์ ์ ๋ฆฌํ๋ฉด์ ์์ํ  ๊ฒ
- ์ธ์ฆ๊ณผ ๋ณด์๊ธฐ๋ฅ ๊ฐํ ํ์