package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险代扣协议签约
 *
 * @author auto create
 * @since 1.0, 2022-11-29 16:59:14
 */
public class AlipayInsSceneProductSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2354134568414396668L;

	/**
	 * 支付宝会员openID，替代之前传入的2088账号，后续会通过灰度过度不再传入2088，用此id替代
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 支付宝会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
