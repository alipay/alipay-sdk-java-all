package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息模型
 *
 * @author auto create
 * @since 1.0, 2018-07-20 14:21:27
 */
public class SubMerchantEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 3391863646258776692L;

	/**
	 * 开票商户pid，入驻支付即开票场景的时候，该字段必传
	 */
	@ApiField("pid")
	private String pid;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

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
