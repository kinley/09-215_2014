insert into Students values 
(1, '12-145', 'Закиров', 'Ильяс', 'Наилевич', '1994-04-15', 'm', 'ИВМиИТ', '09-215', 3, null),
(2, '13-112', 'Александров', 'Кирилл', 'Андреевич', '1995-01-13', 'm', 'ИФМиБ', '01-303', 2, null),
(3, '12-069', 'Бердникова', 'Галия', 'Маратовна', '1994-05-23', 'f', 'ИУЭиФ', '15-212', 3, null),
(4, '14-023', 'Шайдуллина', 'Альмира', 'Рафисовна', '1996-10-06', 'f', 'ИВМиИТ', '09-404', 1, null),
(5, '13-137', 'Хабибуллин', 'Айнур', 'Ильясович', '1995-02-17', 'm', 'ИВМиИТ', '09-307', 2, null),
(6, '12-014', 'Монаков', 'Виктор', 'Сергеевич', '1994-08-03', 'm', 'ИТИС', '14-202', 3, null),
(7, '14-077', 'Хакимуллина', 'Алина', 'Альбертовна', '1996-07-25', 'f', 'ИФМиБ', '01-408', 1, null),
(8, '13-056',  'Белова', 'Вероника', 'Александровна', '1995-06-04', 'f', 'ИФМиБ', '01-301', 2, null),
(9, '14-105', 'Филиппов', 'Юрий', 'Викторович', '1996-12-09', 'm', 'ИУЭиФ', '15-409', 1, null),
(10, '13-044', 'Андреев', 'Евгений', 'Фёдорович', '1995-11-19', 'm', 'ИТИС', '14-302', 2, null);

insert into Disciplines values 
(1, 'malerun', 15.1, 14.8, 13.5),
(2, 'run3', 14, 13.30, 12.30),
(3, 'malejump', 215, 230, 240),
(4, 'pull-ups', 9, 10, 13),
(5, 'maleflex', 6, 7, 13),
(6, 'femalerun', 17.8, 17.5, 16.5),
(7, 'run2', 11.35, 11.15, 10.3),
(8, 'femalejump', 170, 180, 195),
(9, 'push-ups', 10, 12, 14),
(10, 'femaleflex', 8, 11, 16);

insert into Tests values 
(1, 1, 13.6),
(1, 2, 13.12),
(1, 3, 255),
(1, 4, 17),
(1, 5, 15),
(2, 1, 14.9),
(2, 2, 14.48),
(2, 3, 230),
(2, 4, 7),
(2, 5, 12),
(3, 6, 17.2),
(3, 7, 11.27),
(3, 8, 192),
(3, 9, 11),
(3, 10, 17),
(4, 6, 18.8),
(4, 7, 13.33),
(4, 8, 165),
(4, 9, 5),
(4, 10, 15),
(5, 1, 12.9),
(5, 2, 12.15),
(5, 3, 246),
(5, 4, 15),
(5, 5, 16),
(6, 1, 14.4),
(6, 2, 15.21),
(6, 3, 226),
(6, 4, 3),
(6, 5, 8),
(7, 6, 16.7),
(7, 7, 10.58),
(7, 8, 188),
(7, 9, 14),
(7, 10, 20),
(8, 6, 18.8),
(8, 7, 13.11),
(8, 8, 175),
(8, 9, 8),
(8, 10, 19),
(9, 1, 13.9),
(9, 2, 13.38),
(9, 3, 265),
(9, 4, 9),
(9, 5, 9),
(10, 1, 14.6),
(10, 2, 13.34),
(10, 3, 252),
(10, 4, 7),
(10, 5, 10);

insert into Accounts values
(1, "INZakirov", "tgmk64gu1h", 0),
(2, "KVAlexandrov", "erhrn35nr5g", 0),
(3, "GMBerdnikova", "yw45gbr7br", 0),
(4, "AIShaydullina", "yb4ew5gh", 0),
(5, "APHabibullin", "uvw2rv56wc", 0),
(6, "VSMonakov", "y4rbr67er", 0),
(7, "ALHakimullina", "nxr6d5m3g", 0),
(8, "VRBelova", "rhr44brb3gg", 0),
(9, "YEFilippov", "q3ghj4bb9v", 0),
(10, "EBAndreev", "hsv3b55bf", 0),
(null, "RHMustafin", "nw1ur4y6yh", 1),
(null, "GPIvanov", "dwc23cr5vh", 1),
(null, "NVKozlova", "e1cw4nt6b", 1);
