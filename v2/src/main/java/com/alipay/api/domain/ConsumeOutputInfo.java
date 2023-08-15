package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单记录输出模型
 *
 * @author auto create
 * @since 1.0, 2022-12-26 20:28:02
 */
public class ConsumeOutputInfo extends AlipayObject {

	private static final long serialVersionUID = 2223386659138134457L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单分类
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 金额
	 */
	@ApiField("consume_amount")
	private String consumeAmount;

	/**
	 * 日期
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 交易记录标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 商家名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getConsumeAmount() {
		return this.consumeAmount;
	}
	public void setConsumeAmount(String consumeAmount) {
		this.consumeAmount = consumeAmount;
	}

	public String getConsumeDate() {
		return this.consumeDate;
	}
	public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

}
