package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化门店挂载小程序
 *
 * @author auto create
 * @since 1.0, 2026-05-12 16:07:50
 */
public class AntMerchantExpandChannelpoiurlModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5157962323874526385L;

	/**
	 * 小程序url状态
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 小程序服务Id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 小程序服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 门店小程序appId
	 */
	@ApiField("shop_app_id")
	private String shopAppId;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 小程序跳转url
	 */
	@ApiField("url")
	private String url;

	public String getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getShopAppId() {
		return this.shopAppId;
	}
	public void setShopAppId(String shopAppId) {
		this.shopAppId = shopAppId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
