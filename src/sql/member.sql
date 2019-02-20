계정만드는법
	* 
CREAT USER oracle IDENTIFIED BY password;


            CREATE USER가 키워드 oracle ID
            DB에서는 대문자가 키워드, 소문자 id
	* 
oracle/password


password는 설치시 입력했던 비번
DB는 테이블구조 ex) tr*3>td*5
만든계정에 접속
sqlplus oracle/password
권한부여
GRANT RESOURCE, CONNECT, DBA TO oracle;
    리소스접근권한,  연결권한       
   
    -- 현재사용자 정보
SHOW USER;

--테이블 생성
CREATE TABLE member(
   id VARCHAR2(10),
   name VARCHAR2(10),
   pass VARCHAR2(10),
   ssn VARCHAR2(14)
);

                                ( )<--속성값
                                안에 들어간 값은 MemberBean의 멤버변수
                                오라클은 타입이 뒤에붙음 ex)VARCHAR2()
                                마지막은 ; 없음
                                
--테이블 삭제
DROP TABLE member;

--인스턴스 생성
DB에서 한 row를 추가하는 행동
	* 
싱글쿼터임 ' '


INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '900101-1234567');

SELECT * FROM member;