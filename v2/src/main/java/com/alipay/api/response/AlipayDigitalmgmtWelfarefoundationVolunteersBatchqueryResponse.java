package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryVolunteersDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.welfarefoundation.volunteers.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayDigitalmgmtWelfarefoundationVolunteersBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3461619615749876695L;

	/** 
	 * 志愿者活动时
	 */
	@ApiListField("activity_hours")
	@ApiField("query_volunteers_dto")
	private List<QueryVolunteersDto> activityHours;

	/** 
	 * 调用是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setActivityHours(List<QueryVolunteersDto> activityHours) {
		this.activityHours = activityHours;
	}
	public List<QueryVolunteersDto> getActivityHours( ) {
		return this.activityHours;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
