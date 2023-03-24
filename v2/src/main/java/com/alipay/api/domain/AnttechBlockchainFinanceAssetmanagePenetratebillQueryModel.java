package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产穿透账单查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 15:17:13
 */
public class AnttechBlockchainFinanceAssetmanagePenetratebillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8828912261239681897L;

	/**
	 * 产品合约代码
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 账单日期，格式根据账单类型而定
日账单格式示例：20210908
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单周期类型
DAY：日账单
	 */
	@ApiField("bill_period")
	private String billPeriod;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillPeriod() {
		return this.billPeriod;
	}
	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
	}

}
