package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品铸造提交
 *
 * @author auto create
 * @since 1.0, 2026-04-14 17:22:45
 */
public class AnttechNftSkuCastSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1261862234837731317L;

	/**
	 * 申请单号必须保证唯一
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 藏品的作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 创作日期，格式必须为yyyy-MM-dd
	 */
	@ApiField("creation_time")
	private String creationTime;

	/**
	 * 自定义藏品基模 true-基模，其他值为否
	 */
	@ApiField("custom_flag")
	private String customFlag;

	/**
	 * 发行藏品的自然人或公司
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 发行数量
0 代表不限量藏品
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 藏品标颜色
	 */
	@ApiField("sku_ac_color")
	private String skuAcColor;

	/**
	 * 藏品分类(一级)
	 */
	@ApiField("sku_class")
	private String skuClass;

	/**
	 * 作品简介
	 */
	@ApiField("sku_introduction")
	private String skuIntroduction;

	/**
	 * 作品名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * 作品类型
IMAGE-图片
AUDIO-音频
VIDEO-视频
THREE_DIMENSIONS-3D作品
AR-场景藏品
	 */
	@ApiField("sku_type")
	private String skuType;

	/**
	 * 关联藏品资源文件的鲸造模型ID
	 */
	@ApiField("source_file_model_id")
	private String sourceFileModelId;

	/**
	 * 藏品分类(二级级)
	 */
	@ApiField("sub_sku_class")
	private String subSkuClass;

	/**
	 * 关联藏品缩略图的鲸造模型ID
	 */
	@ApiField("thumbnail_model_id")
	private String thumbnailModelId;

	/**
	 * 不限量藏品，AC编码透出字符，只能是包含字母和数字
	 */
	@ApiField("unlimited_ac_code")
	private String unlimitedAcCode;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreationTime() {
		return this.creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getCustomFlag() {
		return this.customFlag;
	}
	public void setCustomFlag(String customFlag) {
		this.customFlag = customFlag;
	}

	public String getIssuer() {
		return this.issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuAcColor() {
		return this.skuAcColor;
	}
	public void setSkuAcColor(String skuAcColor) {
		this.skuAcColor = skuAcColor;
	}

	public String getSkuClass() {
		return this.skuClass;
	}
	public void setSkuClass(String skuClass) {
		this.skuClass = skuClass;
	}

	public String getSkuIntroduction() {
		return this.skuIntroduction;
	}
	public void setSkuIntroduction(String skuIntroduction) {
		this.skuIntroduction = skuIntroduction;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSkuType() {
		return this.skuType;
	}
	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}

	public String getSourceFileModelId() {
		return this.sourceFileModelId;
	}
	public void setSourceFileModelId(String sourceFileModelId) {
		this.sourceFileModelId = sourceFileModelId;
	}

	public String getSubSkuClass() {
		return this.subSkuClass;
	}
	public void setSubSkuClass(String subSkuClass) {
		this.subSkuClass = subSkuClass;
	}

	public String getThumbnailModelId() {
		return this.thumbnailModelId;
	}
	public void setThumbnailModelId(String thumbnailModelId) {
		this.thumbnailModelId = thumbnailModelId;
	}

	public String getUnlimitedAcCode() {
		return this.unlimitedAcCode;
	}
	public void setUnlimitedAcCode(String unlimitedAcCode) {
		this.unlimitedAcCode = unlimitedAcCode;
	}

}
