package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云企付，用于透传网络渠道返回的扩展信息。
 *
 * @author auto create
 * @since 1.0, 2020-07-14 14:00:24
 */
public class ExtContext extends AlipayObject {

	private static final long serialVersionUID = 5428672416212724431L;

	/**
	 * ebank_form，银行返回格式类型
	 */
	@ApiField("ebank_form")
	private String ebankForm;

	public String getEbankForm() {
		return this.ebankForm;
	}
	public void setEbankForm(String ebankForm) {
		this.ebankForm = ebankForm;
	}

}
