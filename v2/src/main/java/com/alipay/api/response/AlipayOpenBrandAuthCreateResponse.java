package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandFailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.brand.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 14:42:43
 */
public class AlipayOpenBrandAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1649712358669768417L;

	/** 
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * null
	 */
	@ApiListField("fail_reasons")
	@ApiField("brand_fail_response")
	private List<BrandFailResponse> failReasons;

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setFailReasons(List<BrandFailResponse> failReasons) {
		this.failReasons = failReasons;
	}
	public List<BrandFailResponse> getFailReasons( ) {
		return this.failReasons;
	}

}
