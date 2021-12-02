package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoterDeleteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.relation.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-09 11:20:34
 */
public class AlipayCommerceOperationPromoterRelationDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835896473484157752L;

	/** 
	 * 门店推广员解除绑定处理结果
	 */
	@ApiField("promoter_delete_result")
	private PromoterDeleteInfo promoterDeleteResult;

	public void setPromoterDeleteResult(PromoterDeleteInfo promoterDeleteResult) {
		this.promoterDeleteResult = promoterDeleteResult;
	}
	public PromoterDeleteInfo getPromoterDeleteResult( ) {
		return this.promoterDeleteResult;
	}

}
