package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot交易设备信息
 *
 * @author auto create
 * @since 1.0, 2019-02-25 16:47:04
 */
public class DeviceTradeResponse extends AlipayObject {

	private static final long serialVersionUID = 5454977668537656485L;

	/**
	 * 设备唯一标识
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 设备sn，通常置于设备标签中
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 交易错误提示
例如：未收录设备的SDK交易
	 */
	@ApiField("iot_trade_error_type")
	private String iotTradeErrorType;

	/**
	 * 物料id,由支付宝同学提供
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * SDK加签名信息
	 */
	@ApiField("terminal_sdk_sign_info")
	private String terminalSdkSignInfo;

	/**
	 * 交易完成时间
	 */
	@ApiField("trade_finish_time")
	private String tradeFinishTime;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getIotTradeErrorType() {
		return this.iotTradeErrorType;
	}
	public void setIotTradeErrorType(String iotTradeErrorType) {
		this.iotTradeErrorType = iotTradeErrorType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTerminalSdkSignInfo() {
		return this.terminalSdkSignInfo;
	}
	public void setTerminalSdkSignInfo(String terminalSdkSignInfo) {
		this.terminalSdkSignInfo = terminalSdkSignInfo;
	}

	public String getTradeFinishTime() {
		return this.tradeFinishTime;
	}
	public void setTradeFinishTime(String tradeFinishTime) {
		this.tradeFinishTime = tradeFinishTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
