package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票邮寄ID获取当前的邮寄信息
 *
 * @author auto create
 * @since 1.0, 2020-11-27 14:07:10
 */
public class AlipayBossFncInvoiceMailinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1636644122458295112L;

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
