package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefuseVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.bill.repay.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:12:48
 */
public class MybankCreditLoantradeBillRepayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211789479975458193L;

	/** 
	 * 受理成功时有值，trade单据号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	/** 
	 * 不可见不可用信息
	 */
	@ApiField("refuse_msg")
	private RefuseVo refuseMsg;

	/** 
	 * 是否处理成功，true(成功)，false(失败)。true表示咨询成功，但不代表可见可用
	 */
	@ApiField("success")
	private Boolean success;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

	public void setRefuseMsg(RefuseVo refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public RefuseVo getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
