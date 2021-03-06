CREATE TABLE PROYECTO (id BIGINT NOT NULL, descripcion VARCHAR(50) NOT NULL, localidad VARCHAR(50) NOT NULL, nombre VARCHAR(50) NOT NULL, ONG_ID BIGINT, PRIMARY KEY (id))
CREATE TABLE USUARIO (ID BIGINT NOT NULL, disc VARCHAR(31), direccion VARCHAR(50), apellidos VARCHAR(50) NOT NULL, correo VARCHAR(50) NOT NULL, hashPassword VARCHAR(50) NOT NULL, nombre VARCHAR(50) NOT NULL, telefono VARCHAR(50) NOT NULL, Area_de_Estudio VARCHAR(50) NOT NULL, Departamento VARCHAR(50) NOT NULL, Area_de_interes VARCHAR(100), Carrera VARCHAR(150) NOT NULL, Disponibilidad VARCHAR(150), Profesion VARCHAR(50) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE ETIQUETA (ID BIGINT NOT NULL, Categoria VARCHAR(50) NOT NULL, Tag VARCHAR(50) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE ACTIVIDAD (ID BIGINT NOT NULL, conocimientos_necesarios VARCHAR(50) NOT NULL, descripcion VARCHAR(50) NOT NULL, fecha_finalizacion DATE, fecha_inicio DATE NOT NULL, nombre VARCHAR(50) NOT NULL, PROYECTO_id BIGINT, PRIMARY KEY (ID))
CREATE TABLE ONG (ID BIGINT NOT NULL, correo VARCHAR(50) NOT NULL, direccion VARCHAR(50) NOT NULL, hashPassword INTEGER NOT NULL, nTelefono VARCHAR(9) NOT NULL, nombreOng VARCHAR(50) NOT NULL, orientacion VARCHAR(50) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE ARCHIVOADJUNTO (ID BIGINT NOT NULL, comentario VARCHAR(50) NOT NULL, extension VARCHAR(50) NOT NULL, fecha_subida VARCHAR(50) NOT NULL, nombre VARCHAR(50) NOT NULL, PROYECTO_ID_id BIGINT, PRIMARY KEY (ID))
CREATE TABLE jnd_Proyecto_Etiqueta (Etiqueta_fk BIGINT NOT NULL, Proyecto_fk BIGINT NOT NULL, PRIMARY KEY (Etiqueta_fk, Proyecto_fk))
CREATE TABLE jnd_Proyecto_PAS (PAS_fk BIGINT NOT NULL, Proyecto_fk BIGINT NOT NULL, PRIMARY KEY (PAS_fk, Proyecto_fk))
CREATE TABLE jnd_Proyecto_PDI (PDI_fk BIGINT NOT NULL, Proyecto_fk BIGINT NOT NULL, PRIMARY KEY (PDI_fk, Proyecto_fk))
CREATE TABLE jnd_Usuario_Actividad (Actividad_fk BIGINT NOT NULL, Usuario_fk BIGINT NOT NULL, PRIMARY KEY (Actividad_fk, Usuario_fk))
ALTER TABLE PROYECTO ADD CONSTRAINT FK_PROYECTO_ONG_ID FOREIGN KEY (ONG_ID) REFERENCES ONG (ID)
ALTER TABLE ACTIVIDAD ADD CONSTRAINT CTIVIDADPROYECTOid FOREIGN KEY (PROYECTO_id) REFERENCES PROYECTO (id)
ALTER TABLE ARCHIVOADJUNTO ADD CONSTRAINT RCHVDJUNTOPRYCTDid FOREIGN KEY (PROYECTO_ID_id) REFERENCES PROYECTO (id)
ALTER TABLE jnd_Proyecto_Etiqueta ADD CONSTRAINT jndPrycttqtPryctfk FOREIGN KEY (Proyecto_fk) REFERENCES ETIQUETA (ID)
ALTER TABLE jnd_Proyecto_Etiqueta ADD CONSTRAINT jndPrycttqetatqtfk FOREIGN KEY (Etiqueta_fk) REFERENCES PROYECTO (id)
ALTER TABLE jnd_Proyecto_PAS ADD CONSTRAINT jndProyectoPASPSfk FOREIGN KEY (PAS_fk) REFERENCES PROYECTO (id)
ALTER TABLE jnd_Proyecto_PAS ADD CONSTRAINT jndPryctPASPryctfk FOREIGN KEY (Proyecto_fk) REFERENCES USUARIO (ID)
ALTER TABLE jnd_Proyecto_PDI ADD CONSTRAINT jndPryctPDIPryctfk FOREIGN KEY (Proyecto_fk) REFERENCES USUARIO (ID)
ALTER TABLE jnd_Proyecto_PDI ADD CONSTRAINT jndProyectoPDIPDfk FOREIGN KEY (PDI_fk) REFERENCES PROYECTO (id)
ALTER TABLE jnd_Usuario_Actividad ADD CONSTRAINT jndsrctvdadctvddfk FOREIGN KEY (Actividad_fk) REFERENCES ACTIVIDAD (ID)
ALTER TABLE jnd_Usuario_Actividad ADD CONSTRAINT jndsrActividadsrfk FOREIGN KEY (Usuario_fk) REFERENCES USUARIO (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
