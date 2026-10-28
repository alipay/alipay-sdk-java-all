package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NowpayProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.product.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 11:48:00
 */
public class AlipayAipayNowpayProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691276662113436341L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("nowpay_product")
	private List<NowpayProduct> items;

	public void setItems(List<NowpayProduct> items) {
		this.items = items;
	}
	public List<NowpayProduct> getItems( ) {
		return this.items;
	}

}
