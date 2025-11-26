package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业联系方式模型
 *
 * @author auto create
 * @since 1.0, 2024-05-15 13:38:45
 */
public class EpContactInfo extends AlipayObject {

	private static final long serialVersionUID = 3119882536694235886L;

	/**
	 * 企业社会公开的联系方式列表
	 */
	@ApiListField("ep_contact")
	@ApiField("string")
	private List<String> epContact;

	public List<String> getEpContact() {
		return this.epContact;
	}
	public void setEpContact(List<String> epContact) {
		this.epContact = epContact;
	}

}
