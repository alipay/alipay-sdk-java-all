package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付中断推进数据模型
 *
 * @author auto create
 * @since 1.0, 2020-04-03 14:12:17
 */
public class TransactionAuthenticationDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 7449829591292282815L;

	/**
	 * 支付打断推进方式
	 */
	@ApiListField("authentication_mechanisms")
	@ApiField("string")
	private List<String> authenticationMechanisms;

	/**
	 * 密码校验方式
	 */
	@ApiField("pin_format")
	private String pinFormat;

	public List<String> getAuthenticationMechanisms() {
		return this.authenticationMechanisms;
	}
	public void setAuthenticationMechanisms(List<String> authenticationMechanisms) {
		this.authenticationMechanisms = authenticationMechanisms;
	}

	public String getPinFormat() {
		return this.pinFormat;
	}
	public void setPinFormat(String pinFormat) {
		this.pinFormat = pinFormat;
	}

}
