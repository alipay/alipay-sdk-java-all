package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserCustIdentifyActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.customer.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class AlipayUserCustomerIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7638386136614283795L;

	/** 
	 * 账户互通活动信息列表，目前支持的活动名称
PAYMENT_NEW_CUSTOMER, 支付拉新
	 */
	@ApiListField("activity_list")
	@ApiField("alipay_user_cust_identify_activity")
	private List<AlipayUserCustIdentifyActivity> activityList;

	/** 
	 * 用户画像信息，预留参数。返回用户画像信息，例如用户特征或者其他脱敏后的信息。
	 */
	@ApiField("user_profile")
	private String userProfile;

	public void setActivityList(List<AlipayUserCustIdentifyActivity> activityList) {
		this.activityList = activityList;
	}
	public List<AlipayUserCustIdentifyActivity> getActivityList( ) {
		return this.activityList;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public String getUserProfile( ) {
		return this.userProfile;
	}

}
