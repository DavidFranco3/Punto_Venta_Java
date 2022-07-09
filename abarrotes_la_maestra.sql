-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 29-03-2022 a las 00:03:15
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `abarrotes_la_maestra`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `ID_cliente` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido_paterno` varchar(20) NOT NULL,
  `Apellido_materno` varchar(20) NOT NULL,
  `Sexo` varchar(15) NOT NULL,
  `Nombre_completo` varchar(200) NOT NULL,
  PRIMARY KEY (`ID_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`ID_cliente`, `Nombre`, `Apellido_paterno`, `Apellido_materno`, `Sexo`, `Nombre_completo`) VALUES
('1', 'José David', 'Ayala', 'Franco', 'Masculino', 'José David Ayala Franco'),
('2', 'jorge antonio', 'perez', 'robles', 'Masculino', 'jorge antonio perez robles');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

DROP TABLE IF EXISTS `compras`;
CREATE TABLE IF NOT EXISTS `compras` (
  `ID_compra` varchar(20) NOT NULL,
  `Dia_compra` varchar(5) NOT NULL,
  `Mes_compra` varchar(20) NOT NULL,
  `Año_compra` varchar(6) NOT NULL,
  `ID_proveedor` varchar(20) NOT NULL,
  `Total` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID_compra`),
  KEY `ID_proveedor` (`ID_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`ID_compra`, `Dia_compra`, `Mes_compra`, `Año_compra`, `ID_proveedor`, `Total`) VALUES
('1', '23', '06', '2021', '2', 136),
('2', '24', '06', '2021', '1', 139.5),
('3', '25', '06', '2021', '2', 93),
('4', '25', '06', '2021', '2', 93);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_compras`
--

DROP TABLE IF EXISTS `detalles_compras`;
CREATE TABLE IF NOT EXISTS `detalles_compras` (
  `ID_compra` varchar(20) NOT NULL,
  `ID_producto` varchar(20) NOT NULL,
  `precio` double NOT NULL,
  `cantidad_comprada` int(11) NOT NULL,
  `Total` double NOT NULL,
  KEY `ID_compra` (`ID_compra`),
  KEY `ID_producto` (`ID_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalles_compras`
--

INSERT INTO `detalles_compras` (`ID_compra`, `ID_producto`, `precio`, `cantidad_comprada`, `Total`) VALUES
('1', '1', 21.5, 4, 86),
('1', '2', 25, 2, 50),
('2', '1', 21.5, 3, 64.5),
('2', '2', 25, 3, 75),
('3', '1', 21.5, 2, 43),
('3', '2', 25, 2, 50),
('4', '1', 21.5, 2, 43),
('4', '2', 25, 2, 50);

--
-- Disparadores `detalles_compras`
--
DROP TRIGGER IF EXISTS `aumentar_producto_insertar`;
DELIMITER $$
CREATE TRIGGER `aumentar_producto_insertar` BEFORE INSERT ON `detalles_compras` FOR EACH ROW UPDATE productos_existencia SET existencia = existencia+new.cantidad_comprada WHERE id_producto = NEW.id_producto
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `calcular_total_compra_actualizar`;
DELIMITER $$
CREATE TRIGGER `calcular_total_compra_actualizar` BEFORE UPDATE ON `detalles_compras` FOR EACH ROW UPDATE compras SET total = total + (NEW.cantidad_comprada - OLD.cantidad_comprada) * NEW.precio WHERE ID_compra = NEW.id_compra
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `calcular_total_compra_insertar`;
DELIMITER $$
CREATE TRIGGER `calcular_total_compra_insertar` BEFORE INSERT ON `detalles_compras` FOR EACH ROW UPDATE compras SET total =  total + NEW.cantidad_comprada* NEW.precio WHERE id_compra = NEW.id_compra
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_ventas`
--

DROP TABLE IF EXISTS `detalles_ventas`;
CREATE TABLE IF NOT EXISTS `detalles_ventas` (
  `ID_venta` varchar(20) NOT NULL,
  `ID_producto` varchar(20) NOT NULL,
  `Precio` double NOT NULL,
  `Cantidad_vendida` double NOT NULL,
  `Total` double NOT NULL,
  KEY `ID_venta` (`ID_venta`),
  KEY `ID_producto` (`ID_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalles_ventas`
--

INSERT INTO `detalles_ventas` (`ID_venta`, `ID_producto`, `Precio`, `Cantidad_vendida`, `Total`) VALUES
('1', '2', 28, 3, 84),
('2', '1', 25.5, 4, 102),
('2', '2', 28, 3, 84),
('3', '1', 25.5, 2, 51),
('3', '2', 28, 2, 56),
('4', '1', 25.5, 4, 102),
('4', '2', 28, 2, 56);

--
-- Disparadores `detalles_ventas`
--
DROP TRIGGER IF EXISTS `calcular_total_venta_actualizar`;
DELIMITER $$
CREATE TRIGGER `calcular_total_venta_actualizar` BEFORE UPDATE ON `detalles_ventas` FOR EACH ROW UPDATE ventas SET total = total + (NEW.cantidad_vendida - OLD.cantidad_vendida) * NEW.precio WHERE ID_venta = NEW.id_venta
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `calcular_total_venta_insertar`;
DELIMITER $$
CREATE TRIGGER `calcular_total_venta_insertar` BEFORE INSERT ON `detalles_ventas` FOR EACH ROW UPDATE ventas SET total =  total + NEW.cantidad_vendida* NEW.precio WHERE ID_venta= NEW.id_venta
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `disminuir_producto_insertar`;
DELIMITER $$
CREATE TRIGGER `disminuir_producto_insertar` BEFORE INSERT ON `detalles_ventas` FOR EACH ROW UPDATE productos_existencia SET existencia = existencia-new.cantidad_vendida WHERE id_producto = NEW.id_producto
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_existencia`
--

DROP TABLE IF EXISTS `productos_existencia`;
CREATE TABLE IF NOT EXISTS `productos_existencia` (
  `ID_producto` varchar(20) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Tamaño` varchar(30) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Existencia` double NOT NULL DEFAULT '0',
  `Precio_compra` double NOT NULL,
  `Precio_venta` double NOT NULL,
  `Descripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`ID_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos_existencia`
--

INSERT INTO `productos_existencia` (`ID_producto`, `Nombre`, `Tamaño`, `Tipo`, `Existencia`, `Precio_compra`, `Precio_venta`, `Descripcion`) VALUES
('1', 'Cheetos', 'Grande', 'Torciditos', 17, 21.5, 25.5, 'Cheetos Torciditos Grande'),
('2', 'jabon', 'grande', 'barra', 0, 25, 28, 'jabon barra grande');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE IF NOT EXISTS `proveedores` (
  `ID_proveedor` varchar(20) NOT NULL,
  `Empresa` varchar(30) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Correo` varchar(70) NOT NULL,
  `Calle` varchar(30) NOT NULL,
  `Numero` varchar(10) NOT NULL,
  `Colonia` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`ID_proveedor`, `Empresa`, `Telefono`, `Correo`, `Calle`, `Numero`, `Colonia`) VALUES
('1', 'bimbo', '4531527363', 'bimbo@gmail.com', 'venustiano carranza', '15', 'insurgentes'),
('2', 'Sabritas', '4531527363', 'sabritas@gmail.com', 'lazaro cardenas', '10', 'agraria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `ID_venta` varchar(20) NOT NULL,
  `Dia_venta` varchar(5) NOT NULL,
  `Mes_venta` varchar(20) NOT NULL,
  `Año_venta` varchar(6) NOT NULL,
  `ID_cliente` varchar(20) NOT NULL,
  `Total` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID_venta`),
  KEY `ID_cliente` (`ID_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`ID_venta`, `Dia_venta`, `Mes_venta`, `Año_venta`, `ID_cliente`, `Total`) VALUES
('1', '23', '06', '2021', '1', 84),
('2', '24', '06', '2021', '1', 186),
('3', '25', '06', '2021', '1', 107),
('4', '25', '06', '2021', '2', 158);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`ID_proveedor`) REFERENCES `proveedores` (`ID_proveedor`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalles_compras`
--
ALTER TABLE `detalles_compras`
  ADD CONSTRAINT `detalles_compras_ibfk_1` FOREIGN KEY (`ID_compra`) REFERENCES `compras` (`ID_compra`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalles_compras_ibfk_2` FOREIGN KEY (`ID_producto`) REFERENCES `productos_existencia` (`ID_producto`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD CONSTRAINT `detalles_ventas_ibfk_1` FOREIGN KEY (`ID_venta`) REFERENCES `ventas` (`ID_venta`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalles_ventas_ibfk_2` FOREIGN KEY (`ID_producto`) REFERENCES `productos_existencia` (`ID_producto`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`ID_cliente`) REFERENCES `clientes` (`ID_cliente`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
