package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询AI跟进任务
 *
 * @author auto create
 * @since 1.0, 2026-10-09 10:17:57
 */
public class AlipayCommerceCareerOpenbaseFollowupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5223381247361442666L;

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
