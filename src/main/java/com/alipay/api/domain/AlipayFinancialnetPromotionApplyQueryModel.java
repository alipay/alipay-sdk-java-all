package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询进件信息
 *
 * @author auto create
 * @since 1.0, 2021-05-21 10:13:55
 */
public class AlipayFinancialnetPromotionApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5393955826769735397L;

	/**
	 * 进件订单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 申请人支付宝UID
	 */
	@ApiField("apply_user_id")
	private String applyUserId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getApplyUserId() {
		return this.applyUserId;
	}
	public void setApplyUserId(String applyUserId) {
		this.applyUserId = applyUserId;
	}

}
