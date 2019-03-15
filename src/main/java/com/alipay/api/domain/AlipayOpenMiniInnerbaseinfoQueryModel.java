package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序信息查询
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:27:19
 */
public class AlipayOpenMiniInnerbaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8194496788276877921L;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
