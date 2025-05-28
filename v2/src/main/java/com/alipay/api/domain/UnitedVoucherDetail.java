package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销消费券场景 券详情信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 14:37:40
 */
public class UnitedVoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 4724878462222547464L;

	/**
	 * 券激活时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 单据id（同一次领奖请求里领到的券的单据id相同）
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 封顶金额（仅适用于折扣券）
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 券折扣类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 券过期时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 券满减门槛-满金额，单位：元
	 */
	@ApiField("from_amount")
	private String fromAmount;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品发放时间
	 */
	@ApiField("prize_send_time")
	private Date prizeSendTime;

	/**
	 * 券折扣比例（仅适用于折扣券）
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 券展示顺序
	 */
	@ApiField("show_order")
	private Long showOrder;

	/**
	 * 券可用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券满减门槛-减金额（仅适用于满减券），单位：元
	 */
	@ApiField("to_amount")
	private String toAmount;

	/**
	 * 券所属行业/类目
	 */
	@ApiField("voucher_biz_code")
	private String voucherBizCode;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getFromAmount() {
		return this.fromAmount;
	}
	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public Date getPrizeSendTime() {
		return this.prizeSendTime;
	}
	public void setPrizeSendTime(Date prizeSendTime) {
		this.prizeSendTime = prizeSendTime;
	}

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public Long getShowOrder() {
		return this.showOrder;
	}
	public void setShowOrder(Long showOrder) {
		this.showOrder = showOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getToAmount() {
		return this.toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public String getVoucherBizCode() {
		return this.voucherBizCode;
	}
	public void setVoucherBizCode(String voucherBizCode) {
		this.voucherBizCode = voucherBizCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
