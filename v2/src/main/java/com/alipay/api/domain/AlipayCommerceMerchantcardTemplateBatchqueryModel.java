package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版分页查询
 *
 * @author auto create
 * @since 1.0, 2024-09-02 19:26:16
 */
public class AlipayCommerceMerchantcardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4224443399912694554L;

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

}
