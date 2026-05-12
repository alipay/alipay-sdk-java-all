package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizVoucherConsultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 14:47:48
 */
public class AlipayCommerceTransportIndustryPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8122361844247944572L;

	/** 
	 * null
	 */
	@ApiListField("voucher_consult_list")
	@ApiField("biz_voucher_consult_info")
	private List<BizVoucherConsultInfo> voucherConsultList;

	public void setVoucherConsultList(List<BizVoucherConsultInfo> voucherConsultList) {
		this.voucherConsultList = voucherConsultList;
	}
	public List<BizVoucherConsultInfo> getVoucherConsultList( ) {
		return this.voucherConsultList;
	}

}
