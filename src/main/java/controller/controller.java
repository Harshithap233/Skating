package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;
import dto.RegDto;

@WebServlet("/register")
@MultipartConfig(maxFileSize = 16177215)
public class controller extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String name=req.getParameter("name");
	String year=req.getParameter("year");
	String nof=req.getParameter("nof");
	int nof1=Integer.parseInt(nof);
	String corrname=req.getParameter("corrname");
	String status=req.getParameter("status");
	String club=req.getParameter("club");
	String address=req.getParameter("address");
	String regno=req.getParameter("regno");
	int regno1=Integer.parseInt(regno);
	String achei=req.getParameter("achei");
	String address1=req.getParameter("address1");
	String pan=req.getParameter("pan");
	String website=req.getParameter("website");
	String city=req.getParameter("city");
	String bank=req.getParameter("bank");
	String facebook=req.getParameter("facebook");
	String state=req.getParameter("state");
	String disciplines=req.getParameter("disciplines");
	String instagram=req.getParameter("instagram");
	String insterted=req.getParameter("insterted");
	String district=req.getParameter("district");
	String rinkfacilities=req.getParameter("rinkfacilities");
	String mobile=req.getParameter("mobile");
	long mobile1=Long.parseLong(mobile);
	String rinkstatus=req.getParameter("rinkstatus");
	String email=req.getParameter("email");
	String officebearers=req.getParameter("officebearers");

	RegDto dto=new RegDto();
	dto.setAcheivements(achei);
	dto.setAddress(address1);
	dto.setAffiliationStatus(rinkstatus);
	dto.setAssociationName(name);
	dto.setBankDetails(bank);
	dto.setCity(city);
	dto.setClubNamesPhone(club);
	dto.setDistrict(district);
	dto.setEmail(email);
	dto.setEstablishedyear(year);
	dto.setFacebookLink(facebook);
	dto.setInstagramLink(instagram);
	dto.setInterested(officebearers);
	dto.setMobile(mobile1);
	dto.setNoofAffiliatedClubs(nof1);
	dto.setOfficeBearersNamePhone(officebearers);
	dto.setOfficialCorrespondent(corrname);
	dto.setPANNo(pan);
	dto.setRegisteredAddress(address);
	dto.setRinkFacilities(rinkfacilities);
	dto.setRinkStatus(rinkstatus);
	dto.setSocietiesRegno(regno1);
	dto.setState(state);
	dto.setWebsite(website);
	
	
	Part logo=req.getPart("logo");
	
	dto.setLogo((Blob) logo);
	
	Dao dao=new Dao();
	dao.insert(dto);
}
}
