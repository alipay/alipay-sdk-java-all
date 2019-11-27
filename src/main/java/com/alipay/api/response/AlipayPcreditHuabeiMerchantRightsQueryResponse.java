package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.rights.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditHuabeiMerchantRightsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1179642359167863726L;

	/** 
	 * 名字
	 */
	@ApiField("aiouniya_name")
	private String aiouniyaName;

	/** 
	 * 数字
	 */
	@ApiField("aiouniya_number")
	private String aiouniyaNumber;

	public void setAiouniyaName(String aiouniyaName) {
		this.aiouniyaName = aiouniyaName;
	}
	public String getAiouniyaName( ) {
		return this.aiouniyaName;
	}

	public void setAiouniyaNumber(String aiouniyaNumber) {
		this.aiouniyaNumber = aiouniyaNumber;
	}
	public String getAiouniyaNumber( ) {
		return this.aiouniyaNumber;
	}

}
