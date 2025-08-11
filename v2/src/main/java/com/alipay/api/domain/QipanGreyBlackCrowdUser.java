package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家灰黑产人群中用户信息 -注意：商家会员专用，禁止滥用，因模型升级造成的兼容性问题，后果自负
 *
 * @author auto create
 * @since 1.0, 2025-02-24 10:54:19
 */
public class QipanGreyBlackCrowdUser extends AlipayObject {

	private static final long serialVersionUID = 3183747636815432577L;

	/**
	 * 用户的支付宝账号通过加密类型加密后的结果
	 */
	@ApiField("encrypt_alipay_id")
	private String encryptAlipayId;

	/**
	 * 用户身份证号码通过加密类型加密后的结果
	 */
	@ApiField("encrypt_identity_card_id")
	private String encryptIdentityCardId;

	/**
	 * 用户的手机号通过加密类型加密后的结果
	 */
	@ApiField("encrypt_mobile_id")
	private String encryptMobileId;

	/**
	 * 本字段用于标识用户信息SHA256加密类型
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 用户入库灰黑产时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("storage_time")
	private Date storageTime;

	/**
	 * 用户的交易订单号，不需要加密
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户黑名单类型，多种类型请用英文逗号隔开，如：FRAUD,DISPUTE。
枚举值：
FRAUD：疑似欺诈
DISPUTE：案件纠纷
OVERDUE：租赁逾期
OTHER：其他黑名单
	 */
	@ApiField("user_tags")
	private String userTags;

	public String getEncryptAlipayId() {
		return this.encryptAlipayId;
	}
	public void setEncryptAlipayId(String encryptAlipayId) {
		this.encryptAlipayId = encryptAlipayId;
	}

	public String getEncryptIdentityCardId() {
		return this.encryptIdentityCardId;
	}
	public void setEncryptIdentityCardId(String encryptIdentityCardId) {
		this.encryptIdentityCardId = encryptIdentityCardId;
	}

	public String getEncryptMobileId() {
		return this.encryptMobileId;
	}
	public void setEncryptMobileId(String encryptMobileId) {
		this.encryptMobileId = encryptMobileId;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public Date getStorageTime() {
		return this.storageTime;
	}
	public void setStorageTime(Date storageTime) {
		this.storageTime = storageTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserTags() {
		return this.userTags;
	}
	public void setUserTags(String userTags) {
		this.userTags = userTags;
	}

}
