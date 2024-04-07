package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模版信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 8613255562969476641L;

	/**
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 卡模版名称
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

	/**
	 * 卡模版状态
	 */
	@ApiField("card_template_status")
	private String cardTemplateStatus;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 卡封面图ID
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * 卡封面图Url
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	/**
	 * 行业方案类型
	 */
	@ApiField("industry_solution_type")
	private String industrySolutionType;

	/**
	 * 外部卡ID
	 */
	@ApiField("out_card_id")
	private String outCardId;

	/**
	 * 卡模版归属人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 售卖信息
	 */
	@ApiField("sale_info")
	private CardTemplateSaleInfo saleInfo;

	/**
	 * 使用信息
	 */
	@ApiField("use_info")
	private CardTemplateUseInfo useInfo;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardTemplateName() {
		return this.cardTemplateName;
	}
	public void setCardTemplateName(String cardTemplateName) {
		this.cardTemplateName = cardTemplateName;
	}

	public String getCardTemplateStatus() {
		return this.cardTemplateStatus;
	}
	public void setCardTemplateStatus(String cardTemplateStatus) {
		this.cardTemplateStatus = cardTemplateStatus;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<String> getImageIdList() {
		return this.imageIdList;
	}
	public void setImageIdList(List<String> imageIdList) {
		this.imageIdList = imageIdList;
	}

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

	public String getIndustrySolutionType() {
		return this.industrySolutionType;
	}
	public void setIndustrySolutionType(String industrySolutionType) {
		this.industrySolutionType = industrySolutionType;
	}

	public String getOutCardId() {
		return this.outCardId;
	}
	public void setOutCardId(String outCardId) {
		this.outCardId = outCardId;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public CardTemplateSaleInfo getSaleInfo() {
		return this.saleInfo;
	}
	public void setSaleInfo(CardTemplateSaleInfo saleInfo) {
		this.saleInfo = saleInfo;
	}

	public CardTemplateUseInfo getUseInfo() {
		return this.useInfo;
	}
	public void setUseInfo(CardTemplateUseInfo useInfo) {
		this.useInfo = useInfo;
	}

}
