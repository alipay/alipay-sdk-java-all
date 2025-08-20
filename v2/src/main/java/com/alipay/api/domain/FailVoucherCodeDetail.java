package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导入失败券码详情
 *
 * @author auto create
 * @since 1.0, 2023-01-12 10:32:30
 */
public class FailVoucherCodeDetail extends AlipayObject {

	private static final long serialVersionUID = 7125622286219615735L;

	/**
	 * 券码导入失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 券码导入失败错误原因描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 导入失败的券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
