package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizCard;
import com.alipay.api.domain.BizGrantPlan;
import com.alipay.api.domain.BizVoucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.card.receive response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 16:37:54
 */
public class AlipayCommerceTransportIndustryCardReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435477956493382539L;

	/** 
	 * 卡详情
	 */
	@ApiField("card")
	private BizCard card;

	/** 
	 * null
	 */
	@ApiListField("grant_plan_list")
	@ApiField("biz_grant_plan")
	private List<BizGrantPlan> grantPlanList;

	/** 
	 * null
	 */
	@ApiListField("voucher_list")
	@ApiField("biz_voucher")
	private List<BizVoucher> voucherList;

	public void setCard(BizCard card) {
		this.card = card;
	}
	public BizCard getCard( ) {
		return this.card;
	}

	public void setGrantPlanList(List<BizGrantPlan> grantPlanList) {
		this.grantPlanList = grantPlanList;
	}
	public List<BizGrantPlan> getGrantPlanList( ) {
		return this.grantPlanList;
	}

	public void setVoucherList(List<BizVoucher> voucherList) {
		this.voucherList = voucherList;
	}
	public List<BizVoucher> getVoucherList( ) {
		return this.voucherList;
	}

}
