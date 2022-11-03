package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序 - 删除小程序
 *
 * @author auto create
 * @since 1.0, 2019-05-06 10:41:10
 */
public class AlipayOpenMiniInnerbaseinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4828374576473122793L;

	/**
	 * 租户code，alipay or taobao
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
