package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class EntityEnterpriseInfo extends AlipayObject {

	private static final long serialVersionUID = 8398537957168284161L;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
