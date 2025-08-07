package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备绑定需要的额外信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 20:07:34
 */
public class DeviceExtAttribute extends AlipayObject {

	private static final long serialVersionUID = 8278956799492392292L;

	/**
	 * 设备外挂配件的SN号，仅设备有外挂配件时需要传
	 */
	@ApiField("accessory_sn")
	private String accessorySn;

	/**
	 * 商家编号，由服务商定义，需要保证在服务商下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部门店 ID，如果是间连绑定必有
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 服务商密钥
	 */
	@ApiField("isv_access_token")
	private String isvAccessToken;

	/**
	 * 小写字母串_服务商PID
	 */
	@ApiField("isv_device_version_tag")
	private String isvDeviceVersionTag;

	/**
	 * 卖进订单id，先卖进后绑定模式下必传。
	 */
	@ApiField("sales_entry_order_id")
	private String salesEntryOrderId;

	/**
	 * 卖进方案扩展信息
	 */
	@ApiField("sales_solution_ext")
	private SalesSolutionExt salesSolutionExt;

	/**
	 * 间连绑定时必有，用于设备左上角展示，可以区分设备所在门店
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 间连绑定时选填，用于设备左上角展示，可以区分设备所在门店
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

	public String getAccessorySn() {
		return this.accessorySn;
	}
	public void setAccessorySn(String accessorySn) {
		this.accessorySn = accessorySn;
	}

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

	public String getIsvAccessToken() {
		return this.isvAccessToken;
	}
	public void setIsvAccessToken(String isvAccessToken) {
		this.isvAccessToken = isvAccessToken;
	}

	public String getIsvDeviceVersionTag() {
		return this.isvDeviceVersionTag;
	}
	public void setIsvDeviceVersionTag(String isvDeviceVersionTag) {
		this.isvDeviceVersionTag = isvDeviceVersionTag;
	}

	public String getSalesEntryOrderId() {
		return this.salesEntryOrderId;
	}
	public void setSalesEntryOrderId(String salesEntryOrderId) {
		this.salesEntryOrderId = salesEntryOrderId;
	}

	public SalesSolutionExt getSalesSolutionExt() {
		return this.salesSolutionExt;
	}
	public void setSalesSolutionExt(SalesSolutionExt salesSolutionExt) {
		this.salesSolutionExt = salesSolutionExt;
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
