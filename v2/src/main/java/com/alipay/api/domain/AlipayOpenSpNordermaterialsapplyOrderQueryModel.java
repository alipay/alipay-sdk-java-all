package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料查询申请单信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:31:17
 */
public class AlipayOpenSpNordermaterialsapplyOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6227389887411855831L;

	/**
	 * 此前接口创建申请单时，蚂蚁侧返回的申请单ID
	 */
	@ApiField("apply_id")
	private String applyId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

}
