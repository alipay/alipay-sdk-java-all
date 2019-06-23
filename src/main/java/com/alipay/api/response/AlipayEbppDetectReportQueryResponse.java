package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.detect.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-02 20:05:00
 */
public class AlipayEbppDetectReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3573328362563313556L;

	/** 
	 * 检测是否完成。true-是，false-否
	 */
	@ApiField("audit_done")
	private Boolean auditDone;

	/** 
	 * 检测是否通过。true-通过，false-不通过
	 */
	@ApiField("audit_pass")
	private Boolean auditPass;

	/** 
	 * 当audit_pass=false时，表示错误细节
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 外部业务标识。和入参一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAuditDone(Boolean auditDone) {
		this.auditDone = auditDone;
	}
	public Boolean getAuditDone( ) {
		return this.auditDone;
	}

	public void setAuditPass(Boolean auditPass) {
		this.auditPass = auditPass;
	}
	public Boolean getAuditPass( ) {
		return this.auditPass;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
