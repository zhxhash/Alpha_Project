Drop Database if exists Alpha_project;
Create Database Alpha_project;
use Alpha_Project;
drop table if exists CaseComment;
drop table if exists CouncilMembership;
drop table if exists ManagingAgentMembership;
drop table if exists Resident;
drop table if exists User_Many_to_Many_Case;
drop table if exists Case_;
drop table if exists User;
create table CaseComment(ID char(128) not null,Cas_ID char(128),C_Serial_number char(255), Use_ID char(128),U_Email char(128),Updated_atSince datetime,CC_Content longtext not null, primary key (ID));
create table Case_(   ID char(128) not null,   C_Serial_number      char(255) not null,   Updated_atSince      datetime,      C_Name               char(255) not null,   C_Description        longtext not null,U_Email              char(128) not null,   primary key (ID, C_Serial_number));
create table CouncilMembership(   ID char(128) not null,   Use_ID               char(128),   U_Email              char(128),   Updated_atSince      datetime,   CM_Role              char(255) not null,   primary key (ID));
create table ManagingAgentMembership(   ID char(128) not null,   Use_ID               char(128),   U_Email              char(128),   Updated_atSince      datetime,   MAM_Role             char(255) not null,   primary key (ID));
create table Resident(   ID char(128) not null,   R_Name               char(20) not null,   R_Mobile_phone       char(255),   R_Email              char(128) not null,   Use_ID               char(128),   U_Email              char(128),   Updated_atSince      datetime,   R_Address            char(255),   R_City               char(255),   R_State              char(255),   R_Country            char(255),   R_Postal_code        char(255),   primary key (ID, R_Email));
create table User(   ID char(128) not null,   U_Email              char(128) not null,   Updated_atSince      datetime,   U_Name               char(20) not null,   U_Company            char(255),   U_Password           char(20) not null,   primary key (ID, U_Email));
create table User_Many_to_Many_Case(   ID char(128) not null,   U_Email              char(128) not null,   Cas_ID               char(128) not null,   C_Serial_number      char(255) not null, C_Status             char(255) not null,  primary key (ID, U_Email, Cas_ID, C_Serial_number));
alter table CouncilMembership add constraint FK_A_user_has_many_council_memberships foreign key (Use_ID, U_Email)      references User (ID, U_Email) on delete restrict on update restrict;
alter table ManagingAgentMembership add constraint FK_A_user_has_many_managing_agent_memberships foreign key (Use_ID, U_Email)      references User (ID, U_Email) on delete restrict on update restrict;
alter table Resident add constraint FK_A_user_has_many_residentships foreign key (Use_ID, U_Email)      references User (ID, U_Email) on delete restrict on update restrict;
alter table User_Many_to_Many_Case add constraint FK_User_Many_to_Many_Case foreign key (ID, U_Email)      references User (ID, U_Email) on delete restrict on update restrict;
alter table User_Many_to_Many_Case add constraint FK_User_Many_to_Many_Case2 foreign key (Cas_ID, C_Serial_number)      references Case_ (ID, C_Serial_number) on delete restrict on update restrict;