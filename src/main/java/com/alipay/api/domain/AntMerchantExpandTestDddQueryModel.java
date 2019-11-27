package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试only
 *
 * @author auto create
 * @since 1.0, 2019-10-30 17:31:37
 */
public class AntMerchantExpandTestDddQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8232983752235232974L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
