package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务合约签订
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:53
 */
public class ZhimaCreditEpAeprepayContractSignModel extends AlipayObject {

	private static final long serialVersionUID = 8669227116789227944L;

	/**
	 * 支付宝uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * havana_id
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * AE卖家登录ID
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
