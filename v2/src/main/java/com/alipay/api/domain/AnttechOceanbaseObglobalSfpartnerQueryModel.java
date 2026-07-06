package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * salesforce查询伙伴接口
 *
 * @author auto create
 * @since 1.0, 2026-06-02 17:37:50
 */
public class AnttechOceanbaseObglobalSfpartnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8278531658381612176L;

	/**
	 * 伙伴完整名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 伙伴名称，用于模糊查询
	 */
	@ApiField("ep_name_keyword")
	private String epNameKeyword;

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpNameKeyword() {
		return this.epNameKeyword;
	}
	public void setEpNameKeyword(String epNameKeyword) {
		this.epNameKeyword = epNameKeyword;
	}

}
