package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻企业信用征信数据服务非实时创建
 *
 * @author auto create
 * @since 1.0, 2022-09-23 15:19:48
 */
public class ZhimaCreditEpCreditlinkAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4157592839337779872L;

	/**
	 * 企业可信链接协议列表
	 */
	@ApiListField("agreement_info_list")
	@ApiField("credit_link_agreement_info")
	private List<CreditLinkAgreementInfo> agreementInfoList;

	/**
	 * 授权商户ID。针对授权方与取数方不一致的场景，传入取数方的商户ID。未传入时会默认使用接口发起方的商户ID进行填充
	 */
	@ApiField("auth_merchant_id")
	private String authMerchantId;

	/**
	 * 法人身份证号
	 */
	@ApiField("cognizant_cert_no")
	private String cognizantCertNo;

	/**
	 * 法人手机号
	 */
	@ApiField("cognizant_mobile")
	private String cognizantMobile;

	/**
	 * 法人姓名
	 */
	@ApiField("cognizant_name")
	private String cognizantName;

	/**
	 * 信用链接数据类型，请联系服务提供方获取
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 信用链接类型，请联系服务提供方确认对应类型
	 */
	@ApiField("link_type")
	private String linkType;

	/**
	 * 商户订单号，需要商户保障唯一性
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	public List<CreditLinkAgreementInfo> getAgreementInfoList() {
		return this.agreementInfoList;
	}
	public void setAgreementInfoList(List<CreditLinkAgreementInfo> agreementInfoList) {
		this.agreementInfoList = agreementInfoList;
	}

	public String getAuthMerchantId() {
		return this.authMerchantId;
	}
	public void setAuthMerchantId(String authMerchantId) {
		this.authMerchantId = authMerchantId;
	}

	public String getCognizantCertNo() {
		return this.cognizantCertNo;
	}
	public void setCognizantCertNo(String cognizantCertNo) {
		this.cognizantCertNo = cognizantCertNo;
	}

	public String getCognizantMobile() {
		return this.cognizantMobile;
	}
	public void setCognizantMobile(String cognizantMobile) {
		this.cognizantMobile = cognizantMobile;
	}

	public String getCognizantName() {
		return this.cognizantName;
	}
	public void setCognizantName(String cognizantName) {
		this.cognizantName = cognizantName;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getLinkType() {
		return this.linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

}
