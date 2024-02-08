-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-02-2024 a las 05:35:53
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `topografiabd`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Contrato_Proyecto_Tipo_Cliente` ()   select idCliente, FechaInicio, FechaFin, Clausula, Valor, (NomProyecto) as TipoProyecto from contratoproyecto inner join tipoproyecto on contratoproyecto.idTipoProyecto=tipoproyecto.idTipoProyecto group by idContratoProyecto$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Nom_Proyecto` (IN `letra` VARCHAR(1))   SELECT * FROM tipoproyecto WHERE NomProyecto LIKE concat('%',letra,'%')$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `idAdmin` int(10) UNSIGNED NOT NULL,
  `NomAdmin` varchar(25) DEFAULT NULL,
  `ApeAdmin` varchar(25) DEFAULT NULL,
  `Telefono` double DEFAULT NULL,
  `Correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`idAdmin`, `NomAdmin`, `ApeAdmin`, `Telefono`, `Correo`) VALUES
(1, 'Jose', 'Mendoza', 301265652346, 'Pmendozajose@hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `idCargo` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `NomCargo` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`idCargo`, `idEmpleado`, `NomCargo`) VALUES
(1, 1, 'Constructor'),
(2, 2, 'Constructor'),
(3, 3, 'Ing Civil'),
(4, 4, 'Ing Industrial'),
(5, 5, 'Topografo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `certificados`
--

CREATE TABLE `certificados` (
  `idCertificado` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `NumCertificado` int(10) DEFAULT NULL,
  `EstadoCertificadp` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `certificados`
--

INSERT INTO `certificados` (`idCertificado`, `idEmpleado`, `NumCertificado`, `EstadoCertificadp`) VALUES
(1, 1, 1, 'Activo'),
(2, 2, 2, 'Activo'),
(4, NULL, 3, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(10) UNSIGNED NOT NULL,
  `NomCiudad` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idCiudad`, `NomCiudad`) VALUES
(1, 'Bogotá'),
(2, 'Tunja'),
(3, 'Medellin'),
(4, 'Cali'),
(5, 'Tolima');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(10) UNSIGNED NOT NULL,
  `NomCliente` varchar(25) DEFAULT NULL,
  `ApeCliente` varchar(25) DEFAULT NULL,
  `Telefono` double DEFAULT NULL,
  `Correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `NomCliente`, `ApeCliente`, `Telefono`, `Correo`) VALUES
(1, 'Lorem', 'Chuleta', 3026547890, 'LoremChuleta1@gmail.com'),
(2, 'pablo', 'Quiñones', 3051469753, 'pquiones12@gmail.com'),
(7, 'Diego ', 'Quiñones', 3016636500, 'diegodarkar123@hotmail.com'),
(8, 'Pedro', 'Quiñones', 3056636500, 'pedropquinones@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratoemp`
--

CREATE TABLE `contratoemp` (
  `idContratoEmp` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `idAdmin` int(10) UNSIGNED DEFAULT NULL,
  `idRecHum` int(10) UNSIGNED DEFAULT NULL,
  `TipoContrato` varchar(25) DEFAULT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `Salario` double DEFAULT NULL,
  `Banco` varchar(15) DEFAULT NULL,
  `TipoDeCuenta` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contratoemp`
--

INSERT INTO `contratoemp` (`idContratoEmp`, `idEmpleado`, `idAdmin`, `idRecHum`, `TipoContrato`, `FechaInicio`, `FechaFin`, `Salario`, `Banco`, `TipoDeCuenta`) VALUES
(1, 1, 1, 1, 'obra labor', '2021-05-10', '2022-05-10', 1600000, 'Bancolombia', 'Ahorros'),
(4, NULL, NULL, NULL, 'Obra Labor', '2023-08-27', '2023-10-07', 2350000, 'BBVA', NULL),
(6, 2, 1, 1, 'Obra Labor', '2023-08-27', '2023-10-07', 2350000, 'BBVA', 'Ahorros'),
(7, 3, 1, 1, 'Obra Labor', '2023-09-17', '2023-10-06', 1800000, 'Itau', 'Ahorros');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratoproyecto`
--

CREATE TABLE `contratoproyecto` (
  `idContratoProyecto` int(10) UNSIGNED NOT NULL,
  `idAdmin` int(10) UNSIGNED DEFAULT NULL,
  `idRecHum` int(10) UNSIGNED DEFAULT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `idCiudad` int(10) UNSIGNED DEFAULT NULL,
  `idTipoProyecto` int(10) UNSIGNED DEFAULT NULL,
  `idCliente` int(10) UNSIGNED DEFAULT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `Valor` double DEFAULT NULL,
  `Clausula` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contratoproyecto`
--

INSERT INTO `contratoproyecto` (`idContratoProyecto`, `idAdmin`, `idRecHum`, `idEmpleado`, `idCiudad`, `idTipoProyecto`, `idCliente`, `FechaInicio`, `FechaFin`, `Valor`, `Clausula`) VALUES
(1, 1, 1, 1, 1, 1, 1, '2021-10-10', '2023-10-10', 12000000, 'C1'),
(5, 1, 1, 2, 2, 2, 2, '2020-10-10', '2023-10-10', 160000000, 'C2'),
(6, 1, 1, 3, 3, 3, 2, '2023-11-11', '2023-11-11', 110000000, 'C3'),
(7, 1, 1, 4, 4, 4, 2, '2020-04-14', '2026-04-14', 230000000, 'C4'),
(8, 1, 1, 5, 5, 5, 1, '2021-02-20', '2023-02-20', 64000000, 'C5'),
(9, 1, 1, 1, 1, 1, 7, '2023-09-01', '2023-10-01', 78000000, 'C6'),
(15, 1, 1, 5, 3, 5, 8, '2023-09-09', '2023-10-07', 88000000, 'C7'),
(16, 1, 1, 6, 3, 3, 8, '2023-08-31', '2023-10-07', 12000000, 'C8');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(10) UNSIGNED NOT NULL,
  `NomEmpleado` varchar(25) DEFAULT NULL,
  `ApeEmpleado` varchar(25) DEFAULT NULL,
  `Telefono` double DEFAULT NULL,
  `Edad` int(5) DEFAULT NULL,
  `Correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `NomEmpleado`, `ApeEmpleado`, `Telefono`, `Edad`, `Correo`) VALUES
(1, 'Alenadro', 'Jaramillo', 3113545127, 22, 'Asessinandro1@gmail.com'),
(2, 'Santiago', 'Granados', 3103695471, 19, 'shomtaduro1@gmail.com'),
(3, 'Brayan', 'Yomasa', 3056421756, 27, 'brayamotor4@gmail.com'),
(4, 'Miguel', 'Sanabria', 3120345127, 26, 'miguelsan98@gmail.com'),
(5, 'Eswin', 'Fajardo', 3153564127, 20, 'erwinfa9@gmail.com'),
(6, 'Shon', 'Granados', 3106425789, 21, 'Shontaduro1@gmail.com'),
(8, 'Juan', 'Cajiao', 3104522697, 21, 'juanEsteban00@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eps`
--

CREATE TABLE `eps` (
  `idEps` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `TipoEps` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `eps`
--

INSERT INTO `eps` (`idEps`, `idEmpleado`, `TipoEps`) VALUES
(1, 1, 'Famisanar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gerenterh`
--

CREATE TABLE `gerenterh` (
  `idRecHum` int(10) UNSIGNED NOT NULL,
  `NomGerente` varchar(25) DEFAULT NULL,
  `ApeGerente` varchar(25) DEFAULT NULL,
  `Telefono` double DEFAULT NULL,
  `Correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `gerenterh`
--

INSERT INTO `gerenterh` (`idRecHum`, `NomGerente`, `ApeGerente`, `Telefono`, `Correo`) VALUES
(1, 'Maria', 'Sanchez', 601354658, 'MariaRHSan10@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incapacidades`
--

CREATE TABLE `incapacidades` (
  `idIncapacidades` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `NumIncapacidades` int(10) DEFAULT NULL,
  `Duracion` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `incapacidades`
--

INSERT INTO `incapacidades` (`idIncapacidades`, `idEmpleado`, `FechaInicio`, `FechaFin`, `NumIncapacidades`, `Duracion`) VALUES
(1, 1, '2023-06-02', '2023-10-02', 1, '4 Meses'),
(3, NULL, '2023-09-01', '2023-09-21', 1, '21 Dias');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permisos`
--

CREATE TABLE `permisos` (
  `idPermisos` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `NumPermiso` int(10) DEFAULT NULL,
  `Duracion` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `permisos`
--

INSERT INTO `permisos` (`idPermisos`, `idEmpleado`, `NumPermiso`, `Duracion`) VALUES
(1, 1, 1, '2 meses');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoproyecto`
--

CREATE TABLE `tipoproyecto` (
  `idTipoProyecto` int(10) UNSIGNED NOT NULL,
  `NomProyecto` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipoproyecto`
--

INSERT INTO `tipoproyecto` (`idTipoProyecto`, `NomProyecto`) VALUES
(1, 'Placa Huel'),
(2, 'Tuberia'),
(3, 'Carretera'),
(4, 'Tunel'),
(5, 'Puente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuarios` int(10) UNSIGNED NOT NULL,
  `idEmpleado` int(10) UNSIGNED DEFAULT NULL,
  `idAdmin` int(10) UNSIGNED DEFAULT NULL,
  `idCliente` int(10) UNSIGNED DEFAULT NULL,
  `idRecHum` int(10) UNSIGNED DEFAULT NULL,
  `Usuario` varchar(25) NOT NULL,
  `Contraseña` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuarios`, `idEmpleado`, `idAdmin`, `idCliente`, `idRecHum`, `Usuario`, `Contraseña`) VALUES
(1, NULL, 1, NULL, NULL, 'JpMendoza12@gmail.com', 'MendozaP12.'),
(2, NULL, NULL, NULL, 1, 'MariapPerezRH@gmail.com', 'Maria1995.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`idCargo`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `certificados`
--
ALTER TABLE `certificados`
  ADD PRIMARY KEY (`idCertificado`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`idCiudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `contratoemp`
--
ALTER TABLE `contratoemp`
  ADD PRIMARY KEY (`idContratoEmp`),
  ADD KEY `idEmpleado` (`idEmpleado`),
  ADD KEY `idAdmin` (`idAdmin`),
  ADD KEY `idRecHum` (`idRecHum`);

--
-- Indices de la tabla `contratoproyecto`
--
ALTER TABLE `contratoproyecto`
  ADD PRIMARY KEY (`idContratoProyecto`),
  ADD KEY `idEmpleado` (`idEmpleado`),
  ADD KEY `idRecHum` (`idRecHum`),
  ADD KEY `idAdmin` (`idAdmin`),
  ADD KEY `idCiudad` (`idCiudad`),
  ADD KEY `idTipoProyecto` (`idTipoProyecto`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`);

--
-- Indices de la tabla `eps`
--
ALTER TABLE `eps`
  ADD PRIMARY KEY (`idEps`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `gerenterh`
--
ALTER TABLE `gerenterh`
  ADD PRIMARY KEY (`idRecHum`);

--
-- Indices de la tabla `incapacidades`
--
ALTER TABLE `incapacidades`
  ADD PRIMARY KEY (`idIncapacidades`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `permisos`
--
ALTER TABLE `permisos`
  ADD PRIMARY KEY (`idPermisos`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `tipoproyecto`
--
ALTER TABLE `tipoproyecto`
  ADD PRIMARY KEY (`idTipoProyecto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuarios`),
  ADD KEY `idEmpleado` (`idEmpleado`),
  ADD KEY `idAdmin` (`idAdmin`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idRecHum` (`idRecHum`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `idAdmin` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `cargo`
--
ALTER TABLE `cargo`
  MODIFY `idCargo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `certificados`
--
ALTER TABLE `certificados`
  MODIFY `idCertificado` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `contratoemp`
--
ALTER TABLE `contratoemp`
  MODIFY `idContratoEmp` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `contratoproyecto`
--
ALTER TABLE `contratoproyecto`
  MODIFY `idContratoProyecto` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `eps`
--
ALTER TABLE `eps`
  MODIFY `idEps` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `gerenterh`
--
ALTER TABLE `gerenterh`
  MODIFY `idRecHum` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `incapacidades`
--
ALTER TABLE `incapacidades`
  MODIFY `idIncapacidades` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `permisos`
--
ALTER TABLE `permisos`
  MODIFY `idPermisos` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipoproyecto`
--
ALTER TABLE `tipoproyecto`
  MODIFY `idTipoProyecto` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuarios` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD CONSTRAINT `cargo_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `certificados`
--
ALTER TABLE `certificados`
  ADD CONSTRAINT `certificados_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `contratoemp`
--
ALTER TABLE `contratoemp`
  ADD CONSTRAINT `contratoemp_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `contratoemp_ibfk_2` FOREIGN KEY (`idAdmin`) REFERENCES `administrador` (`idAdmin`),
  ADD CONSTRAINT `contratoemp_ibfk_3` FOREIGN KEY (`idRecHum`) REFERENCES `gerenterh` (`idRecHum`);

--
-- Filtros para la tabla `contratoproyecto`
--
ALTER TABLE `contratoproyecto`
  ADD CONSTRAINT `contratoproyecto_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `contratoproyecto_ibfk_2` FOREIGN KEY (`idRecHum`) REFERENCES `gerenterh` (`idRecHum`),
  ADD CONSTRAINT `contratoproyecto_ibfk_3` FOREIGN KEY (`idAdmin`) REFERENCES `administrador` (`idAdmin`),
  ADD CONSTRAINT `contratoproyecto_ibfk_4` FOREIGN KEY (`idCiudad`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `contratoproyecto_ibfk_5` FOREIGN KEY (`idTipoProyecto`) REFERENCES `tipoproyecto` (`idTipoProyecto`),
  ADD CONSTRAINT `contratoproyecto_ibfk_6` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `eps`
--
ALTER TABLE `eps`
  ADD CONSTRAINT `eps_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `incapacidades`
--
ALTER TABLE `incapacidades`
  ADD CONSTRAINT `incapacidades_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `permisos`
--
ALTER TABLE `permisos`
  ADD CONSTRAINT `permisos_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`idAdmin`) REFERENCES `administrador` (`idAdmin`),
  ADD CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`idRecHum`) REFERENCES `gerenterh` (`idRecHum`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
