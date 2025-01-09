package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方单状态回流接口
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:12
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1197317762258754948L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝处方id
	 */
	@ApiField("alipay_prescription_id")
	private String alipayPrescriptionId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private PlatformPrescriptionStatusExtInfo extInfo;

	/**
	 * 外部平台用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部处方id
	 */
	@ApiField("out_prescription_id")
	private String outPrescriptionId;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 处方状态：
审核中:AUDIT
已过期:EXPIRED
审核不通过:AUDIT_FAIL
已退回:RETURNED
审核通过:AUDIT_PASS
	 */
	@ApiField("prescription_status")
	private String prescriptionStatus;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayPrescriptionId() {
		return this.alipayPrescriptionId;
	}
	public void setAlipayPrescriptionId(String alipayPrescriptionId) {
		this.alipayPrescriptionId = alipayPrescriptionId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public PlatformPrescriptionStatusExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PlatformPrescriptionStatusExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutPrescriptionId() {
		return this.outPrescriptionId;
	}
	public void setOutPrescriptionId(String outPrescriptionId) {
		this.outPrescriptionId = outPrescriptionId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPrescriptionStatus() {
		return this.prescriptionStatus;
	}
	public void setPrescriptionStatus(String prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

}
