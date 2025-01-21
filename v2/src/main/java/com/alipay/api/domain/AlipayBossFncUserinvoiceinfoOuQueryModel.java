package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据机构代码(OU的简码，例如Z50,K53)获取机构相关的开票资料
 *
 * @author auto create
 * @since 1.0, 2020-01-08 14:36:14
 */
public class AlipayBossFncUserinvoiceinfoOuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6428411265898117289L;

	/**
	 * 机构代码
	 */
	@ApiField("inst_id")
	private String instId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
