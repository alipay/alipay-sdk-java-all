package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dialogonline.answer.push response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoMycarDialogonlineAnswerPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 6761822236969969256L;

	/** 
	 * 技师ID，支付宝对技师的唯一标识
	 */
	@ApiField("answer_id")
	private String answerId;

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerId( ) {
		return this.answerId;
	}

}
