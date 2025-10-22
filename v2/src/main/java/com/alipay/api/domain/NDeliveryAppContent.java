package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序对象
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:11
 */
public class NDeliveryAppContent extends AlipayObject {

	private static final long serialVersionUID = 3158815982925595156L;

	/**
	 * 小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序服务id，通过 
alipay.open.app.service.apply(服务提报申请)
接口创建服务后获取。
限制: 
1.只有mini_app_id有值时该值传入才会有效；
2.当前只支持一个sercive_code；
3.service_code必须是已传入的mini_app_id下的小程序服务；
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
