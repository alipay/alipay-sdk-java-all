package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案修改
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:55
 */
public class KoubeiMarketingCampaignIntelligentPromoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5175827425122676857L;

	/**
	 * 操作人员上下文
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 方案信息
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public IntelligentPromo getPromo() {
		return this.promo;
	}
	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}

}
