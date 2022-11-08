package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订购查询及实时报价接口
 *
 * @author auto create
 * @since 1.0, 2022-08-30 22:10:14
 */
public class AlipayInsSceneEcommercePurchasequoteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3448199384686526388L;

	/**
	 * 商品信息
订购主体为商品时必传
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 报价范围

ALL_INSURE_PLAN : 对所有保障方案报价
SELETED_INSURE_PLAN : 只对已选方案报价
NONE : 无需报价
	 */
	@ApiField("quote_scope")
	private String quoteScope;

	/**
	 * 订购主体类型
PURCHASE_USER : 订购人(即商家)
ECOM_ITEM : 商品
	 */
	@ApiField("related_subject_type")
	private String relatedSubjectType;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getQuoteScope() {
		return this.quoteScope;
	}
	public void setQuoteScope(String quoteScope) {
		this.quoteScope = quoteScope;
	}

	public String getRelatedSubjectType() {
		return this.relatedSubjectType;
	}
	public void setRelatedSubjectType(String relatedSubjectType) {
		this.relatedSubjectType = relatedSubjectType;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}
