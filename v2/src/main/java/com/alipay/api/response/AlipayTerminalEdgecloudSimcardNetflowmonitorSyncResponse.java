package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.terminal.edgecloud.simcard.netflowmonitor.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 19:37:48
 */
public class AlipayTerminalEdgecloudSimcardNetflowmonitorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346276624196469194L;

	/** 
	 * 同步文件所属日期。yyyymmdd或yyyymm
	 */
	@ApiField("biz_date")
	private String bizDate;

	/** 
	 * 本次同步文件的序列号
	 */
	@ApiField("biz_date_file_seq_id")
	private Long bizDateFileSeqId;

	/** 
	 * 同步结果id
	 */
	@ApiField("record_detail_id")
	private String recordDetailId;

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}
	public String getBizDate( ) {
		return this.bizDate;
	}

	public void setBizDateFileSeqId(Long bizDateFileSeqId) {
		this.bizDateFileSeqId = bizDateFileSeqId;
	}
	public Long getBizDateFileSeqId( ) {
		return this.bizDateFileSeqId;
	}

	public void setRecordDetailId(String recordDetailId) {
		this.recordDetailId = recordDetailId;
	}
	public String getRecordDetailId( ) {
		return this.recordDetailId;
	}

}
