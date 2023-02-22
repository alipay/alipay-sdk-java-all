package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-发货
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:35:40
 */
public class AlipayOpenLotteryCampdeliverModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1416416835625797769L;

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
