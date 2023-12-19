package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpeechRecordReportFailDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.iotdata.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 14:31:47
 */
public class AlipayMerchantIndirectIotdataBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2657891699719548522L;

	/** 
	 * 失败记录详情
	 */
	@ApiListField("fail_detail")
	@ApiField("speech_record_report_fail_detail")
	private List<SpeechRecordReportFailDetail> failDetail;

	/** 
	 * 上报成功条数
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailDetail(List<SpeechRecordReportFailDetail> failDetail) {
		this.failDetail = failDetail;
	}
	public List<SpeechRecordReportFailDetail> getFailDetail( ) {
		return this.failDetail;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
