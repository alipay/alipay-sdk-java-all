package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付取消
 *
 * @author auto create
 * @since 1.0, 2025-10-20 09:57:28
 */
public class AlipayBossFncGfsettleprodPrepaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3688372819769596679L;

	/**
	 * 预付逆向入参
	 */
	@ApiField("prepay_apply_cancel_order")
	private PrePayApplyCancelOrder prepayApplyCancelOrder;

	public PrePayApplyCancelOrder getPrepayApplyCancelOrder() {
		return this.prepayApplyCancelOrder;
	}
	public void setPrepayApplyCancelOrder(PrePayApplyCancelOrder prepayApplyCancelOrder) {
		this.prepayApplyCancelOrder = prepayApplyCancelOrder;
	}

}
