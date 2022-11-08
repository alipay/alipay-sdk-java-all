package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在线协议-签约记录
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:07:39
 */
public class SignRecordLogVO extends AlipayObject {

	private static final long serialVersionUID = 4536393176682338427L;

	/**
	 * 签约的协议版本
	 */
	@ApiField("s_version")
	private String sVersion;

	/**
	 * 签约动作 S/U
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约/解约日期
	 */
	@ApiField("trans_date")
	private Date transDate;

	public String getsVersion() {
		return this.sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTransDate() {
		return this.transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

}
