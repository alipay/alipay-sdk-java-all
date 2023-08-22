package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机交易单信息
 *
 * @author auto create
 * @since 1.0, 2022-11-23 15:07:51
 */
public class DriverTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 4377861864648623596L;

	/**
	 * 交易日期
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 支付宝司机open_id
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 支付宝司机uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * Y-风控，N-不风控，null或空代表不风控
	 */
	@ApiField("risk_control")
	private String riskControl;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 订单金额(单位分)
	 */
	@ApiField("trade_total_amount")
	private String tradeTotalAmount;

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getDriverOpenId() {
		return this.driverOpenId;
	}
	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getRiskControl() {
		return this.riskControl;
	}
	public void setRiskControl(String riskControl) {
		this.riskControl = riskControl;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTotalAmount() {
		return this.tradeTotalAmount;
	}
	public void setTradeTotalAmount(String tradeTotalAmount) {
		this.tradeTotalAmount = tradeTotalAmount;
	}

}
