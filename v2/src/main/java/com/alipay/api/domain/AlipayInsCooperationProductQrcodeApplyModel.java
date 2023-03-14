package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （快捷投保）生成产品二维码
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:16
 */
public class AlipayInsCooperationProductQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1763358914539726433L;

	/**
	 * 保险代理人在保险公司的惟一ID，数据来自保险公司内部管理系统
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 代理人手机号码
	 */
	@ApiField("agent_phone")
	private String agentPhone;

	/**
	 * 保险公司在蚂蚁保险平台的惟一ID，由蚂蚁保险平台分配。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 产品编码，蚂蚁保险平台会为每个产品分配一个唯一的产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentPhone() {
		return this.agentPhone;
	}
	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
