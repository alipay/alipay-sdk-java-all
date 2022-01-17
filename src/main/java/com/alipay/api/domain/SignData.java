package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签名原始信息
 *
 * @author auto create
 * @since 1.0, 2021-04-27 15:13:53
 */
public class SignData extends AlipayObject {

	private static final long serialVersionUID = 5346484345881187348L;

	/**
	 * 签名商户开放平台应用APPID
	 */
	@ApiField("ori_app_id")
	private String oriAppId;

	/**
	 * 编码类型（大小写敏感）
	 */
	@ApiField("ori_char_set")
	private String oriCharSet;

	/**
	 * ori_out_biz_no_001
	 */
	@ApiField("ori_out_biz_no")
	private String oriOutBizNo;

	/**
	 * 签名密文
	 */
	@ApiField("ori_sign")
	private String oriSign;

	/**
	 * 签名算法（大小写敏感）
	 */
	@ApiField("ori_sign_type")
	private String oriSignType;

	/**
	 * 2088041181118800
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getOriAppId() {
		return this.oriAppId;
	}
	public void setOriAppId(String oriAppId) {
		this.oriAppId = oriAppId;
	}

	public String getOriCharSet() {
		return this.oriCharSet;
	}
	public void setOriCharSet(String oriCharSet) {
		this.oriCharSet = oriCharSet;
	}

	public String getOriOutBizNo() {
		return this.oriOutBizNo;
	}
	public void setOriOutBizNo(String oriOutBizNo) {
		this.oriOutBizNo = oriOutBizNo;
	}

	public String getOriSign() {
		return this.oriSign;
	}
	public void setOriSign(String oriSign) {
		this.oriSign = oriSign;
	}

	public String getOriSignType() {
		return this.oriSignType;
	}
	public void setOriSignType(String oriSignType) {
		this.oriSignType = oriSignType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
