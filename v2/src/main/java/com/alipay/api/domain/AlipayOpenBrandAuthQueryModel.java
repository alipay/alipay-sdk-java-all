package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌认证信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8543544728781712619L;

	/**
	 * true:只返回已授权,false:返回已授权+未授权
	 */
	@ApiField("authorized")
	private Boolean authorized;

	/**
	 * true:需要,false:不需要
	 */
	@ApiField("need_app")
	private Boolean needApp;

	public Boolean getAuthorized() {
		return this.authorized;
	}
	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}

	public Boolean getNeedApp() {
		return this.needApp;
	}
	public void setNeedApp(Boolean needApp) {
		this.needApp = needApp;
	}

}
