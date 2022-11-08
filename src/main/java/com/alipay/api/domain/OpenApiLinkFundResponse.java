package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联基金
 *
 * @author auto create
 * @since 1.0, 2022-02-25 22:03:44
 */
public class OpenApiLinkFundResponse extends AlipayObject {

	private static final long serialVersionUID = 1394781245699916448L;

	/**
	 * 基金数据
	 */
	@ApiField("data")
	private LinkFundResponse data;

	public LinkFundResponse getData() {
		return this.data;
	}
	public void setData(LinkFundResponse data) {
		this.data = data;
	}

}
