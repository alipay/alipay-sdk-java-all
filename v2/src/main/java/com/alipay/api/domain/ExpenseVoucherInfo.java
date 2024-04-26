package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证基础信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 17:03:49
 */
public class ExpenseVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6815663823689573943L;

	/**
	 * 企业支付宝用户id(对应凭证ownerid)
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 消费时间
	 */
	@ApiField("consumption_date")
	private Date consumptionDate;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工ID
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 扩展预留
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 数据创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 数据更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 行业属性值（从支付宝主账单复制）
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 是否冲抵凭证：0 否（蓝票）；1 是(如:红票)
	 */
	@ApiField("is_off_set")
	private String isOffSet;

	/**
	 * 凭证介质：纸or电子(PAPER,ELECTRON)
	 */
	@ApiField("medium")
	private String medium;

	/**
	 * 外部唯一ID（和凭证类型有关，如果发票类型为发票号码+发票编码，如果是账单，则为账单号）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 凭证父类型（INVOICE-发票，TRAVEL-出行凭证，HTL_ORDER-酒店水单，CONSUME-账单，财政票夹）
	 */
	@ApiField("parent_type")
	private String parentType;

	/**
	 * 交易金额（元）
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 凭证创建时间
	 */
	@ApiField("voucher_date")
	private Date voucherDate;

	/**
	 * 凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 一类凭证，唯一号码，有必须传，没有可不传。
发票、账单必须有
如部分餐饮小票，没有唯一号
	 */
	@ApiField("voucher_no")
	private String voucherNo;

	/**
	 * 凭证状态(0-无效，1 有效)
	 */
	@ApiField("voucher_state")
	private String voucherState;

	/**
	 * 凭证类型
（FINANCIAL_BILLS-财政电子票
MEDICAL_INVOICE-医疗票据
DONATION_INVOICE-公益捐赠电子票据
SETTLEMENT_INVOICE-往来结算票据
DUES_INVOICE-社会团体会费收据
INVOICE-增值税票
PLAIN-增值税电子普通发票
SPECIAL-增值税专用发票
PLAIN_INVOICE-增值税普通发票
PAPER_INVOICE-增值税普通发票(卷式)
CONSUME-账单
ALIPAY_CONSUME-支付宝账单
TRAVEL-出行凭证
TAXI-出租车票
BUS_TICKET-汽车票
TRAIN-火车票
TOLL-过路费
BOARD_PASS-登机牌
HTL_ORDER-酒店水单
MEMO-酒店水单
OTHERS-杂票
FIXED-定额发票
LIST-小票
COMMON_INVOICE-通用发票）
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Date getConsumptionDate() {
		return this.consumptionDate;
	}
	public void setConsumptionDate(Date consumptionDate) {
		this.consumptionDate = consumptionDate;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeOpenId() {
		return this.employeeOpenId;
	}
	public void setEmployeeOpenId(String employeeOpenId) {
		this.employeeOpenId = employeeOpenId;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIsOffSet() {
		return this.isOffSet;
	}
	public void setIsOffSet(String isOffSet) {
		this.isOffSet = isOffSet;
	}

	public String getMedium() {
		return this.medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getParentType() {
		return this.parentType;
	}
	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public Date getVoucherDate() {
		return this.voucherDate;
	}
	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getVoucherState() {
		return this.voucherState;
	}
	public void setVoucherState(String voucherState) {
		this.voucherState = voucherState;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
