package dto;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class RegDto 
{
	@Id
	private long mobile;
	private String AssociationName;
	private String Establishedyear;
	private int    NoofAffiliatedClubs;
	private String OfficialCorrespondent ;
	private String AffiliationStatus;
	private String ClubNamesPhone;
	private String RegisteredAddress;
	private int    SocietiesRegno;
	private String Acheivements;
	private String Address;
	private String PANNo;
	private String Website;
	private String City;
	private String BankDetails;
	private String FacebookLink;
	private String State;
	private String InstagramLink;
	private String Interested;
	private String District;
	private String RinkFacilities;
	private String RinkStatus;
	private String Email;
	private String OfficeBearersNamePhone;
	@Lob
	private byte[] logo;
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	private Blob RegistrationCertificate;
	private Blob AffiliationLetter;
	private String name;
	private String DOB;
	private String Age;
	private String AgeGroup;
	private String gender;
	private String Disciplines;
	private String intersted;

	
public String getIntersted() {
		return intersted;
	}
	public void setIntersted(String intersted) {
		this.intersted = intersted;
	}
public String getDisciplines() {
		return Disciplines;
	}
	public void setDisciplines(String disciplines) {
		Disciplines = disciplines;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getAgeGroup() {
		return AgeGroup;
	}
	public void setAgeGroup(String ageGroup) {
		AgeGroup = ageGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAssociationName() {
		return AssociationName;
	}
	public void setAssociationName(String associationName) {
		AssociationName = associationName;
	}
	public String getEstablishedyear() {
		return Establishedyear;
	}
	public void setEstablishedyear(String establishedyear) {
		Establishedyear = establishedyear;
	}
	public int getNoofAffiliatedClubs() {
		return NoofAffiliatedClubs;
	}
	public void setNoofAffiliatedClubs(int noofAffiliatedClubs) {
		NoofAffiliatedClubs = noofAffiliatedClubs;
	}
	public String getOfficialCorrespondent() {
		return OfficialCorrespondent;
	}
	public void setOfficialCorrespondent(String officialCorrespondent) {
		OfficialCorrespondent = officialCorrespondent;
	}
	public String getAffiliationStatus() {
		return AffiliationStatus;
	}
	public void setAffiliationStatus(String affiliationStatus) {
		AffiliationStatus = affiliationStatus;
	}
	public String getClubNamesPhone() {
		return ClubNamesPhone;
	}
	public void setClubNamesPhone(String clubNamesPhone) {
		ClubNamesPhone = clubNamesPhone;
	}
	public String getRegisteredAddress() {
		return RegisteredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		RegisteredAddress = registeredAddress;
	}
	public int getSocietiesRegno() {
		return SocietiesRegno;
	}
	public void setSocietiesRegno(int societiesRegno) {
		SocietiesRegno = societiesRegno;
	}
	public String getAcheivements() {
		return Acheivements;
	}
	public void setAcheivements(String acheivements) {
		Acheivements = acheivements;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPANNo() {
		return PANNo;
	}
	public void setPANNo(String pANNo) {
		PANNo = pANNo;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getBankDetails() {
		return BankDetails;
	}
	public void setBankDetails(String bankDetails) {
		BankDetails = bankDetails;
	}
	public String getFacebookLink() {
		return FacebookLink;
	}
	public void setFacebookLink(String facebookLink) {
		FacebookLink = facebookLink;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getInstagramLink() {
		return InstagramLink;
	}
	public void setInstagramLink(String instagramLink) {
		InstagramLink = instagramLink;
	}
	public String getInterested() {
		return Interested;
	}
	public void setInterested(String interested) {
		Interested = interested;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getRinkFacilities() {
		return RinkFacilities;
	}
	public void setRinkFacilities(String rinkFacilities) {
		RinkFacilities = rinkFacilities;
	}
	public String getRinkStatus() {
		return RinkStatus;
	}
	public void setRinkStatus(String rinkStatus) {
		RinkStatus = rinkStatus;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getOfficeBearersNamePhone() {
		return OfficeBearersNamePhone;
	}
	public void setOfficeBearersNamePhone(String officeBearersNamePhone) {
		OfficeBearersNamePhone = officeBearersNamePhone;
	}
	
	public Blob getRegistrationCertificate() {
		return RegistrationCertificate;
	}
	public void setRegistrationCertificate(Blob registrationCertificate) {
		RegistrationCertificate = registrationCertificate;
	}
	public Blob getAffiliationLetter() {
		return AffiliationLetter;
	}
	public void setAffiliationLetter(Blob affiliationLetter) {
		AffiliationLetter = affiliationLetter;
	}

}
