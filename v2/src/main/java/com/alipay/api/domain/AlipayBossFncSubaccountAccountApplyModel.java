package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资主子户申请
 *
 * @author auto create
 * @since 1.0, 2022-01-19 22:32:22
 */
public class AlipayBossFncSubaccountAccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8257729433162813981L;

	/**
	 * 子户创建申请
	 */
	@ApiField("apply_sub_account_and_bind_order")
	private ApplySubAccountAndBindOrder applySubAccountAndBindOrder;

	public ApplySubAccountAndBindOrder getApplySubAccountAndBindOrder() {
		return this.applySubAccountAndBindOrder;
	}
	public void setApplySubAccountAndBindOrder(ApplySubAccountAndBindOrder applySubAccountAndBindOrder) {
		this.applySubAccountAndBindOrder = applySubAccountAndBindOrder;
	}

}
