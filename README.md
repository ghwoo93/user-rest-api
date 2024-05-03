# user-rest-api 를 TDD로 구축해보자! 
TDD 스터디를 위한 사용자 관리 구축 시나리오 틀입니다. (2024.05.03) <br>
TDD 방법론을 활용해 아래 기능을 무사히 구현해주세요 :-D <br> 
개발 시간이 된다면 유효성 검증도 함께 TDD로 활용해보면 좋을 것 같아 추가했습니다. <br>

발제자 : 0216tw <br>
기한 : ~ 2024.05.09 23:00 까지 <br> <br>

## 사전 시나리오 👩‍💻

우리는 사용자 관리를 위한 rest api를 구축해야합니다. <br> 
현재 controller , service , repository , dto 틀은 정해졌지만 내부 로직은 아무것도 구현되지 않았습니다. <br>
(독립적인 개발이 가능하도록 실제 DB연결은 하지 않습니다.) <br><br><br>


### 우리가 구현하고자 하는 기능은 다음과 같습니다. <br>

### [주요 기능] (필수 구현 , 입출력 등은 편하게 변경하셔도 됩니다.) 
1. 사용자 모두 조회하기 (findUserAll)
2. id로 특정 사용자 정보 조회하기 (findUserById)
3. 사용자 입력하기 (createUser)
4. 사용자 수정하기 (updateUser)
5. 사용자 삭제하기 (deleteUser)

### [추가 유효성 검사] (선택 구현) 
1. 사용자 입력시 id는 숫자,영문자 조합으로 최대 7자리까지만 가능합니다.(한글불가) ex) abcD123 -> 가능 , 뮤뮤1@# -> 불가능
2. 사용자 조회시 id에 특수문자를 사용할 수 없습니다. ex) ' or 1=1 -- 불가능  
3. 사용자 입력시 이미 똑같은 이름이 존재한다면 입력 불가능하도록 에러응답을 리턴해주세요. (코드 및 메세지 자유) 
4. 사용자 수정시 이미 똑같은 이름으로 수정하려면 에러응답을 리턴해주세요.  (코드 및 메세지 자유)
5. 사용자 삭제시 존재하지 않는 사용자를 삭제하려 할 경우 에러응답을 리턴해주세요. (코드 및 메세지 자유) 

### [ 이외에 본인이 만들어보고 싶은 기능이 있다면 편하게 구현해보고 가르쳐주세요 ] 👍👍👍👍

<br><br> 
<hr> 


### [디렉터리 구조도] <br> 
기본적인 틀은 아래와 같습니다. (편하게 변경하셔도 상관없습니다. 말 그대로 단순히 틀이에요) <br> 

![image](https://github.com/0216tw/user-rest-api/assets/140934688/cf5f1180-dc41-4e5c-ad8e-68e1c0adb97c)



### TDD 관련 레퍼런스 
https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html (mockito 레퍼런스) <br>
https://github.com/0216tw/Spring-restdocs/blob/main/src/test/java/com/study/restdocs/user/UserTest.java  (restdocs 예시 만들면서 사용한 TDD 예시) <br> 



