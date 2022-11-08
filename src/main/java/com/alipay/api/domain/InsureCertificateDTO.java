package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台保险受理凭证模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:21:45
 */
public class InsureCertificateDTO extends AlipayObject {

	private static final long serialVersionUID = 2547117956493564396L;

	/**
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 产品编码:YFX(运费险),JYBZ(交易保障险),SHX(售后险）
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 报价id
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 推荐流水id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

}
