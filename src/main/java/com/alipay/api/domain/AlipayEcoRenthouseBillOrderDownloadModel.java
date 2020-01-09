package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户对账文件下载
 *
 * @author auto create
 * @since 1.0, 2018-09-12 20:06:34
 */
public class AlipayEcoRenthouseBillOrderDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 8121352588149336819L;

	/**
	 * 查询日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 商户编号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

}
