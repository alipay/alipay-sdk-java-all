package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.crowd.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 15:11:15
 */
public class AlipayTradeCrowdConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4545743537294577528L;

	/** 
	 * 淘宝的活动id列表
	 */
	@ApiListField("activity_code_list")
	@ApiField("string")
	private List<String> activityCodeList;

	/** 
	 * Y表示是营销人群
N表示不是营销人群
	 */
	@ApiField("promoted_user")
	private String promotedUser;

	public void setActivityCodeList(List<String> activityCodeList) {
		this.activityCodeList = activityCodeList;
	}
	public List<String> getActivityCodeList( ) {
		return this.activityCodeList;
	}

	public void setPromotedUser(String promotedUser) {
		this.promotedUser = promotedUser;
	}
	public String getPromotedUser( ) {
		return this.promotedUser;
	}

}
