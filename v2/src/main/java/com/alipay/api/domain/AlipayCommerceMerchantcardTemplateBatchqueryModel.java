package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版分页查询
 *
 * @author auto create
 * @since 1.0, 2024-12-20 13:31:52
 */
public class AlipayCommerceMerchantcardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5776437168359978962L;

	/**
	 * 卡的归属appid
	 */
	@ApiField("card_template_appid")
	private String cardTemplateAppid;

	/**
	 * 卡名称
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

	/**
	 * 卡类型。需要查询次卡周期付时不用传。查询金额卡必传AXF_MONEY_CARD
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardTemplateAppid() {
		return this.cardTemplateAppid;
	}
	public void setCardTemplateAppid(String cardTemplateAppid) {
		this.cardTemplateAppid = cardTemplateAppid;
	}

	public String getCardTemplateName() {
		return this.cardTemplateName;
	}
	public void setCardTemplateName(String cardTemplateName) {
		this.cardTemplateName = cardTemplateName;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
