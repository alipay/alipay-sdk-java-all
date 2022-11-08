package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建AMPE引导二维码
 *
 * @author auto create
 * @since 1.0, 2022-06-30 21:31:15
 */
public class AlipayOpenMiniAmpeQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5393282362443439595L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 硬件设备的在AMPE注册的设备id，可以通过jsapi-my.getSystemInfo获取，对应的属性名为：arome_deviceId
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 需要跳转的小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 需要跳转的页面，默认为首页
	 */
	@ApiField("page")
	private String page;

	/**
	 * 硬件设备的在AMPE注册的产品id，可以通过jsapi-my.getSystemInfo获取，对应的属性名为：arome_productId
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 需要跳转页面携带的
	 */
	@ApiField("query")
	private String query;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
