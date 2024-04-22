package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券修改模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class VoucherModifyInfo extends AlipayObject {

	private static final long serialVersionUID = 6125831468818889619L;

	/**
	 * 追加的适用门店
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	/**
	 * 描述信息
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 使用须知
	 */
	@ApiListField("voucher_terms")
	@ApiField("voucher_term_info")
	private List<VoucherTermInfo> voucherTerms;

	public List<String> getSuitableShops() {
		return this.suitableShops;
	}
	public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public List<VoucherTermInfo> getVoucherTerms() {
		return this.voucherTerms;
	}
	public void setVoucherTerms(List<VoucherTermInfo> voucherTerms) {
		this.voucherTerms = voucherTerms;
	}

}
