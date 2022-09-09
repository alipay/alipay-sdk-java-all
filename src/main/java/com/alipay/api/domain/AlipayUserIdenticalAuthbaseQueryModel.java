package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账号实名同人校验
 *
 * @author auto create
 * @since 1.0, 2019-07-22 11:00:11
 */
public class AlipayUserIdenticalAuthbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4184664798723639296L;

	/**
	 * 需要校验的userId，该参数需要用作请求路由
	 */
	@ApiField("base_user_id")
	private String baseUserId;

	/**
	 * 另一个需要校验的用户的支付宝账户ID
	 */
	@ApiField("comparator_user_id")
	private String comparatorUserId;

	public String getBaseUserId() {
		return this.baseUserId;
	}
	public void setBaseUserId(String baseUserId) {
		this.baseUserId = baseUserId;
	}

	public String getComparatorUserId() {
		return this.comparatorUserId;
	}
	public void setComparatorUserId(String comparatorUserId) {
		this.comparatorUserId = comparatorUserId;
	}

}
