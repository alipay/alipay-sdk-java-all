package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户券详情
 *
 * @author auto create
 * @since 1.0, 2021-11-25 22:40:43
 */
public class AlipayMarketingActivityUserQueryvoucherModel extends AlipayObject {

	private static final long serialVersionUID = 8455425311813735286L;

	/**
	 * 商户PID,默认为当前接口调用商户 
限制: 
接口调用者必须有商户代运营权限。 

代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户券id。支付宝为用户优惠券唯一分配的id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
