package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源包询价
 *
 * @author auto create
 * @since 1.0, 2023-08-17 12:59:45
 */
public class AlipayCloudCloudbaseResourcepackageConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2427376474413132453L;

	/**
	 * 资源包时间单位数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 资源包规格CODE
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_basic_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_enterprise_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 资源包时间单位
 - 1_M
	 */
	@ApiField("time_unit")
	private String timeUnit;

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}
