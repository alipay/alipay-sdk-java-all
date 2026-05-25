package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizCard;
import com.alipay.api.domain.BizGrantPlan;
import com.alipay.api.domain.BizVoucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.carddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AlipayCommerceTransportIndustryCarddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3642393589634357238L;

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
