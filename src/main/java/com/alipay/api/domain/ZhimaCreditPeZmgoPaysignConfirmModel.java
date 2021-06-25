package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO支付下单链路签约确认
 *
 * @author auto create
 * @since 1.0, 2021-05-07 09:33:54
 */
public class ZhimaCreditPeZmgoPaysignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7125994341396433239L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 模板关联的appid
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 签约申请的时候返回的操作单号
	 */
	@ApiField("zmgo_opt_no")
	private String zmgoOptNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getZmgoOptNo() {
		return this.zmgoOptNo;
	}
	public void setZmgoOptNo(String zmgoOptNo) {
		this.zmgoOptNo = zmgoOptNo;
	}

}
