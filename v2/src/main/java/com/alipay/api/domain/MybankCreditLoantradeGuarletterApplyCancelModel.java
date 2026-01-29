package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函取消
 *
 * @author auto create
 * @since 1.0, 2025-08-19 20:06:03
 */
public class MybankCreditLoantradeGuarletterApplyCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2426138518433797938L;

	/**
	 * 原开函申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 请求单号，标识每一笔不同的请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

}
