package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherConsultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.voucher.result.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:07:57
 */
public class AlipayCommerceVoucherResultConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4277951132326493917L;

	/** 
	 * 最优券叠加总优惠金额，单位为元
	 */
	@ApiField("optimal_total_promo_amount")
	private String optimalTotalPromoAmount;

	/** 
	 * 优惠券咨询结果列表
	 */
	@ApiListField("voucher_consult_list")
	@ApiField("voucher_consult_info")
	private List<VoucherConsultInfo> voucherConsultList;

	public void setOptimalTotalPromoAmount(String optimalTotalPromoAmount) {
		this.optimalTotalPromoAmount = optimalTotalPromoAmount;
	}
	public String getOptimalTotalPromoAmount( ) {
		return this.optimalTotalPromoAmount;
	}

	public void setVoucherConsultList(List<VoucherConsultInfo> voucherConsultList) {
		this.voucherConsultList = voucherConsultList;
	}
	public List<VoucherConsultInfo> getVoucherConsultList( ) {
		return this.voucherConsultList;
	}

}
