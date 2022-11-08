package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务券信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:40:04
 */
public class TaskVoucherBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 5568567353887494747L;

	/**
	 * 券图标
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 代金券面额
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 门槛金额
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 总核销次数
	 */
	@ApiField("total_used_count")
	private Long totalUsedCount;

	/**
	 * 门店核销次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 任务模板编号
	 */
	@ApiField("voucher_template_no")
	private String voucherTemplateNo;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public Long getTotalUsedCount() {
		return this.totalUsedCount;
	}
	public void setTotalUsedCount(Long totalUsedCount) {
		this.totalUsedCount = totalUsedCount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherTemplateNo() {
		return this.voucherTemplateNo;
	}
	public void setVoucherTemplateNo(String voucherTemplateNo) {
		this.voucherTemplateNo = voucherTemplateNo;
	}

}
