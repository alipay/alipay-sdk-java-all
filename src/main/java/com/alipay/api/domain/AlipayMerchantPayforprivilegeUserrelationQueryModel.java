package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询会员关系
 *
 * @author auto create
 * @since 1.0, 2020-07-01 11:15:56
 */
public class AlipayMerchantPayforprivilegeUserrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1521755861662292212L;

	/**
	 * 该字段已废弃，请使用user_id查询
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
