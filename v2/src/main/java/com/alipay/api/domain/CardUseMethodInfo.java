package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户核销方式
 *
 * @author auto create
 * @since 1.0, 2025-07-04 17:17:52
 */
public class CardUseMethodInfo extends AlipayObject {

	private static final long serialVersionUID = 5316956269412958691L;

	/**
	 * 用户核销方式类型
	 */
	@ApiField("use_method_type")
	private String useMethodType;

	/**
	 * 小程序使用链接，当use_method_type=“2”时生效
	 */
	@ApiField("use_path")
	private String usePath;

	public String getUseMethodType() {
		return this.useMethodType;
	}
	public void setUseMethodType(String useMethodType) {
		this.useMethodType = useMethodType;
	}

	public String getUsePath() {
		return this.usePath;
	}
	public void setUsePath(String usePath) {
		this.usePath = usePath;
	}

}
