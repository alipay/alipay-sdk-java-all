package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoterCreateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-03 11:14:42
 */
public class AlipayCommerceOperationPromoterRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4617191622878429473L;

	/** 
	 * 门店推广员创建处理结果
	 */
	@ApiField("promoter_create_result")
	private PromoterCreateInfo promoterCreateResult;

	public void setPromoterCreateResult(PromoterCreateInfo promoterCreateResult) {
		this.promoterCreateResult = promoterCreateResult;
	}
	public PromoterCreateInfo getPromoterCreateResult( ) {
		return this.promoterCreateResult;
	}

}
