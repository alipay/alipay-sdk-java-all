package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecycleAssessProductVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.mingertest.inspect response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 21:32:30
 */
public class AlipayCommerceRecycleOrderMingertestInspectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1871494657125218348L;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("assess_product")
	private RecycleAssessProductVO assessProduct;

	public void setAssessProduct(RecycleAssessProductVO assessProduct) {
		this.assessProduct = assessProduct;
	}
	public RecycleAssessProductVO getAssessProduct( ) {
		return this.assessProduct;
	}

}
