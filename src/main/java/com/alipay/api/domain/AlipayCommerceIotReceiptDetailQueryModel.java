package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票详情查询
 *
 * @author auto create
 * @since 1.0, 2020-06-02 16:02:14
 */
public class AlipayCommerceIotReceiptDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4542649249645317126L;

	/**
	 * 调用发送电子小票接口时返回的电子小票id
	 */
	@ApiField("receipt_id")
	private String receiptId;

	public String getReceiptId() {
		return this.receiptId;
	}
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

}
