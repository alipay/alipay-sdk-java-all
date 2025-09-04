package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.usercancelaccount.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 17:07:38
 */
public class AlipayPcreditLoanHonorUsercancelaccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7688657714121557184L;

	/** 
	 * 注销失败描述
	 */
	@ApiField("logoff_err_desc")
	private String logoffErrDesc;

	/** 
	 * 注销受理是否成功，注销业务逻辑异步处理
	 */
	@ApiField("logoff_result")
	private Boolean logoffResult;

	/** 
	 * --增加注销结果？
1-注销成功--处理完成的结果
2-注销处理中--处理中
3-注销失败（不允许出现）
	 */
	@ApiField("logoff_status")
	private String logoffStatus;

	/** 
	 * 渠道侧受理单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setLogoffErrDesc(String logoffErrDesc) {
		this.logoffErrDesc = logoffErrDesc;
	}
	public String getLogoffErrDesc( ) {
		return this.logoffErrDesc;
	}

	public void setLogoffResult(Boolean logoffResult) {
		this.logoffResult = logoffResult;
	}
	public Boolean getLogoffResult( ) {
		return this.logoffResult;
	}

	public void setLogoffStatus(String logoffStatus) {
		this.logoffStatus = logoffStatus;
	}
	public String getLogoffStatus( ) {
		return this.logoffStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
