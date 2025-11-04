package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小厅消息同步至服催
 *
 * @author auto create
 * @since 1.0, 2025-10-16 17:57:09
 */
public class AlipayIserviceCsfuServicehallSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1525837778166745634L;

	/**
	 * 保持和原接口兼容 使用string类型,
参考:com.alipay.antmcc.facade.model.aiworker.ChatRequest
	 */
	@ApiField("message")
	private String message;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
