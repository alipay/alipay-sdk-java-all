package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资主子户申请
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:31
 */
public class AlipayBossFncSubaccountAccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8264899572474694122L;

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
