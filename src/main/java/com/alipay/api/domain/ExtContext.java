package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云企付，用于透传网络渠道返回的扩展信息。
 *
 * @author auto create
 * @since 1.0, 2020-10-19 19:09:30
 */
public class ExtContext extends AlipayObject {

	private static final long serialVersionUID = 1517517251467386486L;

	/**
	 * ebank_form，银行返回格式类型
	 */
	@ApiField("ebank_form")
	private String ebankForm;

	/**
	 * 机构返回描述
	 */
	@ApiField("return_message")
	private String returnMessage;

	public String getEbankForm() {
		return this.ebankForm;
	}
	public void setEbankForm(String ebankForm) {
		this.ebankForm = ebankForm;
	}

	public String getReturnMessage() {
		return this.returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

}
