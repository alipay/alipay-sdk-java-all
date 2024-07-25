package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用明细
 *
 * @author auto create
 * @since 1.0, 2024-05-21 21:52:59
 */
public class ExpenseBillItem extends AlipayObject {

	private static final long serialVersionUID = 7782759437732188297L;

	/**
	 * 收费账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户绑定手机号或者绑定邮箱，优先取绑定手机号，脱敏返回
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 收费账户Open ID
	 */
	@ApiField("account_open_id")
	private String accountOpenId;

	/**
	 * 收费金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收费主体
	 */
	@ApiField("charge_ou")
	private String chargeOu;

	/**
	 * 收费/退费
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 计费时间
	 */
	@ApiField("occurrence_time")
	private Date occurrenceTime;

	/**
	 * 费用码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 费用名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 凭证核销的次序号
例：商品为次卡，可使用三次，则一个凭证能够进行三次核销，生成三个核销次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountOpenId() {
		return this.accountOpenId;
	}
	public void setAccountOpenId(String accountOpenId) {
		this.accountOpenId = accountOpenId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChargeOu() {
		return this.chargeOu;
	}
	public void setChargeOu(String chargeOu) {
		this.chargeOu = chargeOu;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getOccurrenceTime() {
		return this.occurrenceTime;
	}
	public void setOccurrenceTime(Date occurrenceTime) {
		this.occurrenceTime = occurrenceTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
