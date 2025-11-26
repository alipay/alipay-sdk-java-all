package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videorecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 15:47:40
 */
public class AlipayCommerceMedicalHdfrtcVideorecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295582715463767924L;

	/** 
	 * 观看录播提示信息
	 */
	@ApiField("record_watch_notice")
	private String recordWatchNotice;

	/** 
	 * 录播信息列表
	 */
	@ApiListField("records_info")
	@ApiField("record_info")
	private List<RecordInfo> recordsInfo;

	public void setRecordWatchNotice(String recordWatchNotice) {
		this.recordWatchNotice = recordWatchNotice;
	}
	public String getRecordWatchNotice( ) {
		return this.recordWatchNotice;
	}

	public void setRecordsInfo(List<RecordInfo> recordsInfo) {
		this.recordsInfo = recordsInfo;
	}
	public List<RecordInfo> getRecordsInfo( ) {
		return this.recordsInfo;
	}

}
