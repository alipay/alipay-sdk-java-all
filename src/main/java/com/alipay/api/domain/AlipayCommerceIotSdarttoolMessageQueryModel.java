package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息查询
 *
 * @author auto create
 * @since 1.0, 2020-08-04 21:41:48
 */
public class AlipayCommerceIotSdarttoolMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6364725313321683519L;

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
