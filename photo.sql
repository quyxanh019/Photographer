USE [Photographer]
GO
/****** Object:  Table [dbo].[Contact]    Script Date: 5/15/2020 12:09:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[Name] [nvarchar](500) NULL,
	[Address] [nvarchar](500) NULL,
	[City] [nvarchar](500) NULL,
	[Country] [nvarchar](500) NULL,
	[Telephone] [varchar](500) NULL,
	[Email] [varchar](500) NULL,
	[image] [varchar](500) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 5/15/2020 12:09:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](500) NULL,
	[Description] [ntext] NULL,
	[Image] [varchar](500) NULL,
 CONSTRAINT [PK_Gallery] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ImageInGallery]    Script Date: 5/15/2020 12:09:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ImageInGallery](
	[GalleryID] [int] NOT NULL,
	[Image] [varchar](500) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_ImageInGallery] PRIMARY KEY CLUSTERED 
(
	[GalleryID] ASC,
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Information]    Script Date: 5/15/2020 12:09:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Information](
	[About] [ntext] NULL,
	[ShortAbout] [ntext] NULL,
	[Image] [varchar](500) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Contact] ([Name], [Address], [City], [Country], [Telephone], [Email], [image]) VALUES (N'Nguyễn Quỳnh', N'làng Bột Thượng, trấn Hoằng Hóa', N'tỉnh Thanh Hóa', N'Việt Nam', N'0966966999', N'trangquynh@trangnguyen.com', N'map.png')
SET IDENTITY_INSERT [dbo].[Gallery] ON 

INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (1, N'Gallery 1', N'Witness Japan landscape overcome by a breathtaking sea of cherry-blossoms this April. Incredible shades of
 pink stretch across the main islands that make up the country', N'boyVioletShirt.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (2, N'Gallery 2', N'Expect to be greeted by drumbeats, fireworks and a whole lot of energy at Beltane Fire
 Festival in Edinburgh. Taking place on April 30', N'girlBlackShirt.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (3, N'Gallery 3', N'Take this opportunity to check out Edinburgh and its many attractions. Top spots are
 the Edinburgh Castle, National Galleries of Scotland', N'boyBlueEye.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (4, N'Gallery 4', N'For many, travel is a means of escape. Increasingly though, it provides an opportunity for dreams to come true, bodies to be repaired, and lives to be changed.', N'boyBlueEye.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (5, N'Gallery 5', N'It is little wonder then that more and more people from countries with overloaded healthcare systems are venturing overseas for medical treatment.', N'boyVioletShirt.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (6, N'Gallery 6', N'Many independent healthcare travellers put a great deal of effort into their journey to and from a country, bearing in mind the time spent in a foreign country', N'girlBlackShirt.jpg')
INSERT [dbo].[Gallery] ([ID], [Name], [Description], [Image]) VALUES (7, N'Gallery 7', N'In Malaysia, we take care of every single minute detail for you. We have been consistent winners from 2015 to 2019 at the Internal Medical Travel Journal Awards.', N'boyBlueEye.jpg')
SET IDENTITY_INSERT [dbo].[Gallery] OFF
SET IDENTITY_INSERT [dbo].[ImageInGallery] ON 

INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'boyVioletShirt.jpg', 1)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlYellowEye.jpg', 2)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlBlackShirt.jpg', 3)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'boyBlueEye.jpg', 4)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'boyBrownEye.jpg', 5)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlInBW.jpg', 6)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlShortHair.jpg', 7)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlWithHand.jpg', 8)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'dog.jpg', 9)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'cat.jpg', 10)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (1, N'girlBlackShirt.jpg', 22)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (2, N'girlBlackShirt.jpg', 11)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (2, N'boyBlueEye.jpg', 12)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (2, N'boyBrownEye.jpg', 13)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (2, N'girlInBW.jpg', 14)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (2, N'girlShortHair.jpg', 15)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (3, N'boyBlueEye.jpg', 16)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (3, N'boyBrownEye.jpg', 17)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (3, N'girlInBW.jpg', 18)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (3, N'girlShortHair.jpg', 19)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (3, N'girlWithHand.jpg', 20)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'girlWithHand.jpg', 23)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'boyBlueEye.jpg', 24)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'girlWithHand.jpg', 25)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'boyBlueEye.jpg', 26)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'girlWithHand.jpg', 27)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'boyBlueEye.jpg', 28)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'girlWithHand.jpg', 29)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'boyBlueEye.jpg', 30)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'girlWithHand.jpg', 31)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (4, N'boyBlueEye.jpg', 32)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (5, N'cat.jpg', 33)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (5, N'girlBlackShirt.jpg', 34)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (6, N'boyVioletShirt.jpg', 35)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (6, N'girlYellowEye.jpg', 36)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 37)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 38)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 39)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 40)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 41)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 42)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 43)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 44)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 45)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 46)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 47)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 48)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 49)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 50)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 51)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 52)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 53)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 54)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 55)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 56)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 57)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 58)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 59)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 60)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 61)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 62)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 63)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'girlInBW.jpg', 64)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'boyBlueEye.jpg', 65)
INSERT [dbo].[ImageInGallery] ([GalleryID], [Image], [ID]) VALUES (7, N'dog.jpg', 66)
SET IDENTITY_INSERT [dbo].[ImageInGallery] OFF
INSERT [dbo].[Information] ([About], [ShortAbout], [Image]) VALUES (N'COVID-19 is a new virus that belongs to the Coronavirus group which is actually
common across the world. This particular virus can cause respiratory illnesses which could
lead to more severe health problems. COVID-19 can spread from person-to-person, causing much fear
and confusion among the general public. Many countries around the world have implemented
drastic measures to protect their citizens. Some countries shut their borders while
others impose self-isolation for all arrivals. In other words, your travel plan is likely to be affected.', N'COVID-19 is a new virus', N'girlYellowEye.jpg')
ALTER TABLE [dbo].[ImageInGallery]  WITH CHECK ADD  CONSTRAINT [FK_ImageInGallery_Gallery] FOREIGN KEY([GalleryID])
REFERENCES [dbo].[Gallery] ([ID])
GO
ALTER TABLE [dbo].[ImageInGallery] CHECK CONSTRAINT [FK_ImageInGallery_Gallery]
GO
