package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单文件查询接口
 *
 * @author auto create
 * @since 1.0, 2026-08-13 16:42:48
 */
public class AlipayOpenAppBizbillBillfileDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 8779931376326859682L;

	/**
	 * 账单日期，格式yyyy-MM-dd，仅支持T-1及之前的日期，最多支持近60天
	 */
	@ApiField("bill_date")
	private String billDate;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

}
