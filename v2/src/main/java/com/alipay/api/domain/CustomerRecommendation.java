package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-22 12:07:55
 */
public class CustomerRecommendation extends AlipayObject {

	private static final long serialVersionUID = 6537775257391679758L;

	/**
	 * 被推荐企业CRN，最多64字符，用于点击卡片后定位目标企业详情，不可使用请求中的商家CRN代替。示例为Mock占位值，不可用于真实跳转。
	 */
	@ApiField("company_crn")
	private String companyCrn;

	/**
	 * 被推荐企业名称，展示最多50个Unicode码点。示例为Mock企业。
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 符合约定有效性、去重、企业归属及展示授权口径的企业电话数量，不是当前账户已解锁数量。未知、查询失败或口径未核实时为null；确认没有才为0。为null时1688隐藏数量，不展示0个联系方式。本接口不返回具体号码。示例3仅为Mock，不代表实际数量或覆盖率；最大值为技术类型边界。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("contact_count")
	private Long contactCount;

	/**
	 * null
	 */
	@ApiListField("ecommerce_platforms")
	@ApiField("string")
	private List<String> ecommercePlatforms;

	/**
	 * 可展示的企业主营业务，最多200个Unicode码点，由服务端根据事实主营信息整理。缺失时为null，1688隐藏该区域，不以行业分类直接冒充。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("main_business")
	private String mainBusiness;

	/**
	 * 可直接展示的推荐理由，最多200个Unicode码点。由服务端根据实际企业画像、召回命中及加权依据组装为完整文案，1688无需拼接。仅在有可靠依据时描述品类相关、本地经营、电商开店或联系方式等信息，不虚构采购意愿、采购金额或平台内商家排名；无可靠理由时为null，1688隐藏该区域。示例仅用于展示格式。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("recommendation_reason")
	private String recommendationReason;

	/**
	 * 企业经营地，各级缺失时为null。不使用注册地址、店铺所在地或发货地冒充。1688按省、市、区顺序展示非空值，全部为空时隐藏地区。
	 */
	@ApiField("region")
	private RecommendationRegion region;

	/**
	 * 可直接展示的近一年电商销售额文案，最多64个Unicode码点。由服务端依据可靠的近12个月国内多源电商销售额区间组装，包含金额单位和边界含义，不等同于采购额，也不限定为六个平台之和。数据缺失、查询失败、无授权或口径不明确时为null，1688隐藏该区域，不补0。金额仅用于展示，不参与召回、过滤或排序。 无值时字段可省略或返回null；调用方统一按未知处理，不补0或空字符串。
	 */
	@ApiField("sales_amount_text")
	private String salesAmountText;

	public String getCompanyCrn() {
		return this.companyCrn;
	}
	public void setCompanyCrn(String companyCrn) {
		this.companyCrn = companyCrn;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getContactCount() {
		return this.contactCount;
	}
	public void setContactCount(Long contactCount) {
		this.contactCount = contactCount;
	}

	public List<String> getEcommercePlatforms() {
		return this.ecommercePlatforms;
	}
	public void setEcommercePlatforms(List<String> ecommercePlatforms) {
		this.ecommercePlatforms = ecommercePlatforms;
	}

	public String getMainBusiness() {
		return this.mainBusiness;
	}
	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	public String getRecommendationReason() {
		return this.recommendationReason;
	}
	public void setRecommendationReason(String recommendationReason) {
		this.recommendationReason = recommendationReason;
	}

	public RecommendationRegion getRegion() {
		return this.region;
	}
	public void setRegion(RecommendationRegion region) {
		this.region = region;
	}

	public String getSalesAmountText() {
		return this.salesAmountText;
	}
	public void setSalesAmountText(String salesAmountText) {
		this.salesAmountText = salesAmountText;
	}

}
