package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SalesforceCouponInstanceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcloudfeereduction.instances.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 14:42:55
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionInstancesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7318148315646256869L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("salesforce_coupon_instance_response")
	private List<SalesforceCouponInstanceResponse> result;

	public void setResult(List<SalesforceCouponInstanceResponse> result) {
		this.result = result;
	}
	public List<SalesforceCouponInstanceResponse> getResult( ) {
		return this.result;
	}

}
