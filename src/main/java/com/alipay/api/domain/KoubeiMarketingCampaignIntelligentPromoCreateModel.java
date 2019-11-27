package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案创建
 *
 * @author auto create
 * @since 1.0, 2018-01-18 14:43:41
 */
public class KoubeiMarketingCampaignIntelligentPromoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6314362378275416428L;

	/**
	 * 创建营销方案的上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动信息
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
