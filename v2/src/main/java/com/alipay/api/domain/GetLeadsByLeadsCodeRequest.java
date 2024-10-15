package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据商机编码查询商机请求对象
 *
 * @author auto create
 * @since 1.0, 2024-03-06 09:54:54
 */
public class GetLeadsByLeadsCodeRequest extends AlipayObject {

	private static final long serialVersionUID = 6328422564356745529L;

	/**
	 * 海图商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

}
