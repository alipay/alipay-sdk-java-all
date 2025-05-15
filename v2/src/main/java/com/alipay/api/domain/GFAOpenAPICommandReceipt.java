package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理指令回执信息
 *
 * @author auto create
 * @since 1.0, 2020-08-27 20:00:30
 */
public class GFAOpenAPICommandReceipt extends AlipayObject {

	private static final long serialVersionUID = 4689712744919443669L;

	/**
	 * 回执扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 回执状态
	 */
	@ApiField("receipt_status")
	private String receiptStatus;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getReceiptStatus() {
		return this.receiptStatus;
	}
	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

}
