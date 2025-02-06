package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能选址充电桩订单信息同步
 *
 * @author auto create
 * @since 1.0, 2024-09-13 20:14:14
 */
public class SiteChargerOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 1673774492362899595L;

	/**
	 * 充电设备编码
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 结束充电时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 运营商编码
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 运营商名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 支付渠道：
ALIPAY（支付宝）；
WECHAT（微信）；
QUICKPASS（云闪付）；
OTHER（其他支付渠道）；
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 付款交易号，通过支付宝付款的必传
	 */
	@ApiField("payment_trade_no")
	private String paymentTradeNo;

	/**
	 * 充电订单号
	 */
	@ApiField("start_charge_seq")
	private String startChargeSeq;

	/**
	 * 开始充电时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 充电站ID
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 充电站名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 总服务费，单位:元
	 */
	@ApiField("total_elec_money")
	private String totalElecMoney;

	/**
	 * 总金额（总电费+总服务费）,单位:元
	 */
	@ApiField("total_money")
	private String totalMoney;

	/**
	 * 累计充电量，单位:度
	 */
	@ApiField("total_power")
	private String totalPower;

	/**
	 * 总实际支付电费，单位:元
	 */
	@ApiField("total_real_elec_money")
	private String totalRealElecMoney;

	/**
	 * 总实际支付服务费，单位:元
	 */
	@ApiField("total_real_service_money")
	private String totalRealServiceMoney;

	/**
	 * 总服务费，单位:元
	 */
	@ApiField("total_service_money")
	private String totalServiceMoney;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
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
