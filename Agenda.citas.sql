//////////////////////////////////////
////////     De esta forma    //////// 
//////////////////////////////////////
create table citas (
  cit_id int AUTO_INCREMENT PRIMARY KEY,
  cit_id_contacto int NOT NULL,
  cit_fecha date NOT NULL,
  cit_lugar varchar(150) NOT NULL,
  cit_hora time NOT NULL,
  cit_descripcion varchar(200) NOT NULL
)

ALTER TABLE citas  
ADD CONSTRAINT fk_cit_id_contacto  
FOREIGN KEY (cit_id_contacto)  
REFERENCES contactos (con_id) 



//////////////////////////////////////
////////    O de esta otra    //////// 
//////////////////////////////////////
create table citas (
  cit_id int AUTO_INCREMENT PRIMARY KEY,
  cit_id_contacto int NOT NULL,
  cit_fecha date NOT NULL,
  cit_lugar varchar(150) NOT NULL,
  cit_hora time NOT NULL,
  cit_descripcion varchar(200) NOT NULL,
 FOREIGN KEY(cit_id_contacto) REFERENCES contactos (con_id)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COMMENT='tabla de citas';

