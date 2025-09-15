package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultActivityResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-03 10:28:56
 */
public class AlipayMarketingActivityConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6887717927487961157L;

	/** 
	 * 咨询后的活动结果信息
	 */
	@ApiListField("consult_result_info_list")
	@ApiField("consult_activity_result_info")
	private List<ConsultActivityResultInfo> consultResultInfoList;

	/** 
	 * 领券的用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 领券的用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public void setConsultResultInfoList(List<ConsultActivityResultInfo> consultResultInfoList) {
		this.consultResultInfoList = consultResultInfoList;
	}
	public List<ConsultActivityResultInfo> getConsultResultInfoList( ) {
		return this.consultResultInfoList;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
