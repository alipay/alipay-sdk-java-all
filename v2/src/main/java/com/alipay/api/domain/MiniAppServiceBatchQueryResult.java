package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-13 10:52:45
 */
public class MiniAppServiceBatchQueryResult extends AlipayObject {

	private static final long serialVersionUID = 7794786619328151624L;

	/**
	 * 会员频道历史累计销量,若>10000以万为单位
	 */
	@ApiField("aggre_sales")
	private String aggreSales;

	/**
	 * true：可用，false：不可用
	 */
	@ApiField("available")
	private Boolean available;

	/**
	 * 商品详情页跳转URL
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 行家说名称（图鲲）
	 */
	@ApiField("expert_remark")
	private String expertRemark;

	/**
	 * 行家说头像（图鲲）
	 */
	@ApiField("expert_remark_icon")
	private String expertRemarkIcon;

	/**
	 * null
	 */
	@ApiListField("featured_labels")
	@ApiField("string")
	private List<String> featuredLabels;

	/**
	 * 用于调用方关联商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * null
	 */
	@ApiListField("marketing_labels")
	@ApiField("string")
	private List<String> marketingLabels;

	/**
	 * 积分
	 */
	@ApiField("point")
	private String point;

	/**
	 * 单位为元，货币单位为CNY
	 */
	@ApiField("point_preferential_yuan")
	private String pointPreferentialYuan;

	/**
	 * 排行榜跳转链接URL
	 */
	@ApiField("rank_link")
	private String rankLink;

	/**
	 * 所在排行榜供给排名
	 */
	@ApiField("rank_pos")
	private String rankPos;

	/**
	 * 不可用原因
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	/**
	 * 会员服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 所在榜单二级类目名称
	 */
	@ApiField("sub_cat_name")
	private String subCatName;

	/**
	 * 单位为元，货币单位为CNY
	 */
	@ApiField("yuan")
	private String yuan;

	public String getAggreSales() {
		return this.aggreSales;
	}
	public void setAggreSales(String aggreSales) {
		this.aggreSales = aggreSales;
	}

	public Boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getExpertRemark() {
		return this.expertRemark;
	}
	public void setExpertRemark(String expertRemark) {
		this.expertRemark = expertRemark;
	}

	public String getExpertRemarkIcon() {
		return this.expertRemarkIcon;
	}
	public void setExpertRemarkIcon(String expertRemarkIcon) {
		this.expertRemarkIcon = expertRemarkIcon;
	}

	public List<String> getFeaturedLabels() {
		return this.featuredLabels;
	}
	public void setFeaturedLabels(List<String> featuredLabels) {
		this.featuredLabels = featuredLabels;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getMarketingLabels() {
		return this.marketingLabels;
	}
	public void setMarketingLabels(List<String> marketingLabels) {
		this.marketingLabels = marketingLabels;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getPointPreferentialYuan() {
		return this.pointPreferentialYuan;
	}
	public void setPointPreferentialYuan(String pointPreferentialYuan) {
		this.pointPreferentialYuan = pointPreferentialYuan;
	}

	public String getRankLink() {
		return this.rankLink;
	}
	public void setRankLink(String rankLink) {
		this.rankLink = rankLink;
	}

	public String getRankPos() {
		return this.rankPos;
	}
	public void setRankPos(String rankPos) {
		this.rankPos = rankPos;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSubCatName() {
		return this.subCatName;
	}
	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	public String getYuan() {
		return this.yuan;
	}
	public void setYuan(String yuan) {
		this.yuan = yuan;
	}

}
