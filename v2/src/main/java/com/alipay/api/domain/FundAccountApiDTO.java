package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金专户信息
 *
 * @author auto create
 * @since 1.0, 2023-09-25 17:16:26
 */
public class FundAccountApiDTO extends AlipayObject {

	private static final long serialVersionUID = 4711993984724917162L;

	/**
	 * 资金专户ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 资金专户可用余额，最多两位小数（元）
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 资金专户应用场景是否开启
	 */
	@ApiField("enable_status")
	private String enableStatus;

	/**
	 * 资金专户应用场景码
	 */
	@ApiField("scene")
	private String scene;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getEnableStatus() {
		return this.enableStatus;
	}
	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
