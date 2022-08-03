package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连iot播报回传
 *
 * @author auto create
 * @since 1.0, 2022-06-09 14:00:57
 */
public class AlipayMerchantIndirectIotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6529468343319737385L;

	/**
	 * 设备id，根据不同的设备类型device_id_type传不同的值
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备id类型，SN指设备sn号，BIZ_TID指蚂蚁iot对应的唯一biz_tid，ALIYUN指阿里云对应的唯一的设备id类型，其他类型待补充
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
	 * 最终营销文案的播报方式
SDK：指服务商的设备接入了支付宝SDK，最终由支付宝播报；
ALIYUN:指服务商接入了阿里云的播报平台，最终服务商消费返回的字段，通过阿里云平台进行播报
	 */
	@ApiField("play_mode")
	private String playMode;

	/**
	 * 间连商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 补充定义设备device_id,当device_id_type是SN时，传对应的服务商source_id。
其他场景待补充
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
