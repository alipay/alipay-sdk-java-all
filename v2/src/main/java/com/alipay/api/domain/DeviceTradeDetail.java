package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备交易明细
 *
 * @author auto create
 * @since 1.0, 2021-02-05 16:00:07
 */
public class DeviceTradeDetail extends AlipayObject {

	private static final long serialVersionUID = 1531261456938545598L;

	/**
	 * 设备序列号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 统计时间
	 */
	@ApiField("max_dt")
	private String maxDt;

	/**
	 * 支付方式
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 交易金额
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	/**
	 * 设备交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMaxDt() {
		return this.maxDt;
	}
	public void setMaxDt(String maxDt) {
		this.maxDt = maxDt;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getTradeAmt() {
		return this.tradeAmt;
	}
	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

}
