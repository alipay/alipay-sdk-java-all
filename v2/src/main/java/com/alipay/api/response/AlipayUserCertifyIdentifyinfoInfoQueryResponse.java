package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identifyinfo.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 11:27:03
 */
public class AlipayUserCertifyIdentifyinfoInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4289478318171227558L;

	/** 
	 * 组织地址
	 */
	@ApiField("org_address")
	private String orgAddress;

	/** 
	 * 企业名称
	 */
	@ApiField("org_cert_name")
	private String orgCertName;

	/** 
	 * 组织证件号码
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/** 
	 * 组织证件类型
	 */
	@ApiField("org_cert_type")
	private String orgCertType;

	/** 
	 * yyyyMMdd或者长期
	 */
	@ApiField("org_expire_date")
	private String orgExpireDate;

	/** 
	 * 组织法人代表名字
	 */
	@ApiField("org_legal_cert_name")
	private String orgLegalCertName;

	/** 
	 * 组织法人代表证件号码
	 */
	@ApiField("org_legal_cert_no")
	private String orgLegalCertNo;

	/** 
	 * 组织法人代表证件类型
	 */
	@ApiField("org_legal_cert_type")
	private String orgLegalCertType;

	/** 
	 * yyyyMMdd或者长期
	 */
	@ApiField("org_legal_expire_date")
	private String orgLegalExpireDate;

	/** 
	 * 组织法人代表证件图片
	 */
	@ApiListField("org_legal_pictures")
	@ApiField("string")
	private List<String> orgLegalPictures;

	/** 
	 * 组织证件图片
	 */
	@ApiListField("org_pictures")
	@ApiField("string")
	private List<String> orgPictures;

	/** 
	 * 个人名称
	 */
	@ApiField("person_cert_name")
	private String personCertName;

	/** 
	 * 个人证件号码
	 */
	@ApiField("person_cert_no")
	private String personCertNo;

	/** 
	 * 个人证件类型
	 */
	@ApiField("person_cert_type")
	private String personCertType;

	/** 
	 * yyyyMMdd或者长期
	 */
	@ApiField("person_expire_date")
	private String personExpireDate;

	/** 
	 * 个人证件图片
	 */
	@ApiListField("person_pictures")
	@ApiField("string")
	private List<String> personPictures;

	/** 
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getOrgAddress( ) {
		return this.orgAddress;
	}

	public void setOrgCertName(String orgCertName) {
		this.orgCertName = orgCertName;
	}
	public String getOrgCertName( ) {
		return this.orgCertName;
	}

	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}
	public String getOrgCertNo( ) {
		return this.orgCertNo;
	}

	public void setOrgCertType(String orgCertType) {
		this.orgCertType = orgCertType;
	}
	public String getOrgCertType( ) {
		return this.orgCertType;
	}

	public void setOrgExpireDate(String orgExpireDate) {
		this.orgExpireDate = orgExpireDate;
	}
	public String getOrgExpireDate( ) {
		return this.orgExpireDate;
	}

	public void setOrgLegalCertName(String orgLegalCertName) {
		this.orgLegalCertName = orgLegalCertName;
	}
	public String getOrgLegalCertName( ) {
		return this.orgLegalCertName;
	}

	public void setOrgLegalCertNo(String orgLegalCertNo) {
		this.orgLegalCertNo = orgLegalCertNo;
	}
	public String getOrgLegalCertNo( ) {
		return this.orgLegalCertNo;
	}

	public void setOrgLegalCertType(String orgLegalCertType) {
		this.orgLegalCertType = orgLegalCertType;
	}
	public String getOrgLegalCertType( ) {
		return this.orgLegalCertType;
	}

	public void setOrgLegalExpireDate(String orgLegalExpireDate) {
		this.orgLegalExpireDate = orgLegalExpireDate;
	}
	public String getOrgLegalExpireDate( ) {
		return this.orgLegalExpireDate;
	}

	public void setOrgLegalPictures(List<String> orgLegalPictures) {
		this.orgLegalPictures = orgLegalPictures;
	}
	public List<String> getOrgLegalPictures( ) {
		return this.orgLegalPictures;
	}

	public void setOrgPictures(List<String> orgPictures) {
		this.orgPictures = orgPictures;
	}
	public List<String> getOrgPictures( ) {
		return this.orgPictures;
	}

	public void setPersonCertName(String personCertName) {
		this.personCertName = personCertName;
	}
	public String getPersonCertName( ) {
		return this.personCertName;
	}

	public void setPersonCertNo(String personCertNo) {
		this.personCertNo = personCertNo;
	}
	public String getPersonCertNo( ) {
		return this.personCertNo;
	}

	public void setPersonCertType(String personCertType) {
		this.personCertType = personCertType;
	}
	public String getPersonCertType( ) {
		return this.personCertType;
	}

	public void setPersonExpireDate(String personExpireDate) {
		this.personExpireDate = personExpireDate;
	}
	public String getPersonExpireDate( ) {
		return this.personExpireDate;
	}

	public void setPersonPictures(List<String> personPictures) {
		this.personPictures = personPictures;
	}
	public List<String> getPersonPictures( ) {
		return this.personPictures;
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
