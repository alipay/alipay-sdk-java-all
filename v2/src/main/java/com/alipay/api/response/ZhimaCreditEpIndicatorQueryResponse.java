package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpRiskIndicatorModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 10:07:33
 */
public class ZhimaCreditEpIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3268666126959238111L;

	/** 
	 * 数据集
	 */
	@ApiListField("array_data")
	@ApiField("ep_risk_indicator_model")
	private List<EpRiskIndicatorModel> arrayData;

	/** 
	 * 企业查询key
	 */
	@ApiField("company_key")
	private String companyKey;

	public void setArrayData(List<EpRiskIndicatorModel> arrayData) {
		this.arrayData = arrayData;
	}
	public List<EpRiskIndicatorModel> getArrayData( ) {
		return this.arrayData;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

}
