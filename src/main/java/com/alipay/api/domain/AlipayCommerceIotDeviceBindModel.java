package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备-商户-店铺绑定
 *
 * @author auto create
 * @since 1.0, 2021-09-17 10:25:20
 */
public class AlipayCommerceIotDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 7684321615567849199L;

	/**
	 * 应用类型，目前只支持小程序MINI_APP
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 应用ID，目前暂不使用，可不填
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 设备ID：bizTid
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 可选项[SN,ID] SN-使用supplier_id、device_sn联合作为设备唯一识别标识 ID-使用biztid作为设备唯一识别标识
	 */
	@ApiField("device_id_type")
	private String deviceIdType;

	/**
	 * 设备序列号：SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 硬件类型
	 */
	@ApiField("equipment_type")
	private String equipmentType;

	/**
	 * 商户编号，由ISV定义，需要保证在ISV下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * external_id对应的secret秘钥
	 */
	@ApiField("external_id_secret")
	private String externalIdSecret;

	/**
	 * 外部门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 商户角色id。对于直连开店场景，填写商户pid；对于间连开店场景，填写商户smid。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 区分商户ID类型，直连商户填写direct，间连商户填写indirect
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 小程序ID，当app_type为MINI_APP时，设置该值；
如意LITE设备，请填写"RUYI_LITE"
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * merchant_id_type为间连indirect时，smid关联的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 受理商户的ISV在支付宝的pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * 表示ISV在开放平台注册的SPI服务应用的app_id
	 */
	@ApiField("spi_app_id")
	private String spiAppId;

	/**
	 * 设备供应商ID：supplierId
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 由ISV自定义的扩展字段，在支付宝侧向SPI服务发起请求时透传给ISV的服务，使得ISV能够自定义商户、设备等相关的信息，包括ISV商户、ISV门店、设备身份、安全校验等。
	 */
	@ApiField("terminal_bind_info")
	private String terminalBindInfo;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceIdType() {
		return this.deviceIdType;
	}
	public void setDeviceIdType(String deviceIdType) {
		this.deviceIdType = deviceIdType;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getEquipmentType() {
		return this.equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getExternalIdSecret() {
		return this.externalIdSecret;
	}
	public void setExternalIdSecret(String externalIdSecret) {
		this.externalIdSecret = externalIdSecret;
	}

	public String getExternalShopId() {
		return this.externalShopId;
	}
	public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTerminalBindInfo() {
		return this.terminalBindInfo;
	}
	public void setTerminalBindInfo(String terminalBindInfo) {
		this.terminalBindInfo = terminalBindInfo;
	}

}
