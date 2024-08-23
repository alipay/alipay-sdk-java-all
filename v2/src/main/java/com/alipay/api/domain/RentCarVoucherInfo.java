package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车券信息
 *
 * @author auto create
 * @since 1.0, 2024-06-20 10:03:36
 */
public class RentCarVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 3763394679529474419L;

	/**
	 * 租车券的金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 商户出资金额，特指交易的本商家出资，单位分
	 */
	@ApiField("merchant_contribute")
	private Long merchantContribute;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他出资，非交易本商家，可能是支付宝，可能是品牌商，或者其他方，也可能是他们的一起，单位分
	 */
	@ApiField("other_contribute")
	private Long otherContribute;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 租车券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getMerchantContribute() {
		return this.merchantContribute;
	}
	public void setMerchantContribute(Long merchantContribute) {
		this.merchantContribute = merchantContribute;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOtherContribute() {
		return this.otherContribute;
	}
	public void setOtherContribute(Long otherContribute) {
		this.otherContribute = otherContribute;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
