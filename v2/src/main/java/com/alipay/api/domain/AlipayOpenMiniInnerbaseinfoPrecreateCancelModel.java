package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序预创建取消
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:31:08
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5512286286267352144L;

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
