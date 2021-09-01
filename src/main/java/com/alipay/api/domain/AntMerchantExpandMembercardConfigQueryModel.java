package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充配置查询
 *
 * @author auto create
 * @since 1.0, 2021-08-26 14:37:12
 */
public class AntMerchantExpandMembercardConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3796145911755482656L;

	/**
	 * 商家的安心充配置的唯一编号，
如果有可以传；不传优先pid查询
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

}
