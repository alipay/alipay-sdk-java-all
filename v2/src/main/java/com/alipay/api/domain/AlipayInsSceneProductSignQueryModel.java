package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险代扣协议签约查询
 *
 * @author auto create
 * @since 1.0, 2022-11-29 16:58:50
 */
public class AlipayInsSceneProductSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5578132474917171158L;

	/**
	 * 支付宝会员openId，后续会逐步灰度替换userId
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
