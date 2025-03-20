package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品交付物
 *
 * @author auto create
 * @since 1.0, 2021-08-06 20:23:27
 */
public class Deliverable extends AlipayObject {

	private static final long serialVersionUID = 8543775588738647572L;

	/**
	 * 验收人名称
	 */
	@ApiField("acceptor")
	private String acceptor;

	/**
	 * 交付物
	 */
	@ApiField("content")
	private String content;

	/**
	 * 备注说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 交付标准
	 */
	@ApiField("standard")
	private String standard;

	public String getAcceptor() {
		return this.acceptor;
	}
	public void setAcceptor(String acceptor) {
		this.acceptor = acceptor;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStandard() {
		return this.standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}

}
