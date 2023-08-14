package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险扫描的公司信息结构对象
 *
 * @author auto create
 * @since 1.0, 2021-09-30 15:01:34
 */
public class RiskPartnerDTO extends AlipayObject {

	private static final long serialVersionUID = 5478689965539543454L;

	/**
	 * 公司名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * ou编码
	 */
	@ApiField("ou")
	private String ou;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOu() {
		return this.ou;
	}
	public void setOu(String ou) {
		this.ou = ou;
	}

}
