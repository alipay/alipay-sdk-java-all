package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息模型
 *
 * @author auto create
 * @since 1.0, 2018-01-19 10:21:21
 */
public class SubMerchantEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7564587387286245413L;

	/**
	 * 商户门店税号。
	 */
	@ApiField("register_no")
	private String registerNo;

	/**
	 * 商户门店全称。
	 */
	@ApiField("sub_m_name")
	private String subMName;

	/**
	 * 商户门店简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getRegisterNo() {
		return this.registerNo;
	}
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getSubMName() {
		return this.subMName;
	}
	public void setSubMName(String subMName) {
		this.subMName = subMName;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
