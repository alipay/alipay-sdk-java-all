package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HmEquityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.userequity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 14:17:42
 */
public class AlipayCommerceMedicalHmUserequityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2257554444556193564L;

	/** 
	 * null
	 */
	@ApiListField("equity_info_list")
	@ApiField("hm_equity_info")
	private List<HmEquityInfo> equityInfoList;

	public void setEquityInfoList(List<HmEquityInfo> equityInfoList) {
		this.equityInfoList = equityInfoList;
	}
	public List<HmEquityInfo> getEquityInfoList( ) {
		return this.equityInfoList;
	}

}
