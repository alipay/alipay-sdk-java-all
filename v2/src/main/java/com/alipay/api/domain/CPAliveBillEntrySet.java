package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业物业费账单明细条目列表
 *
 * @author auto create
 * @since 1.0, 2017-01-18 16:45:49
 */
public class CPAliveBillEntrySet extends AlipayObject {

	private static final long serialVersionUID = 4812691663547192884L;

	/**
	 * 物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 未能删除的账单明细条目状态，状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
	 */
	@ApiField("status")
	private String status;

	public String getBillEntryId() {
		return this.billEntryId;
	}
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
