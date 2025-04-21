package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * API审批时长统计
 *
 * @author auto create
 * @since 1.0, 2025-04-17 10:32:28
 */
public class AlipayDataTimeTongjiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4155128212243154541L;

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
