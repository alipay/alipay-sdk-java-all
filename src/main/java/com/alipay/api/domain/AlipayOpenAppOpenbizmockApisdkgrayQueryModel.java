package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度组件SDK线上验证测试接口
 *
 * @author auto create
 * @since 1.0, 2020-04-20 14:05:38
 */
public class AlipayOpenAppOpenbizmockApisdkgrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7797952374337333735L;

	/**
	 * 测试接口，参数随便配置
	 */
	@ApiField("input_param")
	private String inputParam;

	public String getInputParam() {
		return this.inputParam;
	}
	public void setInputParam(String inputParam) {
		this.inputParam = inputParam;
	}

}
