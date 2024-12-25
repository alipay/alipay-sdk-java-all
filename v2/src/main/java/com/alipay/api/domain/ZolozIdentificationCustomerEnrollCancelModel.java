package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除匿名注册的留底照片
 *
 * @author auto create
 * @since 1.0, 2023-03-03 16:09:10
 */
public class ZolozIdentificationCustomerEnrollCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8259878611838278482L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
