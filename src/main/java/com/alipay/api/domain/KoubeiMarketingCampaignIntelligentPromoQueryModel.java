package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 只能营销方案详情查询
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:03:01
 */
public class KoubeiMarketingCampaignIntelligentPromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8178283763133587958L;

	/**
	 * 操作人员上下文
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够复杂。主要为了定位数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动id
	 */
	@ApiField("promo_id")
	private String promoId;

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

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}
