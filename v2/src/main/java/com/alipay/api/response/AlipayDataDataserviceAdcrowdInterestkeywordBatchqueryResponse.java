package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenXlightCrowd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcrowd.interestkeyword.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:07:29
 */
public class AlipayDataDataserviceAdcrowdInterestkeywordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1191924332936965387L;

	/** 
	 * 该参数表示行为兴趣人群，包含人群包id，名称，覆盖人群
	 */
	@ApiListField("data")
	@ApiField("open_xlight_crowd")
	private List<OpenXlightCrowd> data;

	public void setData(List<OpenXlightCrowd> data) {
		this.data = data;
	}
	public List<OpenXlightCrowd> getData( ) {
		return this.data;
	}

}
