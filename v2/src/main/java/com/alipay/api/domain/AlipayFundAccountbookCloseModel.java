package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 记账本注销
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:27:57
 */
public class AlipayFundAccountbookCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7356427652687317346L;

	/**
	 * 资金记账本ID，指定需要注销的资金记账本
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 资金记账本的补充参数，根据当前业务场景的不同，实际传递会有差异，请根据实际业务场景来组织参数。
	 */
	@ApiField("business_params")
	private AccountCloseBusinessParams businessParams;

	/**
	 * 资金记账本场景，用于区分不同业务场景的记账本
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public AccountCloseBusinessParams getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(AccountCloseBusinessParams businessParams) {
		this.businessParams = businessParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
