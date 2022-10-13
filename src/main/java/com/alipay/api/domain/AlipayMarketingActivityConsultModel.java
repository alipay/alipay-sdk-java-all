package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销活动咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-07 18:19:47
 */
public class AlipayMarketingActivityConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5415984981477475645L;

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
	 * 商户PID,默认为当前接口调用商户 
限制: 
接口调用者必须有商户代运营权限。 

代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
	 */
	@ApiField("merchant_id")
	private String merchantId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
