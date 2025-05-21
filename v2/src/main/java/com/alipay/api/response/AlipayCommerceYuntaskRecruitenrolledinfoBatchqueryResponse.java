package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskRecruitEnrolledInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.recruitenrolledinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-28 14:42:53
 */
public class AlipayCommerceYuntaskRecruitenrolledinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4426638814642516646L;

	/** 
	 * 招商报名记录
	 */
	@ApiListField("enrolled_infos")
	@ApiField("yun_task_recruit_enrolled_info")
	private List<YunTaskRecruitEnrolledInfo> enrolledInfos;

	public void setEnrolledInfos(List<YunTaskRecruitEnrolledInfo> enrolledInfos) {
		this.enrolledInfos = enrolledInfos;
	}
	public List<YunTaskRecruitEnrolledInfo> getEnrolledInfos( ) {
		return this.enrolledInfos;
	}

}
