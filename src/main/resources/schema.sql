DROP TABLE IF EXISTS movies;
   CREATE TABLE movies (
     movie_id int NOT NULL,
     movie_name varchar(45) NOT NULL,
     genere varchar(45),
     duration int,
     start_date TIMESTAMP,
     end_date TIMESTAMP,
     status varchar(45),
     PRIMARY KEY (movie_id)
   ) ;
  
 INSERT INTO movies(movie_id, movie_name, genere, duration, start_date, end_date, status) VALUES (111, 'Black Hawk Down', 'Action',139, '2022-09-13 00:00:00', '2022-12-13 00:00:00', 'ACTIVE');
 INSERT INTO movies(movie_id, movie_name, genere, duration, start_date, end_date, status) VALUES (444, 'Green Zone', 'Action', 155, '2022-08-14 00:00:00', '2022-12-10 00:00:00', 'ACTIVE');
 INSERT INTO movies(movie_id, movie_name, genere, duration, start_date, end_date, status) VALUES (222, 'Jack & Jones', 'Drama', 170, '2022-09-13 00:00:00', '2022-12-13 00:00:00', 'ACTIVE');
 INSERT INTO movies(movie_id, movie_name, genere, duration, start_date, end_date, status) VALUES (333, 'Godzilla', 'Scific', 103, '2022-09-13 00:00:00', '2022-12-13 00:00:00', 'ACTIVE');
  
DROP TABLE IF EXISTS city;
	CREATE TABLE city (
	city_name varchar(45) NOT NULL,
	country varchar(45) NOT NULL,
	PRIMARY KEY (city_name)
	);
	
INSERT INTO city(city_name, country) VALUES ('Hyderabad', 'India');
INSERT INTO city(city_name, country) VALUES ('Bengaluru', 'India');
INSERT INTO city(city_name, country) VALUES ('Chennai', 'India');
   
DROP TABLE IF EXISTS theatres;
   CREATE TABLE theatres (
     theatre_id int NOT NULL,
     theatre_name varchar(45) NOT NULL,
     city_name varchar(45),
     PRIMARY KEY (theatre_id),
     FOREIGN KEY (city_name) REFERENCES city(city_name)
   ) ;
   
INSERT INTO theatres(theatre_id, theatre_name, city_name) VALUES (1000, 'INOX: Hi-Tech City', 'Hyderabad');
INSERT INTO theatres(theatre_id, theatre_name, city_name) VALUES (1003, 'AMB Sarath Capital', 'Hyderabad');
INSERT INTO theatres(theatre_id, theatre_name, city_name) VALUES (1005, 'PVR: Movie Plex', 'Chennai');


 DROP TABLE IF EXISTS screens;
   CREATE TABLE screens (
     screen_id int NOT NULL,
     theatre_name varchar(45) NOT NULL,
     city_name varchar(45),
     PRIMARY KEY (screen_id)
   ) ;
 
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4001, 'AMB Sarath Capital', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4002, 'INOX: Hi-Tech City', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4003, 'AMB Sarath Capital', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4004, 'INOX: Hi-Tech City', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4005, 'AMB Sarath Capital', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4006, 'AMB Sarath Capital', 'Hyderaabd');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4007, 'PVR: Movie Plex', 'Chennai');
INSERT INTO screens(screen_id, theatre_name, city_name) VALUES (4008, 'PVR: Movie Plex', 'Chennai');

   
 DROP TABLE IF EXISTS shows;
   CREATE TABLE shows (
   	 show_id int NOT null,
     screen_id int NOT NULL,
     theatre_id int NOT NULL,
     theatre_name varchar(45) NOT NULL,
     sw_dt DATE NOT NULL,
     movie_name varchar(45) NOT NULL,
     city_name varchar(45) NOT NULL,
     st_tm varchar(10) NOT NULL,
     PRIMARY KEY (show_id)
   ) ;  
   
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9000, 4001, 1003, 'AMB Sarath Capital', '2022-10-14', 'Black Hawk Down', 'Hyderabad', '11:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9002, 4001, 1003, 'AMB Sarath Capital', '2022-10-14', 'Black Hawk Down', 'Hyderabad', '12:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9004, 4008, 1005, 'PVR: Movie Plex', '2022-10-14', 'Black Hawk Down', 'Hyderabad', '16:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9006, 4001, 1005, 'PVR: Movie Plex', '2022-10-15', 'Black Hawk Down', 'Chennai', '13:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9008, 4001, 1005, 'PVR: Movie Plex', '2022-10-14', 'Godzilla', 'Chennai', '16:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9010, 4001, 1000, 'INOX: Hi-Tech City', '2022-10-15', 'Black Hawk Down', 'Hyderabad', '10:00');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9012, 4001, 1000, 'INOX: Hi-Tech City', '2022-10-14', 'Black Hawk Down', 'Hyderabad', '5:30');
 INSERT INTO shows(show_id, screen_id, theatre_id, theatre_name, sw_dt, movie_name, city_name, st_tm) VALUES (9014, 4001, 1000, 'INOX: Hi-Tech City', '2022-10-17', 'Godzilla', 'Hyderabad', '19:00');
 
   
   