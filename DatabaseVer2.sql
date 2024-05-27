create database QLKS
go
use QLKS
go 
create table nhanvien(
	manv char(10) not null primary key,
	tennv nchar(100),
	ngaysinh nchar(50),
	sdt nvarchar(20),
	diachi nchar(100),
	lichlamviec nvarchar(20),
	chucvu nchar(100))
go 
create table khachhang(
	cccd nvarchar(20) not null primary key,
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
	cccd nvarchar(20),
	maphong char(10),
	madv char(10),
	ngaynhaphong nvarchar(30),
	ngaytraphong nvarchar(30),
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
	cccd nvarchar(20),
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
('NV01',N'Trần Văn Lâm','23/07/2003','087920312',N'Nam Định','29/05/2024',N'Nhân Viên'),
('NV02',N'Phạm Đức Mạnh','24/08/2003','087920314',N'Hà Nội','30/05/2024',N'Nhân Viên'),
('NV03',N'Phùng Thế Ngọc','25/09/2003','087920316',N'Ninh Bình','01/06/2024',N'Quản Lý'),
('NV04',N'Nguyễn Tuần Lộc','26/10/2003','087920340',N'TP.Hồ Chí Minh','30/05/2024',N'Nhân Viên')
go
insert into khachhang values
('0987654321',N'Chí Phèo',N'Nam',N'Hà Nội',N'Việt Nam'),
('0123456789',N'Yae Miko',N'Nữ',N'Tokyo',N'Nhật Bản'),
('0463236432',N'Hammas Eliot',N'Nam',N'Washington',N'Hoa Kỳ'),
('0343281944',N'Lão Hạc',N'Nam',N'Hà Nam',N'Việt Nam'),
('0279575174',N'Kamada',N'Nữ',N'Osaka',N'Nhật Bản')
go
insert into loaiphong values
('LP01',N'Phòng Đơn',100000,1),
('LP02',N'Phòng Đôi',200000,4),
('LP03',N'Phòng V.I.P 1',2000000,4),
('LP04',N'Phòng V.I.P 2',6000000,8)
go
insert into phong values
('P01','LP02','P101','Còn trống'),
('P02','LP01','P201','Đầy phòng'),
('P03','LP04','P401','Còn trống'),
('P04','LP03','P301','Còn trống')
go
insert into loaidichvu values
('LDV01',N'Đồ Ăn',10000),
('LDV02',N'Vận Chuyển',500000),
('LDV03',N'Giải Trí',200000)
go
insert into dichvu values
('DV01','LDV01',N'Hủ Tiếu Gõ'),
('DV02','LDV01',N'Mì 2 Trứng'),
('DV03','LDV02',N'Xe Đưa Đón Sân Bay'),
('DV04','LDV02',N'Cho Thuê xe Tự lái'),
('DV05','LDV03',N'Spa'),
('DV06','LDV03',N'Đánh Golf, Tennis')
go
insert into phieuthuephong values
('PTP01','0123456789','P02','DV01','2024/05/22','2024/05/22'),
('PTP02','0987654321','P01','DV02','2024/05/23','2024/05/23')
go
insert into hoadon values
('HD01','PTP02'),
('HD02','PTP01')
go
insert into danhgia values
('DG01','0987654321','Hi'),
('DG02','0123456789','5 sao')
go
insert into thongke values
('TK01','NV02','P01', 68.99,1000000),
('TK02','NV01','P02', 99.99,10000000)

select * from khachhang