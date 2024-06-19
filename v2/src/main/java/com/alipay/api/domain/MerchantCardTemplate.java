package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品
 *
 * @author auto create
 * @since 1.0, 2024-05-18 10:42:14
 */
public class MerchantCardTemplate extends AlipayObject {

	private static final long serialVersionUID = 7556397983753836224L;

	/**
	 * 商品归属的小程序appid
	 */
	@ApiField("card_template_app_id")
	private String cardTemplateAppId;

	/**
	 * 支付宝侧商品ID，创建接口不需要传
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商品名称
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

	/**
	 * 商品状态，创建接口不需要传
	 */
	@ApiField("card_template_status")
	private String cardTemplateStatus;

	/**
	 * 商品类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * <a href="https://opendocs.alipay.com/mini/e265db10_alipay.open.app.localitem.allcategory.query?pathHash=186a810a">获取类目接口文档</a>
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * （1）创建时，和image_url_list字段二选一，image_id_list优先级更高
（2）查询返回时该字段为空，返回image_url_list
	 */
	@ApiListField("image_id_list")
	@ApiField("string")
	private List<String> imageIdList;

	/**
	 * （1）创建时，和image_url_list字段二选一，image_id_list优先级更高
（2）查询返回时该字段为空，返回image_url_list
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_card_id")
	private String outCardId;

	/**
	 * 驳回原因
	 */
	@ApiListField("reject_reasons")
	@ApiField("card_reject_reason_info")
	private List<CardRejectReasonInfo> rejectReasons;

	/**
	 * 售卖信息
	 */
	@ApiField("sale_info")
	private CardTemplateSale saleInfo;

	/**
	 * 结算方式
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 使用信息
	 */
	@ApiField("use_info")
	private CardTemplateUse useInfo;

	public String getCardTemplateAppId() {
		return this.cardTemplateAppId;
	}
	public void setCardTemplateAppId(String cardTemplateAppId) {
		this.cardTemplateAppId = cardTemplateAppId;
	}

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

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public String getOutCardId() {
		return this.outCardId;
	}
	public void setOutCardId(String outCardId) {
		this.outCardId = outCardId;
	}

	public List<CardRejectReasonInfo> getRejectReasons() {
		return this.rejectReasons;
	}
	public void setRejectReasons(List<CardRejectReasonInfo> rejectReasons) {
		this.rejectReasons = rejectReasons;
	}

	public CardTemplateSale getSaleInfo() {
		return this.saleInfo;
	}
	public void setSaleInfo(CardTemplateSale saleInfo) {
		this.saleInfo = saleInfo;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public CardTemplateUse getUseInfo() {
		return this.useInfo;
	}
	public void setUseInfo(CardTemplateUse useInfo) {
		this.useInfo = useInfo;
	}

}
