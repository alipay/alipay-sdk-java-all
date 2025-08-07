package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邮寄信息
 *
 * @author auto create
 * @since 1.0, 2025-03-05 11:38:45
 */
public class PostInfo extends AlipayObject {

	private static final long serialVersionUID = 1665927579281963854L;

	/**
	 * 客服电话
	 */
	@ApiField("customer_service_phone")
	private String customerServicePhone;

	/**
	 * 收件地址
	 */
	@ApiField("receiving_address")
	private String receivingAddress;

	/**
	 * 收件单位
	 */
	@ApiField("receiving_unit")
	private String receivingUnit;

	/**
	 * 补充资料信息，不包含额外扩展信息
	 */
	@ApiField("supplementary_data_info")
	private String supplementaryDataInfo;

	public String getCustomerServicePhone() {
		return this.customerServicePhone;
	}
	public void setCustomerServicePhone(String customerServicePhone) {
		this.customerServicePhone = customerServicePhone;
	}

	public String getReceivingAddress() {
		return this.receivingAddress;
	}
	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}

	public String getReceivingUnit() {
		return this.receivingUnit;
	}
	public void setReceivingUnit(String receivingUnit) {
		this.receivingUnit = receivingUnit;
	}

	public String getSupplementaryDataInfo() {
		return this.supplementaryDataInfo;
	}
	public void setSupplementaryDataInfo(String supplementaryDataInfo) {
		this.supplementaryDataInfo = supplementaryDataInfo;
	}

}
