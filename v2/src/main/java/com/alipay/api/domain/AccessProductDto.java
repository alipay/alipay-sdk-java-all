package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品对象
 *
 * @author auto create
 * @since 1.0, 2023-05-10 14:03:36
 */
public class AccessProductDto extends AlipayObject {

	private static final long serialVersionUID = 6757811492245169551L;

	/**
	 * buyer_work_no，用于商品同步，由调用方传入。
	 */
	@ApiField("buyer_work_no")
	private String buyerWorkNo;

	/**
	 * catalog_category_id，用于商品同步，由调用方传入
	 */
	@ApiField("catalog_category_id")
	private Long catalogCategoryId;

	/**
	 * category_code，用于商品同步，由调用方传入
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * data_source，用于商品同步，由调用方传入
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * img_url_list，用于商品同步，由调用方传入
	 */
	@ApiListField("img_url_list")
	@ApiField("string")
	private List<String> imgUrlList;

	/**
	 * lead_pur_org，用于商品同步，由调用方传入
	 */
	@ApiListField("leading_pur_org")
	@ApiField("string")
	private List<String> leadingPurOrg;

	/**
	 * mall_url，用于商品同步，由调用方传入
	 */
	@ApiField("mall_url")
	private String mallUrl;

	/**
	 * order_type，用于商品同步，由调用方传入
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * product_attr_value_list，用于商品同步，由调用方传入
	 */
	@ApiListField("product_attr_value_list")
	@ApiField("access_product_attr_value_dto")
	private List<AccessProductAttrValueDto> productAttrValueList;

	/**
	 * product_desc，用于商品同步，由调用方传入
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * product_name，用于商品同步，由调用方传入
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * purchase_channel，用于商品同步，由调用方传入
	 */
	@ApiField("purchase_channel")
	private String purchaseChannel;

	/**
	 * recommendation，用于商品同步，由调用方传入
	 */
	@ApiField("recommendation")
	private String recommendation;

	/**
	 * source_category_id，用于商品同步，由调用方传入
	 */
	@ApiField("source_category_id")
	private Long sourceCategoryId;

	/**
	 * source_category_name，用于商品同步，由调用方传入
	 */
	@ApiField("source_category_name")
	private String sourceCategoryName;

	/**
	 * source_type，用于商品同步，由调用方传入
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * source_value，用于商品同步，由调用方传入
	 */
	@ApiField("source_value")
	private String sourceValue;

	/**
	 * unit，用于商品同步，由调用方传入
	 */
	@ApiField("unit")
	private String unit;

	public String getBuyerWorkNo() {
		return this.buyerWorkNo;
	}
	public void setBuyerWorkNo(String buyerWorkNo) {
		this.buyerWorkNo = buyerWorkNo;
	}

	public Long getCatalogCategoryId() {
		return this.catalogCategoryId;
	}
	public void setCatalogCategoryId(Long catalogCategoryId) {
		this.catalogCategoryId = catalogCategoryId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public List<String> getImgUrlList() {
		return this.imgUrlList;
	}
	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
	}

	public List<String> getLeadingPurOrg() {
		return this.leadingPurOrg;
	}
	public void setLeadingPurOrg(List<String> leadingPurOrg) {
		this.leadingPurOrg = leadingPurOrg;
	}

	public String getMallUrl() {
		return this.mallUrl;
	}
	public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<AccessProductAttrValueDto> getProductAttrValueList() {
		return this.productAttrValueList;
	}
	public void setProductAttrValueList(List<AccessProductAttrValueDto> productAttrValueList) {
		this.productAttrValueList = productAttrValueList;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPurchaseChannel() {
		return this.purchaseChannel;
	}
	public void setPurchaseChannel(String purchaseChannel) {
		this.purchaseChannel = purchaseChannel;
	}

	public String getRecommendation() {
		return this.recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public Long getSourceCategoryId() {
		return this.sourceCategoryId;
	}
	public void setSourceCategoryId(Long sourceCategoryId) {
		this.sourceCategoryId = sourceCategoryId;
	}

	public String getSourceCategoryName() {
		return this.sourceCategoryName;
	}
	public void setSourceCategoryName(String sourceCategoryName) {
		this.sourceCategoryName = sourceCategoryName;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceValue() {
		return this.sourceValue;
	}
	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
