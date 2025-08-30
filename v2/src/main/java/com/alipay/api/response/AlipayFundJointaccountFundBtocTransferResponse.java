package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.fund.btoc.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:57
 */
public class AlipayFundJointaccountFundBtocTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 2212664869365576941L;

	/** 
	 * 支付宝侧转账订单号
	 */
	@ApiField("biz_trans_id")
	private String bizTransId;

	/** 
	 * 商户侧单号（与当前请求参数中传入值保持一致）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 转账单据状态<br>
SUCCESS：成功<br>
FAIL：失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 转账时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("trans_date")
	private String transDate;

	public void setBizTransId(String bizTransId) {
		this.bizTransId = bizTransId;
	}
	public String getBizTransId( ) {
		return this.bizTransId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransDate( ) {
		return this.transDate;
	}

}
