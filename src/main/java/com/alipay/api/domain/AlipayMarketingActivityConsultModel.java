package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销活动咨询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-31 14:47:01
 */
public class AlipayMarketingActivityConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7532461299526857963L;

	/**
	 * 待咨询的活动信息列表
	 */
	@ApiListField("consult_activity_info_list")
	@ApiField("consult_activity_info")
	private List<ConsultActivityInfo> consultActivityInfoList;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
