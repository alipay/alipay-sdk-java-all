package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndrPoboAuthRecordDTO;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 15:07:22
 */
public class AlipayOverseasOpenPoboQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3728255466235398989L;

	/** 
	 * auth 记录列表
	 */
	@ApiListField("auth_records")
	@ApiField("indr_pobo_auth_record_d_t_o")
	private List<IndrPoboAuthRecordDTO> authRecords;

	/** 
	 * 调用结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setAuthRecords(List<IndrPoboAuthRecordDTO> authRecords) {
		this.authRecords = authRecords;
	}
	public List<IndrPoboAuthRecordDTO> getAuthRecords( ) {
		return this.authRecords;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
