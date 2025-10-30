package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源行业，充电订单信息
 *
 * @author auto create
 * @since 1.0, 2025-05-26 15:36:44
 */
public class SiteChargerOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 1769546659228981217L;

	/**
	 * 互联互通充电枪（设备）编号
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 设备订单号，用于匹配桩SDK上报的订单
	 */
	@ApiField("device_order_id")
	private String deviceOrderId;

	/**
	 * 结束充电时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 互联互通运营商编码
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 互联互通运营商名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 支付单交易号，支付宝交易号（必传）或者其他渠道的交易号
	 */
	@ApiField("payment_trade_no")
	private String paymentTradeNo;

	/**
	 * 互联互通充电订单号
	 */
	@ApiField("start_charge_seq")
	private String startChargeSeq;

	/**
	 * 开始充电时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 互联互通充电场站编号
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 互联互通充电站名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 互联互通二级运营商编码，请联系BD或者解决方案获取映射清单
	 */
	@ApiField("sub_operator_id")
	private String subOperatorId;

	/**
	 * 订单用户应付电费，单位：元，精度为两位小数
	 */
	@ApiField("total_elec_money")
	private String totalElecMoney;

	/**
	 * 订单用户应付金额（总电费+总服务费），单位：元，精度为两位小数
	 */
	@ApiField("total_money")
	private String totalMoney;

	/**
	 * 订单累计充电量，单位：kWh
	 */
	@ApiField("total_power")
	private String totalPower;

	/**
	 * 订单用户实际支付电费，单位：元，精度为两位小数
	 */
	@ApiField("total_real_elec_money")
	private String totalRealElecMoney;

	/**
	 * 订单用户实际支付服务费，单位：元，精度为两位小数
	 */
	@ApiField("total_real_service_money")
	private String totalRealServiceMoney;

	/**
	 * 订单用户应付服务费，单位：元，精度为两位小数
	 */
	@ApiField("total_service_money")
	private String totalServiceMoney;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getDeviceOrderId() {
		return this.deviceOrderId;
	}
	public void setDeviceOrderId(String deviceOrderId) {
		this.deviceOrderId = deviceOrderId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPaymentTradeNo() {
		return this.paymentTradeNo;
	}
	public void setPaymentTradeNo(String paymentTradeNo) {
		this.paymentTradeNo = paymentTradeNo;
	}

	public String getStartChargeSeq() {
		return this.startChargeSeq;
	}
	public void setStartChargeSeq(String startChargeSeq) {
		this.startChargeSeq = startChargeSeq;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getSubOperatorId() {
		return this.subOperatorId;
	}
	public void setSubOperatorId(String subOperatorId) {
		this.subOperatorId = subOperatorId;
	}

	public String getTotalElecMoney() {
		return this.totalElecMoney;
	}
	public void setTotalElecMoney(String totalElecMoney) {
		this.totalElecMoney = totalElecMoney;
	}

	public String getTotalMoney() {
		return this.totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getTotalPower() {
		return this.totalPower;
	}
	public void setTotalPower(String totalPower) {
		this.totalPower = totalPower;
	}

	public String getTotalRealElecMoney() {
		return this.totalRealElecMoney;
	}
	public void setTotalRealElecMoney(String totalRealElecMoney) {
		this.totalRealElecMoney = totalRealElecMoney;
	}

	public String getTotalRealServiceMoney() {
		return this.totalRealServiceMoney;
	}
	public void setTotalRealServiceMoney(String totalRealServiceMoney) {
		this.totalRealServiceMoney = totalRealServiceMoney;
	}

	public String getTotalServiceMoney() {
		return this.totalServiceMoney;
	}
	public void setTotalServiceMoney(String totalServiceMoney) {
		this.totalServiceMoney = totalServiceMoney;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
