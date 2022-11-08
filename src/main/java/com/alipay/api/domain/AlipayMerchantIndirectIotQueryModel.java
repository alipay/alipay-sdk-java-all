package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连iot播报回传
 *
 * @author auto create
 * @since 1.0, 2022-10-08 14:57:12
 */
public class AlipayMerchantIndirectIotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1647449814361345913L;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备SN号，阿里云物联网平台传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 固定枚举值,支付宝物联网平台传SN，阿里云物联网平台传ALIYUN
	 */
	@ApiField("device_id_type")
	private String deviceIdType;

	/**
	 * 表示调用时机：
AFTER_PAY 支付后
BEFORE_PAY 支付前
	 */
	@ApiField("occasion")
	private String occasion;

	/**
	 * 固定枚举值（阿里云物联网平台：ALIYUN，支付宝物联网平台：SDK）
	 */
	@ApiField("play_mode")
	private String playMode;

	/**
	 * 间连商户在支付宝体系内的唯一id,一般以2088开头
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备sourceId号，阿里云物联网平台传设备productKey
	 */
	@ApiField("suppler_id")
	private String supplerId;

	/**
	 * 交易订单id
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 交易类型 可选值: ALIPAY_TRADE 支付宝交易 OTHER 其他交易途径
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceIdType() {
		return this.deviceIdType;
	}
	public void setDeviceIdType(String deviceIdType) {
		this.deviceIdType = deviceIdType;
	}

	public String getOccasion() {
		return this.occasion;
	}
	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getPlayMode() {
		return this.playMode;
	}
	public void setPlayMode(String playMode) {
		this.playMode = playMode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSupplerId() {
		return this.supplerId;
	}
	public void setSupplerId(String supplerId) {
		this.supplerId = supplerId;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
