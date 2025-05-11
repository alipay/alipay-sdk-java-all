package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电订单支付提交
 *
 * @author auto create
 * @since 1.0, 2025-04-10 12:01:01
 */
public class AlipayCommerceTransportChargerPayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1667596597899924263L;

	/**
	 * 商户优惠的订单金额。 单位为元，精确到小数点后两位
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 电量费用。单位为元，精确到小数点后两位
	 */
	@ApiField("elec_money")
	private String elecMoney;

	/**
	 * 充电结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 用户需要支付订单金额。 单位为元，精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 用户需要支付的电费。单位为元，精确到小数点后两位
	 */
	@ApiField("real_elec_money")
	private String realElecMoney;

	/**
	 * 用户需要支付的服务费。单位为元，精确到小数点后两位
	 */
	@ApiField("real_service_money")
	private String realServiceMoney;

	/**
	 * 订单包含的占位费。单位为元，精确到小数点后两位
	 */
	@ApiField("reserved_money")
	private String reservedMoney;

	/**
	 * 服务费用。单位为元，精确到小数点后两位
	 */
	@ApiField("service_money")
	private String serviceMoney;

	/**
	 * 电池剩余电量，两位小数；当订单类型为即插即充时，必传
	 */
	@ApiField("soc")
	private String soc;

	/**
	 * 充电开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 充电停止原因
	 */
	@ApiField("stop_reason")
	private String stopReason;

	/**
	 * 订单总金额。 单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 充电量，单位kwh，两位小数
	 */
	@ApiField("total_power")
	private String totalPower;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getElecMoney() {
		return this.elecMoney;
	}
	public void setElecMoney(String elecMoney) {
		this.elecMoney = elecMoney;
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

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRealElecMoney() {
		return this.realElecMoney;
	}
	public void setRealElecMoney(String realElecMoney) {
		this.realElecMoney = realElecMoney;
	}

	public String getRealServiceMoney() {
		return this.realServiceMoney;
	}
	public void setRealServiceMoney(String realServiceMoney) {
		this.realServiceMoney = realServiceMoney;
	}

	public String getReservedMoney() {
		return this.reservedMoney;
	}
	public void setReservedMoney(String reservedMoney) {
		this.reservedMoney = reservedMoney;
	}

	public String getServiceMoney() {
		return this.serviceMoney;
	}
	public void setServiceMoney(String serviceMoney) {
		this.serviceMoney = serviceMoney;
	}

	public String getSoc() {
		return this.soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStopReason() {
		return this.stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalPower() {
		return this.totalPower;
	}
	public void setTotalPower(String totalPower) {
		this.totalPower = totalPower;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
