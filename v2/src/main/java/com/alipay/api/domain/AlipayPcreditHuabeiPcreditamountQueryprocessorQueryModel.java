package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗用户签约协议查询
 *
 * @author auto create
 * @since 1.0, 2020-03-31 18:10:29
 */
public class AlipayPcreditHuabeiPcreditamountQueryprocessorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3321964171213959634L;

	/**
	 * 请求参数
	 */
	@ApiField("params")
	private TbapiQueryAmountBizContent params;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public TbapiQueryAmountBizContent getParams() {
		return this.params;
	}
	public void setParams(TbapiQueryAmountBizContent params) {
		this.params = params;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
