INSERT INTO artistas (nombre) VALUES
                                  ('Alicia Keys'),
                                  ('Bruno Mars'),
                                  ('Ed Sheeran'),
                                  ('Taylor Swift');
INSERT INTO albumes (titulo, imagen) VALUES
                                                     ('Songs in A Minor', NULL),
                                                     ('The Diary of Alicia Keys', NULL),
                                                     ('As I Am', NULL);
INSERT INTO albumes (titulo, imagen) VALUES
                                                     ('Doo-Wops & Hooligans', NULL),
                                                     ('Unorthodox Jukebox', NULL),
                                                     ('24K Magic', NULL);

-- Álbumes de Ed Sheeran
INSERT INTO albumes (titulo, imagen) VALUES
                                                     ('+', NULL),
                                                     ('x', NULL),
                                                     ('÷', NULL);

-- Álbumes de Taylor Swift
INSERT INTO albumes (titulo, imagen) VALUES
                                                     ('Fearless', NULL),
                                                     ('Speak Now', NULL),
                                                     ('1989', NULL);


INSERT INTO canciones (nombre, duracion, estilo, valoracion, reproducciones, fecha_insercion, album_id, artista_id)
VALUES
    ('Fallin', 3.46, 'POP', 4.5, 1000000, '2024-04-30', 1, 1),
    ('A Woman''s Worth', 4.59, 'POP', 4.3, 800000, '2024-04-30', 1, 2),
    ('How Come You Don''t Call Me', 3.58, 'POP', 4.2, 900000, '2024-04-30', 1, 3);
INSERT INTO canciones (nombre, duracion, estilo, valoracion, reproducciones, fecha_insercion, album_id, artista_id)
VALUES
    ('Bohemian Rhapsody', 5.55, 'ROCK', 4.8, 1500000, '2024-04-30', 2, 1),
    ('Uptown Funk', 4.31, 'POP', 4.7, 1200000, '2024-04-30', 2, 1),
    ('Clair de Lune', 5.23, 'CLASICA', 4.9, 900000, '2024-04-30', 3, 2),
    ('Smells Like Teen Spirit', 4.36, 'ROCK', 4.6, 1300000, '2024-04-30', 4, 2),
    ('Shape of You', 3.54, 'POP', 4.8, 1600000, '2024-04-30', 4, 2),
    ('Für Elise', 3.03, 'CLASICA', 4.7, 850000, '2024-04-30', 5, 3);

