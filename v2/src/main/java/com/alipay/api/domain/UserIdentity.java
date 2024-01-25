package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份识别信息
 *
 * @author auto create
 * @since 1.0, 2022-12-30 17:35:46
 */
public class UserIdentity extends AlipayObject {

	private static final long serialVersionUID = 4614847726579677428L;

	/**
	 * 用户身份识别值。根据type和issuer传入对应格式的值：若type为USER_ID，issuer为ALIPAY，则identity为2088开头的16位纯数字。若type为USER_ID，issuer为MERCHANT，则identity根据商户定义的格式传入。若type为BAR_CODE，issuer为ALIPAY，则identity为25~30开头的长度为16~24位数字的支付宝付款码（实际字符串长度以及规则可能会进行调整与优化，以开发者获取的付款码长度为准）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用户id的发行主体。
ALIPAY：支付宝，MERCHANT:商户。
目前issuer为MERCHANT时，type仅支持USER_ID。注：issuer为MERCHANT时，请确保商户会员体系与支付宝会员体系已打通，若需打通请联系支付宝小二或接口owner进行咨询
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 用户身份识别值(identity)在应用(appId)下的唯一标识，当type为USER_ID且issuer为ALIPAY时使用，open_id不为空时，identity不能填空字符串
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户识别ID的类型。
USRE_ID：用户id（支付宝或其他发行主体方中的用户id），BAR_CODE：付款码
	 */
	@ApiField("type")
	private String type;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIssuer() {
		return this.issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
