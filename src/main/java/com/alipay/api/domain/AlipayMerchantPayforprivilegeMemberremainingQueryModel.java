package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员充值余额查询
 *
 * @author auto create
 * @since 1.0, 2021-04-19 16:39:40
 */
public class AlipayMerchantPayforprivilegeMemberremainingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3344765398491328626L;

	/**
	 * 该字段已废弃，请通过user_id查询
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
