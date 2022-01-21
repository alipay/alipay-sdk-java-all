package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动咨询推荐接口
 *
 * @author auto create
 * @since 1.0, 2017-12-22 11:10:59
 */
public class KoubeiMarketingCampaignIntelligentPromoConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4198128912868919811L;

	/**
	 * 扩展信息，以key-value的形式传递
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作人信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，尽量保持该字段足够复杂
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 原智能方案id
	 */
	@ApiField("parent_promo_id")
	private String parentPromoId;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 当全场普通和单品普通方案时必传，体验方案不用传
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 营销模板的编号，GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getParentPromoId() {
		return this.parentPromoId;
	}
	public void setParentPromoId(String parentPromoId) {
		this.parentPromoId = parentPromoId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
