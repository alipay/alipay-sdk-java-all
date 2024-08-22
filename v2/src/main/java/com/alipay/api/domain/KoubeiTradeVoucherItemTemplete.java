package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑商品交易凭证模板
 *
 * @author auto create
 * @since 1.0, 2022-12-01 17:52:36
 */
public class KoubeiTradeVoucherItemTemplete extends AlipayObject {

	private static final long serialVersionUID = 4771829216953183255L;

	/**
	 * 商品可用时间段
	 */
	@ApiListField("available_time_info_list")
	@ApiField("available_time_info")
	private List<AvailableTimeInfo> availableTimeInfoList;

	/**
	 * 购买须知，列表类型，最多10项
	 */
	@ApiListField("buyer_notes")
	@ApiField("koubei_item_description")
	private List<KoubeiItemDescription> buyerNotes;

	/**
	 * 表示是否支持预定，支持“T”, 不支持“F”
	 */
	@ApiField("support_book")
	private String supportBook;

	/**
	 * 不可用日期
	 */
	@ApiListField("un_available_time_info_list")
	@ApiField("un_available_time_info")
	private List<UnAvailableTimeInfo> unAvailableTimeInfoList;

	/**
	 * 购买有效期：商品自购买起多长时间内有效，取值范围 7-360，单位天。举例，如果是7的话，是到第七天晚上23:59:59失效。商品购买后，没有在有效期内核销，则自动退款给用户。举例：买了一个高级造型师洗剪吹的商品，有效期一个月，如果一个月之后，用户没有使用商品来进行洗剪吹的服务，则自动退款给用户。
	 */
	@ApiField("validity_period")
	private String validityPeriod;

	/**
	 * 核销绝对有效期开始时间。自该时间点起，商品可被核销。
注意：商品售卖时段开始时间（gmt_start）不能晚于该时间。
	 */
	@ApiField("validity_period_range_from")
	private String validityPeriodRangeFrom;

	/**
	 * 核销绝对有效期结束时间。自改时间点起，商品无法继续被核销，且自动过期退款。
注意：售卖时段结束时间(gmt_end)不能晚于该时间。
	 */
	@ApiField("validity_period_range_to")
	private String validityPeriodRangeTo;

	/**
	 * 核销有效期类型。支持相对有效期及绝对有效期两种方式，对应RELATIVE或FIXED。相对有效期指自购买之日起XX天有效，绝对有效期指某一端固定时间内有效。
注意：绝对有效期不允许超过360天，否则无法成功创建。
	 */
	@ApiField("validity_period_type")
	private String validityPeriodType;

	/**
	 * 份数，单次核销只可赋值为1，表示多次核销商品最多支持核销的份数，需为整数且在[2,50]范围内。备注：多次核销商品的价格为包含所有份数的整体价格，如洗剪吹3次卡300元，则每次核销消耗100元。
	 */
	@ApiField("verify_enable_times")
	private Long verifyEnableTimes;

	/**
	 * 核销类型，single为单次核销商品（即普通商品），multi为多次核销商品（即次卡商品）
	 */
	@ApiField("verify_frequency")
	private String verifyFrequency;

	public List<AvailableTimeInfo> getAvailableTimeInfoList() {
		return this.availableTimeInfoList;
	}
	public void setAvailableTimeInfoList(List<AvailableTimeInfo> availableTimeInfoList) {
		this.availableTimeInfoList = availableTimeInfoList;
	}

	public List<KoubeiItemDescription> getBuyerNotes() {
		return this.buyerNotes;
	}
	public void setBuyerNotes(List<KoubeiItemDescription> buyerNotes) {
		this.buyerNotes = buyerNotes;
	}

	public String getSupportBook() {
		return this.supportBook;
	}
	public void setSupportBook(String supportBook) {
		this.supportBook = supportBook;
	}

	public List<UnAvailableTimeInfo> getUnAvailableTimeInfoList() {
		return this.unAvailableTimeInfoList;
	}
	public void setUnAvailableTimeInfoList(List<UnAvailableTimeInfo> unAvailableTimeInfoList) {
		this.unAvailableTimeInfoList = unAvailableTimeInfoList;
	}

	public String getValidityPeriod() {
		return this.validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public String getValidityPeriodRangeFrom() {
		return this.validityPeriodRangeFrom;
	}
	public void setValidityPeriodRangeFrom(String validityPeriodRangeFrom) {
		this.validityPeriodRangeFrom = validityPeriodRangeFrom;
	}

	public String getValidityPeriodRangeTo() {
		return this.validityPeriodRangeTo;
	}
	public void setValidityPeriodRangeTo(String validityPeriodRangeTo) {
		this.validityPeriodRangeTo = validityPeriodRangeTo;
	}

	public String getValidityPeriodType() {
		return this.validityPeriodType;
	}
	public void setValidityPeriodType(String validityPeriodType) {
		this.validityPeriodType = validityPeriodType;
	}

	public Long getVerifyEnableTimes() {
		return this.verifyEnableTimes;
	}
	public void setVerifyEnableTimes(Long verifyEnableTimes) {
		this.verifyEnableTimes = verifyEnableTimes;
	}

	public String getVerifyFrequency() {
		return this.verifyFrequency;
	}
	public void setVerifyFrequency(String verifyFrequency) {
		this.verifyFrequency = verifyFrequency;
	}

}
