package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登记证抵押登记记录
 *
 * @author auto create
 * @since 1.0, 2026-06-25 21:29:38
 */
public class CarfinRegistrationMortgageInfo extends AlipayObject {

	private static final long serialVersionUID = 3218196786422887738L;

	/**
	 * 抵押登记日期
	 */
	@ApiField("mortgage_registration_date")
	private String mortgageRegistrationDate;

	/**
	 * 解除抵押日期
	 */
	@ApiField("mortgage_release_date")
	private String mortgageReleaseDate;

	/**
	 * 抵押权人姓名
	 */
	@ApiField("mortgagee_name")
	private String mortgageeName;

	public String getMortgageRegistrationDate() {
		return this.mortgageRegistrationDate;
	}
	public void setMortgageRegistrationDate(String mortgageRegistrationDate) {
		this.mortgageRegistrationDate = mortgageRegistrationDate;
	}

	public String getMortgageReleaseDate() {
		return this.mortgageReleaseDate;
	}
	public void setMortgageReleaseDate(String mortgageReleaseDate) {
		this.mortgageReleaseDate = mortgageReleaseDate;
	}

	public String getMortgageeName() {
		return this.mortgageeName;
	}
	public void setMortgageeName(String mortgageeName) {
		this.mortgageeName = mortgageeName;
	}

}
