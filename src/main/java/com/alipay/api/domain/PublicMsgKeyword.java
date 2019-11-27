package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息关键字
 *
 * @author auto create
 * @since 1.0, 2019-11-25 18:48:57
 */
public class PublicMsgKeyword extends AlipayObject {

	private static final long serialVersionUID = 6476597522656754219L;

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
