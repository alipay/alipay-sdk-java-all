package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结余额查询
 *
 * @author auto create
 * @since 1.0, 2024-01-15 15:09:34
 */
public class AlipayDataBillFreezebalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5475862174234983997L;

	/**
	 * 目标查询用户uid
	 */
	@ApiField("bill_user_id")
	private String billUserId;

	/**
	 * 冻结类型
	 */
	@ApiField("freeze_type")
	private String freezeType;

	public String getBillUserId() {
		return this.billUserId;
	}
	public void setBillUserId(String billUserId) {
		this.billUserId = billUserId;
	}

	public String getFreezeType() {
		return this.freezeType;
	}
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

}
