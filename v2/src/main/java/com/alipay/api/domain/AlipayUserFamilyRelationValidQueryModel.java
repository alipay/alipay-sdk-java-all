package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户是否存在有效家庭
 *
 * @author auto create
 * @since 1.0, 2023-01-03 18:10:11
 */
public class AlipayUserFamilyRelationValidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3524885927646211199L;

	/**
	 * 是否需要强一致查询，无特殊要求传false即可。
	 */
	@ApiField("strict")
	private Boolean strict;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getStrict() {
		return this.strict;
	}
	public void setStrict(Boolean strict) {
		this.strict = strict;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
