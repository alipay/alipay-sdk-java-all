package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票企业信息校验结果
 *
 * @author auto create
 * @since 1.0, 2025-06-12 14:48:45
 */
public class ProductInvoiceCheckResult extends AlipayObject {

	private static final long serialVersionUID = 7342954267713346834L;

	/**
	 * 企业信息校验的校验项编码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 异常校验项的校验时间
	 */
	@ApiField("check_time")
	private Date checkTime;

	/**
	 * 企业信息校验的校验异常编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 企业信息异常校验的信息提示
	 */
	@ApiField("message")
	private String message;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
