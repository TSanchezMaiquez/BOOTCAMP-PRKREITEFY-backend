INSERT INTO artistas (nombre) VALUES
                                  ('Alicia Keys'),
                                  ('Bruno Mars'),
                                  ('Ed Sheeran'),
                                  ('Taylor Swift');
INSERT INTO albumes (titulo, artista_id, imagen) VALUES
                                                     ('Songs in A Minor', 1, NULL),
                                                     ('The Diary of Alicia Keys', 1, NULL),
                                                     ('As I Am', 1, NULL);
INSERT INTO albumes (titulo, artista_id, imagen) VALUES
                                                     ('Doo-Wops & Hooligans', 2, NULL),
                                                     ('Unorthodox Jukebox', 2, NULL),
                                                     ('24K Magic', 2, NULL);

-- Álbumes de Ed Sheeran
INSERT INTO albumes (titulo, artista_id, imagen) VALUES
                                                     ('+', 3, NULL),
                                                     ('x', 3, NULL),
                                                     ('÷', 3, NULL);

-- Álbumes de Taylor Swift
INSERT INTO albumes (titulo, artista_id, imagen) VALUES
                                                     ('Fearless', 4, NULL),
                                                     ('Speak Now', 4, NULL),
                                                     ('1989', 4, NULL);


INSERT INTO canciones (nombre, duracion, estilo, valoracion, reproducciones, fecha_insercion, album_id)
VALUES
    ('Fallin', 3.46, 'POP', 4.5, 1000000, '2024-04-30', 1),
    ('A Woman''s Worth', 4.59, 'POP', 4.3, 800000, '2024-04-30', 1),
    ('How Come You Don''t Call Me', 3.58, 'POP', 4.2, 900000, '2024-04-30', 1);
INSERT INTO canciones (nombre, duracion, estilo, valoracion, reproducciones, fecha_insercion, album_id)
VALUES
    ('Bohemian Rhapsody', 5.55, 'ROCK', 4.8, 1500000, '2024-04-30', 2),
    ('Uptown Funk', 4.31, 'POP', 4.7, 1200000, '2024-04-30', 2),
    ('Clair de Lune', 5.23, 'CLASICA', 4.9, 900000, '2024-04-30', 3),
    ('Smells Like Teen Spirit', 4.36, 'ROCK', 4.6, 1300000, '2024-04-30', 4),
    ('Shape of You', 3.54, 'POP', 4.8, 1600000, '2024-04-30', 4),
    ('Für Elise', 3.03, 'CLASICA', 4.7, 850000, '2024-04-30', 5);

