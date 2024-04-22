package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车费用明细
 *
 * @author auto create
 * @since 1.0, 2023-12-04 22:46:22
 */
public class RentCarFeeItem extends AlipayObject {

	private static final long serialVersionUID = 3629279491362233844L;

	/**
	 * 费用金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 费用描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 费用名称。租金、车行服务费等标准费用不需要此字段，字词段用于一些商户自定义的非标准费用
	 */
	@ApiField("name")
	private String name;

	/**
	 * 保障服务费用或增值服务费用必传此字段
	 */
	@ApiField("unique_code")
	private String uniqueCode;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUniqueCode() {
		return this.uniqueCode;
	}
	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

}
