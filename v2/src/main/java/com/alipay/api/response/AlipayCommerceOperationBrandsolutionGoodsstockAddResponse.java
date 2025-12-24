package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnrolledMerchantResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.brandsolution.goodsstock.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:32:43
 */
public class AlipayCommerceOperationBrandsolutionGoodsstockAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4342999798929361523L;

	/** 
	 * 批量修改结果
	 */
	@ApiListField("data")
	@ApiField("enrolled_merchant_result")
	private List<EnrolledMerchantResult> data;

	public void setData(List<EnrolledMerchantResult> data) {
		this.data = data;
	}
	public List<EnrolledMerchantResult> getData( ) {
		return this.data;
	}

}
