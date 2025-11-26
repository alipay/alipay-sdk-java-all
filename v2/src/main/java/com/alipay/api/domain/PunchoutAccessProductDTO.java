package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * punchout模式产品对象信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:09:33
 */
public class PunchoutAccessProductDTO extends AlipayObject {

	private static final long serialVersionUID = 3349647113778619153L;

	/**
	 * brand_id，用于punchout模式产品同步
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * brand_name，用于punchout模式产品同步
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * buyer_work_no，用于punchout模式产品同步
	 */
	@ApiField("buyer_work_no")
	private String buyerWorkNo;

	/**
	 * catalog_category_id，用于punchout模式产品同步
	 */
	@ApiField("catalog_category_id")
	private Long catalogCategoryId;

	/**
	 * category_code，用于punchout模式产品同步
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * category_id,用于punchout模式产品同步
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * category_use_id，用于punchout模式产品同步
	 */
	@ApiField("category_use_id")
	private Long categoryUseId;

	/**
	 * data_source,用于punchout模式产品同步
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * front_category_id,用于punchout模式产品同步
	 */
	@ApiField("front_category_id")
	private Long frontCategoryId;

	/**
	 * img_storage_type，用于punchout模式产品同步
	 */
	@ApiField("img_storage_type")
	private String imgStorageType;

	/**
	 * img_url_list,用于punchout模式产品同步
	 */
	@ApiListField("img_url_list")
	@ApiField("string")
	private List<String> imgUrlList;

	/**
	 * mall_url，用于punchout模式产品同步
	 */
	@ApiField("mall_url")
	private String mallUrl;

	/**
	 * oerder_type,用于punchout模式产品同步
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * product_attr_value_list，用于punchout模式产品同步
	 */
	@ApiListField("product_attr_value_list")
	@ApiField("punchout_access_product_attr_value_dto")
	private List<PunchoutAccessProductAttrValueDto> productAttrValueList;

	/**
	 * product_desc，用于punchout模式产品同步
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * product_name，用于punchout模式产品同步
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * purchase_channel,用于punchout模式产品同步
	 */
	@ApiField("purchase_channel")
	private String purchaseChannel;

	/**
	 * recommendation，用于punchout模式产品同步
	 */
	@ApiField("recommendation")
	private String recommendation;

	/**
	 * source_category_id，用于punchout模式产品同步
	 */
	@ApiField("source_category_id")
	private String sourceCategoryId;

	/**
	 * source_category_name,用于punchout模式产品同步
	 */
	@ApiField("source_category_name")
	private String sourceCategoryName;

	/**
	 * source_info，用于punchout模式产品同步
	 */
	@ApiField("source_info")
	private String sourceInfo;

	/**
	 * source_type，用于punchout模式产品同步
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * source_value，用于punchout模式产品同步
	 */
	@ApiField("source_value")
	private String sourceValue;

	/**
	 * tenant_id,用于punchout模式产品同步
	 */
	@ApiField("tenant_id")
	private Long tenantId;

	/**
	 * unit，用于punchout模式产品同步
	 */
	@ApiField("unit")
	private String unit;

	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

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

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryUseId() {
		return this.categoryUseId;
	}
	public void setCategoryUseId(Long categoryUseId) {
		this.categoryUseId = categoryUseId;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Long getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(Long frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public String getImgStorageType() {
		return this.imgStorageType;
	}
	public void setImgStorageType(String imgStorageType) {
		this.imgStorageType = imgStorageType;
	}

	public List<String> getImgUrlList() {
		return this.imgUrlList;
	}
	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
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

	public List<PunchoutAccessProductAttrValueDto> getProductAttrValueList() {
		return this.productAttrValueList;
	}
	public void setProductAttrValueList(List<PunchoutAccessProductAttrValueDto> productAttrValueList) {
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

	public String getSourceCategoryId() {
		return this.sourceCategoryId;
	}
	public void setSourceCategoryId(String sourceCategoryId) {
		this.sourceCategoryId = sourceCategoryId;
	}

	public String getSourceCategoryName() {
		return this.sourceCategoryName;
	}
	public void setSourceCategoryName(String sourceCategoryName) {
		this.sourceCategoryName = sourceCategoryName;
	}

	public String getSourceInfo() {
		return this.sourceInfo;
	}
	public void setSourceInfo(String sourceInfo) {
		this.sourceInfo = sourceInfo;
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

	public Long getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
