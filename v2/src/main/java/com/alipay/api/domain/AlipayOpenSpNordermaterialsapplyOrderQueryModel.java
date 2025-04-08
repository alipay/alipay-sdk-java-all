package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料查询申请单信息
 *
 * @author auto create
 * @since 1.0, 2025-03-13 11:32:08
 */
public class AlipayOpenSpNordermaterialsapplyOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3513444968286692777L;

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
