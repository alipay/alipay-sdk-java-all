package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单品详情
 *
 * @author auto create
 * @since 1.0, 2016-09-29 10:04:18
 */
public class LimitGoodsCode extends AlipayObject {

	private static final long serialVersionUID = 1157355127858145381L;

	/**
	 * 商品编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 外部商品编号类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
