package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.partner.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:29:43
 */
public class MybankCreditLoantradePartnerPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6347567911248736349L;

	/** 
	 * 备注
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 网商内部申请单编号
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	/** 
	 * 申请结果
	 */
	@ApiField("status")
	private String status;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}
	public String getInApplyNo( ) {
		return this.inApplyNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
