package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据uid查询用户签约保证金信息
 *
 * @author auto create
 * @since 1.0, 2022-05-07 11:30:41
 */
public class AlipayFundBailOrderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4334885739941591832L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
