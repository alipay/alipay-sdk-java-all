package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户动态码回传信息模型。包含动态码的码值、过期时间等信息。
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:03:34
 */
public class MdCodeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1747219883149648415L;

	/**
	 * 本次回传动态码的状态：
SUCCESS: 本次发码成功
FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）
FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 动态码的码值：
code_status为SUCCESS时必填；
基于此码值生成条形码或二维码用于扫码核销。
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 当前动态码的过期（失效）时间：
 code_status为SUCCESS时必填。
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 商户回传动态码的时间戳。

即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。
	 */
	@ApiField("time_stamp")
	private Long timeStamp;

	public String getCodeStatus() {
		return this.codeStatus;
	}
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Long getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
