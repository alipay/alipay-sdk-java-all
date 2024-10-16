package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认证信息申请接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 15:20:11
 */
public class AlipayUserCertifyInfoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6558171235628228216L;

	/**
	 * 委托书图片数据，根据biz_from参数确定是传base64字符串，还是传oss地址
	 */
	@ApiField("agent_auth_letter_picture")
	private String agentAuthLetterPicture;

	/**
	 * 代理人证件图片辅助页图片，对应二代身份证就是国徽页，根据biz_from参数确定是传base64字符串，还是传oss地址
	 */
	@ApiField("agent_cert_card_assist_picture")
	private String agentCertCardAssistPicture;

	/**
	 * 代理人证件信息页图片数据，对应二代身份证为带人脸页图片，根据biz_from参数确定是传base64字符串，还是传oss地址
	 */
	@ApiField("agent_cert_card_info_picture")
	private String agentCertCardInfoPicture;

	/**
	 * 代理人证件图片有效期截止日期，"yyyy-MM-dd"格式，若为长期，则填“长期”
	 */
	@ApiField("agent_cert_expired_date")
	private String agentCertExpiredDate;

	/**
	 * 代理人证件号码，若认证申请人不是法人而是代理人，则需要填写代理人相关信息
	 */
	@ApiField("agent_cert_no")
	private String agentCertNo;

	/**
	 * 代理人证件类型，目前仅支持二代身份证：RESIDENT，不支持其他证件类型
	 */
	@ApiField("agent_cert_type")
	private String agentCertType;

	/**
	 * 代理人姓名，若申请认证者非法人而是由代理人，则将代理人姓名填到此字段
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 外部系统请求申请认证的业务来源，例如DingTalk，具体值请向认证开发同学确定
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 联系人手机号，用于认证过程中对用户进行短信通知的号码，11位数字
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 法人证件图片辅助页图片数据,若为身份证，则为国徽页图片，根据biz_from参数确定是传base64字符串，还是传oss地址
	 */
	@ApiField("legal_cert_card_assist_picture")
	private String legalCertCardAssistPicture;

	/**
	 * 法定代表人的证件图片信息页数据，若为身份证，则为带人脸图片的那一页照片，根据biz_from参数确定是传base64字符串，还是传oss地址
	 */
	@ApiField("legal_cert_card_info_picture")
	private String legalCertCardInfoPicture;

	/**
	 * 法定代表人证件有效期截止日期 “yyyy-MM-dd” 格式，若为长期，则填“长期”
	 */
	@ApiField("legal_cert_expired_date")
	private String legalCertExpiredDate;

	/**
	 * 法定代表人证件号码
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法定代表人证件类型
二代身份证：RESIDENT
护照:PASSPORT
港澳来往内地通行证：HONGKONG_MACAO
台湾同胞往来大陆通行证：TAIWAN
	 */
	@ApiField("legal_cert_type")
	private String legalCertType;

	/**
	 * 法定代理人姓名，要按照营业执照上的姓名填写，必须一致，不能有错别字。
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 用户在应用（AppId）下的用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 住所，填写营业执照号上的住所（经营地址）信息
	 */
	@ApiField("org_address")
	private String orgAddress;

	/**
	 * 填写营业执照上的经营范围
	 */
	@ApiField("org_business_scope")
	private String orgBusinessScope;

	/**
	 * 企业所在市，城市的中文完整描述
	 */
	@ApiField("org_city")
	private String orgCity;

	/**
	 * 企业所在国家，目前只支持 中国
	 */
	@ApiField("org_country")
	private String orgCountry;

	/**
	 * 营业执照上的经营期限截止日期，日期为10位格式"yyyy-MM-dd“  若为长期，则填“长期”
	 */
	@ApiField("org_main_cert_expired_date")
	private String orgMainCertExpiredDate;

	/**
	 * 填企业营业执照上的注册号（一般为15位数字）或社会信用代码（18位数字加字母格式大写），如果有信用代码则优先填写社会信用代码
	 */
	@ApiField("org_main_cert_no")
	private String orgMainCertNo;

	/**
	 * 营业执照图片信息，根据biz_from参数确定是要传base64编码格式的string字符串，还是传oss地址
	 */
	@ApiField("org_main_cert_picture")
	private String orgMainCertPicture;

	/**
	 * 申请认证的公司的名字，要与营业执照上面一致，包括全半角字符
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 企业所在省份，填写省份中文完整信息
	 */
	@ApiField("org_province")
	private String orgProvince;

	/**
	 * 公司: ENTERPRISE，事业单位：PUBLIC_INST，社会团体：SOCIAL_ORG，民办非企业组织：PRIVATE_NON_ENTERPRISE，党政国家机关：PARTY_AND_STATE_ORGANS，个体工商户：INDIVIDUAL
	 */
	@ApiField("org_type")
	private String orgType;

	/**
	 * 注册资本
	 */
	@ApiField("register_capital")
	private String registerCapital;

	/**
	 * 豁免的校验类型，多个用逗号隔开
	 */
	@ApiField("remit_check")
	private String remitCheck;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentAuthLetterPicture() {
		return this.agentAuthLetterPicture;
	}
	public void setAgentAuthLetterPicture(String agentAuthLetterPicture) {
		this.agentAuthLetterPicture = agentAuthLetterPicture;
	}

	public String getAgentCertCardAssistPicture() {
		return this.agentCertCardAssistPicture;
	}
	public void setAgentCertCardAssistPicture(String agentCertCardAssistPicture) {
		this.agentCertCardAssistPicture = agentCertCardAssistPicture;
	}

	public String getAgentCertCardInfoPicture() {
		return this.agentCertCardInfoPicture;
	}
	public void setAgentCertCardInfoPicture(String agentCertCardInfoPicture) {
		this.agentCertCardInfoPicture = agentCertCardInfoPicture;
	}

	public String getAgentCertExpiredDate() {
		return this.agentCertExpiredDate;
	}
	public void setAgentCertExpiredDate(String agentCertExpiredDate) {
		this.agentCertExpiredDate = agentCertExpiredDate;
	}

	public String getAgentCertNo() {
		return this.agentCertNo;
	}
	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

	public String getAgentCertType() {
		return this.agentCertType;
	}
	public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getLegalCertCardAssistPicture() {
		return this.legalCertCardAssistPicture;
	}
	public void setLegalCertCardAssistPicture(String legalCertCardAssistPicture) {
		this.legalCertCardAssistPicture = legalCertCardAssistPicture;
	}

	public String getLegalCertCardInfoPicture() {
		return this.legalCertCardInfoPicture;
	}
	public void setLegalCertCardInfoPicture(String legalCertCardInfoPicture) {
		this.legalCertCardInfoPicture = legalCertCardInfoPicture;
	}

	public String getLegalCertExpiredDate() {
		return this.legalCertExpiredDate;
	}
	public void setLegalCertExpiredDate(String legalCertExpiredDate) {
		this.legalCertExpiredDate = legalCertExpiredDate;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalCertType() {
		return this.legalCertType;
	}
	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgBusinessScope() {
		return this.orgBusinessScope;
	}
	public void setOrgBusinessScope(String orgBusinessScope) {
		this.orgBusinessScope = orgBusinessScope;
	}

	public String getOrgCity() {
		return this.orgCity;
	}
	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public String getOrgCountry() {
		return this.orgCountry;
	}
	public void setOrgCountry(String orgCountry) {
		this.orgCountry = orgCountry;
	}

	public String getOrgMainCertExpiredDate() {
		return this.orgMainCertExpiredDate;
	}
	public void setOrgMainCertExpiredDate(String orgMainCertExpiredDate) {
		this.orgMainCertExpiredDate = orgMainCertExpiredDate;
	}

	public String getOrgMainCertNo() {
		return this.orgMainCertNo;
	}
	public void setOrgMainCertNo(String orgMainCertNo) {
		this.orgMainCertNo = orgMainCertNo;
	}

	public String getOrgMainCertPicture() {
		return this.orgMainCertPicture;
	}
	public void setOrgMainCertPicture(String orgMainCertPicture) {
		this.orgMainCertPicture = orgMainCertPicture;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgProvince() {
		return this.orgProvince;
	}
	public void setOrgProvince(String orgProvince) {
		this.orgProvince = orgProvince;
	}

	public String getOrgType() {
		return this.orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getRegisterCapital() {
		return this.registerCapital;
	}
	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}

	public String getRemitCheck() {
		return this.remitCheck;
	}
	public void setRemitCheck(String remitCheck) {
		this.remitCheck = remitCheck;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
