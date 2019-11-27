package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （快捷投保）提交生成产品传播二维码
 *
 * @author auto create
 * @since 1.0, 2017-08-01 20:29:54
 */
public class AlipayInsCooperationProductlistQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2769334759654574261L;

	/**
	 * 保险代理人在保险公司的惟一ID，数据来自保险公司内部管理系统
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 保险代理人的手机号码。如果传此值，在投保页面就会显示代理人的联系电话；如果不传此值，投保页面就会链接到智能客服
	 */
	@ApiField("agent_phone")
	private String agentPhone;

	/**
	 * 保险公司在蚂蚁保险平台的惟一ID，由蚂蚁保险平台分配。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 蚂蚁保险平台产品的惟一ID，由蚂蚁保险平台提供的产品列表查询接口返回
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 蚂蚁保险平台产品对应的版本号。每次产品被编辑都对修改版本号。由蚂蚁保险平台提供的产品列表查询接口返回
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
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

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
