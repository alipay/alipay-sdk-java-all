package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源包列表信息
 *
 * @author auto create
 * @since 1.0, 2023-10-11 09:44:08
 */
public class ResourcePackageInfo extends AlipayObject {

	private static final long serialVersionUID = 7378716166819184959L;

	/**
	 * 是否可以变配
	 */
	@ApiField("can_alter")
	private Boolean canAlter;

	/**
	 * 不能变配的原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 原始单价(分)
	 */
	@ApiField("original_unit_amount")
	private String originalUnitAmount;

	/**
	 * 产品计费项列表
	 */
	@ApiListField("product_fee_items")
	@ApiField("product_fee_item")
	private List<ProductFeeItem> productFeeItems;

	/**
	 * 资源包规格编码
 - public_cloudd_cd_cn_free_bag(免费版)
 - public_cloudd_cd_cn_base_bag(基础版)
 - public_cloudd_cd_cn_standard_bag(标准版)
 - public_cloudd_cd_cn_pro_bag(专业版)
 - public_cloudd_cd_cn_ent_bag(企业版)
 - public_cloudd_cd_cn_flagship_bag(旗舰版)
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 资源包规格描述
	 */
	@ApiField("spec_desc")
	private String specDesc;

	/**
	 * 资源包规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 折扣后单价(分)
	 */
	@ApiField("trade_unit_amount")
	private String tradeUnitAmount;

	public Boolean getCanAlter() {
		return this.canAlter;
	}
	public void setCanAlter(Boolean canAlter) {
		this.canAlter = canAlter;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getOriginalUnitAmount() {
		return this.originalUnitAmount;
	}
	public void setOriginalUnitAmount(String originalUnitAmount) {
		this.originalUnitAmount = originalUnitAmount;
	}

	public List<ProductFeeItem> getProductFeeItems() {
		return this.productFeeItems;
	}
	public void setProductFeeItems(List<ProductFeeItem> productFeeItems) {
		this.productFeeItems = productFeeItems;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecDesc() {
		return this.specDesc;
	}
	public void setSpecDesc(String specDesc) {
		this.specDesc = specDesc;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getTradeUnitAmount() {
		return this.tradeUnitAmount;
	}
	public void setTradeUnitAmount(String tradeUnitAmount) {
		this.tradeUnitAmount = tradeUnitAmount;
	}

}
