package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HmRecordSummaryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hmtask.recordsummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 11:12:57
 */
public class AlipayCommerceMedicalHmtaskRecordsummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8329421554128997331L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("hm_record_summary_item")
	private List<HmRecordSummaryItem> data;

	public void setData(List<HmRecordSummaryItem> data) {
		this.data = data;
	}
	public List<HmRecordSummaryItem> getData( ) {
		return this.data;
	}

}
