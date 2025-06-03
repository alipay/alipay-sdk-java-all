package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单必填对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:17
 */
public class RequireBean extends AlipayObject {

	private static final long serialVersionUID = 3846871678787134983L;

	/**
	 * 提示内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否开启必填
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
