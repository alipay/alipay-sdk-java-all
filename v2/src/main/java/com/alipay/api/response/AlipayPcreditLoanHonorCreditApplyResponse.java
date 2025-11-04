package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.credit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:12:38
 */
public class AlipayPcreditLoanHonorCreditApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6429979658642321787L;

	/** 
	 * 授信结果，1-审核中，2-通过，3-拒绝
	 */
	@ApiField("apply_status")
	private Long applyStatus;

	/** 
	 * 渠道方授信流水号(授信审核中或通过时必传)
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 拒绝原因码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 授信拒绝管控期，单位：秒，天
	 */
	@ApiField("refuse_control_time")
	private Long refuseControlTime;

	/** 
	 * 拒绝原因说明
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 拒绝具体原因说明
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	public void setApplyStatus(Long applyStatus) {
		this.applyStatus = applyStatus;
	}
	public Long getApplyStatus( ) {
		return this.applyStatus;
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

	public void setRefuseControlTime(Long refuseControlTime) {
		this.refuseControlTime = refuseControlTime;
	}
	public Long getRefuseControlTime( ) {
		return this.refuseControlTime;
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
