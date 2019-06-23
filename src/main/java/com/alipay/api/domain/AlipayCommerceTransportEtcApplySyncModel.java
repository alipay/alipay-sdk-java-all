package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单状态同步
 *
 * @author auto create
 * @since 1.0, 2019-05-20 22:55:59
 */
public class AlipayCommerceTransportEtcApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 4444941184184625826L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

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
	 */
	@ApiField("device_status")
	private String deviceStatus;

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

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

}
