package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询推屏结果
 *
 * @author auto create
 * @since 1.0, 2023-06-13 14:36:01
 */
public class AlipayIserviceBkcsplatformPushwindowresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5544461251774368967L;

	/**
	 * 方舟工作台服务请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 推屏唯一token
	 */
	@ApiField("request_token")
	private String requestToken;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

}
