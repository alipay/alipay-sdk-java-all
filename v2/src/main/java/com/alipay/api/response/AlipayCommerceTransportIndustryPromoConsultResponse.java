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
 * @since 1.0, 2026-09-28 11:32:56
 */
public class AlipayCommerceTransportIndustryPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7811514626487747533L;

	/** 
	 * 收银台订单信息文案
	 */
	@ApiField("cashier_order_info_text")
	private String cashierOrderInfoText;

	/** 
	 * null
	 */
	@ApiListField("voucher_consult_list")
	@ApiField("biz_voucher_consult_info")
	private List<BizVoucherConsultInfo> voucherConsultList;

	public void setCashierOrderInfoText(String cashierOrderInfoText) {
		this.cashierOrderInfoText = cashierOrderInfoText;
	}
	public String getCashierOrderInfoText( ) {
		return this.cashierOrderInfoText;
	}

	public void setVoucherConsultList(List<BizVoucherConsultInfo> voucherConsultList) {
		this.voucherConsultList = voucherConsultList;
	}
	public List<BizVoucherConsultInfo> getVoucherConsultList( ) {
		return this.voucherConsultList;
	}

}
