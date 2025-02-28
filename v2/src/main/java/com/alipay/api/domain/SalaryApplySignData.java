package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发薪申请的签约信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 15:22:04
 */
public class SalaryApplySignData extends AlipayObject {

	private static final long serialVersionUID = 5653632521846869597L;

	/**
	 * 授权平台的appId
	 */
	@ApiField("ori_app_id")
	private String oriAppId;

	/**
	 * 签名编码，大小写敏感
	 */
	@ApiField("ori_char_set")
	private String oriCharSet;

	/**
	 * 转账申请的外部单号
	 */
	@ApiField("ori_out_biz_no")
	private String oriOutBizNo;

	/**
	 * 转账申请的签名
	 */
	@ApiField("ori_sign")
	private String oriSign;

	/**
	 * 商户签名算法，注意次字段大小写敏感。
	 */
	@ApiField("ori_sign_type")
	private String oriSignType;

	/**
	 * 授权平台的账号ID
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
