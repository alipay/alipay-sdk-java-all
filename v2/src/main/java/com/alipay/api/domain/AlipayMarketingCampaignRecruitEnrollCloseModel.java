package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下线招商报名接口
 *
 * @author auto create
 * @since 1.0, 2023-10-09 16:04:35
 */
public class AlipayMarketingCampaignRecruitEnrollCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8283635497522381414L;

	/**
	 * 活动报名ID。
创建活动报名时返回的 enroll_id。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	public String getEnrollId() {
		return this.enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}

}
