package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 漏洞详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:58
 */
public class AlipaySecurityProdAfsrcVulQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3787537772184683856L;

	/**
	 * 漏洞id
	 */
	@ApiField("vul_id")
	private Long vulId;

	public Long getVulId() {
		return this.vulId;
	}
	public void setVulId(Long vulId) {
		this.vulId = vulId;
	}

}
