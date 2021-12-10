package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机交易单信息
 *
 * @author auto create
 * @since 1.0, 2021-09-09 09:44:52
 */
public class DriverTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 8353246661773493192L;

	/**
	 * 交易日期
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 支付宝司机uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

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

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
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
