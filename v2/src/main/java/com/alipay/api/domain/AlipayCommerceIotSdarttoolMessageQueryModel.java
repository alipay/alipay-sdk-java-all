package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息查询
 *
 * @author auto create
 * @since 1.0, 2023-06-01 16:31:05
 */
public class AlipayCommerceIotSdarttoolMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5225232826391592792L;

	/**
	 * 消息ID
	 */
	@ApiField("message_no")
	private String messageNo;

	public String getMessageNo() {
		return this.messageNo;
	}
	public void setMessageNo(String messageNo) {
		this.messageNo = messageNo;
	}

}
