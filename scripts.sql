-- Date: 2024-05-10
-- Author: threeyeies
-- Description: Script to create the database tables
-- Version: 1.0
-- WARNING! names of foreign keys already was stablish as a not null column

-- ADVICE: DATABASE NAME: PASTELERIA
CREATE TABLE USUARIO (USERNAME VARCHAR(10) PRIMARY KEY, TIPO VARCHAR(15) NOT NULL, PASSWORD VARCHAR(25) NOT NULL);
CREATE TABLE RESPCOMPRAS (ID_RESPCOMPRAS SERIAL PRIMARY KEY, NOMBRE VARCHAR(50) NOT NULL, CARGO VARCHAR(30) NOT NULL, TEL VARCHAR(13) NOT NULL, TURNO VARCHAR(10) NOT NULL, USERNAME VARCHAR(10) REFERENCES USUARIO (USERNAME) NOT NULL);
CREATE TABLE RESPPRODUCCION (ID_RESPPRODUCCION SERIAL PRIMARY KEY, NOMBRE VARCHAR(50) NOT NULL, CARGO VARCHAR(30) NOT NULL, TEL VARCHAR(13) NOT NULL, TURNO VARCHAR(10) NOT NULL, USERNAME VARCHAR(10) REFERENCES USUARIO (USERNAME) NOT NULL);
CREATE TABLE RESPALMACEN (ID_RESPALMACEN SERIAL PRIMARY KEY, NOMBRE VARCHAR(50) NOT NULL, CARGO VARCHAR(30) NOT NULL, TEL VARCHAR(13) NOT NULL, TURNO VARCHAR(10) NOT NULL, USERNAME VARCHAR(10) REFERENCES USUARIO (USERNAME) NOT NULL);
CREATE TABLE ORDCOMPRA (ID_ORDCOMPRA SERIAL PRIMARY KEY, FECHA_ORDEN DATE NOT NULL, FECHA_ENTREGA DATE NOT NULL, ESTADO VARCHAR(25) NOT NULL, FORMA_PAGO VARCHAR(25) NOT NULL, PRECIO_SUBTOTAL MONEY NOT NULL, IVA DECIMAL NOT NULL, PRECIO_TOTAL MONEY NOT NULL, ID_RESPCOMPRAS INT REFERENCES RESPCOMPRAS (ID_RESPCOMPRAS) NOT NULL);
CREATE TABLE ALMACEN (ID_ALMACEN SERIAL PRIMARY KEY, NOMBRE_ALMACEN VARCHAR(50) NOT NULL, TIPO VARCHAR(15) NOT NULL, MAX_CAPACIDAD INT NOT NULL, UBICACION VARCHAR(50) NOT NULL, ID_RESPALMACEN INT REFERENCES RESPALMACEN (ID_RESPALMACEN) NOT NULL);
CREATE TABLE MATERIAPRIMA(ID_MATERIAPRIMA SERIAL PRIMARY KEY, CODIGO VARCHAR(15) NOT NULL, NOMBRE VARCHAR(50) NOT NULL, CANTIDAD_DISP INT NOT NULL, NIVEL_STOCK INT NOT NULL, UNIDAD_MEDIDA VARCHAR(15) NOT NULL, TIPO VARCHAR(35), DETALLES_MANEJO TEXT, CADUCIDAD DATE NOT NULL, TOXICIDAD INT NOT NULL, PERIODICIDAD VARCHAR(10) NOT NULL, FECHA_ULTINGRESO DATE NOT NULL, COSTO_UNIT MONEY NOT NULL, ID_ALMACEN INT REFERENCES ALMACEN (ID_ALMACEN) NOT NULL);
CREATE TABLE PROVEEDOR(ID_PROVEEDOR SERIAL PRIMARY KEY, NOMBRE VARCHAR(50) NOT NULL, RAZON_SOCIAL VARCHAR(50) NOT NULL, RFC VARCHAR(13) NOT NULL, DIRECCION TEXT NOT NULL, RAITING INT NOT NULL, TEL VARCHAR(13) NOT NULL, EMAIL VARCHAR(50) NOT NULL, RESPONSABLE VARCHAR(50) NOT NULL, CARGO_RESPONSABLE VARCHAR(30) NOT NULL);
CREATE TABLE MATERIAPRIMA_PROVEEDOR(ID_MATERIAPRIMA INT REFERENCES MATERIAPRIMA (ID_MATERIAPRIMA) NOT NULL, ID_PROVEEDOR INT REFERENCES PROVEEDOR (ID_PROVEEDOR) NOT NULL);
CREATE TABLE ORDCOMPRA_MATERIAPRIMA(ID_ORDCOMPRA INT REFERENCES ORDCOMPRA (ID_ORDCOMPRA) NOT NULL, ID_MATERIAPRIMA INT REFERENCES MATERIAPRIMA (ID_MATERIAPRIMA) NOT NULL, CANTIDAD INT NOT NULL);

CREATE TABLE ORDPROD(ID_ORDPROD SERIAL PRIMARY KEY, NOMBRE_CLIENTE VARCHAR(50) NOT NULL, FECHA_ORDEN DATE NOT NULL, FECHA_ENTREGA DATE NOT NULL, INDICACIONES TEXT, ID_RESPPRODUCCION INT REFERENCES RESPPRODUCCION (ID_RESPPRODUCCION) NOT NULL);

CREATE TABLE PROD(ID_PROD SERIAL PRIMARY KEY, NOMBRE VARCHAR(50) NOT NULL, TIPO VARCHAR(30) NOT NULL, MODELO VARCHAR(30) NOT NULL, ESPECIFICACIONES TEXT);
CREATE TABLE ORDPROD_PROD(ID_ORDPROD INT REFERENCES ORDPROD (ID_ORDPROD) NOT NULL, ID_PROD INT REFERENCES PROD (ID_PROD) NOT NULL, CANTIDAD INT NOT NULL);

CREATE TABLE RECETA(ID_PROD INT REFERENCES PROD (ID_PROD) NOT NULL, ID_MATERIAPRIMA INT REFERENCES MATERIAPRIMA (ID_MATERIAPRIMA) NOT NULL, CANTIDAD INT NOT NULL);

-- Inserting data
INSERT INTO USUARIO (USERNAME, TIPO, PASSWORD) VALUES ('IkariEmp', 'Empleado', 'empleado3');
INSERT INTO USUARIO (USERNAME, TIPO, PASSWORD) VALUES ('JuanEmp', 'Empleado', 'empleado1');
INSERT INTO USUARIO (USERNAME, TIPO, PASSWORD) VALUES ('Nimda', 'Admin', 'admin1');
INSERT INTO USUARIO (USERNAME, TIPO, PASSWORD) VALUES ('PedroEmp', 'Empleado', 'empleado2');
INSERT INTO USUARIO (USERNAME, TIPO, PASSWORD) VALUES ('pedroPEmp', 'Almacenista', 'pedroEmpAlm');

INSERT INTO RESPCOMPRAS (NOMBRE, CARGO, TEL, TURNO, USERNAME) VALUES ('Pedro Carranza', 'Gerente de Compras', '1234567890', 'Matutino', 'pedroPEmp');

INSERT INTO RESPPRODUCCION (NOMBRE, CARGO, TEL, TURNO, USERNAME) VALUES ('Juan Perez', 'Gerente de Producción', '1234567890', 'Matutino', 'JuanEmp');
INSERT INTO RESPPRODUCCION (NOMBRE, CARGO, TEL, TURNO, USERNAME) VALUES ('Ikari Romero', 'Gerente de Producción', '1234567890', 'Vespertino', 'IkariEmp');

INSERT INTO RESPALMACEN (NOMBRE, CARGO, TEL, TURNO, USERNAME) VALUES ('Pedro Pedro Sheinbaum', 'Gerente de Almacén', '1234567890', 'Matutino', 'pedroPEmp');


INSERT INTO ORDCOMPRA (FECHA_ORDEN, FECHA_ENTREGA, ESTADO, FORMA_PAGO, PRECIO_SUBTOTAL, IVA, PRECIO_TOTAL, ID_RESPCOMPRAS) VALUES ('2024-05-10', '2024-05-15', 'En proceso', 'Tarjeta Credit', 1000, 0.16, 1160, 1);
INSERT INTO ORDCOMPRA (FECHA_ORDEN, FECHA_ENTREGA, ESTADO, FORMA_PAGO, PRECIO_SUBTOTAL, IVA, PRECIO_TOTAL, ID_RESPCOMPRAS) VALUES ('2024-05-10', '2024-05-15', 'En proceso', 'Tarjeta Credit', 2000, 0.16, 2320, 1);
INSERT INTO ORDCOMPRA (FECHA_ORDEN, FECHA_ENTREGA, ESTADO, FORMA_PAGO, PRECIO_SUBTOTAL, IVA, PRECIO_TOTAL, ID_RESPCOMPRAS) VALUES ('2024-05-10', '2024-05-15', 'En proceso', 'Transferencia', 3000, 0.16, 3480, 1);
INSERT INTO ORDCOMPRA (FECHA_ORDEN, FECHA_ENTREGA, ESTADO, FORMA_PAGO, PRECIO_SUBTOTAL, IVA, PRECIO_TOTAL, ID_RESPCOMPRAS) VALUES ('2024-05-10', '2024-05-15', 'En proceso', 'Efectivo', 4000, 0.16, 4640, 1);
INSERT INTO ORDCOMPRA (FECHA_ORDEN, FECHA_ENTREGA, ESTADO, FORMA_PAGO, PRECIO_SUBTOTAL, IVA, PRECIO_TOTAL, ID_RESPCOMPRAS) VALUES ('2024-05-10', '2024-05-15', 'En proceso', 'Cheque', 5000, 0.16, 5800, 1);

INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('HT001', 'Harina', 100, 2, 'Kg', 'Trigo', 'No Humedad, No Frio', '2025-05-10', 1, 'Mensual', '2024-05-10', 100);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('AB001', 'Azucar', 100, 3, 'Kg', 'Blanca', 'No Humedad, No Frio', '2025-05-10', 1, 'Mensual', '2024-05-10', 30);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('SM001', 'Sal', 100, 2, 'Kg', 'Marina', 'No Humedad, No Frio', '2025-05-10', 1, 'Mensual', '2024-05-10', 25);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('HU001', 'Huevos', 100, 3, 'Kg', 'San Marcos', 'No Humedad, Fragil', '2024-06-20', 1, 'Semanal', '2024-05-10', 50);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('LE001', 'Leche', 100, 3, 'L', 'Entera', 'No Humedad', '2024-06-10', 1, 'Mensual', '2024-05-10', 25);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('MA001', 'Mantequilla', 100, 3, 'Kg', 'Lala', 'No Humedad', '2024-08-10', 1, 'Mensual', '2024-05-10', 40);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('CN001', 'Chocolate', 100, 3, 'Kg', 'Nestle', 'No Humedad, No Calor', '2025-05-10', 1, 'Mensual', '2024-05-10', 60);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('CA001', 'Cacao', 100, 3, 'Kg', 'Nestle', 'No Humedad, Ambiente Seco', '2025-05-10', 1, 'Mensual', '2024-05-10', 50);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('AM001', 'Azucar', 100, 3, 'Kg', 'Morena', 'No Humedad, No Frio', '2024-08-10', 1, 'Mensual', '2024-05-10', 30);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('CA001', 'Canela', 100, 3, 'Kg', 'Nestle', 'No Humedad, No Frio', '2024-07-10', 1, 'Mensual', '2024-05-10', 60);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('VA001', 'Vainilla', 100, 3, 'Kg', 'Nestle', 'No Humedad, No Frio', '2024-07-10', 1, 'Mensual', '2024-05-10', 50);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('PO001', 'Polvo Hornear', 5, 2, 'Kg', 'Royal', 'No Humedad, No Frio', '2025-05-10', 2, 'Semanal', '2024-05-10', 25);
INSERT INTO MATERIAPRIMA (CODIGO, NOMBRE, CANTIDAD_DISP, NIVEL_STOCK, UNIDAD_MEDIDA, TIPO, DETALLES_MANEJO, CADUCIDAD, TOXICIDAD, PERIODICIDAD, FECHA_ULTINGRESO, COSTO_UNIT) VALUES ('EV001', 'Especias Secas', 10, 3, 'Kg', 'Varios', 'No Humedad, No Frio', '2024-06-10', 1, 'Mensual', '2024-05-10', 50);

INSERT INTO ORDCOMPRA_MATERIAPRIMA (ID_ORDCOMPRA, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 1, 10);
INSERT INTO ORDCOMPRA_MATERIAPRIMA (ID_ORDCOMPRA, ID_MATERIAPRIMA, CANTIDAD) VALUES (2, 6, 50);
INSERT INTO ORDCOMPRA_MATERIAPRIMA (ID_ORDCOMPRA, ID_MATERIAPRIMA, CANTIDAD) VALUES (3, 12, 120);
INSERT INTO ORDCOMPRA_MATERIAPRIMA (ID_ORDCOMPRA, ID_MATERIAPRIMA, CANTIDAD) VALUES (4, 5, 160);
INSERT INTO ORDCOMPRA_MATERIAPRIMA (ID_ORDCOMPRA, ID_MATERIAPRIMA, CANTIDAD) VALUES (5, 7, 82);

INSERT INTO PROVEEDOR (NOMBRE, RAZON_SOCIAL, RFC, DIRECCION, RAITING, TEL, EMAIL, RESPONSABLE, CARGO_RESPONSABLE) VALUES ('NESTLE', 'NESTLE S.A. de C.V.', 'PROV001', 'Calle Heriberto Henriquez, Parque Industrual, Toluca, Estado de México, México', 5, '1234567890','nestleprov@nestle.com', 'Juan Perez', 'Gerente de Ventas');
INSERT INTO PROVEEDOR (NOMBRE, RAZON_SOCIAL, RFC, DIRECCION, RAITING, TEL, EMAIL, RESPONSABLE, CARGO_RESPONSABLE) VALUES ('LALA', 'LALA S.A. de C.V.', 'PROV002', 'Calle Heriberto Henriquez, Parque Industrual, Toluca, Estado de México, México', 5, '1234567890','lalaprov@lala.com', 'Jose Enrique', 'Gerente de Ventas');
INSERT INTO PROVEEDOR (NOMBRE, RAZON_SOCIAL, RFC, DIRECCION, RAITING, TEL, EMAIL, RESPONSABLE, CARGO_RESPONSABLE) VALUES ('ROYAL', 'ROYAL S.A. de C.V.', 'PROV003', 'Calle Heriberto Henriquez, Parque Industrual, Toluca, Estado de México, México', 5, '1234567890','royalatencion@royal.com', 'Maria Lopez', 'Gerente de Ventas');

INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (1, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (2, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (3, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (4, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (5, 2);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (6, 2);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (7, 1);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (8, 1);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (9, 1);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (10, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (11, 1);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (12, 3);
INSERT INTO MATERIAPRIMA_PROVEEDOR (ID_MATERIAPRIMA, ID_PROVEEDOR) VALUES (13, 3);

--INSERT INTO ORDPROD (NOMBRE_PRODUCTO, CANTIDAD, FECHA_ORDEN, FECHA_ENTREGA, TIPO, MODELO, ESPECIFICACIONES, ID_RESPPRODUCCION) VALUES ('Pastel Selva Negra', 3, '2024-05-10', '2024-05-15', 'Mediano', 'SELNEGM', 'Pastel de Chocolate con relleno de cereza, agregar mensaje de feliz dia mamá', 1);
--INSERT INTO ORDPROD (NOMBRE_PRODUCTO, CANTIDAD, FECHA_ORDEN, FECHA_ENTREGA, TIPO, MODELO, ESPECIFICACIONES, ID_RESPPRODUCCION) VALUES ('Pastel Tres Leches', 3, '2024-05-10', '2024-05-15', 'Mediano', 'TRESLECM', 'Pastel de Vainilla con relleno de crema, agregar mensaje de feliz dia mamá', 2);
--INSERT INTO ORDPROD (NOMBRE_PRODUCTO, CANTIDAD, FECHA_ORDEN, FECHA_ENTREGA, TIPO, MODELO, ESPECIFICACIONES, ID_RESPPRODUCCION) VALUES ('Pastel de Chocoqueso', 1, '2024-05-10', '2024-05-15', 'Grande', 'CHOCOQM', 'Pastel de Chocolate con capas y relleno de queso, agregar mensaje de feliz dia mamá', 2);

INSERT INTO ORDPROD(NOMBRE_CLIENTE, FECHA_ORDEN, FECHA_ENTREGA, INDICACIONES, ID_RESPPRODUCCION) VALUES ('Victor Sarabia', '2024-05-10', '2024-05-15', 'Agregar mensaje de feliz dia mamá', 1);
INSERT INTO ORDPROD(NOMBRE_CLIENTE, FECHA_ORDEN, FECHA_ENTREGA, INDICACIONES, ID_RESPPRODUCCION) VALUES ('Luisa Perez', '2024-05-10', '2024-05-15', 'Agregar mensaje de feliz cumpleaños', 2);
INSERT INTO ORDPROD(NOMBRE_CLIENTE, FECHA_ORDEN, FECHA_ENTREGA, INDICACIONES, ID_RESPPRODUCCION) VALUES ('Maria Lopez', '2024-05-10', '2024-05-15', 'Agregar mensaje de feliz dia mamá', 2);

INSERT INTO PROD(NOMBRE, TIPO, MODELO, ESPECIFICACIONES) VALUES ('Pastel Selva Negra', 'Mediano', 'SELNEGM', 'Pastel de Chocolate con relleno de cereza');
INSERT INTO PROD(NOMBRE, TIPO, MODELO, ESPECIFICACIONES) VALUES ('Pastel Tres Leches', 'Mediano', 'TRESLECM', 'Pastel de Vainilla con relleno de crema');
INSERT INTO PROD(NOMBRE, TIPO, MODELO, ESPECIFICACIONES) VALUES ('Pastel de Chocoqueso', 'Grande', 'CHOCOQG', 'Pastel de Chocolate con capas y relleno de queso');

INSERT INTO ORDPROD_PROD (ID_ORDPROD, ID_PROD, CANTIDAD) VALUES (1, 1, 3);
INSERT INTO ORDPROD_PROD (ID_ORDPROD, ID_PROD, CANTIDAD) VALUES (2, 2, 3);
INSERT INTO ORDPROD_PROD (ID_ORDPROD, ID_PROD, CANTIDAD) VALUES (3, 3, 1);

INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 1, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 2, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 4, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 5, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 7, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 8, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 10, 1);
INSERT INTO RECETA (ID_PROD, ID_MATERIAPRIMA, CANTIDAD) VALUES (1, 12, 1);

INSERT INTO ALMACEN (NOMBRE_ALMACEN, TIPO, MAX_CAPACIDAD, UBICACION, ID_RESPALMACEN) VALUES ('Almacen 1', 'Refrigeración', 10000, '16 de Septiembre, Lerma, Estado de México, México', 1);
INSERT INTO ALMACEN (NOMBRE_ALMACEN, TIPO, MAX_CAPACIDAD, UBICACION, ID_RESPALMACEN) VALUES ('Almacen 2', 'Temp Amb', 10000, '16 de Septiembre, Lerma, Estado de México, México', 1);

-- specific scripts
-- 1. Listado de producto (respecto su id) y sus materias primas que requiere
SELECT PROD.NOMBRE AS nombre_producto, MATERIAPRIMA.NOMBRE AS nombre_materia_prima 
FROM PROD 
JOIN RECETA ON PROD.ID_PROD = RECETA.ID_PROD 
JOIN MATERIAPRIMA ON RECETA.ID_MATERIAPRIMA = MATERIAPRIMA.ID_MATERIAPRIMA 
WHERE PROD.ID_PROD = 1;
