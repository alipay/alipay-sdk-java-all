package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板申领关键词模型
 *
 * @author auto create
 * @since 1.0, 2023-02-20 10:16:18
 */
public class MsgApplyKeyword extends AlipayObject {

	private static final long serialVersionUID = 1657996682715518149L;

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
