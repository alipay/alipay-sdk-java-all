package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备档案拓展信息
 *
 * @author auto create
 * @since 1.0, 2021-07-29 21:25:01
 */
public class DeviceExtParams extends AlipayObject {

	private static final long serialVersionUID = 1587697321447577614L;

	/**
	 * 商户编号，由ISV定义，需要保证在ISV下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 支付类型
云支付服务商：ALIPAY_CLOUD
生态服务商：SPI
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 进件服务商pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * isv应用id，绑定流程不消费，订单中心消费。
	 */
	@ApiField("spi_app_id")
	private String spiAppId;

	/**
	 * sv内部唯一标识商户、商户门店等字段信息
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
