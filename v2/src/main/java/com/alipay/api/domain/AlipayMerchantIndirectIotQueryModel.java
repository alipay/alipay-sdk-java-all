package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连iot播报回传
 *
 * @author auto create
 * @since 1.0, 2023-10-13 15:33:55
 */
public class AlipayMerchantIndirectIotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8221935622125536499L;

	/**
	 * 合约机和lite接入模式传设备SN号，千里传音模式传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 可选字段，兼容可能的bizTid传入场景，可不填
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
	 * 固定枚举值（千里传音：ALIYUN，合约机：SDK，lite模式：LITE）
	 */
	@ApiField("play_mode")
	private String playMode;

	/**
	 * 间连商户在支付宝体系内的唯一id,一般以2088开头
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 合约机模式必传设备sourceId号，千里传音模式必传设备的productKey，lite模式必传分配给服务商的设备型号编码
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
