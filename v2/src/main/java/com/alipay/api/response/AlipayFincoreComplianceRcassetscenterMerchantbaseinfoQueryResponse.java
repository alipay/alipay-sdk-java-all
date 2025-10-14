package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantBaseInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcassetscenter.merchantbaseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-16 10:36:49
 */
public class AlipayFincoreComplianceRcassetscenterMerchantbaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4718257342522242152L;

	/** 
	 * 商家基础信息响应列表
	 */
	@ApiListField("merchant_base_info_list")
	@ApiField("merchant_base_info_response")
	private List<MerchantBaseInfoResponse> merchantBaseInfoList;

	public void setMerchantBaseInfoList(List<MerchantBaseInfoResponse> merchantBaseInfoList) {
		this.merchantBaseInfoList = merchantBaseInfoList;
	}
	public List<MerchantBaseInfoResponse> getMerchantBaseInfoList( ) {
		return this.merchantBaseInfoList;
	}

}
