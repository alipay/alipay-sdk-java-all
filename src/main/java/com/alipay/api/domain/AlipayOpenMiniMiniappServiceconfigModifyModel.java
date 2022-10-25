package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代商户快速投放智能客服入口
 *
 * @author auto create
 * @since 1.0, 2022-10-20 11:23:53
 */
public class AlipayOpenMiniMiniappServiceconfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5663918193496447588L;

	/**
	 * 云客服是否在小程序首页透出，true-开启，false-不开启
	 */
	@ApiField("home_open")
	private Boolean homeOpen;

	/**
	 * 客服方式，目前支持ANTCLOUD-云客服
	 */
	@ApiField("service_config")
	private String serviceConfig;

	public Boolean getHomeOpen() {
		return this.homeOpen;
	}
	public void setHomeOpen(Boolean homeOpen) {
		this.homeOpen = homeOpen;
	}

	public String getServiceConfig() {
		return this.serviceConfig;
	}
	public void setServiceConfig(String serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

}
