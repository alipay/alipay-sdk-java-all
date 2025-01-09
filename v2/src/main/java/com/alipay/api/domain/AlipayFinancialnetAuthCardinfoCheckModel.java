package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验并缓存卡信息接口
 *
 * @author auto create
 * @since 1.0, 2022-11-29 19:26:25
 */
public class AlipayFinancialnetAuthCardinfoCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7342682298182262451L;

	/**
	 * 是否校验卡bin
	 */
	@ApiField("card_bin_check")
	private Boolean cardBinCheck;

	/**
	 * 可以传入明文卡号或者索引卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 信用卡的cvv2信息
	 */
	@ApiField("cvv_2")
	private String cvv2;

	/**
	 * 是否更新卡信息明确传入true或不传,均执行更新
	 */
	@ApiField("do_update")
	private Boolean doUpdate;

	/**
	 * 信用卡的有效期
	 */
	@ApiField("valid_date")
	private String validDate;

	public Boolean getCardBinCheck() {
		return this.cardBinCheck;
	}
	public void setCardBinCheck(Boolean cardBinCheck) {
		this.cardBinCheck = cardBinCheck;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCvv2() {
		return this.cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public Boolean getDoUpdate() {
		return this.doUpdate;
	}
	public void setDoUpdate(Boolean doUpdate) {
		this.doUpdate = doUpdate;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
