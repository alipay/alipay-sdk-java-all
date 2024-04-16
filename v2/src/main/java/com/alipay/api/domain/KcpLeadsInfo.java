package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * leads基本信息
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:20:08
 */
public class KcpLeadsInfo extends AlipayObject {

	private static final long serialVersionUID = 5423952163182229788L;

	/**
	 * 购买须知
	 */
	@ApiField("buy_tips")
	private String buyTips;

	/**
	 * 评论数
	 */
	@ApiField("comment_count")
	private String commentCount;

	/**
	 * 和友商比较标签
	 */
	@ApiField("compare_label")
	private String compareLabel;

	/**
	 * 友商商品唯一id
	 */
	@ApiField("deal_id")
	private String dealId;

	/**
	 * 菜品列表
	 */
	@ApiField("dish_list")
	private String dishList;

	/**
	 * 商品有效期
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 行业类型，CATERING餐饮，SERV_INDUSTRY泛行业
	 */
	@ApiField("industry_type")
	private String industryType;

	/**
	 * 适用的友商门店id
	 */
	@ApiField("jd_shop_id")
	private String jdShopId;

	/**
	 * 门店列表
	 */
	@ApiListField("kb_shop_ids")
	@ApiField("string")
	private List<String> kbShopIds;

	/**
	 * leadsid
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 满减描述
	 */
	@ApiField("minus_description")
	private String minusDescription;

	/**
	 * 价格信息
	 */
	@ApiField("price_rule")
	private String priceRule;

	/**
	 * 评分
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 销量
	 */
	@ApiField("sales")
	private String sales;

	/**
	 * 评价标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * leads类型，ITEM商品，VOUCHER代金券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 不可用日期
	 */
	@ApiField("unvalidate_info")
	private String unvalidateInfo;

	/**
	 * 适用时段
	 */
	@ApiField("valitime_info")
	private String valitimeInfo;

	/**
	 * leads版本，1：新版本；2：老版本
	 */
	@ApiField("ver")
	private String ver;

	public String getBuyTips() {
		return this.buyTips;
	}
	public void setBuyTips(String buyTips) {
		this.buyTips = buyTips;
	}

	public String getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}

	public String getCompareLabel() {
		return this.compareLabel;
	}
	public void setCompareLabel(String compareLabel) {
		this.compareLabel = compareLabel;
	}

	public String getDealId() {
		return this.dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public String getDishList() {
		return this.dishList;
	}
	public void setDishList(String dishList) {
		this.dishList = dishList;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getJdShopId() {
		return this.jdShopId;
	}
	public void setJdShopId(String jdShopId) {
		this.jdShopId = jdShopId;
	}

	public List<String> getKbShopIds() {
		return this.kbShopIds;
	}
	public void setKbShopIds(List<String> kbShopIds) {
		this.kbShopIds = kbShopIds;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getMinusDescription() {
		return this.minusDescription;
	}
	public void setMinusDescription(String minusDescription) {
		this.minusDescription = minusDescription;
	}

	public String getPriceRule() {
		return this.priceRule;
	}
	public void setPriceRule(String priceRule) {
		this.priceRule = priceRule;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSales() {
		return this.sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnvalidateInfo() {
		return this.unvalidateInfo;
	}
	public void setUnvalidateInfo(String unvalidateInfo) {
		this.unvalidateInfo = unvalidateInfo;
	}

	public String getValitimeInfo() {
		return this.valitimeInfo;
	}
	public void setValitimeInfo(String valitimeInfo) {
		this.valitimeInfo = valitimeInfo;
	}

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}
