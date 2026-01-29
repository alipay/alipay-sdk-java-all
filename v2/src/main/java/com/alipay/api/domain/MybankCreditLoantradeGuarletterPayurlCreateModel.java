package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函缴费链接生成
 *
 * @author auto create
 * @since 1.0, 2025-08-19 20:05:55
 */
public class MybankCreditLoantradeGuarletterPayurlCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6192178356756746187L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

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

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

}
