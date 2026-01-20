package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SportsRunRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.runrecord.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 15:17:43
 */
public class AlipayCommerceEducateSportsRunrecordBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2311361374471215711L;

	/** 
	 * null
	 */
	@ApiListField("run_record_list")
	@ApiField("sports_run_record")
	private List<SportsRunRecord> runRecordList;

	/** 
	 * 总条数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRunRecordList(List<SportsRunRecord> runRecordList) {
		this.runRecordList = runRecordList;
	}
	public List<SportsRunRecord> getRunRecordList( ) {
		return this.runRecordList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
