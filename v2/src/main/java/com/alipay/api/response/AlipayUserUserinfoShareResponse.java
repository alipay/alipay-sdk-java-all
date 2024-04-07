package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliverAddress;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:08
 */
public class AlipayUserUserinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 1464568346553783867L;

	/** 
	 * 详细地址。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 区域编码，暂时不返回值
	 */
	@ApiField("address_code")
	private String addressCode;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 区县名称。
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 用户头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 【注意】当is_balance_frozen为“F”时，改字段不会返回.

CTU ---- CTU冻结，允许用户开启

ALIBABA ---- ALIBABA冻结，允许用户开启

SERVER ---- 后台冻结，允许用户开启

USER ----  用户冻结 

CTU_N---- CTU冻结，不允许用户开启

ALIBABA_N ---- ALIBABA冻结，不允许用户开启

SERVER_N ---- 后台冻结，不允许用户开启

UNKNOWN ---- 降级、或查询超时
	 */
	@ApiField("balance_freeze_type")
	private String balanceFreezeType;

	/** 
	 * 用户生日
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 0:身份证

1:护照

2:军官证

3:士兵证

4:回乡证

5:临时身份证

6:户口簿

7:警官证

8:台胞证

9:营业执照

10其它证件
	 */
	@ApiField("cert_type_value")
	private String certTypeValue;

	/** 
	 * 市名称。
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 是否默认收货地址，暂时不返回值
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/** 
	 * 收货人地址列表
	 */
	@ApiListField("deliver_address_list")
	@ApiField("deliver_address")
	private List<DeliverAddress> deliverAddressList;

	/** 
	 * 收货人所在区县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/** 
	 * 收货人所在城市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/** 
	 * 收货人全称
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/** 
	 * 收货地址的联系人移动电话。
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/** 
	 * 收货地址的联系人固定电话。
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/** 
	 * 收货人所在省份
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/** 
	 * 用户支付宝账号绑定的邮箱地址
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 姓氏，取的是realName中的首个字符，对非中文、中文复姓支持较差。
	 */
	@ApiField("family_name")
	private String familyName;

	/** 
	 * 公司名称（用户类型是公司类型时公司名称才有此字段）。
	 */
	@ApiField("firm_name")
	private String firmName;

	/** 
	 * 性别（F：女性；M：男性）
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * T--被冻结；F--未冻结
	 */
	@ApiField("is_balance_frozen")
	private String isBalanceFrozen;

	/** 
	 * T为是银行卡认证，F为非银行卡认证。
	 */
	@ApiField("is_bank_auth")
	private String isBankAuth;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * T：表示A类实名认证；F：表示非A类实名认证
	 */
	@ApiField("is_certify_grade_a")
	private String isCertifyGradeA;

	/** 
	 * T为是身份证认证，F为非身份证认证。
	 */
	@ApiField("is_id_auth")
	private String isIdAuth;

	/** 
	 * T为通过营业执照认证，F为没有通过
	 */
	@ApiField("is_licence_auth")
	private String isLicenceAuth;

	/** 
	 * T为是手机认证，F为非手机认证。
	 */
	@ApiField("is_mobile_auth")
	private String isMobileAuth;

	/** 
	 * 是否是学生
	 */
	@ApiField("is_student_certified")
	private String isStudentCertified;

	/** 
	 * 手机号码。
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 电话号码。
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 省份名称。
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 用户的真实姓名。
	 */
	@ApiField("real_name")
	private String realName;

	/** 
	 * 生日的月和日，MMdd格式
	 */
	@ApiField("reduced_birthday")
	private String reducedBirthday;

	/** 
	 * 用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户状态（Q/T/B/W）。
Q代表快速注册用户
T代表已认证用户
B代表被冻结账户
W代表已注册，未激活的账户
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 用户类型（1/2）

1代表公司账户2代表个人账户
	 */
	@ApiField("user_type_value")
	private String userTypeValue;

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

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getAddressCode( ) {
		return this.addressCode;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
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

	public void setBalanceFreezeType(String balanceFreezeType) {
		this.balanceFreezeType = balanceFreezeType;
	}
	public String getBalanceFreezeType( ) {
		return this.balanceFreezeType;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertTypeValue(String certTypeValue) {
		this.certTypeValue = certTypeValue;
	}
	public String getCertTypeValue( ) {
		return this.certTypeValue;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}
	public String getDefaultDeliverAddress( ) {
		return this.defaultDeliverAddress;
	}

	public void setDeliverAddressList(List<DeliverAddress> deliverAddressList) {
		this.deliverAddressList = deliverAddressList;
	}
	public List<DeliverAddress> getDeliverAddressList( ) {
		return this.deliverAddressList;
	}

	public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}
	public String getDeliverArea( ) {
		return this.deliverArea;
	}

	public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}
	public String getDeliverCity( ) {
		return this.deliverCity;
	}

	public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}
	public String getDeliverFullname( ) {
		return this.deliverFullname;
	}

	public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}
	public String getDeliverMobile( ) {
		return this.deliverMobile;
	}

	public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}
	public String getDeliverPhone( ) {
		return this.deliverPhone;
	}

	public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
	}
	public String getDeliverProvince( ) {
		return this.deliverProvince;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyName( ) {
		return this.familyName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getFirmName( ) {
		return this.firmName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setIsBalanceFrozen(String isBalanceFrozen) {
		this.isBalanceFrozen = isBalanceFrozen;
	}
	public String getIsBalanceFrozen( ) {
		return this.isBalanceFrozen;
	}

	public void setIsBankAuth(String isBankAuth) {
		this.isBankAuth = isBankAuth;
	}
	public String getIsBankAuth( ) {
		return this.isBankAuth;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsCertified( ) {
		return this.isCertified;
	}

	public void setIsCertifyGradeA(String isCertifyGradeA) {
		this.isCertifyGradeA = isCertifyGradeA;
	}
	public String getIsCertifyGradeA( ) {
		return this.isCertifyGradeA;
	}

	public void setIsIdAuth(String isIdAuth) {
		this.isIdAuth = isIdAuth;
	}
	public String getIsIdAuth( ) {
		return this.isIdAuth;
	}

	public void setIsLicenceAuth(String isLicenceAuth) {
		this.isLicenceAuth = isLicenceAuth;
	}
	public String getIsLicenceAuth( ) {
		return this.isLicenceAuth;
	}

	public void setIsMobileAuth(String isMobileAuth) {
		this.isMobileAuth = isMobileAuth;
	}
	public String getIsMobileAuth( ) {
		return this.isMobileAuth;
	}

	public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}
	public String getIsStudentCertified( ) {
		return this.isStudentCertified;
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

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealName( ) {
		return this.realName;
	}

	public void setReducedBirthday(String reducedBirthday) {
		this.reducedBirthday = reducedBirthday;
	}
	public String getReducedBirthday( ) {
		return this.reducedBirthday;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}

	public void setUserTypeValue(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}
	public String getUserTypeValue( ) {
		return this.userTypeValue;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip( ) {
		return this.zip;
	}

}
