package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序代商户订购插件
 *
 * @author auto create
 * @since 1.0, 2019-12-19 19:03:42
 */
public class AlipayOpenMiniInnerappPluginOrderModel extends AlipayObject {

	private static final long serialVersionUID = 8561875162425636512L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 订购的服务商品ID
	 */
	@ApiField("merchandise_id")
	private String merchandiseId;

	/**
	 * 一二方支持传入appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMerchandiseId() {
		return this.merchandiseId;
	}
	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
