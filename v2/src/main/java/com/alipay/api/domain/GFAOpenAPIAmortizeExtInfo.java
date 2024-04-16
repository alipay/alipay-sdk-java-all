package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财摊销扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 14:40:22
 */
public class GFAOpenAPIAmortizeExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4751143329991452338L;

	/**
	 * 待摊销金额。（单位：各币种的“元”单位，精确到小数点后两位）
	 */
	@ApiField("amortize_amount")
	private String amortizeAmount;

	/**
	 * 摊销频率
	 */
	@ApiField("amortize_period_type")
	private String amortizePeriodType;

	/**
	 * 摊销总天数
	 */
	@ApiField("amortize_total_day")
	private String amortizeTotalDay;

	/**
	 * 摊销类型
	 */
	@ApiField("amortize_type")
	private String amortizeType;

	/**
	 * 待摊销业务量
	 */
	@ApiField("amortize_volume")
	private Long amortizeVolume;

	/**
	 * 摊销失效时间。（GMT+8时区，精确到天，暂不支持小时分秒等粒度）
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 摊销生效时间。（GMT+8时区，精确到天，暂不支持小时分秒等粒度）
	 */
	@ApiField("gmt_valid")
	private Date gmtValid;

	/**
	 * 同 out_business_no 下业财已受理的总摊销金额（单位：各币种的“元”单位，精确到小数点后两位）
	 */
	@ApiField("total_amortize_amount")
	private String totalAmortizeAmount;

	public String getAmortizeAmount() {
		return this.amortizeAmount;
	}
	public void setAmortizeAmount(String amortizeAmount) {
		this.amortizeAmount = amortizeAmount;
	}

	public String getAmortizePeriodType() {
		return this.amortizePeriodType;
	}
	public void setAmortizePeriodType(String amortizePeriodType) {
		this.amortizePeriodType = amortizePeriodType;
	}

	public String getAmortizeTotalDay() {
		return this.amortizeTotalDay;
	}
	public void setAmortizeTotalDay(String amortizeTotalDay) {
		this.amortizeTotalDay = amortizeTotalDay;
	}

	public String getAmortizeType() {
		return this.amortizeType;
	}
	public void setAmortizeType(String amortizeType) {
		this.amortizeType = amortizeType;
	}

	public Long getAmortizeVolume() {
		return this.amortizeVolume;
	}
	public void setAmortizeVolume(Long amortizeVolume) {
		this.amortizeVolume = amortizeVolume;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(Date gmtValid) {
		this.gmtValid = gmtValid;
	}

	public String getTotalAmortizeAmount() {
		return this.totalAmortizeAmount;
	}
	public void setTotalAmortizeAmount(String totalAmortizeAmount) {
		this.totalAmortizeAmount = totalAmortizeAmount;
	}

}
