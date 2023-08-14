package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * BrandResult的列表
 *
 * @author auto create
 * @since 1.0, 2020-10-21 11:44:24
 */
public class MerchantBrandListResult extends AlipayObject {

	private static final long serialVersionUID = 6287839368253973547L;

	/**
	 * 商户已有品牌
	 */
	@ApiListField("brand_list_result")
	@ApiField("brand_result")
	private List<BrandResult> brandListResult;

	public List<BrandResult> getBrandListResult() {
		return this.brandListResult;
	}
	public void setBrandListResult(List<BrandResult> brandListResult) {
		this.brandListResult = brandListResult;
	}

}
