package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收估价产品信息（估价产品是用户选择的产品，可能跟实际商家质检产品型号不一致）
 *
 * @author auto create
 * @since 1.0, 2025-07-23 11:12:35
 */
public class RecycleAssessProductVO extends AlipayObject {

	private static final long serialVersionUID = 5562823349938685197L;

	/**
	 * 估价最高金额、固定价
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 单位：元。
当估价类型=区间价的时候，需要传入
	 */
	@ApiField("assess_min_amount")
	private String assessMinAmount;

	/**
	 * 最低重量
	 */
	@ApiField("assess_min_quality")
	private String assessMinQuality;

	/**
	 * 除去称重外，其他3C、酒水、潮奢按unit_type=piece件计数
	 */
	@ApiField("assess_quality")
	private String assessQuality;

	/**
	 * FIXED：固定价

RANGE_UNIT：浮动数量固定单价，如统收衣物称斤
--对应区间重量

RANGE_PRICE：区间价，如潮奢、酒水
--对应区间价
	 */
	@ApiField("assess_type")
	private String assessType;

	/**
	 * 回收商户的产品编码
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 回收商的产品名称
	 */
	@ApiField("out_sku_name")
	private String outSkuName;

	/**
	 * 3C品类
● 手机PHONE
● 电脑COMPUTER
● 平板PAD
● 智能手表WATCH
● 手环BAND
● 无人机DRONE
● 游戏机GAME
● 数码配件ACCESSORIES
● 相机CAMERA
● 其他数码产品OTHERS

潮品: FASHION
奢品: LUXURY
	 */
	@ApiField("product_category")
	private String productCategory;

	/**
	 * 支付宝侧的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品图片
	 */
	@ApiField("product_logo")
	private String productLogo;

	/**
	 * 支付宝侧的回收产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * PIECE：一部手机、一瓶酒水
KG：衣物称斤，一公斤
G：黄金按克重算单价
	 */
	@ApiField("unit_type")
	private String unitType;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getAssessMinAmount() {
		return this.assessMinAmount;
	}
	public void setAssessMinAmount(String assessMinAmount) {
		this.assessMinAmount = assessMinAmount;
	}

	public String getAssessMinQuality() {
		return this.assessMinQuality;
	}
	public void setAssessMinQuality(String assessMinQuality) {
		this.assessMinQuality = assessMinQuality;
	}

	public String getAssessQuality() {
		return this.assessQuality;
	}
	public void setAssessQuality(String assessQuality) {
		this.assessQuality = assessQuality;
	}

	public String getAssessType() {
		return this.assessType;
	}
	public void setAssessType(String assessType) {
		this.assessType = assessType;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getOutSkuName() {
		return this.outSkuName;
	}
	public void setOutSkuName(String outSkuName) {
		this.outSkuName = outSkuName;
	}

	public String getProductCategory() {
		return this.productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductLogo() {
		return this.productLogo;
	}
	public void setProductLogo(String productLogo) {
		this.productLogo = productLogo;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnitType() {
		return this.unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
