package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:55
 */
public class AnttechBlockchainFinanceFsupvTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4298946169115368471L;

	/** 
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/** 
	 * 被管控方脱敏登录号
	 */
	@ApiField("supervised_desensitized_access_no")
	private String supervisedDesensitizedAccessNo;

	/** 
	 * 资金管控专户号
	 */
	@ApiField("supervised_special_account_no")
	private String supervisedSpecialAccountNo;

	/** 
	 * 资金管控协议编号
	 */
	@ApiField("supv_agreement_no")
	private String supvAgreementNo;

	/** 
	 * 资金管控终止日期
	 */
	@ApiField("supv_end")
	private Date supvEnd;

	/** 
	 * 资金管控开始时间
	 */
	@ApiField("supv_start")
	private Date supvStart;

	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}
	public String getFundSupvTaskId( ) {
		return this.fundSupvTaskId;
	}

	public void setSupervisedDesensitizedAccessNo(String supervisedDesensitizedAccessNo) {
		this.supervisedDesensitizedAccessNo = supervisedDesensitizedAccessNo;
	}
	public String getSupervisedDesensitizedAccessNo( ) {
		return this.supervisedDesensitizedAccessNo;
	}

	public void setSupervisedSpecialAccountNo(String supervisedSpecialAccountNo) {
		this.supervisedSpecialAccountNo = supervisedSpecialAccountNo;
	}
	public String getSupervisedSpecialAccountNo( ) {
		return this.supervisedSpecialAccountNo;
	}

	public void setSupvAgreementNo(String supvAgreementNo) {
		this.supvAgreementNo = supvAgreementNo;
	}
	public String getSupvAgreementNo( ) {
		return this.supvAgreementNo;
	}

	public void setSupvEnd(Date supvEnd) {
		this.supvEnd = supvEnd;
	}
	public Date getSupvEnd( ) {
		return this.supvEnd;
	}

	public void setSupvStart(Date supvStart) {
		this.supvStart = supvStart;
	}
	public Date getSupvStart( ) {
		return this.supvStart;
	}

}
