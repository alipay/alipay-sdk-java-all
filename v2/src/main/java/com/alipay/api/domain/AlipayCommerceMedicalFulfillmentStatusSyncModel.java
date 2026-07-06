package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV履约单状态同步
 *
 * @author auto create
 * @since 1.0, 2026-07-03 17:57:56
 */
public class AlipayCommerceMedicalFulfillmentStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4877162598246326796L;

	/**
	 * 履约数据
	 */
	@ApiField("fulfillment_data")
	private FulfillmentDataInfo fulfillmentData;

	/**
	 * 履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * isv履约状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * 履约状态描述
	 */
	@ApiField("fulfillment_status_desc")
	private String fulfillmentStatusDesc;

	/**
	 * 支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

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

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public FulfillmentDataInfo getFulfillmentData() {
		return this.fulfillmentData;
	}
	public void setFulfillmentData(FulfillmentDataInfo fulfillmentData) {
		this.fulfillmentData = fulfillmentData;
	}

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getFulfillmentStatusDesc() {
		return this.fulfillmentStatusDesc;
	}
	public void setFulfillmentStatusDesc(String fulfillmentStatusDesc) {
		this.fulfillmentStatusDesc = fulfillmentStatusDesc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
