package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lendapply.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:39
 */
public class AlipayPcreditLoanHonorLendapplyQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 6839386147175457736L;

	/** 
	 * 借款申请状态，枚举值：
1-审核中，2-成功，3-失败
	 */
	@ApiField("apply_status")
	private Long applyStatus;

	/** 
	 * 借款申请时间，时间戳毫秒
	 */
	@ApiField("apply_time")
	private Long applyTime;

	/** 
	 * 机构名称（简称），放款后需要对客展示的，不能脱敏
	 */
	@ApiField("institution_names")
	private String institutionNames;

	/** 
	 * 随身贷支用受理单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 拒绝原因码（失败必传）
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因说明（失败必传）
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 拒绝具体原因描述（失败必传）
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	public void setApplyStatus(Long applyStatus) {
		this.applyStatus = applyStatus;
	}
	public Long getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}
	public Long getApplyTime( ) {
		return this.applyTime;
	}

	public void setInstitutionNames(String institutionNames) {
		this.institutionNames = institutionNames;
	}
	public String getInstitutionNames( ) {
		return this.institutionNames;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}
	public String getRefuseMsgData( ) {
		return this.refuseMsgData;
	}

}
