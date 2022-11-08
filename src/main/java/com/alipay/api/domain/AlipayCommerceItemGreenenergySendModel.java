package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业绿色能量插件能量领取
 *
 * @author auto create
 * @since 1.0, 2022-11-07 14:50:52
 */
public class AlipayCommerceItemGreenenergySendModel extends AlipayObject {

	private static final long serialVersionUID = 6889236841581248393L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 绿色能量发放归属的商户信息。
说明：
如果该复杂对象不填。则默认为该绿色能量发放的归属者是调用者本人。
如果填写，则认为该绿色能量发放的归属者是该商户。
限制:服务商身份接入时必传
	 */
	@ApiField("belong_merchant_info")
	private BelongGreenMerchantInfo belongMerchantInfo;

	/**
	 * 能量流水id
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 用于领取绿色能量的小程序appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public BelongGreenMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongGreenMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

}
