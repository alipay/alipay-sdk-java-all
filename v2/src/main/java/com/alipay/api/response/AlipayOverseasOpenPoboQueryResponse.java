package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndrPoboAuthRecordDTO;
import com.alipay.api.domain.IndrPoboDebitRecordDTO;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-12 11:57:56
 */
public class AlipayOverseasOpenPoboQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3658591511793123498L;

	/** 
	 * auth 记录列表
	 */
	@ApiListField("auth_records")
	@ApiField("indr_pobo_auth_record_d_t_o")
	private List<IndrPoboAuthRecordDTO> authRecords;

	/** 
	 * 最新差错记录
	 */
	@ApiField("latest_debit_record")
	private IndrPoboDebitRecordDTO latestDebitRecord;

	/** 
	 * 支付方式
	 */
	@ApiField("payment_type")
	private String paymentType;

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

	public void setLatestDebitRecord(IndrPoboDebitRecordDTO latestDebitRecord) {
		this.latestDebitRecord = latestDebitRecord;
	}
	public IndrPoboDebitRecordDTO getLatestDebitRecord( ) {
		return this.latestDebitRecord;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentType( ) {
		return this.paymentType;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
