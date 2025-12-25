package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenXlightConvertedEvent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adtarget.convertedevent.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:07:28
 */
public class AlipayDataDataserviceAdtargetConvertedeventBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4743415262515538483L;

	/** 
	 * 可选择的转化事件列表
	 */
	@ApiListField("data")
	@ApiField("open_xlight_converted_event")
	private List<OpenXlightConvertedEvent> data;

	public void setData(List<OpenXlightConvertedEvent> data) {
		this.data = data;
	}
	public List<OpenXlightConvertedEvent> getData( ) {
		return this.data;
	}

}
