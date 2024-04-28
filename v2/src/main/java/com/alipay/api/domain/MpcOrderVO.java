package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销订单结构
 *
 * @author auto create
 * @since 1.0, 2023-12-21 15:26:19
 */
public class MpcOrderVO extends AlipayObject {

	private static final long serialVersionUID = 2848898117252914221L;

	/**
	 * 小程序云订单编码
	 */
	@ApiField("mpc_order_code")
	private String mpcOrderCode;

	/**
	 * 小程序云订单链接
	 */
	@ApiField("url")
	private String url;

	public String getMpcOrderCode() {
		return this.mpcOrderCode;
	}
	public void setMpcOrderCode(String mpcOrderCode) {
		this.mpcOrderCode = mpcOrderCode;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
