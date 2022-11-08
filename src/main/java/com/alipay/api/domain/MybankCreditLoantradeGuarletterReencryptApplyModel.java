package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重新加密申请
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:38:06
 */
public class MybankCreditLoantradeGuarletterReencryptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8862225462781483652L;

	/**
	 * 新的公钥值
	 */
	@ApiField("apply_user_public_key")
	private String applyUserPublicKey;

	/**
	 * 保函单号
	 */
	@ApiField("guar_letter_order_no")
	private String guarLetterOrderNo;

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

	public String getApplyUserPublicKey() {
		return this.applyUserPublicKey;
	}
	public void setApplyUserPublicKey(String applyUserPublicKey) {
		this.applyUserPublicKey = applyUserPublicKey;
	}

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
