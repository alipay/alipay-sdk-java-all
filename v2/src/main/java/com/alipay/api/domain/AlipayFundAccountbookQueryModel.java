package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账号的信息查询
 *
 * @author auto create
 * @since 1.0, 2025-03-26 19:52:19
 */
public class AlipayFundAccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3144117253247782957L;

	/**
	 * 记账账簿id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 传递业务扩展参数。
注意：ext_info字段本质上是String类型，所以传递
的是转义后的json字符串。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户会员的唯一标识，如果传入account_book_id此字段必传并比对一致性。
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 资金记账本的开通场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
