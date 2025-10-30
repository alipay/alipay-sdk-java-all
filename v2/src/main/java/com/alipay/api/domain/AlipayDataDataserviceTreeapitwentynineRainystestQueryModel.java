package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型的测试接口29
 *
 * @author auto create
 * @since 1.0, 2025-05-21 10:33:22
 */
public class AlipayDataDataserviceTreeapitwentynineRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6263345641133282339L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
