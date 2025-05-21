package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户多收多贷准入查询
 *
 * @author auto create
 * @since 1.0, 2019-11-12 14:29:43
 */
public class MybankCreditCreditriskDsddAdmitConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7688954472395845689L;

	/**
	 * 支付宝SMID
	 */
	@ApiField("smid")
	private String smid;

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
