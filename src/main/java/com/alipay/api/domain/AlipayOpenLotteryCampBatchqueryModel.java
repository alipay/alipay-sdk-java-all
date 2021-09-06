package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-活动批量搜索
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:35:52
 */
public class AlipayOpenLotteryCampBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5786733497857562669L;

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
