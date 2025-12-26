package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:32:38
 */
public class EduOrderCourseDetail extends AlipayObject {

	private static final long serialVersionUID = 4386183245681727671L;

	/**
	 * 上课结束日期
	 */
	@ApiField("course_end_date")
	private Date courseEndDate;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 上课起始日期
	 */
	@ApiField("course_start_date")
	private Date courseStartDate;

	/**
	 * 直减金额/手续费/亏损费，度量单位人民币，单位：元。
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 扣除金额类型，请参考枚举
	 */
	@ApiField("deduction_amount_type")
	private String deductionAmountType;

	/**
	 * 订单明细ID
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 折扣（百分比，9折即存90，计算需转换）
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * 赠送数量/转出赠送数量
	 */
	@ApiField("gift_quantity")
	private String giftQuantity;

	/**
	 * 赠送数量单位
CLASS_HOUR：课时
DAY：天
MONTH：月
PIECE：件
PACKET：笔
YUAN：元
	 */
	@ApiField("gift_quantity_unit")
	private String giftQuantityUnit;

	/**
	 * 商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 关联原订单id（转课、退课、退物品、退费用）
	 */
	@ApiField("ori_order_id")
	private String oriOrderId;

	/**
	 * 商品原金额/转出金额（含手续费）/转出金额（不含亏损费），单位：元。
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 优惠后金额/转出金额（不含手续费）/转出金额（含亏损费），单位：元。
	 */
	@ApiField("original_price_after_discount")
	private String originalPriceAfterDiscount;

	/**
	 * INCOME-收入
EXPENSE-支出
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * COURSE：课程
ARTICLE：物品
FEE：费用
RECHARGE：充值
	 */
	@ApiField("purchase_item_type")
	private String purchaseItemType;

	/**
	 * 购买数量或转出购买数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 购买数量单位
CLASS_HOUR：课时
DAY：天
MONTH：月
PIECE：件
PACKET：笔
	 */
	@ApiField("quantity_unit")
	private String quantityUnit;

	/**
	 * 商品规格价格，单位：元。
	 */
	@ApiField("spec_current_price")
	private String specCurrentPrice;

	/**
	 * 商品规格ID
	 */
	@ApiField("spec_id")
	private String specId;

	/**
	 * 商品规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 所属套餐商品ID，若为-1，表示商品不在某个套餐中
	 */
	@ApiField("suite_commodity_id")
	private String suiteCommodityId;

	/**
	 * 所属套餐商品名称
	 */
	@ApiField("suite_commodity_name")
	private String suiteCommodityName;

	/**
	 * 欠费金额，单位：元。
	 */
	@ApiField("unpaid_amount")
	private String unpaidAmount;

	public Date getCourseEndDate() {
		return this.courseEndDate;
	}
	public void setCourseEndDate(Date courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Date getCourseStartDate() {
		return this.courseStartDate;
	}
	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDeductionAmountType() {
		return this.deductionAmountType;
	}
	public void setDeductionAmountType(String deductionAmountType) {
		this.deductionAmountType = deductionAmountType;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public String getGiftQuantity() {
		return this.giftQuantity;
	}
	public void setGiftQuantity(String giftQuantity) {
		this.giftQuantity = giftQuantity;
	}

	public String getGiftQuantityUnit() {
		return this.giftQuantityUnit;
	}
	public void setGiftQuantityUnit(String giftQuantityUnit) {
		this.giftQuantityUnit = giftQuantityUnit;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getOriOrderId() {
		return this.oriOrderId;
	}
	public void setOriOrderId(String oriOrderId) {
		this.oriOrderId = oriOrderId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOriginalPriceAfterDiscount() {
		return this.originalPriceAfterDiscount;
	}
	public void setOriginalPriceAfterDiscount(String originalPriceAfterDiscount) {
		this.originalPriceAfterDiscount = originalPriceAfterDiscount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPurchaseItemType() {
		return this.purchaseItemType;
	}
	public void setPurchaseItemType(String purchaseItemType) {
		this.purchaseItemType = purchaseItemType;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return this.quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public String getSpecCurrentPrice() {
		return this.specCurrentPrice;
	}
	public void setSpecCurrentPrice(String specCurrentPrice) {
		this.specCurrentPrice = specCurrentPrice;
	}

	public String getSpecId() {
		return this.specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSuiteCommodityId() {
		return this.suiteCommodityId;
	}
	public void setSuiteCommodityId(String suiteCommodityId) {
		this.suiteCommodityId = suiteCommodityId;
	}

	public String getSuiteCommodityName() {
		return this.suiteCommodityName;
	}
	public void setSuiteCommodityName(String suiteCommodityName) {
		this.suiteCommodityName = suiteCommodityName;
	}

	public String getUnpaidAmount() {
		return this.unpaidAmount;
	}
	public void setUnpaidAmount(String unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}

}
