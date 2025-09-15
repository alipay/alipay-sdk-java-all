package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayAppRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.app.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 21:02:34
 */
public class AlipayDataDataserviceAdcampaignAppBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6515722261733494127L;

	/** 
	 * 小程序信息
	 */
	@ApiListField("data")
	@ApiField("alipay_app_res")
	private List<AlipayAppRes> data;

	public void setData(List<AlipayAppRes> data) {
		this.data = data;
	}
	public List<AlipayAppRes> getData( ) {
		return this.data;
	}

}
