package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业身份验真插件初始化
 *
 * @author auto create
 * @since 1.0, 2023-04-07 11:38:39
 */
public class ZhimaCustomerJobworthAuthenticationpluginQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2612944556966514618L;

	/**
	 * 通过受理台签约接口获取到的signStr
	 */
	@ApiField("sign_str")
	private String signStr;

	public String getSignStr() {
		return this.signStr;
	}
	public void setSignStr(String signStr) {
		this.signStr = signStr;
	}

}
