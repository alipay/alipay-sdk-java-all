package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值记录查询
 *
 * @author auto create
 * @since 1.0, 2023-08-31 12:02:55
 */
public class AlipayCloudCloudbaseWalletFundhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3785243416545284217L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 充值日期
	 */
	@ApiField("fund_date")
	private String fundDate;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getFundDate() {
		return this.fundDate;
	}
	public void setFundDate(String fundDate) {
		this.fundDate = fundDate;
	}

}
