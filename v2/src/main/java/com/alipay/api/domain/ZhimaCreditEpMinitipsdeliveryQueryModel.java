package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi渲染测试
 *
 * @author auto create
 * @since 1.0, 2022-11-19 12:58:44
 */
public class ZhimaCreditEpMinitipsdeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3875326424651699671L;

	/**
	 * 无openid字段
	 */
	@ApiField("hhh")
	private Long hhh;

	/**
	 * 金额
	 */
	@ApiField("xx")
	private String xx;

	/**
	 * 金额
	 */
	@ApiField("xx_open_id")
	private String xxOpenId;

	public Long getHhh() {
		return this.hhh;
	}
	public void setHhh(Long hhh) {
		this.hhh = hhh;
	}

	public String getXx() {
		return this.xx;
	}
	public void setXx(String xx) {
		this.xx = xx;
	}

	public String getXxOpenId() {
		return this.xxOpenId;
	}
	public void setXxOpenId(String xxOpenId) {
		this.xxOpenId = xxOpenId;
	}

}
