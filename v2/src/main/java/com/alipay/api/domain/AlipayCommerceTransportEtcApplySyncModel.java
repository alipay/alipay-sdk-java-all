package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单状态同步
 *
 * @author auto create
 * @since 1.0, 2021-09-10 22:01:43
 */
public class AlipayCommerceTransportEtcApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6189888665359431576L;

	/**
	 * 卡片有效期
	 */
	@ApiField("card_expiry_date")
	private String cardExpiryDate;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡片类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 申请单审核意见
	 */
	@ApiField("censor_info")
	private String censorInfo;

	/**
	 * 物流公司编码
	 */
	@ApiField("delivery_code")
	private String deliveryCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 物流单号
	 */
	@ApiField("delivery_no")
	private String deliveryNo;

	/**
	 * 设备有效期
	 */
	@ApiField("device_expiry_date")
	private String deviceExpiryDate;

	/**
	 * 设备编号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 设备状态
0：未发货
1：已发货
2：运输中
3：已签收
4：已二发
5：已激活
6：退货中
7：已退货
8：换货中
9：设备已注销
10：设备注销失败
11：已发卡
12：已发签
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 支付宝生成的申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 0：未提交；
1：审核中；
2：驳回(可重新提交)；
3：不通过(不可重新提交)；
4：通过；
5：撤销；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 最近更新时间
	 */
	@ApiField("order_update_time")
	private String orderUpdateTime;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 1: 二次激活成功
	 */
	@ApiField("reactive_status")
	private String reactiveStatus;

	public String getCardExpiryDate() {
		return this.cardExpiryDate;
	}
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCensorInfo() {
		return this.censorInfo;
	}
	public void setCensorInfo(String censorInfo) {
		this.censorInfo = censorInfo;
	}

	public String getDeliveryCode() {
		return this.deliveryCode;
	}
	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliveryNo() {
		return this.deliveryNo;
	}
	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getDeviceExpiryDate() {
		return this.deviceExpiryDate;
	}
	public void setDeviceExpiryDate(String deviceExpiryDate) {
		this.deviceExpiryDate = deviceExpiryDate;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderUpdateTime() {
		return this.orderUpdateTime;
	}
	public void setOrderUpdateTime(String orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReactiveStatus() {
		return this.reactiveStatus;
	}
	public void setReactiveStatus(String reactiveStatus) {
		this.reactiveStatus = reactiveStatus;
	}

}
