package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保方案查询
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:48:02
 */
public class MybankCreditCreditriskGuarschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2891198384271553851L;

	/**
	 * 担保方案查询类型，TYZBL：通用自保理业务场景
	 */
	@ApiField("bsn_type")
	private String bsnType;

	/**
	 * 销售产品码，特殊可选，某些场景是必填的
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 用户身份信息
	 */
	@ApiField("user")
	private Member user;

	public String getBsnType() {
		return this.bsnType;
	}
	public void setBsnType(String bsnType) {
		this.bsnType = bsnType;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public Member getUser() {
		return this.user;
	}
	public void setUser(Member user) {
		this.user = user;
	}

}
