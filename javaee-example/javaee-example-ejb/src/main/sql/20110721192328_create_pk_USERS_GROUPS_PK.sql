ALTER TABLE USERS_GROUPS ADD CONSTRAINT USERS_GROUPS_PK PRIMARY KEY (GROUPID, USERID);

--//@UNDO

ALTER TABLE USERS_GROUPS DROP CONSTRAINT USERS_GROUPS_PK;