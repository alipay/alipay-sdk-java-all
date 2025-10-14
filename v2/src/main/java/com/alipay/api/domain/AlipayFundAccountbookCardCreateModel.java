package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账本开通卡
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:34:48
 */
public class AlipayFundAccountbookCardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5695854317452954481L;

	/**
	 * JSON格式，传递业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部商户系统会员的唯一标识，自定义传入
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部商户用户类型:BUSINESS_EMPLOYEE
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	/**
	 * 资金记账本的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public String getMerchantUserType() {
		return this.merchantUserType;
	}
	public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
