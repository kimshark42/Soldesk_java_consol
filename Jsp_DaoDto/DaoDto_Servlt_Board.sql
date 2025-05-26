USE my_cat;

CREATE TABLE board(
   B_NO INT PRIMARY KEY AUTO_INCREMENT,  # 글 번호
   B_TITLE CHAR(255) NOT NULL DEFAULT "", # 글 제목
   B_ID CHAR(225) NOT NULL DEFAULT 'ㅇㅇ',  # 글 작성자 ID
   B_TEXT TEXT NOT NULL,  # 글 내용, 댓글 내용
   B_DATETIME DATETIME NOT NULL DEFAULT now(),  # 글 작성 시간
   B_HIT INT NOT NULL DEFAULT 0,  # 글 조회수
   B_REPLY_COUNT INT NOT NULL DEFAULT 0,  # 댓글 수
   B_REPLY_ORI INT NOT NULL DEFAULT -1
);

SELECT * FROM board;

DROP TABLE board;

INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('제목','아이디','내용');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('TITLE','ID','CONTENT');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('title','id','content');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('12345','12','1234567');

INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('제목','아이디','내용');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('TITLE','ID','TEXT');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('title','id','text');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('12345','12','1234');

INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('따이', '상', '그것참 따이뾰이 하지 않소');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('따이','상어 따이;;;','shark');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('테스트 제목','테스트 내용,,,,,','shark4');
INSERT INTO board (B_TITLE, B_ID, B_TEXT) VALUES ('test name','test content,,,,','shark5');
 
SELECT * FROM board WHERE B_NO=4;
DELETE FROM board WHERE B_NO=1;
UPDATE board SET B_TITLE='bb',B_TEXT='bbbb' WHERE B_NO=4;
SELECT * FROM board WHERE B_NO=2;
DESC borad;

ALTER TABLE board ADD B_CATEGORY CHAR(50);
UPDATE board SET B_CATEGORY = "free";