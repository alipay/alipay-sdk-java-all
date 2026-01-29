package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销活动咨询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 10:28:56
 */
public class AlipayMarketingActivityConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2487822716249937828L;

	/**
	 * 待咨询的活动信息列表
	 */
	@ApiListField("consult_activity_info_list")
	@ApiField("consult_activity_info")
	private List<ConsultActivityInfo> consultActivityInfoList;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 商户PID,默认为当前接口调用商户。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 领券的支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 领券的用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public List<ConsultActivityInfo> getConsultActivityInfoList() {
		return this.consultActivityInfoList;
	}
	public void setConsultActivityInfoList(List<ConsultActivityInfo> consultActivityInfoList) {
		this.consultActivityInfoList = consultActivityInfoList;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
