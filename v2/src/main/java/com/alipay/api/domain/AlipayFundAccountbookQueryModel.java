package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账号的信息查询
 *
 * @author auto create
 * @since 1.0, 2023-03-31 10:17:16
 */
public class AlipayFundAccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8392233678429586479L;

	/**
	 * 记账账簿id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * JSON格式，传递业务扩展参数
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
