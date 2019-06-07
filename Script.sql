-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  ven. 07 juin 2019 à 14:51
-- Version du serveur :  5.7.25
-- Version de PHP :  7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `Script`
--

-- --------------------------------------------------------

--
-- Structure de la table `AnneeScolaire`
--

CREATE TABLE `AnneeScolaire` (
  `IdAnneeScolaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Bulletin`
--

CREATE TABLE `Bulletin` (
  `IdBulletin` int(11) NOT NULL,
  `IdTrimestre` int(11) NOT NULL,
  `IdInscription` int(11) NOT NULL,
  `Appreciation` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Classe`
--

CREATE TABLE `Classe` (
  `IdClasse` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `IdNiveau` int(11) NOT NULL,
  `IdAnneeScolaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `DetailBulletin`
--

CREATE TABLE `DetailBulletin` (
  `IdDetailBulletin` int(11) NOT NULL,
  `IdBulletin` int(11) NOT NULL,
  `IdEnseignement` int(11) NOT NULL,
  `Appreciation` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Discipline`
--

CREATE TABLE `Discipline` (
  `IdDiscipline` int(11) NOT NULL,
  `nomdiscipline` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Ecole`
--

CREATE TABLE `Ecole` (
  `IdEcole` int(11) NOT NULL,
  `NomEcole` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Enseignement`
--

CREATE TABLE `Enseignement` (
  `IdEnseignement` int(11) NOT NULL,
  `IdClasse` int(11) NOT NULL,
  `IdDiscipline` int(11) NOT NULL,
  `IdPersonne` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Evaluation`
--

CREATE TABLE `Evaluation` (
  `IdEvaluation` int(11) NOT NULL,
  `IdDetailBulletin` int(11) NOT NULL,
  `Note` float DEFAULT NULL,
  `Appreciation` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Inscription`
--

CREATE TABLE `Inscription` (
  `IdInscription` int(11) NOT NULL,
  `IdClasse` int(11) NOT NULL,
  `IdPersonne` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Niveau`
--

CREATE TABLE `Niveau` (
  `IdNiveau` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Personne`
--

CREATE TABLE `Personne` (
  `IdPersonne` int(11) NOT NULL,
  `nompersonne` varchar(255) DEFAULT NULL,
  `prenompersonne` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Personne`
--

INSERT INTO `Personne` (`IdPersonne`, `nompersonne`, `prenompersonne`, `type`) VALUES
(1, 'jean', 'duj', 'eleve'),
(2, 'jean', 'duj', 'eleve');

-- --------------------------------------------------------

--
-- Structure de la table `Trimestre`
--

CREATE TABLE `Trimestre` (
  `IdTrimestre` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `debut` int(11) DEFAULT NULL,
  `fin` int(11) DEFAULT NULL,
  `IdAnneeScolaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `AnneeScolaire`
--
ALTER TABLE `AnneeScolaire`
  ADD PRIMARY KEY (`IdAnneeScolaire`);

--
-- Index pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  ADD PRIMARY KEY (`IdBulletin`),
  ADD KEY `IdTrimestre` (`IdTrimestre`,`IdInscription`);

--
-- Index pour la table `Classe`
--
ALTER TABLE `Classe`
  ADD PRIMARY KEY (`IdClasse`),
  ADD KEY `IdNiveau` (`IdNiveau`,`IdAnneeScolaire`),
  ADD KEY `IdAnneScolaire` (`IdAnneeScolaire`);

--
-- Index pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  ADD PRIMARY KEY (`IdDetailBulletin`),
  ADD KEY `IdBulletin` (`IdBulletin`,`IdEnseignement`),
  ADD KEY `IdEnseignement` (`IdEnseignement`);

--
-- Index pour la table `Discipline`
--
ALTER TABLE `Discipline`
  ADD PRIMARY KEY (`IdDiscipline`);

--
-- Index pour la table `Ecole`
--
ALTER TABLE `Ecole`
  ADD PRIMARY KEY (`IdEcole`);

--
-- Index pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  ADD PRIMARY KEY (`IdEnseignement`),
  ADD KEY `IdClasse` (`IdClasse`,`IdDiscipline`,`IdPersonne`),
  ADD KEY `IdDiscipline` (`IdDiscipline`),
  ADD KEY `IdPersonne` (`IdPersonne`);

--
-- Index pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  ADD PRIMARY KEY (`IdEvaluation`),
  ADD KEY `IdDetailBulletin` (`IdDetailBulletin`);

--
-- Index pour la table `Inscription`
--
ALTER TABLE `Inscription`
  ADD PRIMARY KEY (`IdInscription`),
  ADD KEY `IdClasse` (`IdClasse`,`IdPersonne`);

--
-- Index pour la table `Niveau`
--
ALTER TABLE `Niveau`
  ADD PRIMARY KEY (`IdNiveau`);

--
-- Index pour la table `Personne`
--
ALTER TABLE `Personne`
  ADD PRIMARY KEY (`IdPersonne`);

--
-- Index pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  ADD PRIMARY KEY (`IdTrimestre`),
  ADD KEY `IdAnneeScolaire` (`IdAnneeScolaire`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  MODIFY `IdBulletin` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  MODIFY `IdDetailBulletin` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  MODIFY `IdEvaluation` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Inscription`
--
ALTER TABLE `Inscription`
  MODIFY `IdInscription` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Bulletin`
--
ALTER TABLE `Bulletin`
  ADD CONSTRAINT `IdTrimestre` FOREIGN KEY (`IdTrimestre`) REFERENCES `Trimestre` (`IdTrimestre`);

--
-- Contraintes pour la table `Classe`
--
ALTER TABLE `Classe`
  ADD CONSTRAINT `IdAnneScolaire` FOREIGN KEY (`IdAnneeScolaire`) REFERENCES `AnneeScolaire` (`IdAnneeScolaire`),
  ADD CONSTRAINT `IdNiveau` FOREIGN KEY (`IdNiveau`) REFERENCES `Niveau` (`IdNiveau`);

--
-- Contraintes pour la table `DetailBulletin`
--
ALTER TABLE `DetailBulletin`
  ADD CONSTRAINT `IdBulletin` FOREIGN KEY (`IdBulletin`) REFERENCES `Bulletin` (`IdBulletin`),
  ADD CONSTRAINT `IdEnseignement` FOREIGN KEY (`IdEnseignement`) REFERENCES `Enseignement` (`IdEnseignement`);

--
-- Contraintes pour la table `Enseignement`
--
ALTER TABLE `Enseignement`
  ADD CONSTRAINT `IdClasse` FOREIGN KEY (`IdClasse`) REFERENCES `Classe` (`IdClasse`),
  ADD CONSTRAINT `IdDiscipline` FOREIGN KEY (`IdDiscipline`) REFERENCES `Discipline` (`IdDiscipline`),
  ADD CONSTRAINT `IdPersonne` FOREIGN KEY (`IdPersonne`) REFERENCES `Personne` (`IdPersonne`);

--
-- Contraintes pour la table `Evaluation`
--
ALTER TABLE `Evaluation`
  ADD CONSTRAINT `IdDetailBulletin` FOREIGN KEY (`IdDetailBulletin`) REFERENCES `DetailBulletin` (`IdDetailBulletin`);

--
-- Contraintes pour la table `Trimestre`
--
ALTER TABLE `Trimestre`
  ADD CONSTRAINT `IdAnneeScolaire` FOREIGN KEY (`IdAnneeScolaire`) REFERENCES `AnneeScolaire` (`IdAnneeScolaire`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
