package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名详情查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 20:01:13
 */
public class AlipayMarketingRecruitEnrollQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3856676894672156129L;

	/**
	 * 报名ID，此参数和out_biz_no至少传一个，优先取enroll_id
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 外部业务号
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
