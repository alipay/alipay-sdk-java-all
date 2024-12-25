package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 15:41:20
 */
public class AlipayMarketingVoucherTemplatedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3786424765583438785L;

	/** 
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。当券类型为无资金单品券（ITEM_CASHLESS_FIX_VOUCHER、ITEM_CASHLESS_DISCOUNT_VOUCHER、ITEM_CASHLESS_SPE_VOUCHER）时，暂不支持查询本参数，出参为0
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 最低额度。券的最低使用门槛金额，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不小于0，小数点以后最多保留两位。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/** 
	 * 已发放总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("publish_amount")
	private String publishAmount;

	/** 
	 * 已发放张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("publish_count")
	private Long publishCount;

	/** 
	 * 发放结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 发放开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 退回金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)、‘删除’(D)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 总金额面额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。仅代金券有效。当券类型为无资金单品券（ITEM_CASHLESS_FIX_VOUCHER、ITEM_CASHLESS_DISCOUNT_VOUCHER、ITEM_CASHLESS_SPE_VOUCHER）时，暂不支持查询本参数，出参为0
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 已使用总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("used_amount")
	private String usedAmount;

	/** 
	 * 已使用张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("used_count")
	private Long usedCount;

	/** 
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/** 
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 拟发行券的数量。单位为张。该数值是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/** 
	 * 券类型。可枚举，暂时只支持代金券(FIX_VOUCHER)、无资金单品代金券（ITEM_CASHLESS_FIX_VOUCHER）、无资金单品折扣券（ITEM_CASHLESS_DISCOUNT_VOUCHER）、无资金单品特价券（ITEM_CASHLESS_SPE_VOUCHER）
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}
	public String getFloorAmount( ) {
		return this.floorAmount;
	}

	public void setPublishAmount(String publishAmount) {
		this.publishAmount = publishAmount;
	}
	public String getPublishAmount( ) {
		return this.publishAmount;
	}

	public void setPublishCount(Long publishCount) {
		this.publishCount = publishCount;
	}
	public Long getPublishCount( ) {
		return this.publishCount;
	}

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}
	public Date getPublishStartTime( ) {
		return this.publishStartTime;
	}

	public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}
	public String getRecycleAmount( ) {
		return this.recycleAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}
	public String getUsedAmount( ) {
		return this.usedAmount;
	}

	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}
	public Long getUsedCount( ) {
		return this.usedCount;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}
	public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public String getVoucherName( ) {
		return this.voucherName;
	}

	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}
	public Long getVoucherQuantity( ) {
		return this.voucherQuantity;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}
	public String getVoucherValidPeriod( ) {
		return this.voucherValidPeriod;
	}

}
