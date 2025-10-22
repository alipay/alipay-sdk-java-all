package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费直付通对账单下载接口
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:22:33
 */
public class AlipayEcoEduKtDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1316198444946398944L;

	/**
	 * 账单时间：日账单格式为yyyy-MM-dd
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * ISV的支付宝唯一标识PID
	 */
	@ApiField("partner_pid")
	private String partnerPid;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getPartnerPid() {
		return this.partnerPid;
	}
	public void setPartnerPid(String partnerPid) {
		this.partnerPid = partnerPid;
	}

}
