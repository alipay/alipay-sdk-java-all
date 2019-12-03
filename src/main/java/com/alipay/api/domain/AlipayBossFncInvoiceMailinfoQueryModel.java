package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票邮寄ID获取当前的邮寄信息
 *
 * @author auto create
 * @since 1.0, 2019-10-23 15:45:57
 */
public class AlipayBossFncInvoiceMailinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135251656963872729L;

	/**
	 * 邮寄ID，唯一性ID，邮寄信息表唯一主键ID
	 */
	@ApiField("mail_id")
	private String mailId;

	public String getMailId() {
		return this.mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

}
