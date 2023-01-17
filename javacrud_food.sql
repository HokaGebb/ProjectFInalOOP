-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2023 at 09:41 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javacrud_food`
--

-- --------------------------------------------------------

--
-- Table structure for table `foodtable`
--

CREATE TABLE `foodtable` (
  `productnum` int(11) NOT NULL,
  `foodorder` varchar(250) NOT NULL,
  `foodprice` varchar(250) NOT NULL,
  `foodqt` varchar(250) NOT NULL,
  `drinks` varchar(250) NOT NULL,
  `drinksprice` varchar(250) NOT NULL,
  `drinksquantity` varchar(250) NOT NULL,
  `totalprice` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `foodtable`
--

INSERT INTO `foodtable` (`productnum`, `foodorder`, `foodprice`, `foodqt`, `drinks`, `drinksprice`, `drinksquantity`, `totalprice`) VALUES
(1, 'Hamburger', '30.0', '2', 'None', '0.0', '0', '60.0'),
(3, 'Chicken Nuggets', '25.0', '2', 'Lemonnade', '10.0', '2', '70.0'),
(4, 'Footlong Sandwich', '35.0', '1', 'None', '0.0', '0', '35.0'),
(5, 'Hamburger', '30.0', '2', 'None', '0.0', '0', '60.0'),
(7, 'Ham Sandwich', '20.0', '2', 'Lemonnade', '10.0', '2', '60.0'),
(8, 'French Fries', '15.0', '2', 'None', '0.0', '0', '30.0'),
(9, 'None', '0.0', '0', 'Zesto', '8.0', '3', '24.0'),
(10, 'Ramen', '45.0', '2', 'Lemonnade', '10.0', '3', '120.0'),
(11, 'French Fries', '15.0', '2', 'None', '0.0', '0', '30.0'),
(12, 'Chicken Nuggets', '25.0', '2', 'Lemonnade', '10.0', '2', '70.0'),
(13, 'Ramen', '45.0', '2', 'Iced Tea', '10.0', '2', '110.0');

-- --------------------------------------------------------

--
-- Table structure for table `userpass`
--

CREATE TABLE `userpass` (
  `id` int(11) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userpass`
--

INSERT INTO `userpass` (`id`, `username`, `password`) VALUES
(1, 'user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `user_list`
--

CREATE TABLE `user_list` (
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_list`
--

INSERT INTO `user_list` (`username`, `password`) VALUES
('user', 'user'),
('user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `id` int(11) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`id`, `username`, `password`) VALUES
(1, 'user123', 'user123'),
(2, 'user', 'user'),
(3, 'u', 'u');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `foodtable`
--
ALTER TABLE `foodtable`
  ADD PRIMARY KEY (`productnum`);

--
-- Indexes for table `userpass`
--
ALTER TABLE `userpass`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `foodtable`
--
ALTER TABLE `foodtable`
  MODIFY `productnum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `userpass`
--
ALTER TABLE `userpass`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user_table`
--
ALTER TABLE `user_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20230115;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
