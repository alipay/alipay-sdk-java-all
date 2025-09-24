package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MdRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfmdm.records.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 04:57:39
 */
public class AlipayBossFncGfmdmRecordsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6812581482854358528L;

	/** 
	 * 列表类型，包含多条records
	 */
	@ApiListField("result_data")
	@ApiField("md_record")
	private List<MdRecord> resultData;

	/** 
	 * 错误码对应的详细错误信息，助于排查问题
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<MdRecord> resultData) {
		this.resultData = resultData;
	}
	public List<MdRecord> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
