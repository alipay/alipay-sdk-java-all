package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 礼品卡模版
 *
 * @author auto create
 * @since 1.0, 2022-10-14 16:13:15
 */
public class GiftCardTemplate extends AlipayObject {

	private static final long serialVersionUID = 6719766675878536594L;

	/**
	 * 开卡模版扩展参数
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 面额
	 */
	@ApiField("denomination")
	private String denomination;

	/**
	 * 绝对模式用户最晚可以进行绑定的时间
	 */
	@ApiField("effective_end_date")
	private String effectiveEndDate;

	/**
	 * 有效日期
	 */
	@ApiField("effective_period")
	private String effectivePeriod;

	/**
	 * 绝对模式用户最早进行绑定的时间
	 */
	@ApiField("effective_start_date")
	private String effectiveStartDate;

	/**
	 * 生效结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 礼品卡模版名字
	 */
	@ApiField("gift_card_template_name")
	private String giftCardTemplateName;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 待结算户账号
	 */
	@ApiField("settle_account_no")
	private String settleAccountNo;

	/**
	 * 生效开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 用户绑定后的卡的有效期 绝对模式
	 */
	@ApiField("valid_date")
	private String validDate;

	/**
	 * 生效周期
	 */
	@ApiField("valid_period")
	private String validPeriod;

	/**
	 * 生效周期模式
	 */
	@ApiField("valid_type")
	private String validType;

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getDenomination() {
		return this.denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public String getEffectivePeriod() {
		return this.effectivePeriod;
	}
	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public String getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getGiftCardTemplateName() {
		return this.giftCardTemplateName;
	}
	public void setGiftCardTemplateName(String giftCardTemplateName) {
		this.giftCardTemplateName = giftCardTemplateName;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSettleAccountNo() {
		return this.settleAccountNo;
	}
	public void setSettleAccountNo(String settleAccountNo) {
		this.settleAccountNo = settleAccountNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

	public String getValidType() {
		return this.validType;
	}
	public void setValidType(String validType) {
		this.validType = validType;
	}

}
