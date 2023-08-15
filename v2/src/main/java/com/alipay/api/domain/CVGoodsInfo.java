package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CV商品信息
 *
 * @author auto create
 * @since 1.0, 2022-11-30 16:42:35
 */
public class CVGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 5675544556665337795L;

	/**
	 * 对应算法id
	 */
	@ApiField("algorithm_id")
	private String algorithmId;

	/**
	 * 商品大类
	 */
	@ApiField("big_category")
	private String bigCategory;

	/**
	 * 商品类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 进深[毫米]-静态时需必填
	 */
	@ApiField("depth")
	private String depth;

	/**
	 * standardGoods为true时必填
	 */
	@ApiField("gb_code")
	private String gbCode;

	/**
	 * 商品SKU的名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 高[毫米]-静态时需必填
	 */
	@ApiField("height")
	private String height;

	/**
	 * 1(正面)、2(左侧)、3(右侧)、4(背面)、5(顶部)，6(底部)、7(69码特写照)
	 */
	@ApiField("img_info")
	private String imgInfo;

	/**
	 * 对应主外观算法id
	 */
	@ApiField("main_algorithm_id")
	private String mainAlgorithmId;

	/**
	 * 软包类型
	 */
	@ApiField("package_type")
	private String packageType;

	/**
	 * 商品小类
	 */
	@ApiField("small_category")
	private String smallCategory;

	/**
	 * 是否标准商品，标准商品必填69码
	 */
	@ApiField("standard_goods")
	private Boolean standardGoods;

	/**
	 * 样本重量[克]：多个,分割
	 */
	@ApiField("weight_list")
	private String weightList;

	/**
	 * 宽[毫米]-静态时需必填
	 */
	@ApiField("width")
	private String width;

	public String getAlgorithmId() {
		return this.algorithmId;
	}
	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

	public String getBigCategory() {
		return this.bigCategory;
	}
	public void setBigCategory(String bigCategory) {
		this.bigCategory = bigCategory;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDepth() {
		return this.depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getGbCode() {
		return this.gbCode;
	}
	public void setGbCode(String gbCode) {
		this.gbCode = gbCode;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getImgInfo() {
		return this.imgInfo;
	}
	public void setImgInfo(String imgInfo) {
		this.imgInfo = imgInfo;
	}

	public String getMainAlgorithmId() {
		return this.mainAlgorithmId;
	}
	public void setMainAlgorithmId(String mainAlgorithmId) {
		this.mainAlgorithmId = mainAlgorithmId;
	}

	public String getPackageType() {
		return this.packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getSmallCategory() {
		return this.smallCategory;
	}
	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}

	public Boolean getStandardGoods() {
		return this.standardGoods;
	}
	public void setStandardGoods(Boolean standardGoods) {
		this.standardGoods = standardGoods;
	}

	public String getWeightList() {
		return this.weightList;
	}
	public void setWeightList(String weightList) {
		this.weightList = weightList;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
