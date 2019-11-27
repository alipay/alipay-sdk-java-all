package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游优惠活动信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 15:17:06
 */
public class OverseaPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 5759147479634459574L;

	/**
	 * 优惠操作链接。目前仅适用于：
当优惠状态为COLLECTED_UNUSED(即当前用户已领取该优惠且未使用)时，该链接用于跳转到对应的支付宝卡券页面进行使用
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 优惠领用状态：
1. 已领取可使用COLLECTED_UNUSE
2. 未领取UNCOLLECT
3.已使用USED
	 */
	@ApiField("collect_status")
	private String collectStatus;

	/**
	 * 优惠被领取总数
	 */
	@ApiField("collected_count")
	private Long collectedCount;

	/**
	 * 优惠详情页跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 优惠图标url
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 优惠id
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 使用范围说明
	 */
	@ApiField("scope_of_use")
	private String scopeOfUse;

	/**
	 * 使用条件说明
	 */
	@ApiField("terms_of_use")
	private String termsOfUse;

	/**
	 * 优惠标题
	 */
	@ApiField("title")
	private String title;

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
	 * 相对有效期的展示文案
	 */
	@ApiField("valid_time_text")
	private String validTimeText;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCollectStatus() {
		return this.collectStatus;
	}
	public void setCollectStatus(String collectStatus) {
		this.collectStatus = collectStatus;
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

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getScopeOfUse() {
		return this.scopeOfUse;
	}
	public void setScopeOfUse(String scopeOfUse) {
		this.scopeOfUse = scopeOfUse;
	}

	public String getTermsOfUse() {
		return this.termsOfUse;
	}
	public void setTermsOfUse(String termsOfUse) {
		this.termsOfUse = termsOfUse;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
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
