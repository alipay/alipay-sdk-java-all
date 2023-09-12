package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-供给-供给权益信息
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsSupplyInfo extends AlipayObject {

	private static final long serialVersionUID = 7198569292778773799L;

	/**
	 * 权益优惠信息
	 */
	@ApiField("benefit_discount")
	private BsSupplyDiscountInfo benefitDiscount;

	/**
	 * 权益商品信息
	 */
	@ApiField("benefit_item_info")
	private BsSupplyItemInfo benefitItemInfo;

	/**
	 * 权益优惠描述文案
	 */
	@ApiField("description_doc")
	private String descriptionDoc;

	/**
	 * 权益子类型，如权益是优惠券时，则是优惠券类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 供给权益类型
	 */
	@ApiField("suppl_type")
	private String supplType;

	/**
	 * 供给权益id，优惠券场景即券活动id
	 */
	@ApiField("supply_id")
	private String supplyId;

	/**
	 * 供给权益名称，如权益类型为优惠券，则是券活动名称（非券名称）
	 */
	@ApiField("supply_name")
	private String supplyName;

	public BsSupplyDiscountInfo getBenefitDiscount() {
		return this.benefitDiscount;
	}
	public void setBenefitDiscount(BsSupplyDiscountInfo benefitDiscount) {
		this.benefitDiscount = benefitDiscount;
	}

	public BsSupplyItemInfo getBenefitItemInfo() {
		return this.benefitItemInfo;
	}
	public void setBenefitItemInfo(BsSupplyItemInfo benefitItemInfo) {
		this.benefitItemInfo = benefitItemInfo;
	}

	public String getDescriptionDoc() {
		return this.descriptionDoc;
	}
	public void setDescriptionDoc(String descriptionDoc) {
		this.descriptionDoc = descriptionDoc;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSupplType() {
		return this.supplType;
	}
	public void setSupplType(String supplType) {
		this.supplType = supplType;
	}

	public String getSupplyId() {
		return this.supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}

	public String getSupplyName() {
		return this.supplyName;
	}
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

}
