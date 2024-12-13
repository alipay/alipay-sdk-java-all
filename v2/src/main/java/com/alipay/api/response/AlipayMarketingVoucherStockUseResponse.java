package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayMarketingVoucherStockUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3833257843393473958L;

	/** 
	 * 返回如果为空，说明没有核销成功；如果不为空，长度一定是28，表示的是核销序号。该值唯一对应一个券码，即入参中的entity_no
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
