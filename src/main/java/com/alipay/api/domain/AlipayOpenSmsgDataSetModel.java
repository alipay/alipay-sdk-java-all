package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * to蚂蚁消息测试-数据重置
 *
 * @author auto create
 * @since 1.0, 2018-03-09 11:03:37
 */
public class AlipayOpenSmsgDataSetModel extends AlipayObject {

	private static final long serialVersionUID = 5493398373255845863L;

	/**
	 * 测试
	 */
	@ApiField("paramone")
	private String paramone;

	/**
	 * 测试参数2
	 */
	@ApiField("paramtwo")
	private String paramtwo;

	public String getParamone() {
		return this.paramone;
	}
	public void setParamone(String paramone) {
		this.paramone = paramone;
	}

	public String getParamtwo() {
		return this.paramtwo;
	}
	public void setParamtwo(String paramtwo) {
		this.paramtwo = paramtwo;
	}

}
