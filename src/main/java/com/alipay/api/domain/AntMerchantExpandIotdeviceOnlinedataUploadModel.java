package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户合作设备在线时间回传
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:47
 */
public class AntMerchantExpandIotdeviceOnlinedataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5834798965357947432L;

	/**
	 * 设备有效时长（小于等于86400秒）
	 */
	@ApiField("device_online_time")
	private Long deviceOnlineTime;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备对应政策类型(无政策(NO_POLICY),现金返佣(CASH_POLICY),屏幕共享(SHAREING_POLICY))
	 */
	@ApiField("policy_type")
	private String policyType;

	/**
	 * 结算支付宝账号：结算支付宝账号（商户）、结算支付宝账号（服务商）
	 */
	@ApiField("settled_alipay_id")
	private String settledAlipayId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 签约支付宝账号PID(2088开头): 商家支付宝账号（用于与蚂蚁签约的支付宝账号）、 外部服务商支付宝账号（用于与蚂蚁签约的支付宝账号）
	 */
	@ApiField("signed_alipay_id")
	private String signedAlipayId;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	/**
	 * 上传日期
	 */
	@ApiField("upload_date")
	private String uploadDate;

	public Long getDeviceOnlineTime() {
		return this.deviceOnlineTime;
	}
	public void setDeviceOnlineTime(Long deviceOnlineTime) {
		this.deviceOnlineTime = deviceOnlineTime;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getPolicyType() {
		return this.policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getSettledAlipayId() {
		return this.settledAlipayId;
	}
	public void setSettledAlipayId(String settledAlipayId) {
		this.settledAlipayId = settledAlipayId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSignedAlipayId() {
		return this.signedAlipayId;
	}
	public void setSignedAlipayId(String signedAlipayId) {
		this.signedAlipayId = signedAlipayId;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

	public String getUploadDate() {
		return this.uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

}
