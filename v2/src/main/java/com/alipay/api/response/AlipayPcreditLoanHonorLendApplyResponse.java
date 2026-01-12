package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lend.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 13:47:38
 */
public class AlipayPcreditLoanHonorLendApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5151831675267718775L;

	/** 
	 * 随身贷借款受理单号(受理成功后才有)
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 拒绝原因码(若成功默认返回0)
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因说明
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 拒绝具体原因描述
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

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
