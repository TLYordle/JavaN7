create database QLKS
go
use QLKS
go 
create table nhanvien(
	manv char(10) not null primary key,
	tennv nchar(100),
	ngaysinh date,
	sdt int,
	diachi nchar(100),
	lichlamviec date,
	chucvu nchar(100))
go 
create table khachhang(
	cccd int not null primary key,
	tenkh nchar(100),
	gioitinh nchar(100),
	diachi nchar(1000),
	quoctich nchar(100))
go 
create table loaiphong(
	malp char(10) not null primary key,
	tenlp nchar(1000),
	dongia money,
	songuoitoida int) 
go
create table phong(
	maphong char(10) not null primary key,
	malp char(10),
	tenphong nchar(1000),
	tinhtrangphong nchar(100),
	constraint fk_phong_loaiphong foreign key (malp) references loaiphong(malp))
go 
create table loaidichvu(
	maldv char(10) not null primary key,
	tenldv nchar(1000),
	dongia money)
go 
create table dichvu(
	madv char(10) not null primary key,
	maldv char(10),
	tendv nchar(1000),
	constraint fk_dichvu_loaidichvu foreign key (maldv) references loaidichvu(maldv))
go 
create table phieuthuephong(
	maptp char(10) not null primary key,
	cccd int,
	maphong char(10),
	madv char(10),
	ngaynhaphong date,
	ngaytraphong date,
	constraint fk_phieuthuephong_khachhang foreign key (cccd) references khachhang(cccd),
	constraint fk_phieuthuephong_phong foreign key (maphong) references phong(maphong),
	constraint fk_phieuthuephong_dichvu foreign key (madv) references dichvu(madv))
go 
create table hoadon(
	mahd char(10) not null primary key,
	maptp char(10),
	constraint fk_hoadon_phieuthuephong foreign key (maptp) references phieuthuephong(maptp))
go 
create table danhgia(
	madg char(10) not null primary key,
	cccd int,
	noidungdg nchar(1000),
	constraint fk_danhgia_khachhang foreign key (cccd) references khachhang(cccd))
go 
create table thongke(
	matk char(10) not null primary key,
	manv char(10),
	maphong char(10),
	tyledatphong float,
	doanhthu money,
	constraint fk_thongke_nhanvien foreign key (manv) references nhanvien(manv),
	constraint fk_thongke_phong foreign key (maphong) references phong(maphong))
go
insert into nhanvien values
('NV01','NV1','1999/05/03',087920313,'Hà Nội','2024/05/21','Nhân Viên'),
('NV02','NV2','2000/06/02',087920314,'Hà Nam','2024/05/21','Nhân Viên')
go
insert into khachhang values
(0987654321,'kh1','nam','hà nội','việt nam'),
(0123456789,'KH2','Nữ','Tokyo','Nhật Bản')
go
insert into loaiphong values
('LP01','LP1',100000,4),
('LP02','LP2',200000,1)
go
insert into phong values
('P01','LP02','P1','Còn trống'),
('P02','LP01','P2','Đầy phòng')
go
insert into loaidichvu values
('LDV01','LDV1',10000),
('LDV02','LDV2',100000)
go
insert into dichvu values
('DV01','LDV02','DV1'),
('DV02','LDV01','DV2')
go 
insert into phieuthuephong values
('PTP01',0123456789,'P02','DV01','2024/05/22','2024/05/22'),
('PTP02',0987654321,'P01','DV02','2024/05/23','2024/05/23')
go
insert into hoadon values
('HD01','PTP02'),
('HD02','PTP01')
go
insert into danhgia values
('DG01',0987654321,'Hi'),
('DG02',0123456789,'5 sao')
go
insert into thongke values
('TK01','NV02','P01', 68.99,1000000),
('TK02','NV01','P02', 99.99,10000000)
