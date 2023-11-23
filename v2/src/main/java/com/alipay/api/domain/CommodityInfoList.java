package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品类信息列表
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:33:14
 */
public class CommodityInfoList extends AlipayObject {

	private static final long serialVersionUID = 2159632597737322678L;

	/**
	 * 品类生效地区码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 基础面额，单位为分
	 */
	@ApiField("basic_amount")
	private String basicAmount;

	/**
	 * 特殊面额（一般为权益金）
	 */
	@ApiField("benefit_amout")
	private String benefitAmout;

	/**
	 * 品类类目枚举，平台映射
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 品类型（储值方案、商品、权益方案）由平台分配
	 */
	@ApiField("commodity_type")
	private String commodityType;

	/**
	 * 关联用户数量
	 */
	@ApiField("customer_amount")
	private String customerAmount;

	/**
	 * 商品跳转链接
	 */
	@ApiField("directing_url")
	private String directingUrl;

	/**
	 * 展示图片地址
	 */
	@ApiField("display_img_url")
	private String displayImgUrl;

	/**
	 * 商品描述
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 失效时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 月销量
	 */
	@ApiField("monthly_sale")
	private String monthlySale;

	/**
	 * 外部资源品类的id（长度<128）
	 */
	@ApiField("out_commodity_id")
	private String outCommodityId;

	/**
	 * 生效日期（Date类型）
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * A、U，生效、失效状态，为枚举值
	 */
	@ApiField("status")
	private String status;

	/**
	 * 品类二级类目枚举，平台映射
	 */
	@ApiField("sub_category")
	private String subCategory;

	/**
	 * 标签列表，需要映射到平台的标签，否则无法处理，联系平台添加
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 总销量
	 */
	@ApiField("total_sale")
	private String totalSale;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBasicAmount() {
		return this.basicAmount;
	}
	public void setBasicAmount(String basicAmount) {
		this.basicAmount = basicAmount;
	}

	public String getBenefitAmout() {
		return this.benefitAmout;
	}
	public void setBenefitAmout(String benefitAmout) {
		this.benefitAmout = benefitAmout;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityType() {
		return this.commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	public String getCustomerAmount() {
		return this.customerAmount;
	}
	public void setCustomerAmount(String customerAmount) {
		this.customerAmount = customerAmount;
	}

	public String getDirectingUrl() {
		return this.directingUrl;
	}
	public void setDirectingUrl(String directingUrl) {
		this.directingUrl = directingUrl;
	}

	public String getDisplayImgUrl() {
		return this.displayImgUrl;
	}
	public void setDisplayImgUrl(String displayImgUrl) {
		this.displayImgUrl = displayImgUrl;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInventory() {
		return this.inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getMonthlySale() {
		return this.monthlySale;
	}
	public void setMonthlySale(String monthlySale) {
		this.monthlySale = monthlySale;
	}

	public String getOutCommodityId() {
		return this.outCommodityId;
	}
	public void setOutCommodityId(String outCommodityId) {
		this.outCommodityId = outCommodityId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubCategory() {
		return this.subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getTotalSale() {
		return this.totalSale;
	}
	public void setTotalSale(String totalSale) {
		this.totalSale = totalSale;
	}

}
