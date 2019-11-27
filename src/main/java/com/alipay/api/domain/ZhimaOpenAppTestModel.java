package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * api测试
 *
 * @author auto create
 * @since 1.0, 2016-01-25 17:56:33
 */
public class ZhimaOpenAppTestModel extends AlipayObject {

	private static final long serialVersionUID = 7381553823686962855L;

	/**
	 * id
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
