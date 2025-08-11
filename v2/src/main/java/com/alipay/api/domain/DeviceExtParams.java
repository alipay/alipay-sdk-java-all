package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备档案拓展信息
 *
 * @author auto create
 * @since 1.0, 2025-04-11 15:55:19
 */
public class DeviceExtParams extends AlipayObject {

	private static final long serialVersionUID = 1455537444166334869L;

	/**
	 * 商户编号，由ISV定义，需要保证在ISV下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部门店id，可用绑定必传
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 服务商通过这个参数传入服务商定制版本信息，不传默认为标准版
	 */
	@ApiField("isv_device_version_tag")
	private String isvDeviceVersionTag;

	/**
	 * 支付类型
云支付服务商：ALIPAY_CLOUD
生态服务商：SPI
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 可用绑定时必传，用于设备左上角展示，可以区分设备所在门店
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 该参数为门店名称的拓展使用，供商户自主配置店铺昵称
	 */
	@ApiField("shop_nick_name")
	private String shopNickName;

	/**
	 * 进件服务商pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * 表示ISV在开放平台注册的SPI服务应用的app_id，用于标识ISV身份
	 */
	@ApiField("spi_app_id")
	private String spiAppId;

	/**
	 * isv内部唯一标识商户、商户门店等字段信息；可作为ISV自主对接的扩展字段使用
	 */
	@ApiField("terminal_bind_info")
	private String terminalBindInfo;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public String getIsvDeviceVersionTag() {
		return this.isvDeviceVersionTag;
	}
	public void setIsvDeviceVersionTag(String isvDeviceVersionTag) {
		this.isvDeviceVersionTag = isvDeviceVersionTag;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopNickName() {
		return this.shopNickName;
	}
	public void setShopNickName(String shopNickName) {
		this.shopNickName = shopNickName;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSpiAppId() {
		return this.spiAppId;
	}
	public void setSpiAppId(String spiAppId) {
		this.spiAppId = spiAppId;
	}

	public String getTerminalBindInfo() {
		return this.terminalBindInfo;
	}
	public void setTerminalBindInfo(String terminalBindInfo) {
		this.terminalBindInfo = terminalBindInfo;
	}

}
