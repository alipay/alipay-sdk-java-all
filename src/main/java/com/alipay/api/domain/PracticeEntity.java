package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 做法模型
 *
 * @author auto create
 * @since 1.0, 2018-11-21 14:21:15
 */
public class PracticeEntity extends AlipayObject {

	private static final long serialVersionUID = 3634468823792947583L;

	/**
	 * 做法id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 做法名称
	 */
	@ApiField("practice_name")
	private String practiceName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPracticeName() {
		return this.practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
