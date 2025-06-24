package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品订单状态回流接口
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:13
 */
public class AlipayCommerceMedicalIndustrydataDrugorderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1688454622453658925L;

	/**
	 * 支付宝药品订单id
	 */
	@ApiField("alipay_drug_order_id")
	private String alipayDrugOrderId;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝问诊单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝处方订单id
	 */
	@ApiField("alipay_prescription_id")
	private String alipayPrescriptionId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单状态
	 */
	@ApiField("drug_order_status")
	private String drugOrderStatus;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private PlatformDrugOrderStatusExtInfo extInfo;

	/**
	 * 平台用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部药品订单id
	 */
	@ApiField("out_drug_order_id")
	private String outDrugOrderId;

	/**
	 * 外部问诊单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部处方订单id
	 */
	@ApiField("out_prescription_id")
	private String outPrescriptionId;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayDrugOrderId() {
		return this.alipayDrugOrderId;
	}
	public void setAlipayDrugOrderId(String alipayDrugOrderId) {
		this.alipayDrugOrderId = alipayDrugOrderId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
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

	public String getDrugOrderStatus() {
		return this.drugOrderStatus;
	}
	public void setDrugOrderStatus(String drugOrderStatus) {
		this.drugOrderStatus = drugOrderStatus;
	}

	public PlatformDrugOrderStatusExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PlatformDrugOrderStatusExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutDrugOrderId() {
		return this.outDrugOrderId;
	}
	public void setOutDrugOrderId(String outDrugOrderId) {
		this.outDrugOrderId = outDrugOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
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

}
