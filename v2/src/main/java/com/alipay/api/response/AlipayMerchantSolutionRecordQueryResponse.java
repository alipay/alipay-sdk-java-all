package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipaySolutionRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-14 11:02:04
 */
public class AlipayMerchantSolutionRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8836846179512319382L;

	/** 
	 * 入参中的查询数据
	 */
	@ApiListField("record_data")
	@ApiField("alipay_solution_record")
	private List<AlipaySolutionRecord> recordData;

	/** 
	 * 标识当前记录的审核状态
	 */
	@ApiField("record_status_code")
	private String recordStatusCode;

	/** 
	 * 当前记录审核状态的中文描述
	 */
	@ApiField("record_status_desc")
	private String recordStatusDesc;

	/** 
	 * 标识唯一的解决方案
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public void setRecordData(List<AlipaySolutionRecord> recordData) {
		this.recordData = recordData;
	}
	public List<AlipaySolutionRecord> getRecordData( ) {
		return this.recordData;
	}

	public void setRecordStatusCode(String recordStatusCode) {
		this.recordStatusCode = recordStatusCode;
	}
	public String getRecordStatusCode( ) {
		return this.recordStatusCode;
	}

	public void setRecordStatusDesc(String recordStatusDesc) {
		this.recordStatusDesc = recordStatusDesc;
	}
	public String getRecordStatusDesc( ) {
		return this.recordStatusDesc;
	}

	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}
	public String getSolutionCode( ) {
		return this.solutionCode;
	}

}
