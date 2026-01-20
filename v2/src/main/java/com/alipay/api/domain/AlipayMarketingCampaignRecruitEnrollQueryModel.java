package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询招商报名详情接口
 *
 * @author auto create
 * @since 1.0, 2023-10-09 16:05:02
 */
public class AlipayMarketingCampaignRecruitEnrollQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8661281244664878958L;

	/**
	 * 活动报名ID。
创建活动报名时返回的 enroll_id。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 外部操作流水号，创建活动报名时传入。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
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
