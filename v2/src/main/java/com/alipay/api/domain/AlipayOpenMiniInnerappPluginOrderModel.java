package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序代商户订购插件
 *
 * @author auto create
 * @since 1.0, 2020-06-08 16:21:57
 */
public class AlipayOpenMiniInnerappPluginOrderModel extends AlipayObject {

	private static final long serialVersionUID = 8268493174976227679L;

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

	/**
	 * 业务幂等号，规则为商品id+appOrigin+requestId 作为幂等流水号
非必填,不传则默认生成一个8位requestId
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
