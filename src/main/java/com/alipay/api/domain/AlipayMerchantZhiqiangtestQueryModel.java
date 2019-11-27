package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 致强测试查询
 *
 * @author auto create
 * @since 1.0, 2019-11-13 11:47:53
 */
public class AlipayMerchantZhiqiangtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1149857257242769618L;

	/**
	 * String[]args
	 */
	@ApiListField("args")
	@ApiField("string")
	private List<String> args;

	public List<String> getArgs() {
		return this.args;
	}
	public void setArgs(List<String> args) {
		this.args = args;
	}

}
