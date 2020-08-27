insert into LOCATION_MASTER(ID, NAME) values(1,'Chennai');
insert into LOCATION_MASTER(ID, NAME) values(2,'Vellore');
insert into LOCATION_MASTER(ID, NAME) values(3,'Salem');

insert into FARE_MASTER(ID, FARE_AMOUNT) values(1,250);
insert into FARE_MASTER(ID, FARE_AMOUNT) values(2,300);
insert into FARE_MASTER(ID, FARE_AMOUNT) values(3,550);

insert into FLEET_MASTER(ID, TOTAL_SEATS) values(1,30);
insert into FLEET_MASTER(ID, TOTAL_SEATS) values(2,32);

insert into BUS_MASTER(ID, BUS_NUMBER, BUS_COMPANY, DEPARTURE_TIME, ARRIVAL_TIME, TRAVEL_DATE, REMAINING_SEATS, DEPARTURE_LOC, ARRIVAL_LOC, FLEET, FARE)
values(1,'TN01 2345','ABC Service','06.00 AM','09.00 AM', '01-09-2020', 30, 1, 2, 1, 1 );

insert into BUS_MASTER(ID, BUS_NUMBER, BUS_COMPANY, DEPARTURE_TIME, ARRIVAL_TIME, TRAVEL_DATE, REMAINING_SEATS, DEPARTURE_LOC, ARRIVAL_LOC, FLEET, FARE)
values(2,'TN02 6478','DEF Service','10.00 AM','01.00 PM', '01-09-2020', 32, 1, 2, 2, 2 );

insert into BUS_MASTER(ID, BUS_NUMBER, BUS_COMPANY, DEPARTURE_TIME, ARRIVAL_TIME, TRAVEL_DATE, REMAINING_SEATS, DEPARTURE_LOC, ARRIVAL_LOC, FLEET, FARE)
values(3,'TN03 9874','GHK Service','08.00 AM','02.00 PM', '01-09-2020', 32, 1, 3, 2, 3);