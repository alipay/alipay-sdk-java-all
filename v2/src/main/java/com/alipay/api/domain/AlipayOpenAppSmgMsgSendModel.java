package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * to蚂蚁消息接口
 *
 * @author auto create
 * @since 1.0, 2018-03-08 17:44:40
 */
public class AlipayOpenAppSmgMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 5697428552193894893L;

	/**
	 * 5555
	 */
	@ApiField("numberone")
	private String numberone;

	/**
	 * 22
	 */
	@ApiField("numbertowe")
	private String numbertowe;

	public String getNumberone() {
		return this.numberone;
	}
	public void setNumberone(String numberone) {
		this.numberone = numberone;
	}

	public String getNumbertowe() {
		return this.numbertowe;
	}
	public void setNumbertowe(String numbertowe) {
		this.numbertowe = numbertowe;
	}

}
