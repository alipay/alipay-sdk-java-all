package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作通知扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:04:35
 */
public class OperateNotifyExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2266593347386878988L;

	/**
	 * 提前收款标识，提前收款场景下有值
	 */
	@ApiField("receipt_advanced")
	private String receiptAdvanced;

	public String getReceiptAdvanced() {
		return this.receiptAdvanced;
	}
	public void setReceiptAdvanced(String receiptAdvanced) {
		this.receiptAdvanced = receiptAdvanced;
	}

}
