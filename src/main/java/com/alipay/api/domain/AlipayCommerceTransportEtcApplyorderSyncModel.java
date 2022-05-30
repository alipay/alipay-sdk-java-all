package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理申请单信息同步
 *
 * @author auto create
 * @since 1.0, 2022-02-17 18:31:08
 */
public class AlipayCommerceTransportEtcApplyorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6728216259481676221L;

	/**
	 * 支付宝ETC平台扣款协议号，与order_id参数 二选一。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 业务发生时间；对应order_status 几个状态的变更时间； 当order_status = DELIVERYED 时 biz_time 为物流发货时间；order_status = ACTIVATED时 biz_time为设备激活时间，以此类推
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 用户取消订单原因，在取消状态同步时必填
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 用户ETC卡号，激活状态时必传
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 审核不通过原因， 审核不通过时必传
	 */
	@ApiField("censor_info")
	private String censorInfo;

	/**
	 * 已发货状态必传，物流公司编码，需要与菜鸟映射
	 */
	@ApiField("delivery_code")
	private String deliveryCode;

	/**
	 * 已发货状态必传，物流公司名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 已发货状态必传，物流单号
	 */
	@ApiField("delivery_no")
	private String deliveryNo;

	/**
	 * 用户ETC OBU号， 激活状态时必传
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 是否需要退款，该字段只有在取消状态同步时才会消费，其他状态不消费；取消状态同步时，该状态必传。
	 */
	@ApiField("need_refund")
	private Boolean needRefund;

	/**
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态；
DELIVERYED：已发货；
RECEIVED：已收货； 
CENSOR_PASS：审核通过； 
CENSOR_BLOCK：审核不通过 ；
ACTIVATED：已激活； 
UNMOUNTED：已注销； 
CANCEL：取消；
拉黑:ADD_BLACKLIST；
解黑:REMOVE_BLACKLIST；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号，对应用户该笔ETC申请单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 0：蓝； 1：黄； 2：黑； 3：白； 4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

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

	public Boolean getNeedRefund() {
		return this.needRefund;
	}
	public void setNeedRefund(Boolean needRefund) {
		this.needRefund = needRefund;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
