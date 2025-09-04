package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接听视频通话并发控制接口
 *
 * @author auto create
 * @since 1.0, 2025-09-01 15:01:31
 */
public class AlipayCommercePropertyVideocallCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7256927191986176474L;

	/**
	 * 用于后续访客记录交互
	 */
	@ApiField("visit_biz_id")
	private String visitBizId;

	public String getVisitBizId() {
		return this.visitBizId;
	}
	public void setVisitBizId(String visitBizId) {
		this.visitBizId = visitBizId;
	}

}
