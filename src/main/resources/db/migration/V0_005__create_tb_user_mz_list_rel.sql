CREATE TABLE `TB_USER_MZ_LIST_REL`
(
    `USER_ID` INT NOT NULL COMMENT '사용자 ID',
    `MZLIST_ID` INT NOT NULL COMMENT '맛집리스트 ID',
    `MZLIST_MANAGEMENT_ROLE` VARCHAR(36) COMMENT 'WRITE-수정가능/READ-읽기전용/ADMIN-운영자',
    PRIMARY KEY (USER_ID, MZLIST_ID)
) COMMENT = '유저 맛집리스트 관계 테이블'
;