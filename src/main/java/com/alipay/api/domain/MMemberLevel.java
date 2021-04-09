package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销
 *
 * @author auto create
 * @since 1.0, 2019-01-11 10:44:02
 */
public class MMemberLevel extends AlipayObject {

	private static final long serialVersionUID = 1577319776164462871L;

	/**
	 * 会员等级code码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 会员等级值
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会员等级名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
