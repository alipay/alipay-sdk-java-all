package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI跟进-查询任务
 *
 * @author auto create
 * @since 1.0, 2026-10-21 13:57:58
 */
public class AlipayCommerceCareerOpenbaseFollowupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7394994754289219959L;

	/**
	 * 客户业务单号，任务定位键。查询仅以该字段定位任务，无其他定位入参。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
