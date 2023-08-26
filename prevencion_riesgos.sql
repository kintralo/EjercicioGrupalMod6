CREATE DATABASE prevencion_riesgos;
USE prevencion_riesgos;
describe capacitaciones;
show tables;
-- Tabla "Usuarios"
-- Tabla "Usuarios"
CREATE TABLE Usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  tipo ENUM('Cliente', 'Administrativo', 'Profesional') NOT NULL,
  pass VARCHAR(100) NOT NULL
);

-- Tabla "Capacitaciones"
CREATE TABLE Capacitaciones (
identificador INT PRIMARY KEY AUTO_INCREMENT,
 rut INTEGER,
 dia VARCHAR(100) NOT NULL,
 hora TIME,
 lugar VARCHAR(100) NOT NULL,
 duracion TIME,
 cantAsistentes INTEGER
);

-- Tabla "Pagos"
CREATE TABLE Pagos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  monto DECIMAL(10,2),
  fecha_pago DATE,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id)
);