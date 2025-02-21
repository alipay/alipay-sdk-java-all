package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备绑定需要的额外信息
 *
 * @author auto create
 * @since 1.0, 2025-02-10 14:48:23
 */
public class DeviceExtAttribute extends AlipayObject {

	private static final long serialVersionUID = 8456695174168318988L;

	/**
	 * 商家编号，由服务商定义，需要保证在服务商下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部门店 ID，如果是可用绑定必有
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 可用绑定时必有，用于设备左上角展示，可以区分设备所在门店
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 可用绑定时选填，用于设备左上角展示，可以区分设备所在门店
	 */
	@ApiField("shop_nick_name")
	private String shopNickName;

	/**
	 * 卖进方案id，作业时有卖进方案的必传
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 进件服务商 PID
	 */
	@ApiField("source")
	private String source;

	/**
	 * 表示服务商在开放平台注册的 SPI 服务应用的 app_id，用于标识服务商身份
	 */
	@ApiField("spi_app_id")
	private String spiAppId;

	/**
	 * 服务商内部唯一标识商家、商家门店等字段信息；
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

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
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
