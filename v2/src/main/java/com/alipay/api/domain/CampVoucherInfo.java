package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动和券模版信息
 *
 * @author auto create
 * @since 1.0, 2021-07-12 21:21:34
 */
public class CampVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 2191267359365729211L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 券优惠金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 品牌logo
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 封顶金额，单位元
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券折扣
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 券优惠类型
	 */
	@ApiField("discount_calc_type")
	private String discountCalcType;

	/**
	 * 门槛金额，单位元
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 本次可以使用改券的商品条码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 活动状态
INIT("INIT", "已创建"),
    P_AUDIT("P_AUDIT", "已提交审核"),
    AUDIT("AUDIT", "已审核"),
    WAIT_ACTIVE("WAIT_ACTIVE","提交激活"),
    ACTIVE("ACTIVE", "已发布"),
    PAUSE("PAUSE", "已暂停"),
    FINISHED("FINISHED", "已结束"),
    DISCARD("DISCARD", "已废弃"),
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券描述
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDiscountCalcType() {
		return this.discountCalcType;
	}
	public void setDiscountCalcType(String discountCalcType) {
		this.discountCalcType = discountCalcType;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
