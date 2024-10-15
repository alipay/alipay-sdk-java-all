package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寄件激励码动销反馈信息同步
 *
 * @author auto create
 * @since 1.0, 2024-09-04 16:25:00
 */
public class AlipayCommerceLogisticsIncentivecodeOperationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7466722826637488681L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 支付宝交易成功状态
	 */
	@ApiField("alipay_trade_status")
	private String alipayTradeStatus;

	/**
	 * 激励码值
	 */
	@ApiField("incentive_code")
	private String incentiveCode;

	/**
	 * 商户标识（接口调用方的渠道编码，由支付宝分配）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * SCAN(用户扫码)
SEND_ORDER(用户寄件下单)
RECEIVE_SUCCESS（揽收成功）
PAY_SUCCESS(完成支付)
	 */
	@ApiField("operation_dynamic_sales_type")
	private String operationDynamicSalesType;

	/**
	 * 寄件用户操作时位置的纬度，单位：度
	 */
	@ApiField("operation_latitude")
	private String operationLatitude;

	/**
	 * 寄件用户操作时位置的经度，单位：度
	 */
	@ApiField("operation_longitude")
	private String operationLongitude;

	/**
	 * 寄件支付宝用户标识
	 */
	@ApiField("operation_open_id")
	private String operationOpenId;

	/**
	 * ALIPAY 支付宝操作渠道
OTHER 其他渠道
	 */
	@ApiField("operation_source")
	private String operationSource;

	/**
	 * 寄件用户操作时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 寄件支付宝用户id（当operation_source为OTHER渠道时，可不校验operation_open_id和operation_user_id是否同时为空）
	 */
	@ApiField("operation_user_id")
	private String operationUserId;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付完成页面链接（支付宝小程序链接）
	 */
	@ApiField("pay_finish_url")
	private String payFinishUrl;

	/**
	 * 待支付页面链接（支付宝小程序链接）
当用户下单后有待支付链接请传
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getAlipayTradeStatus() {
		return this.alipayTradeStatus;
	}
	public void setAlipayTradeStatus(String alipayTradeStatus) {
		this.alipayTradeStatus = alipayTradeStatus;
	}

	public String getIncentiveCode() {
		return this.incentiveCode;
	}
	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOperationDynamicSalesType() {
		return this.operationDynamicSalesType;
	}
	public void setOperationDynamicSalesType(String operationDynamicSalesType) {
		this.operationDynamicSalesType = operationDynamicSalesType;
	}

	public String getOperationLatitude() {
		return this.operationLatitude;
	}
	public void setOperationLatitude(String operationLatitude) {
		this.operationLatitude = operationLatitude;
	}

	public String getOperationLongitude() {
		return this.operationLongitude;
	}
	public void setOperationLongitude(String operationLongitude) {
		this.operationLongitude = operationLongitude;
	}

	public String getOperationOpenId() {
		return this.operationOpenId;
	}
	public void setOperationOpenId(String operationOpenId) {
		this.operationOpenId = operationOpenId;
	}

	public String getOperationSource() {
		return this.operationSource;
	}
	public void setOperationSource(String operationSource) {
		this.operationSource = operationSource;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperationUserId() {
		return this.operationUserId;
	}
	public void setOperationUserId(String operationUserId) {
		this.operationUserId = operationUserId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayFinishUrl() {
		return this.payFinishUrl;
	}
	public void setPayFinishUrl(String payFinishUrl) {
		this.payFinishUrl = payFinishUrl;
	}

	public String getPayUrl() {
		return this.payUrl;
	}
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
