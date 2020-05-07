package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支行查询
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:55:24
 */
public class MybankPaymentTradeBankBranchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4619464981319837167L;

	/**
	 * 支持全称，或部分名称。银行名称不单独传参，需要其它条件一起使用，允许的几种模式：
1. 银行名称 + 总行联行号 + 行政地区编码
2. 银行名称 + 总行联行号
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 行政地区编码。行政地区编码不单独传参，需要其它条件一起使用，允许的几种模式：
1. 银行名称 + 总行联行号 + 行政地区编码
2. 总行联行号 + 行政地区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 总行联行号。总行联行号不单独传参，需要其它条件一起使用，允许的几种模式：
1. 银行名称 + 总行联行号 + 行政地区编码
2. 银行名称 + 总行联行号
3. 总行联行号 + 行政地区编码
	 */
	@ApiField("root_bank_code")
	private String rootBankCode;

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getRootBankCode() {
		return this.rootBankCode;
	}
	public void setRootBankCode(String rootBankCode) {
		this.rootBankCode = rootBankCode;
	}

}
