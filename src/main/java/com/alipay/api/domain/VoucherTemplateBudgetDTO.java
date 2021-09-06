package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板预算查询结果
 *
 * @author auto create
 * @since 1.0, 2021-02-01 11:19:11
 */
public class VoucherTemplateBudgetDTO extends AlipayObject {

	private static final long serialVersionUID = 8558767265967647197L;

	/**
	 * 当前可用余额，单位：分
	 */
	@ApiField("current_amount")
	private Long currentAmount;

	/**
	 * 预算类型，MONEY代表金额，AMOUNT代表数量
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 总预算金额，单位：分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public Long getCurrentAmount() {
		return this.currentAmount;
	}
	public void setCurrentAmount(Long currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
