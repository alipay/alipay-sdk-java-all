package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品详情
 *
 * @author auto create
 * @since 1.0, 2025-07-03 13:46:15
 */
public class BenefitGoodDetail extends AlipayObject {

	private static final long serialVersionUID = 6854484736859859739L;

	/**
	 * 中台商品id(B站)
	 */
	@ApiField("alipay_product_id")
	private String alipayProductId;

	/**
	 * 商品类目id(叶子类目)
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 商品详情页url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 商品有效期
	 */
	@ApiField("expiration_date")
	private String expirationDate;

	/**
	 * 扩展信息Map,存储额外的商品字段信息
	 */
	@ApiListField("ext_info")
	@ApiField("key_value_map")
	private List<KeyValueMap> extInfo;

	/**
	 * 最新变更时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 商品主图url
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 商品原价，单位分（1000表示10元）
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家回传的外部产品唯一编号，用于接口幂等控制，记录映射关系
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * INIT-待上架、ONLIN-已上架销售、OFFLINE-已下架、FROZEN-已冻结、SHELF_OUT-已售罄、DELETE-已删除
	 */
	@ApiField("out_product_status")
	private String outProductStatus;

	/**
	 * 商品所属商家id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 是否处方药
	 */
	@ApiField("prescription_drug")
	private Boolean prescriptionDrug;

	/**
	 * 商品品牌
	 */
	@ApiField("product_brand")
	private String productBrand;

	/**
	 * 如：药品69码等。创建时：商品编码为空，默认使用outProductId填充
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商品描述
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 商品功能(适应症)
	 */
	@ApiField("product_feature")
	private String productFeature;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品产地
	 */
	@ApiField("product_origin")
	private String productOrigin;

	/**
	 * 商品销售规格
	 */
	@ApiField("product_spec")
	private String productSpec;

	/**
	 * 医药商品-MEDICAL_DRUG,
体检商品-MEDICAL_EXAMINATION,
医美商品-MEDICAL_COSMETOLOGY,
口腔商品-MEDICAL_MOUTH
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 商品所属门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 蚂蚁药saas-ALIPAY_MEDICAL_SAAS,
虎鲸saas-ORCAS_SAAS,
蚂蚁B站-ALIPAY_B
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 商品副图
	 */
	@ApiListField("sub_images")
	@ApiField("string")
	private List<String> subImages;

	/**
	 * 商品副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 适用人群
	 */
	@ApiField("suitable_crowd")
	private String suitableCrowd;

	public String getAlipayProductId() {
		return this.alipayProductId;
	}
	public void setAlipayProductId(String alipayProductId) {
		this.alipayProductId = alipayProductId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public List<KeyValueMap> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<KeyValueMap> extInfo) {
		this.extInfo = extInfo;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public String getOutProductStatus() {
		return this.outProductStatus;
	}
	public void setOutProductStatus(String outProductStatus) {
		this.outProductStatus = outProductStatus;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Boolean getPrescriptionDrug() {
		return this.prescriptionDrug;
	}
	public void setPrescriptionDrug(Boolean prescriptionDrug) {
		this.prescriptionDrug = prescriptionDrug;
	}

	public String getProductBrand() {
		return this.productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductFeature() {
		return this.productFeature;
	}
	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductOrigin() {
		return this.productOrigin;
	}
	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}

	public String getProductSpec() {
		return this.productSpec;
	}
	public void setProductSpec(String productSpec) {
		this.productSpec = productSpec;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public List<String> getSubImages() {
		return this.subImages;
	}
	public void setSubImages(List<String> subImages) {
		this.subImages = subImages;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSuitableCrowd() {
		return this.suitableCrowd;
	}
	public void setSuitableCrowd(String suitableCrowd) {
		this.suitableCrowd = suitableCrowd;
	}

}
