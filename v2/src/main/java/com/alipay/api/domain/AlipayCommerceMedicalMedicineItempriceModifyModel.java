package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品商品价格修改接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 13:59:50
 */
public class AlipayCommerceMedicalMedicineItempriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4421725674939183922L;

	/**
	 * 支付宝平台侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 原价，单位分，例如传入101代表1.01元
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 外部唯一标识商品的id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 特价后的价格，单位分，例如传入100代表1元
	 */
	@ApiField("sale_price")
	private Long salePrice;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

}
