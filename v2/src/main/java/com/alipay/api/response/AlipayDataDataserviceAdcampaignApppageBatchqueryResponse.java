package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayAppPageRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.apppage.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 18:02:34
 */
public class AlipayDataDataserviceAdcampaignApppageBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8438276645822787862L;

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
