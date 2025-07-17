package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名详情查询
 *
 * @author auto create
 * @since 1.0, 2023-10-08 09:57:27
 */
public class AlipayMarketingRecruitEnrollQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1247428818647828479L;

	/**
	 * 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 外部操作流水号，创建招商报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEnrollId() {
		return this.enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
