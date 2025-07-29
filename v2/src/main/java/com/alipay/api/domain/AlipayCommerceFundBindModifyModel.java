package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金行业银行卡换绑接口
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:54:39
 */
public class AlipayCommerceFundBindModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6162758187176618777L;

	/**
	 * 已经绑定的银行卡对应的代扣协议号。用户完成新卡的授权签约后，接口会将该协议号对应的代扣协议解绑。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 绑卡记录过期时间，默认产期有效（1年）
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 绑卡流水号，用来标识一次绑卡行为，商户维度下需确保唯一
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	/**
	 * 用户绑卡成功后，回调到基金APP的URL
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getOutBindNo() {
		return this.outBindNo;
	}
	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
