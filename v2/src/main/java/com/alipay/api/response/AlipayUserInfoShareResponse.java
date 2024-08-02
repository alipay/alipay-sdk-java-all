package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserDeliverAddress;
import com.alipay.api.domain.AlipayUserPicture;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.share response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:15
 */
public class AlipayUserInfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 3723788752297286129L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 用户年龄，实名认证为T，且证件类型为身份证，则输出年龄字段，否则不输出
	 */
	@ApiField("age")
	private String age;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像地址。
注意：如果没有数据（用户未设置）时不会返回该信息，请做好容错。
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 经营/业务范围（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 【证件号码】结合证件类型使用.【注意】只is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 【证件类型】0:身份证 1:护照 2:军官证 3:士兵证 4:回乡证 5:临时身份证 6:户口簿 7:警官证 8:台胞证 9:营业执照10:其它证件 11:港澳居民来往内地通行证 12:台湾居民来往大陆通行证 13:台湾居民居住证 14:港澳居民居住证
 15:港澳身份证 16:外国人永久居住证【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 学信网返回的学校名称，有可能为空。
	 */
	@ApiField("college_name")
	private String collegeName;

	/** 
	 * 国家码
	 */
	@ApiField("country_code")
	private String countryCode;

	/** 
	 * 学信网返回的学历/学位信息，数据质量一般，请谨慎使用，取值包括：博士研究生、硕士研究生、高升本、专科、博士、硕士、本科、夜大电大函大普通班、专科(高职)、第二学士学位。
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 收货地址列表
	 */
	@ApiListField("deliver_addresses")
	@ApiField("alipay_user_deliver_address")
	private List<AlipayUserDeliverAddress> deliverAddresses;

	/** 
	 * 展示名称，用于展示和识别用户。返回的值是支付宝账户的可用外标之一，根据展示名称产品规则可能返回手机号/邮箱/支付宝号其中的一个。同一个账户在不同的时期返回的展示名称可能随规则变化而变化。
	 */
	@ApiField("display_name")
	private String displayName;

	/** 
	 * 优先获取email登录名，如果不存在，则返回mobile登录名
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 入学时间，yyyy-mm-dd格式
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 企业证照地址的详细地址（用户类型是公司用户才有该字段）【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("ent_license_address")
	private String entLicenseAddress;

	/** 
	 * 企业证照地址所在地区或县（用户类型是公司用户才有该字段）【注意】只有is_certified为T的时候才有意义，否则不保证准确性，目前企业营业执照地址不含县(区)，area为空。
	 */
	@ApiField("ent_license_area")
	private String entLicenseArea;

	/** 
	 * 企业证照地址所在市（用户类型是公司用户才有该字段）【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("ent_license_city")
	private String entLicenseCity;

	/** 
	 * 企业证照地址所在省份（用户类型是公司用户才有该字段）【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("ent_license_province")
	private String entLicenseProvince;

	/** 
	 * 企业代理人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_expiry_date")
	private String firmAgentPersonCertExpiryDate;

	/** 
	 * 企业代理人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_no")
	private String firmAgentPersonCertNo;

	/** 
	 * 企业代理人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_cert_type")
	private String firmAgentPersonCertType;

	/** 
	 * 企业代理人姓名（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_agent_person_name")
	private String firmAgentPersonName;

	/** 
	 * 企业法人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_expiry_date")
	private String firmLegalPersonCertExpiryDate;

	/** 
	 * 法人证件号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_no")
	private String firmLegalPersonCertNo;

	/** 
	 * 企业法人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_cert_type")
	private String firmLegalPersonCertType;

	/** 
	 * 企业法人名称（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("firm_legal_person_name")
	private String firmLegalPersonName;

	/** 
	 * 企业法人证件图片（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_legal_person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmLegalPersonPictures;

	/** 
	 * 企业相关证件图片，包含图片地址（目前需要调用alipay.user.certify.image.fetch转换一下）及类型（用户类型是公司类型时才有此字段）。
	 */
	@ApiListField("firm_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> firmPictures;

	/** 
	 * 公司类型，包括（用户类型是公司类型时才有此字段）：

CO(公司)

INST(事业单位),

COMM(社会团体),

NGO(民办非企业组织),

STATEORGAN(党政国家机关)
	 */
	@ApiField("firm_type")
	private String firmType;

	/** 
	 * 性别。枚举值如下：
F：女性；
M：男性。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 预期毕业时间，不保证准确性，yyyy-mm-dd格式。
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/** 
	 * 身份证地址信息
	 */
	@ApiField("identity_card_address")
	private String identityCardAddress;

	/** 
	 * 身份证地区信息
	 */
	@ApiField("identity_card_area")
	private String identityCardArea;

	/** 
	 * 身份证市信息
	 */
	@ApiField("identity_card_city")
	private String identityCardCity;

	/** 
	 * 身份证省信息
	 */
	@ApiField("identity_card_province")
	private String identityCardProvince;

	/** 
	 * 是否是金融机构或特殊单位，"I"表示金融机构, "C"表示无余额账户的单位账户,  "V", 表示虚拟主体(类似机构仅内部户无余额户),  "N"表示非金融机构且非无余额账户的单位账户,"?"表示匿名用户
	 */
	@ApiField("inst_or_corp")
	private String instOrCorp;

	/** 
	 * T/F, 实名认证为T，且证件类型为身份证，则输出是否成年字段，否则不输出
	 */
	@ApiField("is_adult")
	private String isAdult;

	/** 
	 * 余额账户是否被冻结。

T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * 账户是否被冻结，T/F，T冻结，F未冻结
	 */
	@ApiField("is_blocked")
	private String isBlocked;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证。
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 营业执照有效期，yyyyMMdd或长期，（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_expiry_date")
	private String licenseExpiryDate;

	/** 
	 * 企业执照号码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 支付宝会员等级
	 */
	@ApiField("member_grade")
	private String memberGrade;

	/** 
	 * 手机号码。
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户昵称。
注意：如果没有数据（用户未设置）时不会返回该信息，请做好容错。
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 支付宝用户的openId。
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 组织机构代码（用户类型是公司类型时才有此字段）。
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/** 
	 * 个人用户生日。
	 */
	@ApiField("person_birthday")
	private String personBirthday;

	/** 
	 * 生日。不包含具体年份，格式MMdd
	 */
	@ApiField("person_birthday_without_year")
	private String personBirthdayWithoutYear;

	/** 
	 * 证件有效期（用户类型是个人的时候才有此字段）。
	 */
	@ApiField("person_cert_expiry_date")
	private String personCertExpiryDate;

	/** 
	 * 证件起始日期（用户类型是个人的时候才可能有此字段，不保证准确，同时有可能为空）。
	 */
	@ApiField("person_cert_issue_date")
	private String personCertIssueDate;

	/** 
	 * 个人证件图片（用户类型是个人的时候才有此字段）。
	 */
	@ApiListField("person_pictures")
	@ApiField("alipay_user_picture")
	private List<AlipayUserPicture> personPictures;

	/** 
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 职业
	 */
	@ApiField("profession")
	private String profession;

	/** 
	 * 省份名称。
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 淘宝id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 若用户是个人用户，则是用户的真实姓名；若是企业用户，则是企业名称。【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("user_name")
	private String userName;

	/** 
	 * 身份证民族信息
	 */
	@ApiField("user_nation")
	private String userNation;

	/** 
	 * 用户状态（Q/T/B/W）。
Q代表快速注册用户
T代表正常用户
B代表被冻结账户
W代表已注册，未激活的账户
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 用户类型（1/2）
1代表公司账户2代表个人账户
	 */
	@ApiField("user_type")
	private String userType;

	/** 
	 * 邮政编码。
	 */
	@ApiField("zip")
	private String zip;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAge(String age) {
		this.age = age;
	}
	public String getAge( ) {
		return this.age;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeName( ) {
		return this.collegeName;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryCode( ) {
		return this.countryCode;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setDeliverAddresses(List<AlipayUserDeliverAddress> deliverAddresses) {
		this.deliverAddresses = deliverAddresses;
	}
	public List<AlipayUserDeliverAddress> getDeliverAddresses( ) {
		return this.deliverAddresses;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDisplayName( ) {
		return this.displayName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setEnrollmentTime(String enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}
	public String getEnrollmentTime( ) {
		return this.enrollmentTime;
	}

	public void setEntLicenseAddress(String entLicenseAddress) {
		this.entLicenseAddress = entLicenseAddress;
	}
	public String getEntLicenseAddress( ) {
		return this.entLicenseAddress;
	}

	public void setEntLicenseArea(String entLicenseArea) {
		this.entLicenseArea = entLicenseArea;
	}
	public String getEntLicenseArea( ) {
		return this.entLicenseArea;
	}

	public void setEntLicenseCity(String entLicenseCity) {
		this.entLicenseCity = entLicenseCity;
	}
	public String getEntLicenseCity( ) {
		return this.entLicenseCity;
	}

	public void setEntLicenseProvince(String entLicenseProvince) {
		this.entLicenseProvince = entLicenseProvince;
	}
	public String getEntLicenseProvince( ) {
		return this.entLicenseProvince;
	}

	public void setFirmAgentPersonCertExpiryDate(String firmAgentPersonCertExpiryDate) {
		this.firmAgentPersonCertExpiryDate = firmAgentPersonCertExpiryDate;
	}
	public String getFirmAgentPersonCertExpiryDate( ) {
		return this.firmAgentPersonCertExpiryDate;
	}

	public void setFirmAgentPersonCertNo(String firmAgentPersonCertNo) {
		this.firmAgentPersonCertNo = firmAgentPersonCertNo;
	}
	public String getFirmAgentPersonCertNo( ) {
		return this.firmAgentPersonCertNo;
	}

	public void setFirmAgentPersonCertType(String firmAgentPersonCertType) {
		this.firmAgentPersonCertType = firmAgentPersonCertType;
	}
	public String getFirmAgentPersonCertType( ) {
		return this.firmAgentPersonCertType;
	}

	public void setFirmAgentPersonName(String firmAgentPersonName) {
		this.firmAgentPersonName = firmAgentPersonName;
	}
	public String getFirmAgentPersonName( ) {
		return this.firmAgentPersonName;
	}

	public void setFirmLegalPersonCertExpiryDate(String firmLegalPersonCertExpiryDate) {
		this.firmLegalPersonCertExpiryDate = firmLegalPersonCertExpiryDate;
	}
	public String getFirmLegalPersonCertExpiryDate( ) {
		return this.firmLegalPersonCertExpiryDate;
	}

	public void setFirmLegalPersonCertNo(String firmLegalPersonCertNo) {
		this.firmLegalPersonCertNo = firmLegalPersonCertNo;
	}
	public String getFirmLegalPersonCertNo( ) {
		return this.firmLegalPersonCertNo;
	}

	public void setFirmLegalPersonCertType(String firmLegalPersonCertType) {
		this.firmLegalPersonCertType = firmLegalPersonCertType;
	}
	public String getFirmLegalPersonCertType( ) {
		return this.firmLegalPersonCertType;
	}

	public void setFirmLegalPersonName(String firmLegalPersonName) {
		this.firmLegalPersonName = firmLegalPersonName;
	}
	public String getFirmLegalPersonName( ) {
		return this.firmLegalPersonName;
	}

	public void setFirmLegalPersonPictures(List<AlipayUserPicture> firmLegalPersonPictures) {
		this.firmLegalPersonPictures = firmLegalPersonPictures;
	}
	public List<AlipayUserPicture> getFirmLegalPersonPictures( ) {
		return this.firmLegalPersonPictures;
	}

	public void setFirmPictures(List<AlipayUserPicture> firmPictures) {
		this.firmPictures = firmPictures;
	}
	public List<AlipayUserPicture> getFirmPictures( ) {
		return this.firmPictures;
	}

	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}
	public String getFirmType( ) {
		return this.firmType;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}
	public String getGraduationTime( ) {
		return this.graduationTime;
	}

	public void setIdentityCardAddress(String identityCardAddress) {
		this.identityCardAddress = identityCardAddress;
	}
	public String getIdentityCardAddress( ) {
		return this.identityCardAddress;
	}

	public void setIdentityCardArea(String identityCardArea) {
		this.identityCardArea = identityCardArea;
	}
	public String getIdentityCardArea( ) {
		return this.identityCardArea;
	}

	public void setIdentityCardCity(String identityCardCity) {
		this.identityCardCity = identityCardCity;
	}
	public String getIdentityCardCity( ) {
		return this.identityCardCity;
	}

	public void setIdentityCardProvince(String identityCardProvince) {
		this.identityCardProvince = identityCardProvince;
	}
	public String getIdentityCardProvince( ) {
		return this.identityCardProvince;
	}

	public void setInstOrCorp(String instOrCorp) {
		this.instOrCorp = instOrCorp;
	}
	public String getInstOrCorp( ) {
		return this.instOrCorp;
	}

	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}
	public String getIsAdult( ) {
		return this.isAdult;
	}

	public void setIsBalanceFrozen(String isBalanceFrozen) {
		this.isBalanceFrozen = isBalanceFrozen;
	}
	public String getIsBalanceFrozen( ) {
		return this.isBalanceFrozen;
	}

	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}
	public String getIsBlocked( ) {
		return this.isBlocked;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsCertified( ) {
		return this.isCertified;
	}

	public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}
	public String getIsStudentCertified( ) {
		return this.isStudentCertified;
	}

	public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}
	public String getLicenseExpiryDate( ) {
		return this.licenseExpiryDate;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo( ) {
		return this.licenseNo;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	public String getMemberGrade( ) {
		return this.memberGrade;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getOrganizationCode( ) {
		return this.organizationCode;
	}

	public void setPersonBirthday(String personBirthday) {
		this.personBirthday = personBirthday;
	}
	public String getPersonBirthday( ) {
		return this.personBirthday;
	}

	public void setPersonBirthdayWithoutYear(String personBirthdayWithoutYear) {
		this.personBirthdayWithoutYear = personBirthdayWithoutYear;
	}
	public String getPersonBirthdayWithoutYear( ) {
		return this.personBirthdayWithoutYear;
	}

	public void setPersonCertExpiryDate(String personCertExpiryDate) {
		this.personCertExpiryDate = personCertExpiryDate;
	}
	public String getPersonCertExpiryDate( ) {
		return this.personCertExpiryDate;
	}

	public void setPersonCertIssueDate(String personCertIssueDate) {
		this.personCertIssueDate = personCertIssueDate;
	}
	public String getPersonCertIssueDate( ) {
		return this.personCertIssueDate;
	}

	public void setPersonPictures(List<AlipayUserPicture> personPictures) {
		this.personPictures = personPictures;
	}
	public List<AlipayUserPicture> getPersonPictures( ) {
		return this.personPictures;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getProfession( ) {
		return this.profession;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}
	public String getTaobaoId( ) {
		return this.taobaoId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}
	public String getUserNation( ) {
		return this.userNation;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType( ) {
		return this.userType;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip( ) {
		return this.zip;
	}

}
