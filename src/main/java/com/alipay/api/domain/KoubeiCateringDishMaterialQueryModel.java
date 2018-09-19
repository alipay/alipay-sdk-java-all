package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-02 19:50:37
 */
public class KoubeiCateringDishMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5619674643464742855L;

	/**
	 * 加料的id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 要查询的加料库的商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
