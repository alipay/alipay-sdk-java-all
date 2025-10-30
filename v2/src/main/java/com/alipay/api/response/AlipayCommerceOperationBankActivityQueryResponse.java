package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BankActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bank.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:43
 */
public class AlipayCommerceOperationBankActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7577468542231313298L;

	/** 
	 * 活动信息列表
	 */
	@ApiListField("activity_info_list")
	@ApiField("bank_activity_info")
	private List<BankActivityInfo> activityInfoList;

	/** 
	 * 商户标签
	 */
	@ApiField("merchant_tag")
	private String merchantTag;

	public void setActivityInfoList(List<BankActivityInfo> activityInfoList) {
		this.activityInfoList = activityInfoList;
	}
	public List<BankActivityInfo> getActivityInfoList( ) {
		return this.activityInfoList;
	}

	public void setMerchantTag(String merchantTag) {
		this.merchantTag = merchantTag;
	}
	public String getMerchantTag( ) {
		return this.merchantTag;
	}

}
