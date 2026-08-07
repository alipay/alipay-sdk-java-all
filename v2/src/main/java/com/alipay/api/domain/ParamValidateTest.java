package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 11
 *
 * @author auto create
 * @since 1.0, 2023-08-02 19:50:29
 */
public class ParamValidateTest extends AlipayObject {

	private static final long serialVersionUID = 6281831873919433947L;

	/**
	 * 1
	 */
	@ApiField("test")
	private DialogueProcess test;

	public DialogueProcess getTest() {
		return this.test;
	}
	public void setTest(DialogueProcess test) {
		this.test = test;
	}

}
