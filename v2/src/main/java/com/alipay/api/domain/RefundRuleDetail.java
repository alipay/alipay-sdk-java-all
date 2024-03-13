package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退订规则详情
 *
 * @author auto create
 * @since 1.0, 2024-01-24 10:57:34
 */
public class RefundRuleDetail extends AlipayObject {

	private static final long serialVersionUID = 2446567257521388685L;

	/**
	 * 固定日期
当relativeDateType为ABSOLUTE时这个字段有值
	 */
	@ApiField("absolute_date")
	private String absoluteDate;

	/**
	 * 取消时扣款金额计算基数
取消时扣款金额基数(首晚价格:FIRST_NIGHT_PRICE；订单总价:FULL_NIGHT_PRICE)，
实际扣款金额为 deductBaseType*decuctPercent
	 */
	@ApiField("deduct_base_type")
	private String deductBaseType;

	/**
	 * 取消时扣款比例(0.01-100.00)，实际扣款金额为 deductBaseType*deductPercent
	 */
	@ApiField("deduct_percent")
	private String deductPercent;

	/**
	 * 相对日期类别
	 */
	@ApiField("relative_date_type")
	private String relativeDateType;

	/**
	 * 对入住日提前分钟数
相对入住日提前的分钟数,当relativeDateType为CHECK_IN时这个字段有值,相对的是CHECK_IN日期的24点提前的分钟数。如入住日是2015-12-22号，则可取消时间是 2015-12-22 23:59:59 - relativeMinute 点之前可退
	 */
	@ApiField("relative_minute")
	private Long relativeMinute;

	public String getAbsoluteDate() {
		return this.absoluteDate;
	}
	public void setAbsoluteDate(String absoluteDate) {
		this.absoluteDate = absoluteDate;
	}

	public String getDeductBaseType() {
		return this.deductBaseType;
	}
	public void setDeductBaseType(String deductBaseType) {
		this.deductBaseType = deductBaseType;
	}

	public String getDeductPercent() {
		return this.deductPercent;
	}
	public void setDeductPercent(String deductPercent) {
		this.deductPercent = deductPercent;
	}

	public String getRelativeDateType() {
		return this.relativeDateType;
	}
	public void setRelativeDateType(String relativeDateType) {
		this.relativeDateType = relativeDateType;
	}

	public Long getRelativeMinute() {
		return this.relativeMinute;
	}
	public void setRelativeMinute(Long relativeMinute) {
		this.relativeMinute = relativeMinute;
	}

}
