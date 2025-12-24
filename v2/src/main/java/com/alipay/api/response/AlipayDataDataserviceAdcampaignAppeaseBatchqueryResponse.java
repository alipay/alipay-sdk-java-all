package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayAppPageRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.appease.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 15:12:34
 */
public class AlipayDataDataserviceAdcampaignAppeaseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1223492291972777367L;

	/** 
	 * 小程序页面信息
	 */
	@ApiListField("data")
	@ApiField("alipay_app_page_res")
	private List<AlipayAppPageRes> data;

	public void setData(List<AlipayAppPageRes> data) {
		this.data = data;
	}
	public List<AlipayAppPageRes> getData( ) {
		return this.data;
	}

}
