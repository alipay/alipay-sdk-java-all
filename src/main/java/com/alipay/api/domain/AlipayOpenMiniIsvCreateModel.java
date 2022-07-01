package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv服务商代商户创建小程序
 *
 * @author auto create
 * @since 1.0, 2022-06-30 14:54:26
 */
public class AlipayOpenMiniIsvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6584344223592476997L;

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
