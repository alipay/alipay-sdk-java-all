package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询申请单中的设备sn
 *
 * @author auto create
 * @since 1.0, 2020-01-08 15:05:12
 */
public class AlipayCommerceIotProfileSnBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1237725164653445542L;

	/**
	 * 申请单id
	 */
	@ApiField("apply_id")
	private Long applyId;

	public Long getApplyId() {
		return this.applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

}
