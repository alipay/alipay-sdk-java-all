package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验用户信息的合法性和一致性
 *
 * @author auto create
 * @since 1.0, 2026-04-15 20:52:45
 */
public class AlipayFundUserinfoCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1134255298229881713L;

	/**
	 * 业务场景码，固定值：USER_INFO_CHECK
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 按"姓名_身份证号_user_id_salt"格式拼接后，用SM3算法加密后并用Base64编码
	 */
	@ApiField("encrypted_user_info")
	private String encryptedUserInfo;

	/**
	 * 支付宝open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码，固定值：BANK_TO_ALIPAY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用于加密的随机数
	 */
	@ApiField("salt")
	private String salt;

	/**
	 * 用户支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEncryptedUserInfo() {
		return this.encryptedUserInfo;
	}
	public void setEncryptedUserInfo(String encryptedUserInfo) {
		this.encryptedUserInfo = encryptedUserInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSalt() {
		return this.salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
