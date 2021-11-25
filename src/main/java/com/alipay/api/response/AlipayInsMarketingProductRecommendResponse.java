package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecomProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.product.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-31 22:55:25
 */
public class AlipayInsMarketingProductRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5542711848266552316L;

	/** 
	 * 产品列表
	 */
	@ApiListField("products")
	@ApiField("recom_product")
	private List<RecomProduct> products;

	/** 
	 * 推荐流水号
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	public void setProducts(List<RecomProduct> products) {
		this.products = products;
	}
	public List<RecomProduct> getProducts( ) {
		return this.products;
	}

	public void setRecomFlowNo(String recomFlowNo) {
		this.recomFlowNo = recomFlowNo;
	}
	public String getRecomFlowNo( ) {
		return this.recomFlowNo;
	}

}
