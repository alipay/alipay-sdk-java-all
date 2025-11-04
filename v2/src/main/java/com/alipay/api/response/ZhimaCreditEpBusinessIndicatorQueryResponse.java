package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpBusinessIndicator;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.business.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 11:02:41
 */
public class ZhimaCreditEpBusinessIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3568313386661822292L;

	/** 
	 * null
	 */
	@ApiListField("array_data")
	@ApiField("ep_business_indicator")
	private List<EpBusinessIndicator> arrayData;

	/** 
	 * 业务关键词
	 */
	@ApiField("business_key")
	private String businessKey;

	public void setArrayData(List<EpBusinessIndicator> arrayData) {
		this.arrayData = arrayData;
	}
	public List<EpBusinessIndicator> getArrayData( ) {
		return this.arrayData;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
	public String getBusinessKey( ) {
		return this.businessKey;
	}

}
