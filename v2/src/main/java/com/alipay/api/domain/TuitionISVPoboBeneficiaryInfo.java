package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费VCC代付单收款方信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:27:21
 */
public class TuitionISVPoboBeneficiaryInfo extends AlipayObject {

	private static final long serialVersionUID = 4747821941648384988L;

	/**
	 * 收款人名称，留学场景下位学校名称，比如University of Oxford
	 */
	@ApiField("name")
	private String name;

	/**
	 * 网址、留学缴费VCC场景表示的是学校缴费网址
	 */
	@ApiField("website")
	private String website;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return this.website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}
