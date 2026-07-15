package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class FulfillmentInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5637488898868219391L;

	/**
	 * 履约数据
	 */
	@ApiField("fulfillment_biz_info")
	private FulfillmentBizInfo fulfillmentBizInfo;

	/**
	 * SAAS履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务包订单号
	 */
	@ApiField("service_package_order_no")
	private String servicePackageOrderNo;

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
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public FulfillmentBizInfo getFulfillmentBizInfo() {
		return this.fulfillmentBizInfo;
	}
	public void setFulfillmentBizInfo(FulfillmentBizInfo fulfillmentBizInfo) {
		this.fulfillmentBizInfo = fulfillmentBizInfo;
	}

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServicePackageOrderNo() {
		return this.servicePackageOrderNo;
	}
	public void setServicePackageOrderNo(String servicePackageOrderNo) {
		this.servicePackageOrderNo = servicePackageOrderNo;
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
