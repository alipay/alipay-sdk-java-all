package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付及对应预付占用撤销
 *
 * @author auto create
 * @since 1.0, 2025-10-20 09:57:18
 */
public class AlipayBossFncGfsettleprodPayandprepayreverseCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2486153114986495199L;

	/**
	 * 应付撤回参数
	 */
	@ApiField("active_pay_and_prepay_reverse_cancel_open_api_order")
	private ActivePayAndPrepayReverseCancelOpenApiOrder activePayAndPrepayReverseCancelOpenApiOrder;

	public ActivePayAndPrepayReverseCancelOpenApiOrder getActivePayAndPrepayReverseCancelOpenApiOrder() {
		return this.activePayAndPrepayReverseCancelOpenApiOrder;
	}
	public void setActivePayAndPrepayReverseCancelOpenApiOrder(ActivePayAndPrepayReverseCancelOpenApiOrder activePayAndPrepayReverseCancelOpenApiOrder) {
		this.activePayAndPrepayReverseCancelOpenApiOrder = activePayAndPrepayReverseCancelOpenApiOrder;
	}

}
