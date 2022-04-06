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
 * @since 1.0, 2022-03-24 13:26:38
 */
public class AlipayCommerceYuntaskRecruitenrolledinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4374567812175121586L;

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
