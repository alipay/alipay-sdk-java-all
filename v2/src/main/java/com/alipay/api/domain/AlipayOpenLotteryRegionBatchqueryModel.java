package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-商家专区批量查询
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:35:57
 */
public class AlipayOpenLotteryRegionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1514887764119227946L;

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
