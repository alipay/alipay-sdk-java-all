package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试金融科技火眼内部调用服务端update
 *
 * @author auto create
 * @since 1.0, 2019-01-18 16:41:31
 */
public class AftAifinFireeyeTestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8286932911867737767L;

	/**
	 * 11111
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
