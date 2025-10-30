package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 16:17:40
 */
public class AlipayPcreditLoanHonorRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8245674259279721291L;

	/** 
	 * 订单信息 (用于拉起收银台付款)，JSON格式，成功时返回
	 */
	@ApiField("order_info")
	private String orderInfo;

	/** 
	 * 还款交易流水号 (提交还款成功时返回)
	 */
	@ApiField("out_repay_no")
	private String outRepayNo;

	/** 
	 * 拒绝原因码
0-表示提交还款成功。result_code=0时必填
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因说明（失败必传）
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getOrderInfo( ) {
		return this.orderInfo;
	}

	public void setOutRepayNo(String outRepayNo) {
		this.outRepayNo = outRepayNo;
	}
	public String getOutRepayNo( ) {
		return this.outRepayNo;
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

}
