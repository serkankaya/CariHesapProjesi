/*
Navicat MySQL Data Transfer

Source Server         : Java
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : carihesap

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-06-24 02:05:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for kategoriler
-- ----------------------------
DROP TABLE IF EXISTS `kategoriler`;
CREATE TABLE `kategoriler` (
  `kategori_id` int(11) NOT NULL AUTO_INCREMENT,
  `kategori_adi` varchar(255) DEFAULT NULL,
  `kategori_aciklama` varchar(255) DEFAULT NULL,
  `kategori_tarih` date DEFAULT NULL,
  PRIMARY KEY (`kategori_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kategoriler
-- ----------------------------
INSERT INTO `kategoriler` VALUES ('4', 'Ahşap Ürünleri', 'Sağlıklı ürünler', '2016-06-22');
INSERT INTO `kategoriler` VALUES ('5', 'Kimyasal', 'Sağlıksız Ürünler', '2016-06-22');
INSERT INTO `kategoriler` VALUES ('7', 'Telefon', 'Mobil Telefon', '2016-06-23');
INSERT INTO `kategoriler` VALUES ('12', 'Bilgisayar', 'Masaüstü Bilgisayar', '2016-06-23');

-- ----------------------------
-- Table structure for kullanicilar
-- ----------------------------
DROP TABLE IF EXISTS `kullanicilar`;
CREATE TABLE `kullanicilar` (
  `kullanici_id` int(11) NOT NULL AUTO_INCREMENT,
  `kullanici_adi` varchar(255) DEFAULT NULL,
  `kullanici_sifre` varchar(255) DEFAULT NULL,
  `kullanici_tarih` date DEFAULT NULL,
  PRIMARY KEY (`kullanici_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kullanicilar
-- ----------------------------
INSERT INTO `kullanicilar` VALUES ('1', 'admin', '1234', '2016-06-20');

-- ----------------------------
-- Table structure for musteriler
-- ----------------------------
DROP TABLE IF EXISTS `musteriler`;
CREATE TABLE `musteriler` (
  `musteri_id` int(11) NOT NULL AUTO_INCREMENT,
  `musteri_adi` varchar(255) DEFAULT NULL,
  `musteri_soyadi` varchar(255) DEFAULT NULL,
  `musteri_telefon` varchar(15) DEFAULT NULL,
  `musteri_adres` varchar(255) DEFAULT NULL,
  `musteri_tarih` date DEFAULT NULL,
  PRIMARY KEY (`musteri_id`),
  FULLTEXT KEY `musteri_ad` (`musteri_adi`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of musteriler
-- ----------------------------
INSERT INTO `musteriler` VALUES ('19', 'Seher', 'Baş', '05547778498', 'Kangal-Sivas', '2016-06-24');
INSERT INTO `musteriler` VALUES ('25', 'Veli', 'Değer', '05556665544', 'Keçiören-Ankara', '2016-06-24');
INSERT INTO `musteriler` VALUES ('58', 'Serkan', 'Kaya', '05374806535', 'Avcılar-İstanbul', '2016-06-24');

-- ----------------------------
-- Table structure for satislar
-- ----------------------------
DROP TABLE IF EXISTS `satislar`;
CREATE TABLE `satislar` (
  `satis_id` int(11) NOT NULL AUTO_INCREMENT,
  `urun_id` int(11) DEFAULT NULL,
  `musteri_id` int(11) DEFAULT NULL,
  `satis_adedi` int(11) DEFAULT NULL,
  `satis_tarih` date DEFAULT NULL,
  PRIMARY KEY (`satis_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of satislar
-- ----------------------------
INSERT INTO `satislar` VALUES ('47', '11', '25', '3', '2016-06-24');

-- ----------------------------
-- Table structure for urunler
-- ----------------------------
DROP TABLE IF EXISTS `urunler`;
CREATE TABLE `urunler` (
  `urun_id` int(11) NOT NULL AUTO_INCREMENT,
  `urun_adi` varchar(255) DEFAULT NULL,
  `urun_kategori_adi` varchar(255) DEFAULT NULL,
  `urun_alis` int(15) DEFAULT NULL,
  `urun_satis` int(15) DEFAULT NULL,
  `urun_stok` int(15) DEFAULT NULL,
  `urun_aciklama` varchar(255) DEFAULT NULL,
  `urun_tarih` date DEFAULT NULL,
  PRIMARY KEY (`urun_id`),
  FULLTEXT KEY `urun_kategori_adi` (`urun_kategori_adi`),
  FULLTEXT KEY `urun_adi` (`urun_adi`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of urunler
-- ----------------------------
INSERT INTO `urunler` VALUES ('9', 'Sandalye', 'Ahşap Ürünleri', '5', '10', '4', 'Kaliteli Ürün', '2016-06-23');
INSERT INTO `urunler` VALUES ('10', 'Masa', 'Ahşap Ürünleri', '6', '12', '15', 'Kalitesiz Ürün', '2016-06-23');
INSERT INTO `urunler` VALUES ('11', 'Filli Boya', 'Kimyasal', '55', '100', '20', 'Kaliteli Boya', '2016-06-23');
INSERT INTO `urunler` VALUES ('12', 'Aseton', 'Kimyasal', '5', '10', '24', 'İçilmesi zararlıdır ...', '2016-06-23');
INSERT INTO `urunler` VALUES ('13', 'Iphone 6s', 'Telefon', '600', '300', '46', 'Mobil Telefon', '2016-06-24');
INSERT INTO `urunler` VALUES ('14', 'Mouse', 'Bilgisayar', '10', '11', '1', 'Microsoft Mouse\n\n', '2016-06-23');

-- ----------------------------
-- Procedure structure for giris
-- ----------------------------
DROP PROCEDURE IF EXISTS `giris`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `giris`()
BEGIN
	select * from kullanicilar;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for karZararDurumu
-- ----------------------------
DROP PROCEDURE IF EXISTS `karZararDurumu`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `karZararDurumu`()
BEGIN
	

END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for karZararTL
-- ----------------------------
DROP PROCEDURE IF EXISTS `karZararTL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `karZararTL`()
BEGIN
select SUM(satis.satis_adedi*((urun.urun_satis)-(urun.urun_alis)))
from satislar as satis 
LEFT JOIN urunler as urun on satis.urun_id=urun.urun_id 
LEFT JOIN musteriler as musteri on musteri.musteri_id=satis.musteri_id;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kategoriEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `kategoriEkle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kategoriEkle`(IN `kategoriadi` varchar(255),IN `aciklama` varchar(255))
BEGIN
insert into kategoriler values(null,kategoriadi, aciklama ,now());
	
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kategoriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `kategoriGetir`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kategoriGetir`()
BEGIN
	select * from kategoriler;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kategoriGuncelle
-- ----------------------------
DROP PROCEDURE IF EXISTS `kategoriGuncelle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kategoriGuncelle`(IN `kategoriAdi` varchar(255),IN `kategoriAciklama` varchar(255),IN `kategoriID` varchar(255))
BEGIN
update kategoriler set kategori_adi=kategoriAdi,kategori_aciklama=kategoriAciklama,kategori_tarih=NOW() where kategori_id=kategoriID;

END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kategoriIDAL
-- ----------------------------
DROP PROCEDURE IF EXISTS `kategoriIDAL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kategoriIDAL`(IN `kategoriAdi` varchar(255),IN `kategoriAciklama` varchar(255))
BEGIN
select kategoriler.kategori_id from kategoriler 
where kategori_adi=kategoriAdi and 
kategori_aciklama=kategoriAciklama;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kategoriSIL
-- ----------------------------
DROP PROCEDURE IF EXISTS `kategoriSIL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kategoriSIL`(IN `id` varchar(255))
BEGIN
DELETE from kategoriler where kategori_id=id;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kullaniciGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `kullaniciGetir`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kullaniciGetir`(IN `kulid` varchar(255))
BEGIN
	select * from kullanicilar WHERE kullanici_id=kulid;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for kullaniciSifreDegistir
-- ----------------------------
DROP PROCEDURE IF EXISTS `kullaniciSifreDegistir`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `kullaniciSifreDegistir`(IN `sifre` varchar(255),IN `kulid` varchar(255))
BEGIN
	update kullanicilar set kullanici_sifre=sifre where kullanici_id=kulid;

END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for musteriEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `musteriEkle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `musteriEkle`(IN `adi` varchar(255),IN `soyadi` varchar(255),IN `telefon` varchar(255),IN `adres` varchar(255))
BEGIN
insert into musteriler values(null,adi, soyadi ,telefon ,adres,now());

	
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for musteriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `musteriGetir`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `musteriGetir`()
BEGIN
	select * from musteriler;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for musteriGuncelle
-- ----------------------------
DROP PROCEDURE IF EXISTS `musteriGuncelle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `musteriGuncelle`(IN `adi` varchar(255),IN `soyadi` varchar(255),IN `telefon` varchar(255),IN `adres` varchar(255),IN `musteriid` varchar(255))
BEGIN
update musteriler set musteri_adi=adi,musteri_soyadi=soyadi,musteri_telefon=telefon,musteri_adres=adres,musteri_tarih=NOW() where musteri_id=musteriid;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for musteriIDAL
-- ----------------------------
DROP PROCEDURE IF EXISTS `musteriIDAL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `musteriIDAL`(IN `adi` varchar(255),IN `soyadi` varchar(255),IN `telefon` varchar(255),IN `adres` varchar(255))
BEGIN
select musteriler.musteri_id from musteriler 
where musteri_adi=adi and 
musteri_soyadi=soyadi and 
musteri_telefon=telefon AND
musteri_adres=adres;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for musteriSIL
-- ----------------------------
DROP PROCEDURE IF EXISTS `musteriSIL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `musteriSIL`(IN `id` varchar(255))
BEGIN
	DELETE from musteriler where musteri_id=id;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for satilacakUrunListeleme
-- ----------------------------
DROP PROCEDURE IF EXISTS `satilacakUrunListeleme`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `satilacakUrunListeleme`(IN `urunkategoriadi` varchar(255))
BEGIN
select * from urunler where urun_kategori_adi=urunkategoriadi;	
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for satisIcinUrunIDAL
-- ----------------------------
DROP PROCEDURE IF EXISTS `satisIcinUrunIDAL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `satisIcinUrunIDAL`(IN `urunadi` varchar(255),IN `urunsatis` varchar(255),IN `urunaciklama` varchar(255))
BEGIN
select urunler.urun_id from urunler 
where urun_adi=urunadi and 
urun_satis=urunsatis AND
urun_aciklama=urunaciklama;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for satisIcınMusteriIDAL
-- ----------------------------
DROP PROCEDURE IF EXISTS `satisIcınMusteriIDAL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `satisIcınMusteriIDAL`(IN `adi` varchar(255),IN `soyadi` varchar(255))
BEGIN
select musteriler.musteri_id from musteriler 
where musteri_adi=adi and 
musteri_soyadi=soyadi;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for SatislarKategoriAdinaGore
-- ----------------------------
DROP PROCEDURE IF EXISTS `SatislarKategoriAdinaGore`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SatislarKategoriAdinaGore`(IN `ilktarih` varchar(255),IN `sontarih` varchar(255),IN `veri` varchar(255))
BEGIN
select musteri.musteri_adi,urun.urun_kategori_adi,urun.urun_adi,satis.satis_adedi,urun.urun_satis,satis.satis_tarih 
from satislar as satis 
LEFT JOIN urunler as urun on satis.urun_id=urun.urun_id 
LEFT JOIN musteriler as musteri on musteri.musteri_id=satis.musteri_id WHERE MATCH(urun_kategori_adi) AGAINST(CONCAT(veri,'*') in boolean MODE) and (satis.satis_tarih BETWEEN ilktarih AND sontarih);
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for SatislarMusteriyeGore
-- ----------------------------
DROP PROCEDURE IF EXISTS `SatislarMusteriyeGore`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SatislarMusteriyeGore`(IN `ilktarih` varchar(255),IN `sontarih` varchar(255),IN `veri` varchar(255))
BEGIN
select musteri.musteri_adi,urun.urun_kategori_adi,urun.urun_adi,satis.satis_adedi,urun.urun_satis,satis.satis_tarih 
from satislar as satis 
LEFT JOIN urunler as urun on satis.urun_id=urun.urun_id 
LEFT JOIN musteriler as musteri on musteri.musteri_id=satis.musteri_id WHERE MATCH(musteri_adi) AGAINST(CONCAT(veri,'*') in boolean MODE) and (satis.satis_tarih BETWEEN ilktarih AND sontarih);
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for SatislarUrunAdinaGore
-- ----------------------------
DROP PROCEDURE IF EXISTS `SatislarUrunAdinaGore`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SatislarUrunAdinaGore`(IN `ilktarih` varchar(255),IN `sontarih` varchar(255),IN `veri` varchar(255))
BEGIN
select musteri.musteri_adi,urun.urun_kategori_adi,urun.urun_adi,satis.satis_adedi,urun.urun_satis,satis.satis_tarih 
from satislar as satis 
LEFT JOIN urunler as urun on satis.urun_id=urun.urun_id 
LEFT JOIN musteriler as musteri on musteri.musteri_id=satis.musteri_id WHERE MATCH(urun_adi) AGAINST(CONCAT(veri,'*') in boolean MODE) and (satis.satis_tarih BETWEEN ilktarih AND sontarih);
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for stokKontrol
-- ----------------------------
DROP PROCEDURE IF EXISTS `stokKontrol`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `stokKontrol`(IN `id` varchar(255))
BEGIN
select urun_stok,urun_adi from urunler where urunler.urun_id=id;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for toplamSatisAdedi
-- ----------------------------
DROP PROCEDURE IF EXISTS `toplamSatisAdedi`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `toplamSatisAdedi`()
BEGIN
	SELECT SUM(satis_adedi) FROM satislar;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunEkle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunEkle`(IN `adi` varchar(255),IN `kategoriadi` varchar(255),IN `alisucreti` varchar(255),IN `satisucreti` varchar(255),IN `stok` varchar(255),IN `aciklama` varchar(255))
BEGIN
	insert into urunler values(null,adi, kategoriadi ,alisucreti ,satisucreti,stok,aciklama,now());
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunGetir`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunGetir`()
BEGIN
	select * from urunler;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunGuncelle
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunGuncelle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunGuncelle`(IN `urunadi` varchar(255),IN `urunkategoriadi` varchar(255),IN `urunalis` varchar(255),IN `urunsatis` varchar(255),IN `urunstok` varchar(255),IN `urunaciklama` varchar(255),IN `urunid` varchar(255))
BEGIN
update urunler set 
urun_adi=urunadi,
urun_kategori_adi=urunkategoriadi,
urun_alis=urunalis,
urun_satis=urunsatis,
urun_stok=urunstok,
urun_aciklama=urunaciklama,
urun_tarih=NOW() where urun_id=urunid;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunIDAL
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunIDAL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunIDAL`(IN `urunadi` varchar(255),IN `urunkategori` varchar(255),IN `urungelisucreti` varchar(255),IN `urunsatisucreti` varchar(255),IN `urunstok` varchar(255),IN `urunaciklama` varchar(255))
BEGIN
select urunler.urun_id from urunler 
where urun_adi=urunadi and 
urun_kategori_adi=urunkategori and 
urun_alis=urungelisucreti AND
urun_satis=urunsatisucreti AND
urun_stok=urunstok AND
urun_aciklama=urunaciklama;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunSIL
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunSIL`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunSIL`(IN `urunid` varchar(255))
BEGIN
	DELETE from urunler where urun_id=urunid;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for urunStokGuncelle
-- ----------------------------
DROP PROCEDURE IF EXISTS `urunStokGuncelle`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `urunStokGuncelle`(IN `urunstok` varchar(255),IN `urunid` varchar(255))
BEGIN
	update urunler set urun_stok=urunstok where urun_id=urunid;
END
;;
DELIMITER ;
