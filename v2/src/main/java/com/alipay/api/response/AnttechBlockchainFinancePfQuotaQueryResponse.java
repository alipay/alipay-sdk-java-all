package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.pf.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:13
 */
public class AnttechBlockchainFinancePfQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629932698874978997L;

	/** 
	 * 额度协议书编号
	 */
	@ApiField("agrm_bk_no")
	private String agrmBkNo;

	/** 
	 * 授信额度
	 */
	@ApiField("cr_limit")
	private String crLimit;

	/** 
	 * 额度编号
	 */
	@ApiField("lmt_no")
	private String lmtNo;

	/** 
	 * 额度状态
	 */
	@ApiField("lmt_status")
	private String lmtStatus;

	/** 
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/** 
	 * 剩余额度
	 */
	@ApiField("remain_limit")
	private String remainLimit;

	/** 
	 * 交易流水号
	 */
	@ApiField("trans_no")
	private String transNo;

	public void setAgrmBkNo(String agrmBkNo) {
		this.agrmBkNo = agrmBkNo;
	}
	public String getAgrmBkNo( ) {
		return this.agrmBkNo;
	}

	public void setCrLimit(String crLimit) {
		this.crLimit = crLimit;
	}
	public String getCrLimit( ) {
		return this.crLimit;
	}

	public void setLmtNo(String lmtNo) {
		this.lmtNo = lmtNo;
	}
	public String getLmtNo( ) {
		return this.lmtNo;
	}

	public void setLmtStatus(String lmtStatus) {
		this.lmtStatus = lmtStatus;
	}
	public String getLmtStatus( ) {
		return this.lmtStatus;
	}

	public void setParm(String parm) {
		this.parm = parm;
	}
	public String getParm( ) {
		return this.parm;
	}

	public void setRemainLimit(String remainLimit) {
		this.remainLimit = remainLimit;
	}
	public String getRemainLimit( ) {
		return this.remainLimit;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getTransNo( ) {
		return this.transNo;
	}

}
