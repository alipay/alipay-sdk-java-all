package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 松贤测试xxx
 *
 * @author auto create
 * @since 1.0, 2018-04-17 19:33:41
 */
public class AlipayOpenEchoSendModel extends AlipayObject {

	private static final long serialVersionUID = 8451416781646512973L;

	/**
	 * xxx
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
