package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百灵文案创建接口
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:44
 */
public class AnttechOceanbaseObglobalBailingualCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5118142156312595231L;

	/**
	 * 动态在百灵平台创建及发布文案,支持批量操作
	 */
	@ApiField("create_text_request")
	private CreateTextRequest createTextRequest;

	public CreateTextRequest getCreateTextRequest() {
		return this.createTextRequest;
	}
	public void setCreateTextRequest(CreateTextRequest createTextRequest) {
		this.createTextRequest = createTextRequest;
	}

}
