package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:34
 */
public class AlipayUserCertifyIdentifyInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5658584357392777381L;

	/** 
	 * 如果是个人账号，就是个人的名字，如果是企业账号，就是企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 认证等级
	 */
	@ApiField("certify_grade")
	private String certifyGrade;

	/** 
	 * 格式是yyyyMMdd HH:mm:ss
	 */
	@ApiField("certify_time")
	private String certifyTime;

	/** 
	 * havana id
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * T表示认证，F表示未认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * T表示已释放，F表示未释放
	 */
	@ApiField("is_released")
	private String isReleased;

	/** 
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 用户在应用（AppId）下的用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 企业客户维度的证件有效期，格式为yyyyMMdd或者“长期”
	 */
	@ApiField("org_customer_expire_date")
	private String orgCustomerExpireDate;

	/** 
	 * 企业是否注销，T表示注销，F表示不注销
	 */
	@ApiField("org_customer_is_cancelled")
	private String orgCustomerIsCancelled;

	/** 
	 * 企业是否异常名录，T表示异常，F表示不异常
	 */
	@ApiField("org_customer_is_exception")
	private String orgCustomerIsException;

	/** 
	 * 企业是否违法经营，T表示违法，F表示不违法
	 */
	@ApiField("org_customer_is_in_black_list")
	private String orgCustomerIsInBlackList;

	/** 
	 * 企业是否吊销，T是吊销，F是不吊销
	 */
	@ApiField("org_customer_is_revoked")
	private String orgCustomerIsRevoked;

	/** 
	 * 企业客户的证件签发时间，格式为yyyyMMdd或者“长期”
	 */
	@ApiField("org_customer_issue_date")
	private String orgCustomerIssueDate;

	/** 
	 * 企业客户维度的法人代表名称
	 */
	@ApiField("org_customer_legal_person_cert_name")
	private String orgCustomerLegalPersonCertName;

	/** 
	 * 企业客户维度的法人代表证件号码
	 */
	@ApiField("org_customer_legal_person_cert_no")
	private String orgCustomerLegalPersonCertNo;

	/** 
	 * 企业客户维度的法人代表证件类型
	 */
	@ApiField("org_customer_legal_person_cert_type")
	private String orgCustomerLegalPersonCertType;

	/** 
	 * 企业客户维度的证件有效期，格式为yyyyMMdd或者“长期”
	 */
	@ApiField("org_customer_legal_person_expire_date")
	private String orgCustomerLegalPersonExpireDate;

	/** 
	 * 企业客户维度的法人代表证件图片，可以通过alipay.user.certify.identify.file.query获取具体的图片文件
	 */
	@ApiListField("org_customer_legal_person_pictures")
	@ApiField("string")
	private List<String> orgCustomerLegalPersonPictures;

	/** 
	 * 企业客户维度的企业性质
	 */
	@ApiField("org_customer_nature")
	private String orgCustomerNature;

	/** 
	 * 企业客户维度的企业成立时间
	 */
	@ApiField("org_customer_open_date")
	private String orgCustomerOpenDate;

	/** 
	 * 企业客户维度的证件图片，可以通过alipay.user.certify.identify.file.query获取具体的图片文件
	 */
	@ApiListField("org_customer_pictures")
	@ApiField("string")
	private List<String> orgCustomerPictures;

	/** 
	 * 企业客户维度的注册资金
	 */
	@ApiField("org_customer_registered_capital")
	private String orgCustomerRegisteredCapital;

	/** 
	 * 企业客户维度的经营范围
	 */
	@ApiField("org_customer_scope")
	private String orgCustomerScope;

	/** 
	 * 个人客户维度的证件有效期，格式为yyyyMMdd或者“长期”
	 */
	@ApiField("person_customer_expire_date")
	private String personCustomerExpireDate;

	/** 
	 * 个人客户维度的证件图片，可以通过alipay.user.certify.identify.file.query获取具体的图片文件
	 */
	@ApiListField("person_customer_pictures")
	@ApiField("string")
	private List<String> personCustomerPictures;

	/** 
	 * 个人用户维度的证件有效期，格式为yyyyMMdd或者“长期”
	 */
	@ApiField("person_user_expire_date")
	private String personUserExpireDate;

	/** 
	 * 个人用户维度的证件图片，可以通过alipay.user.certify.identify.file.query获取具体的图片文件
	 */
	@ApiListField("person_user_pictures")
	@ApiField("string")
	private List<String> personUserPictures;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户类型，个人是2，企业是1
	 */
	@ApiField("user_type")
	private String userType;

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
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

	public void setCertifyGrade(String certifyGrade) {
		this.certifyGrade = certifyGrade;
	}
	public String getCertifyGrade( ) {
		return this.certifyGrade;
	}

	public void setCertifyTime(String certifyTime) {
		this.certifyTime = certifyTime;
	}
	public String getCertifyTime( ) {
		return this.certifyTime;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}
	public String getHavanaId( ) {
		return this.havanaId;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsCertified( ) {
		return this.isCertified;
	}

	public void setIsReleased(String isReleased) {
		this.isReleased = isReleased;
	}
	public String getIsReleased( ) {
		return this.isReleased;
	}

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrgCustomerExpireDate(String orgCustomerExpireDate) {
		this.orgCustomerExpireDate = orgCustomerExpireDate;
	}
	public String getOrgCustomerExpireDate( ) {
		return this.orgCustomerExpireDate;
	}

	public void setOrgCustomerIsCancelled(String orgCustomerIsCancelled) {
		this.orgCustomerIsCancelled = orgCustomerIsCancelled;
	}
	public String getOrgCustomerIsCancelled( ) {
		return this.orgCustomerIsCancelled;
	}

	public void setOrgCustomerIsException(String orgCustomerIsException) {
		this.orgCustomerIsException = orgCustomerIsException;
	}
	public String getOrgCustomerIsException( ) {
		return this.orgCustomerIsException;
	}

	public void setOrgCustomerIsInBlackList(String orgCustomerIsInBlackList) {
		this.orgCustomerIsInBlackList = orgCustomerIsInBlackList;
	}
	public String getOrgCustomerIsInBlackList( ) {
		return this.orgCustomerIsInBlackList;
	}

	public void setOrgCustomerIsRevoked(String orgCustomerIsRevoked) {
		this.orgCustomerIsRevoked = orgCustomerIsRevoked;
	}
	public String getOrgCustomerIsRevoked( ) {
		return this.orgCustomerIsRevoked;
	}

	public void setOrgCustomerIssueDate(String orgCustomerIssueDate) {
		this.orgCustomerIssueDate = orgCustomerIssueDate;
	}
	public String getOrgCustomerIssueDate( ) {
		return this.orgCustomerIssueDate;
	}

	public void setOrgCustomerLegalPersonCertName(String orgCustomerLegalPersonCertName) {
		this.orgCustomerLegalPersonCertName = orgCustomerLegalPersonCertName;
	}
	public String getOrgCustomerLegalPersonCertName( ) {
		return this.orgCustomerLegalPersonCertName;
	}

	public void setOrgCustomerLegalPersonCertNo(String orgCustomerLegalPersonCertNo) {
		this.orgCustomerLegalPersonCertNo = orgCustomerLegalPersonCertNo;
	}
	public String getOrgCustomerLegalPersonCertNo( ) {
		return this.orgCustomerLegalPersonCertNo;
	}

	public void setOrgCustomerLegalPersonCertType(String orgCustomerLegalPersonCertType) {
		this.orgCustomerLegalPersonCertType = orgCustomerLegalPersonCertType;
	}
	public String getOrgCustomerLegalPersonCertType( ) {
		return this.orgCustomerLegalPersonCertType;
	}

	public void setOrgCustomerLegalPersonExpireDate(String orgCustomerLegalPersonExpireDate) {
		this.orgCustomerLegalPersonExpireDate = orgCustomerLegalPersonExpireDate;
	}
	public String getOrgCustomerLegalPersonExpireDate( ) {
		return this.orgCustomerLegalPersonExpireDate;
	}

	public void setOrgCustomerLegalPersonPictures(List<String> orgCustomerLegalPersonPictures) {
		this.orgCustomerLegalPersonPictures = orgCustomerLegalPersonPictures;
	}
	public List<String> getOrgCustomerLegalPersonPictures( ) {
		return this.orgCustomerLegalPersonPictures;
	}

	public void setOrgCustomerNature(String orgCustomerNature) {
		this.orgCustomerNature = orgCustomerNature;
	}
	public String getOrgCustomerNature( ) {
		return this.orgCustomerNature;
	}

	public void setOrgCustomerOpenDate(String orgCustomerOpenDate) {
		this.orgCustomerOpenDate = orgCustomerOpenDate;
	}
	public String getOrgCustomerOpenDate( ) {
		return this.orgCustomerOpenDate;
	}

	public void setOrgCustomerPictures(List<String> orgCustomerPictures) {
		this.orgCustomerPictures = orgCustomerPictures;
	}
	public List<String> getOrgCustomerPictures( ) {
		return this.orgCustomerPictures;
	}

	public void setOrgCustomerRegisteredCapital(String orgCustomerRegisteredCapital) {
		this.orgCustomerRegisteredCapital = orgCustomerRegisteredCapital;
	}
	public String getOrgCustomerRegisteredCapital( ) {
		return this.orgCustomerRegisteredCapital;
	}

	public void setOrgCustomerScope(String orgCustomerScope) {
		this.orgCustomerScope = orgCustomerScope;
	}
	public String getOrgCustomerScope( ) {
		return this.orgCustomerScope;
	}

	public void setPersonCustomerExpireDate(String personCustomerExpireDate) {
		this.personCustomerExpireDate = personCustomerExpireDate;
	}
	public String getPersonCustomerExpireDate( ) {
		return this.personCustomerExpireDate;
	}

	public void setPersonCustomerPictures(List<String> personCustomerPictures) {
		this.personCustomerPictures = personCustomerPictures;
	}
	public List<String> getPersonCustomerPictures( ) {
		return this.personCustomerPictures;
	}

	public void setPersonUserExpireDate(String personUserExpireDate) {
		this.personUserExpireDate = personUserExpireDate;
	}
	public String getPersonUserExpireDate( ) {
		return this.personUserExpireDate;
	}

	public void setPersonUserPictures(List<String> personUserPictures) {
		this.personUserPictures = personUserPictures;
	}
	public List<String> getPersonUserPictures( ) {
		return this.personUserPictures;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType( ) {
		return this.userType;
	}

}
