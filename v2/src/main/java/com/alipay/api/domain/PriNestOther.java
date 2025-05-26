package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 私有嵌套其他复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-11-30 16:19:36
 */
public class PriNestOther extends AlipayObject {

	private static final long serialVersionUID = 1337726181334598742L;

	/**
	 * 11
	 */
	@ApiField("com_indomain")
	private RegressionInDomian comIndomain;

	/**
	 * 11
	 */
	@ApiField("com_private")
	private RegressionPrivate comPrivate;

	/**
	 * 111
	 */
	@ApiField("com_pub")
	private RegressionPublic comPub;

	public RegressionInDomian getComIndomain() {
		return this.comIndomain;
	}
	public void setComIndomain(RegressionInDomian comIndomain) {
		this.comIndomain = comIndomain;
	}

	public RegressionPrivate getComPrivate() {
		return this.comPrivate;
	}
	public void setComPrivate(RegressionPrivate comPrivate) {
		this.comPrivate = comPrivate;
	}

	public RegressionPublic getComPub() {
		return this.comPub;
	}
	public void setComPub(RegressionPublic comPub) {
		this.comPub = comPub;
	}

}
