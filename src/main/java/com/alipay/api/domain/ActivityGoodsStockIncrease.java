package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消百万小店项目活动单品库存变更
 *
 * @author auto create
 * @since 1.0, 2022-04-15 16:26:28
 */
public class ActivityGoodsStockIncrease extends AlipayObject {

	private static final long serialVersionUID = 4152413583745599387L;

	/**
	 * 单品唯一标识，标品使用69码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 活动权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 活动权益增补库存
	 */
	@ApiField("increase_stock")
	private String increaseStock;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getIncreaseStock() {
		return this.increaseStock;
	}
	public void setIncreaseStock(String increaseStock) {
		this.increaseStock = increaseStock;
	}

}
