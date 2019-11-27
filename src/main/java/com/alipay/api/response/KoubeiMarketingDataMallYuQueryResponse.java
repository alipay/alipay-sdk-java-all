package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.yu.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataMallYuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8644324676389932524L;

	/** 
	 * 查询结果
	 */
	@ApiField("data_info")
	private String dataInfo;

	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}
	public String getDataInfo( ) {
		return this.dataInfo;
	}

}
