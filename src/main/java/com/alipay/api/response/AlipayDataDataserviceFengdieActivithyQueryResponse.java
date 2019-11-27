package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.fengdie.activithy.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceFengdieActivithyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3555862239198891586L;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("activity_info")
	private FengdieActivityInfo activityInfo;

	public void setActivityInfo(FengdieActivityInfo activityInfo) {
		this.activityInfo = activityInfo;
	}
	public FengdieActivityInfo getActivityInfo( ) {
		return this.activityInfo;
	}

}
