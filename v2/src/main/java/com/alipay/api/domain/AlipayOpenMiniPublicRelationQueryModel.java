package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序绑定的生活号信息
 *
 * @author auto create
 * @since 1.0, 2019-12-18 10:18:16
 */
public class AlipayOpenMiniPublicRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8712431876896947276L;

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
