package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝视频挂断接口
 *
 * @author auto create
 * @since 1.0, 2025-09-01 15:01:28
 */
public class AlipayCommercePropertyVideocallCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1761737487882157436L;

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
