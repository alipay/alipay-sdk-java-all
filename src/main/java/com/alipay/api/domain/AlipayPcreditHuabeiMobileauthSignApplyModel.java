package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约申请服务
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:36:17
 */
public class AlipayPcreditHuabeiMobileauthSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3486464762217255791L;

	/**
	 * 请求参数
	 */
	@ApiField("request")
	private String request;

	public String getRequest() {
		return this.request;
	}
	public void setRequest(String request) {
		this.request = request;
	}

}
