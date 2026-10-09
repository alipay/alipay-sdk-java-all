package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-08 19:12:57
 */
public class CareerOpenBaseIntentionLadarBatchDetail extends AlipayObject {

	private static final long serialVersionUID = 1117498822659492317L;

	/**
	 * 使用SM4算法加密后的身份证号密文
	 */
	@ApiField("encrypted_id_card")
	private String encryptedIdCard;

	/**
	 * 使用SM4算法加密后的手机号密文
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 广告标识符（IDFA），iOS 设备用于广告归因的匿名设备标识。
	 */
	@ApiField("idfa")
	private String idfa;

	/**
	 * 国际移动设备识别码（IMEI），用于标识具备蜂窝通信能力的移动设备。
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 开放匿名设备标识符（OAID），Android 设备用于广告归因的匿名设备标识。
	 */
	@ApiField("oaid")
	private String oaid;

	/**
	 * 调用方提供的外部业务号，长度为1至64位，仅支持英文字母和数字；需要保持业务号的唯一性，相同 out_biz_no 重复提交会被拒绝，整批申请不予受理
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEncryptedIdCard() {
		return this.encryptedIdCard;
	}
	public void setEncryptedIdCard(String encryptedIdCard) {
		this.encryptedIdCard = encryptedIdCard;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getIdfa() {
		return this.idfa;
	}
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOaid() {
		return this.oaid;
	}
	public void setOaid(String oaid) {
		this.oaid = oaid;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
