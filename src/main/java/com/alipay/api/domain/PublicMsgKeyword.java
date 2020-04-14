package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息关键字
 *
 * @author auto create
 * @since 1.0, 2019-12-04 19:44:47
 */
public class PublicMsgKeyword extends AlipayObject {

	private static final long serialVersionUID = 3588351755182963471L;

	/**
	 * 模板关键字名称
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
