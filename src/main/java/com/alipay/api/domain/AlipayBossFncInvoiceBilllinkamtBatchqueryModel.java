package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据账单号获取关联的发票ID以及与账单相关的关联开票金额
 *
 * @author auto create
 * @since 1.0, 2019-10-25 14:09:19
 */
public class AlipayBossFncInvoiceBilllinkamtBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7398498479294349243L;

	/**
	 * 账单ID，唯一性ID，账单表唯一主键ID
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 01主站，02芝麻，03金融云
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

}
