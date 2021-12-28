package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资主子户申请
 *
 * @author auto create
 * @since 1.0, 2021-12-27 20:14:24
 */
public class AlipayBossFncSubaccountAccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7423798158765321492L;

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
