package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试老流程page类接口创建01
 *
 * @author auto create
 * @since 1.0, 2024-12-03 19:30:16
 */
public class AlipaySecurityDataOpenapipageRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4357989473477263487L;

	/**
	 * 字符串
	 */
	@ApiField("input_param_01")
	private String inputParam01;

	public String getInputParam01() {
		return this.inputParam01;
	}
	public void setInputParam01(String inputParam01) {
		this.inputParam01 = inputParam01;
	}

}
