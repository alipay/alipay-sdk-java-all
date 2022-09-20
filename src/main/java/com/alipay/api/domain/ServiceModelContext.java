package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务模型上下文
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:34:54
 */
public class ServiceModelContext extends AlipayObject {

	private static final long serialVersionUID = 6247893416857224557L;

	/**
	 * xpId，服务调用唯一的设备标识
	 */
	@ApiField("xp_id")
	private String xpId;

	public String getXpId() {
		return this.xpId;
	}
	public void setXpId(String xpId) {
		this.xpId = xpId;
	}

}
