package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户积分
 *
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:25
 */
public class AlipayOpenNppdUserpointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3829591869532174353L;

	/**
	 * 企业分配给阿里云的Code
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	/**
	 * 企业提供的参数
	 */
	@ApiField("merchant_exts")
	private String merchantExts;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 企业侧的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantCode() {
		return this.merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantExts() {
		return this.merchantExts;
	}
	public void setMerchantExts(String merchantExts) {
		this.merchantExts = merchantExts;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
