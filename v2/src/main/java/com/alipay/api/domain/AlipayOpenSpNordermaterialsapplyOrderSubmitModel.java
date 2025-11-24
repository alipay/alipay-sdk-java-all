package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请单提交
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:31:58
 */
public class AlipayOpenSpNordermaterialsapplyOrderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6828776753685211826L;

	/**
	 * 此前接口蚂蚁侧返回的创建申请单ID
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
