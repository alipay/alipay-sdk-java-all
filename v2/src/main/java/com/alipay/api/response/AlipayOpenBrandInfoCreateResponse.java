package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandFailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.brand.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1627284224785786261L;

	/** 
	 * 编辑时需要透传，需要记录下来
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
