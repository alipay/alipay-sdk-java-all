package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动白名单创建
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:41:04
 */
public class AlipayMarketingCampaignDrawcampWhitelistCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8849462123525433786L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户信息列表，有多个时用逗号隔开，最大支持100个白名单账户，账户必须是非脱敏的登录账号或者2088开头的userid，以覆盖的形式执行。为空（“”）时，则清空白名单，不进行白名单校验。
	 */
	@ApiField("user_id_list")
	private String userIdList;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(String userIdList) {
		this.userIdList = userIdList;
	}

}
