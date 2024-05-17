package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 记账本外卡查询
 *
 * @author auto create
 * @since 1.0, 2022-12-27 11:19:41
 */
public class AlipayFundAccountbookCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6574563184665768738L;

	/**
	 * 记账本外卡卡号
	 */
	@ApiField("account_book_card_no")
	private String accountBookCardNo;

	/**
	 * JSON格式，传递业务扩展参
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户会员的唯一标识，如果传入account_book_card_no此字段必传并比对一致性。
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 资金记账本的开通场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountBookCardNo() {
		return this.accountBookCardNo;
	}
	public void setAccountBookCardNo(String accountBookCardNo) {
		this.accountBookCardNo = accountBookCardNo;
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
