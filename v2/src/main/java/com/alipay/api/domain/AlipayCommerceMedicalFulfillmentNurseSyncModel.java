package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV同步护士信息给SAAS
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:37:44
 */
public class AlipayCommerceMedicalFulfillmentNurseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3346254914938283854L;

	/**
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 护士ID
	 */
	@ApiField("nurse_id")
	private String nurseId;

	/**
	 * 护士姓名
	 */
	@ApiField("nurse_name")
	private String nurseName;

	/**
	 * 护士状态
	 */
	@ApiField("nurse_status")
	private String nurseStatus;

	/**
	 * 护士状态描述
	 */
	@ApiField("nurse_status_desc")
	private String nurseStatusDesc;

	/**
	 * 护士状态变更时间
	 */
	@ApiField("nurse_status_time")
	private String nurseStatusTime;

	/**
	 * isv履约单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * SAAS订单ID
	 */
	@ApiField("trade_order_id")
	private String tradeOrderId;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNurseId() {
		return this.nurseId;
	}
	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseName() {
		return this.nurseName;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getNurseStatus() {
		return this.nurseStatus;
	}
	public void setNurseStatus(String nurseStatus) {
		this.nurseStatus = nurseStatus;
	}

	public String getNurseStatusDesc() {
		return this.nurseStatusDesc;
	}
	public void setNurseStatusDesc(String nurseStatusDesc) {
		this.nurseStatusDesc = nurseStatusDesc;
	}

	public String getNurseStatusTime() {
		return this.nurseStatusTime;
	}
	public void setNurseStatusTime(String nurseStatusTime) {
		this.nurseStatusTime = nurseStatusTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}
	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
