package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试openapi
 *
 * @author auto create
 * @since 1.0, 2022-09-15 09:57:28
 */
public class AlipayOpenAppTestagainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5412647577677768385L;

	/**
	 * 在门店消费用户的标识
	 */
	@ApiField("buyer_openid")
	private String buyerOpenid;

	/**
	 * 金额
	 */
	@ApiField("xxxxxx")
	private String xxxxxx;

	public String getBuyerOpenid() {
		return this.buyerOpenid;
	}
	public void setBuyerOpenid(String buyerOpenid) {
		this.buyerOpenid = buyerOpenid;
	}

	public String getXxxxxx() {
		return this.xxxxxx;
	}
	public void setXxxxxx(String xxxxxx) {
		this.xxxxxx = xxxxxx;
	}

}
