package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营单元信息
 *
 * @author auto create
 * @since 1.0, 2020-05-08 15:19:33
 */
public class BizUnitInfo extends AlipayObject {

	private static final long serialVersionUID = 3478253848999551934L;

	/**
	 * 经营单元id，如店铺id
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 经营单元名称，如店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 经营单元类型，如口碑门店/集团统一门店等
	 */
	@ApiField("type")
	private String type;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
