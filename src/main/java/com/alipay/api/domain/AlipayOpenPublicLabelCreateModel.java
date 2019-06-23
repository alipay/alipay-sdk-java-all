package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-添加标签
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:56:38
 */
public class AlipayOpenPublicLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8264853149693978476L;

	/**
	 * 标签名
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
