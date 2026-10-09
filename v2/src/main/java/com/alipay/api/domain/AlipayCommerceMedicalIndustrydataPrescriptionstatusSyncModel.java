package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方单状态回流接口
 *
 * @author auto create
 * @since 1.0, 2026-09-28 16:33:05
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8256226492573413843L;

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
	 * 购药单状态
	 */
	@ApiField("drug_purchase_status")
	private String drugPurchaseStatus;

	/**
	 * 处方过期时间，为空则阿福互医兜底7*24小时过期处理
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private PlatformPrescriptionStatusExtInfo extInfo;

	/**
	 * 院内购药订单详情页
	 */
	@ApiField("medical_buy_order_detail_url")
	private String medicalBuyOrderDetailUrl;

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
	 * 处方笺图片
	 */
	@ApiField("prescription_image_url")
	private String prescriptionImageUrl;

	/**
	 * 处方笺pdf
	 */
	@ApiField("prescription_pdf_url")
	private String prescriptionPdfUrl;

	/**
	 * 处方状态：
审核中:AUDIT
已过期:EXPIRED
审核不通过:AUDIT_FAIL
已退回:RETURNED
审核通过:AUDIT_PASS
已使用:USED
已撤销:REVOKED
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

	public String getDrugPurchaseStatus() {
		return this.drugPurchaseStatus;
	}
	public void setDrugPurchaseStatus(String drugPurchaseStatus) {
		this.drugPurchaseStatus = drugPurchaseStatus;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public PlatformPrescriptionStatusExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PlatformPrescriptionStatusExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMedicalBuyOrderDetailUrl() {
		return this.medicalBuyOrderDetailUrl;
	}
	public void setMedicalBuyOrderDetailUrl(String medicalBuyOrderDetailUrl) {
		this.medicalBuyOrderDetailUrl = medicalBuyOrderDetailUrl;
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

	public String getPrescriptionImageUrl() {
		return this.prescriptionImageUrl;
	}
	public void setPrescriptionImageUrl(String prescriptionImageUrl) {
		this.prescriptionImageUrl = prescriptionImageUrl;
	}

	public String getPrescriptionPdfUrl() {
		return this.prescriptionPdfUrl;
	}
	public void setPrescriptionPdfUrl(String prescriptionPdfUrl) {
		this.prescriptionPdfUrl = prescriptionPdfUrl;
	}

	public String getPrescriptionStatus() {
		return this.prescriptionStatus;
	}
	public void setPrescriptionStatus(String prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

}
