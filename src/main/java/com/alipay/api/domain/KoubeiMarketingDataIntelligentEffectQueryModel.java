package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动效果预测
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:49
 */
public class KoubeiMarketingDataIntelligentEffectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6155562719879893311L;

	/**
	 * 操作人上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够复杂，方便排查数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动的详情，用于咨询的元数据
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
