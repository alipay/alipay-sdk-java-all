package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充退卡咨询
 *
 * @author auto create
 * @since 1.0, 2022-04-24 14:03:08
 */
public class AntMerchantExpandMembercardRefundConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5179245152562963415L;

	/**
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
