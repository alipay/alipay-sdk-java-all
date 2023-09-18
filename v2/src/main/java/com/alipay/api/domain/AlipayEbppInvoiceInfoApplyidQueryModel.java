package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发票申请id查询发票信息
 *
 * @author auto create
 * @since 1.0, 2022-11-21 17:12:49
 */
public class AlipayEbppInvoiceInfoApplyidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8875489765564795296L;

	/**
	 * 申请开票时支付宝返回的申请id，具有全局唯一性。
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
