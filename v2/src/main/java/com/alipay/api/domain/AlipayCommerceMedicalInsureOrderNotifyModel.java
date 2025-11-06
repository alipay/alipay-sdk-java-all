package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保司保单数据变化通知
 *
 * @author auto create
 * @since 1.0, 2025-07-24 17:44:41
 */
public class AlipayCommerceMedicalInsureOrderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3472363523258837654L;

	/**
	 * 身份证号，明文
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 用户最近一次理赔状态
	 */
	@ApiField("claims_status")
	private String claimsStatus;

	/**
	 * 保司身份标识，由蚂蚁侧提供
	 */
	@ApiField("institution_code")
	private String institutionCode;

	/**
	 * 被保人姓名
	 */
	@ApiField("insurant_user_name")
	private String insurantUserName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 理赔状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 保险增值服务状态
	 */
	@ApiField("vas_services_status")
	private String vasServicesStatus;

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getClaimsStatus() {
		return this.claimsStatus;
	}
	public void setClaimsStatus(String claimsStatus) {
		this.claimsStatus = claimsStatus;
	}

	public String getInstitutionCode() {
		return this.institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getInsurantUserName() {
		return this.insurantUserName;
	}
	public void setInsurantUserName(String insurantUserName) {
		this.insurantUserName = insurantUserName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVasServicesStatus() {
		return this.vasServicesStatus;
	}
	public void setVasServicesStatus(String vasServicesStatus) {
		this.vasServicesStatus = vasServicesStatus;
	}

}
