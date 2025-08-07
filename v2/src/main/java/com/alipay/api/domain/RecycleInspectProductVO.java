package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收质检产品模型
 *
 * @author auto create
 * @since 1.0, 2025-06-25 14:43:28
 */
public class RecycleInspectProductVO extends AlipayObject {

	private static final long serialVersionUID = 5236572753351518873L;

	/**
	 * 单个产品的质检金额
	 */
	@ApiField("inspect_price")
	private String inspectPrice;

	/**
	 * 商户侧的产品编码
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商户产品名称
	 */
	@ApiField("out_sku_name")
	private String outSkuName;

	/**
	 * 回收品类
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
	 */
	@ApiField("product_category")
	private String productCategory;

	/**
	 * 支付宝侧的标准产品编码, 和商户外部OUT_SKU_ID二选一填入
	 */
	@ApiField("product_code")
	private String productCode;

	public String getInspectPrice() {
		return this.inspectPrice;
	}
	public void setInspectPrice(String inspectPrice) {
		this.inspectPrice = inspectPrice;
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

}
