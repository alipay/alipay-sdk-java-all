package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业征信数据服务连接申请
 *
 * @author auto create
 * @since 1.0, 2022-09-23 15:19:49
 */
public class ZhimaCreditEpCreditlinkAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5198162279117843842L;

	/**
	 * 授权回跳页面地址
	 */
	@ApiField("auth_callback_path")
	private String authCallbackPath;

	/**
	 * 被授权商户，如果为空，被授权方即为信用链接创建方
	 */
	@ApiField("auth_merchant_id")
	private String authMerchantId;

	/**
	 * 授权通知地址
	 */
	@ApiField("auth_notify_path")
	private String authNotifyPath;

	/**
	 * 认证类型，请联系服务提供方获取
	 */
	@ApiField("certification_type")
	private String certificationType;

	/**
	 * 已认证法人身份证号
	 */
	@ApiField("cognizant_cert_no")
	private String cognizantCertNo;

	/**
	 * 已认证的法人姓名
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
	 * 商户需要在授权回跳时需要带回的透传字段（
回跳auth_callback_path时）
	 */
	@ApiField("merchant_context")
	private String merchantContext;

	/**
	 * 商户信用链接ID（需要商户保证唯一性）
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 税票信息模型(在data_type为TAXRECEIPT时，该字段为必填)
	 */
	@ApiField("tax_receipt_once_info")
	private TaxReceiptOnceInfo taxReceiptOnceInfo;

	public String getAuthCallbackPath() {
		return this.authCallbackPath;
	}
	public void setAuthCallbackPath(String authCallbackPath) {
		this.authCallbackPath = authCallbackPath;
	}

	public String getAuthMerchantId() {
		return this.authMerchantId;
	}
	public void setAuthMerchantId(String authMerchantId) {
		this.authMerchantId = authMerchantId;
	}

	public String getAuthNotifyPath() {
		return this.authNotifyPath;
	}
	public void setAuthNotifyPath(String authNotifyPath) {
		this.authNotifyPath = authNotifyPath;
	}

	public String getCertificationType() {
		return this.certificationType;
	}
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

	public String getCognizantCertNo() {
		return this.cognizantCertNo;
	}
	public void setCognizantCertNo(String cognizantCertNo) {
		this.cognizantCertNo = cognizantCertNo;
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

	public String getMerchantContext() {
		return this.merchantContext;
	}
	public void setMerchantContext(String merchantContext) {
		this.merchantContext = merchantContext;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public TaxReceiptOnceInfo getTaxReceiptOnceInfo() {
		return this.taxReceiptOnceInfo;
	}
	public void setTaxReceiptOnceInfo(TaxReceiptOnceInfo taxReceiptOnceInfo) {
		this.taxReceiptOnceInfo = taxReceiptOnceInfo;
	}

}
