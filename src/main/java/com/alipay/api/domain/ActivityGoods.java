package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消百万小店项目，活动单品数据
 *
 * @author auto create
 * @since 1.0, 2022-04-28 10:27:58
 */
public class ActivityGoods extends AlipayObject {

	private static final long serialVersionUID = 3836897466263689544L;

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
	 * 活动权益信息
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 活动库存
	 */
	@ApiField("stock")
	private String stock;

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

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getStock() {
		return this.stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}

}
