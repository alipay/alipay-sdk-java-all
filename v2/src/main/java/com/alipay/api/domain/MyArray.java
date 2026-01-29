package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 11
 *
 * @author auto create
 * @since 1.0, 2026-01-23 16:08:43
 */
public class MyArray extends AlipayObject {

	private static final long serialVersionUID = 3679886623781157234L;

	/**
	 * 测试
	 */
	@ApiListField("aa")
	@ApiField("string")
	private List<String> aa;

	public List<String> getAa() {
		return this.aa;
	}
	public void setAa(List<String> aa) {
		this.aa = aa;
	}

}
