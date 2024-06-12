package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品使用方法
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:25:51
 */
public class CardUseMethodInfo extends AlipayObject {

	private static final long serialVersionUID = 6519339353682553498L;

	/**
	 * 用户使用方式类型
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
