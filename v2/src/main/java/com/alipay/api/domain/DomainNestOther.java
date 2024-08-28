package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 域内复杂类型嵌套其他复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-12-04 14:59:41
 */
public class DomainNestOther extends AlipayObject {

	private static final long serialVersionUID = 2278181331593995267L;

	/**
	 * 1
	 */
	@ApiField("com_domain")
	private RegressionInDomian comDomain;

	/**
	 * 11
	 */
	@ApiField("com_private")
	private RegressionPrivate comPrivate;

	/**
	 * 1
	 */
	@ApiField("com_public")
	private RegressionPublic comPublic;

	public RegressionInDomian getComDomain() {
		return this.comDomain;
	}
	public void setComDomain(RegressionInDomian comDomain) {
		this.comDomain = comDomain;
	}

	public RegressionPrivate getComPrivate() {
		return this.comPrivate;
	}
	public void setComPrivate(RegressionPrivate comPrivate) {
		this.comPrivate = comPrivate;
	}

	public RegressionPublic getComPublic() {
		return this.comPublic;
	}
	public void setComPublic(RegressionPublic comPublic) {
		this.comPublic = comPublic;
	}

}
