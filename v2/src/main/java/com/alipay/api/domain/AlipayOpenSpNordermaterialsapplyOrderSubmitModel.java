package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请单提交
 *
 * @author auto create
 * @since 1.0, 2025-11-25 15:28:38
 */
public class AlipayOpenSpNordermaterialsapplyOrderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6898215421649438872L;

	/**
	 * 此前接口蚂蚁侧返回的创建申请单ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 组合单号，基于此单号创建的所有申请单都在一个组合单下，可以统一提交。 与apply_id参数必传一个
	 */
	@ApiField("combined_order_no")
	private String combinedOrderNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getCombinedOrderNo() {
		return this.combinedOrderNo;
	}
	public void setCombinedOrderNo(String combinedOrderNo) {
		this.combinedOrderNo = combinedOrderNo;
	}

}
