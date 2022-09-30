package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 移动应用信息
 *
 * @author auto create
 * @since 1.0, 2020-07-29 16:02:22
 */
public class MobileAppInfo extends AlipayObject {

	private static final long serialVersionUID = 8752469272159577467L;

	/**
	 * 移动应用绑定小程序数量
	 */
	@ApiField("bind_mini_app_count")
	private Long bindMiniAppCount;

	/**
	 * 移动应用id
	 */
	@ApiField("mobile_app_id")
	private String mobileAppId;

	/**
	 * 移动应用名称
	 */
	@ApiField("mobile_app_name")
	private String mobileAppName;

	/**
	 * 移动应用签名
	 */
	@ApiField("mobile_app_sign")
	private String mobileAppSign;

	/**
	 * 设备产品信息列表
	 */
	@ApiListField("related_product_list")
	@ApiField("device_product_info")
	private List<DeviceProductInfo> relatedProductList;

	public Long getBindMiniAppCount() {
		return this.bindMiniAppCount;
	}
	public void setBindMiniAppCount(Long bindMiniAppCount) {
		this.bindMiniAppCount = bindMiniAppCount;
	}

	public String getMobileAppId() {
		return this.mobileAppId;
	}
	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public String getMobileAppName() {
		return this.mobileAppName;
	}
	public void setMobileAppName(String mobileAppName) {
		this.mobileAppName = mobileAppName;
	}

	public String getMobileAppSign() {
		return this.mobileAppSign;
	}
	public void setMobileAppSign(String mobileAppSign) {
		this.mobileAppSign = mobileAppSign;
	}

	public List<DeviceProductInfo> getRelatedProductList() {
		return this.relatedProductList;
	}
	public void setRelatedProductList(List<DeviceProductInfo> relatedProductList) {
		this.relatedProductList = relatedProductList;
	}

}
