package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv服务商代商户创建小程序
 *
 * @author auto create
 * @since 1.0, 2025-05-22 10:05:33
 */
public class AlipayOpenMiniIsvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6352367643886576943L;

	/**
	 * 小程序代创建请求
	 */
	@ApiField("create_mini_request")
	private CreateMiniRequest createMiniRequest;

	public CreateMiniRequest getCreateMiniRequest() {
		return this.createMiniRequest;
	}
	public void setCreateMiniRequest(CreateMiniRequest createMiniRequest) {
		this.createMiniRequest = createMiniRequest;
	}

}
