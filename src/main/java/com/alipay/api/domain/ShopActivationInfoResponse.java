package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺信息列表
 *
 * @author auto create
 * @since 1.0, 2018-03-05 22:47:29
 */
public class ShopActivationInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3127414385568537368L;

	/**
	 * 激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

	/**
	 * 设备信息
	 */
	@ApiListField("device_dynamic_info_response_list")
	@ApiField("device_dynamic_info_response")
	private List<DeviceDynamicInfoResponse> deviceDynamicInfoResponseList;

	/**
	 * isvCode
	 */
	@ApiField("isv_app_enum")
	private String isvAppEnum;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 业务唯一键
	 */
	@ApiField("shop_activation_id")
	private String shopActivationId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺激活码生成状态。一期数据没有业务含义
	 */
	@ApiField("status")
	private String status;

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public List<DeviceDynamicInfoResponse> getDeviceDynamicInfoResponseList() {
		return this.deviceDynamicInfoResponseList;
	}
	public void setDeviceDynamicInfoResponseList(List<DeviceDynamicInfoResponse> deviceDynamicInfoResponseList) {
		this.deviceDynamicInfoResponseList = deviceDynamicInfoResponseList;
	}

	public String getIsvAppEnum() {
		return this.isvAppEnum;
	}
	public void setIsvAppEnum(String isvAppEnum) {
		this.isvAppEnum = isvAppEnum;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getShopActivationId() {
		return this.shopActivationId;
	}
	public void setShopActivationId(String shopActivationId) {
		this.shopActivationId = shopActivationId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
