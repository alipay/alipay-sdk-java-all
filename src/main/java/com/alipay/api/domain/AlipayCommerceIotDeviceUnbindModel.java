package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备-商户-店铺解绑
 *
 * @author auto create
 * @since 1.0, 2020-09-30 15:46:18
 */
public class AlipayCommerceIotDeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5432435233136397647L;

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
	 * 设备ID：biztid
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
	 * 商户编号，由ISV定义，需要保证在ISV下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户角色id。对于直连开店场景，填写商户pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户ID类型，目前只支持直连商户，填写direct
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 小程序ID，当app_type为MINI_APP时，设置该值
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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
	 * 设备供应商ID：supplierId
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
