package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票根码购票信息同步
 *
 * @author auto create
 * @since 1.0, 2025-10-10 16:27:52
 */
public class AlipayOfflineMarketingTicketstubPurchaseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4564655392996858895L;

	/**
	 * 用户购票的操作信息
核销 APPLY
退款 EXPIRE
注意：部分退款的场景需要业务方自己去识别，只有全部退款才发起退款的请求
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 请求流水号,32位UUID，幂等键
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 购票者信息，非必填，可以获取用户证件信息的情况下提供
	 */
	@ApiField("buyer_info")
	private String buyerInfo;

	/**
	 * 外部订单号，票务系统的购票的订单号ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单生成时间
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 支付宝分配的场景编码，用于识别活动场景及区域等信息
格式:城市_票务系统_年份
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 票根的额外信息
	 */
	@ApiField("stub_info")
	private String stubInfo;

	/**
	 * 每个票根场次Code（全局唯一），该Code由支付宝提供，更新场次也会使用该Code
	 */
	@ApiField("venue_code")
	private String venueCode;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(String buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStubInfo() {
		return this.stubInfo;
	}
	public void setStubInfo(String stubInfo) {
		this.stubInfo = stubInfo;
	}

	public String getVenueCode() {
		return this.venueCode;
	}
	public void setVenueCode(String venueCode) {
		this.venueCode = venueCode;
	}

}
