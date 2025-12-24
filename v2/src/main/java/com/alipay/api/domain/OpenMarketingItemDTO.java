package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展品信息
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:01:31
 */
public class OpenMarketingItemDTO extends AlipayObject {

	private static final long serialVersionUID = 7124236998352675199L;

	/**
	 * 展品权益概要
	 */
	@ApiField("benefit_summary")
	private String benefitSummary;

	/**
	 * 核心卖点描述
	 */
	@ApiField("core_selling_point_desc")
	private String coreSellingPointDesc;

	/**
	 * 权益概要高亮文案
	 */
	@ApiField("highlight_text_of_benefit_summary")
	private String highlightTextOfBenefitSummary;

	/**
	 * 展品行动点列表
	 */
	@ApiListField("item_action_list")
	@ApiField("open_marketing_action_d_t_o")
	private List<OpenMarketingActionDTO> itemActionList;

	/**
	 * 展品背景图
	 */
	@ApiField("item_bg_pic")
	private String itemBgPic;

	/**
	 * 展品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 展品logo
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 展品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 展品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 品牌信息(当展品类型是品牌时不为空)
	 */
	@ApiField("marketing_brand")
	private OpenMarketingBrandDTO marketingBrand;

	public String getBenefitSummary() {
		return this.benefitSummary;
	}
	public void setBenefitSummary(String benefitSummary) {
		this.benefitSummary = benefitSummary;
	}

	public String getCoreSellingPointDesc() {
		return this.coreSellingPointDesc;
	}
	public void setCoreSellingPointDesc(String coreSellingPointDesc) {
		this.coreSellingPointDesc = coreSellingPointDesc;
	}

	public String getHighlightTextOfBenefitSummary() {
		return this.highlightTextOfBenefitSummary;
	}
	public void setHighlightTextOfBenefitSummary(String highlightTextOfBenefitSummary) {
		this.highlightTextOfBenefitSummary = highlightTextOfBenefitSummary;
	}

	public List<OpenMarketingActionDTO> getItemActionList() {
		return this.itemActionList;
	}
	public void setItemActionList(List<OpenMarketingActionDTO> itemActionList) {
		this.itemActionList = itemActionList;
	}

	public String getItemBgPic() {
		return this.itemBgPic;
	}
	public void setItemBgPic(String itemBgPic) {
		this.itemBgPic = itemBgPic;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemLogo() {
		return this.itemLogo;
	}
	public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public OpenMarketingBrandDTO getMarketingBrand() {
		return this.marketingBrand;
	}
	public void setMarketingBrand(OpenMarketingBrandDTO marketingBrand) {
		this.marketingBrand = marketingBrand;
	}

}
