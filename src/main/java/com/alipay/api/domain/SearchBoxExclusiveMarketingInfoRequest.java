package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * box活动申请入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:54
 */
public class SearchBoxExclusiveMarketingInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 7766555962154566753L;

	/**
	 * 状态
	 */
	@ApiField("action")
	private String action;

	/**
	 * 活动类型，MARETING/营销活动、MEMBERSHIP/开卡活动、CUSTOM/自定义活动
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 活动链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 申请人id
	 */
	@ApiField("applier_id")
	private String applierId;

	/**
	 * 品牌boxid
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 活动工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 素材链接
	 */
	@ApiField("material_link")
	private String materialLink;

	/**
	 * 素材类型 IMAGE/VIDEO(图片/视频)
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 定向规则
	 */
	@ApiField("oriented_rules")
	private SearchProductOrientedRuleOpenApi orientedRules;

	/**
	 * 活动id
	 */
	@ApiField("serv_code")
	private String servCode;

	/**
	 * 目标时段，包括全天的时段和全年的时段
	 */
	@ApiField("target_period")
	private SearchProductPeriod targetPeriod;

	/**
	 * 目标区域，为list，元素为区域模型标识区域类型和具体区域
	 */
	@ApiListField("target_region")
	@ApiField("search_product_region")
	private List<SearchProductRegion> targetRegion;

	/**
	 * 活动标题
	 */
	@ApiField("title")
	private String title;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getApplierId() {
		return this.applierId;
	}
	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMaterialLink() {
		return this.materialLink;
	}
	public void setMaterialLink(String materialLink) {
		this.materialLink = materialLink;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public SearchProductOrientedRuleOpenApi getOrientedRules() {
		return this.orientedRules;
	}
	public void setOrientedRules(SearchProductOrientedRuleOpenApi orientedRules) {
		this.orientedRules = orientedRules;
	}

	public String getServCode() {
		return this.servCode;
	}
	public void setServCode(String servCode) {
		this.servCode = servCode;
	}

	public SearchProductPeriod getTargetPeriod() {
		return this.targetPeriod;
	}
	public void setTargetPeriod(SearchProductPeriod targetPeriod) {
		this.targetPeriod = targetPeriod;
	}

	public List<SearchProductRegion> getTargetRegion() {
		return this.targetRegion;
	}
	public void setTargetRegion(List<SearchProductRegion> targetRegion) {
		this.targetRegion = targetRegion;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
