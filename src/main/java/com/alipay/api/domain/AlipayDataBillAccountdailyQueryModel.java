package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户日变动余额信息查询接口
 *
 * @author auto create
 * @since 1.0, 2022-04-21 19:53:18
 */
public class AlipayDataBillAccountdailyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8573465172858288293L;

	/**
	 * 签约授权协议号。特殊场景使用
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 签约授权产品码。特殊场景使用
	 */
	@ApiField("agreement_product_code")
	private String agreementProductCode;

	/**
	 * 查询的目标账号。余额户为2088+0156；支出户/收入户为特定的271/281账号
	 */
	@ApiField("bill_user_account_no")
	private String billUserAccountNo;

	/**
	 * 指定查询支付宝账户id
	 */
	@ApiField("bill_user_id")
	private String billUserId;

	/**
	 * 查询的日期，需要小于请求当天
	 */
	@ApiField("date")
	private String date;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementProductCode() {
		return this.agreementProductCode;
	}
	public void setAgreementProductCode(String agreementProductCode) {
		this.agreementProductCode = agreementProductCode;
	}

	public String getBillUserAccountNo() {
		return this.billUserAccountNo;
	}
	public void setBillUserAccountNo(String billUserAccountNo) {
		this.billUserAccountNo = billUserAccountNo;
	}

	public String getBillUserId() {
		return this.billUserId;
	}
	public void setBillUserId(String billUserId) {
		this.billUserId = billUserId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
