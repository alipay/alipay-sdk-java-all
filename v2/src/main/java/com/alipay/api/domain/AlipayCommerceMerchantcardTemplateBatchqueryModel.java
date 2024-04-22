package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版分页查询
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:01:18
 */
public class AlipayCommerceMerchantcardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8861465786629942282L;

	/**
	 * 商品归属appid
	 */
	@ApiField("card_template_appid")
	private String cardTemplateAppid;

	/**
	 * 商品名称
	 */
	@ApiField("card_template_name")
	private String cardTemplateName;

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
