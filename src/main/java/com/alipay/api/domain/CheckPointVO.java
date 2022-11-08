package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务的检查点
 *
 * @author auto create
 * @since 1.0, 2022-09-15 20:44:18
 */
public class CheckPointVO extends AlipayObject {

	private static final long serialVersionUID = 4385692578267259295L;

	/**
	 * 检查点是否通过
	 */
	@ApiField("is_pass")
	private Boolean isPass;

	/**
	 * 检查点名称
	 */
	@ApiField("name")
	private String name;

	public Boolean getIsPass() {
		return this.isPass;
	}
	public void setIsPass(Boolean isPass) {
		this.isPass = isPass;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
