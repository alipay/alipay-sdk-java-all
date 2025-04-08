package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请单提交
 *
 * @author auto create
 * @since 1.0, 2025-03-13 11:32:41
 */
public class AlipayOpenSpNordermaterialsapplyOrderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8416557865745313429L;

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
