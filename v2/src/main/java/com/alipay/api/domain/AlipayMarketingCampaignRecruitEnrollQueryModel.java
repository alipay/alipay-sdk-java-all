package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询招商报名详情接口
 *
 * @author auto create
 * @since 1.0, 2023-06-09 10:52:18
 */
public class AlipayMarketingCampaignRecruitEnrollQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3622671147384947771L;

	/**
	 * 活动报名ID。
创建活动报名时返回的 enroll_id。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 幂等ID。
创建报名时传入的 out_biz_no。
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
