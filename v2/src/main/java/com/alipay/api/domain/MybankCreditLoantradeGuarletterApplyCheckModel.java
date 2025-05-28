package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函验真
 *
 * @author auto create
 * @since 1.0, 2023-09-18 20:02:15
 */
public class MybankCreditLoantradeGuarletterApplyCheckModel extends AlipayObject {

	private static final long serialVersionUID = 3621721149587552874L;

	/**
	 * 保函单号
	 */
	@ApiField("guar_letter_order_no")
	private String guarLetterOrderNo;

	/**
	 * 请求单号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	public String getGuarLetterOrderNo() {
		return this.guarLetterOrderNo;
	}
	public void setGuarLetterOrderNo(String guarLetterOrderNo) {
		this.guarLetterOrderNo = guarLetterOrderNo;
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
