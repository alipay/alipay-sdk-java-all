package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:54:31
 */
public class AlipayMarketingVoucherStockUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5142811299989149127L;

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
