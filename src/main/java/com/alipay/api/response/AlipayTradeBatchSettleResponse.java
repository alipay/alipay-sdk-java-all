package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.settle response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayTradeBatchSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 3656364975937679585L;

	/** 
	 * 结算受理时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 业务结果码。

ACCEPT_SUCCESS：受理成功；
ACCEPT_FAIL：受理失败；
SUCCESS：结算处理成功；
FAIL：结算处理失败；
SYSTEM_EXCEPTION：系统异常
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
