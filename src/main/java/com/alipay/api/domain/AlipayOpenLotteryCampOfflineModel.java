package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-活动下架
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:36:03
 */
public class AlipayOpenLotteryCampOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 8227551788458178639L;

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
