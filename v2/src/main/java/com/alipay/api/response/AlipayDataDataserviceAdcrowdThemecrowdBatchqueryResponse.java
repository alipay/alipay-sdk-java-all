package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenXlightCrowd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcrowd.themecrowd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:07:29
 */
public class AlipayDataDataserviceAdcrowdThemecrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4868619546731964229L;

	/** 
	 * 返回人群包信息，包括id，名称和覆盖人群数量
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
