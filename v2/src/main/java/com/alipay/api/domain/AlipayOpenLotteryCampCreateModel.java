package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-创建活动
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:36:41
 */
public class AlipayOpenLotteryCampCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8251645224817416267L;

	/**
	 * 环境
	 */
	@ApiField("env")
	private String env;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
