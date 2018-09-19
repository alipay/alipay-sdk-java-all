package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游发现平台优惠券详情
 *
 * @author auto create
 * @since 1.0, 2018-01-12 11:23:54
 */
public class PromotionInfo extends AlipayObject {

	private static final long serialVersionUID = 2756991379683435743L;

	/**
	 * 优惠品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 优惠是否已领取
	 */
	@ApiField("collected")
	private Boolean collected;

	/**
	 * 优惠领取总数
	 */
	@ApiField("collected_count")
	private Long collectedCount;

	/**
	 * 优惠详情页跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 优惠类型图标，惠折满减等
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 优惠头图
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 优惠ID
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 优惠标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 使用条件说明
	 */
	@ApiField("using_condition")
	private String usingCondition;

	/**
	 * 使用范围说明
	 */
	@ApiField("using_scope")
	private String usingScope;

	/**
	 * 优惠有效期起：格式yyyy-mm-dd，如"2017-07-18"
	 */
	@ApiField("valid_date_from")
	private String validDateFrom;

	/**
	 * 优惠有效期止：格式yyyy-mm-dd，如"2017-07-18"
	 */
	@ApiField("valid_date_to")
	private String validDateTo;

	/**
	 * 相对有效期展示文案，当valid_date_from及valid_date_to为空时，此字段必然有值
	 */
	@ApiField("valid_time_text")
	private String validTimeText;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Boolean getCollected() {
		return this.collected;
	}
	public void setCollected(Boolean collected) {
		this.collected = collected;
	}

	public Long getCollectedCount() {
		return this.collectedCount;
	}
	public void setCollectedCount(Long collectedCount) {
		this.collectedCount = collectedCount;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getMainImageUrl() {
		return this.mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsingCondition() {
		return this.usingCondition;
	}
	public void setUsingCondition(String usingCondition) {
		this.usingCondition = usingCondition;
	}

	public String getUsingScope() {
		return this.usingScope;
	}
	public void setUsingScope(String usingScope) {
		this.usingScope = usingScope;
	}

	public String getValidDateFrom() {
		return this.validDateFrom;
	}
	public void setValidDateFrom(String validDateFrom) {
		this.validDateFrom = validDateFrom;
	}

	public String getValidDateTo() {
		return this.validDateTo;
	}
	public void setValidDateTo(String validDateTo) {
		this.validDateTo = validDateTo;
	}

	public String getValidTimeText() {
		return this.validTimeText;
	}
	public void setValidTimeText(String validTimeText) {
		this.validTimeText = validTimeText;
	}

}
