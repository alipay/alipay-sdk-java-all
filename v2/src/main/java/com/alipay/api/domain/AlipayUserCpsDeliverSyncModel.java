package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员会利百川cps物流信息同步
 *
 * @author auto create
 * @since 1.0, 2023-11-27 11:02:46
 */
public class AlipayUserCpsDeliverSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2131689863925698395L;

	/**
	 * open_id+第三方小程序场景+由商家主动升级生成
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付宝平台交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 必传参数，蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
