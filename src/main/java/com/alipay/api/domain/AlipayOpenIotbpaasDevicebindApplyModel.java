package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备绑定预处理
 *
 * @author auto create
 * @since 1.0, 2021-01-29 16:08:18
 */
public class AlipayOpenIotbpaasDevicebindApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7354592579587789352L;

	/**
	 * 绑定token，用于查询绑定状态
	 */
	@ApiField("bind_token")
	private String bindToken;

	/**
	 * 非必传，传入为INIT时，强制生成新绑定token
	 */
	@ApiField("type")
	private String type;

	public String getBindToken() {
		return this.bindToken;
	}
	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
