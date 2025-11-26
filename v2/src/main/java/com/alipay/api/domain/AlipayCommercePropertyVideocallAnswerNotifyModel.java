package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绿城通知支付宝天猫精灵接听接口
 *
 * @author auto create
 * @since 1.0, 2025-09-04 16:25:18
 */
public class AlipayCommercePropertyVideocallAnswerNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8593576214344793896L;

	/**
	 * 访客流水号
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
