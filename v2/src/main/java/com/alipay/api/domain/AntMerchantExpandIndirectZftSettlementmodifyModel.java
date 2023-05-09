package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户结算信息修改
 *
 * @author auto create
 * @since 1.0, 2023-04-06 19:16:39
 */
public class AntMerchantExpandIndirectZftSettlementmodifyModel extends AlipayObject {

	private static final long serialVersionUID = 4228432865862164936L;

	/**
	 * 结算支付宝账号，资金结算到支付宝账号时必填。填入的支付宝账号需已实名认证，且与商户同主体(个体工商户可以与负责人或营业执照名称相同)
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 结算银行卡，如果结算到支付宝账号，则不需要填写。本业务当前只允许传入一张结算卡
	 */
	@ApiField("biz_cards")
	private SettleCardInfo bizCards;

	/**
	 * 默认结算规则。当调用收单接口，结算条款中设置默认结算规则时，交易资金将结算至此处设置的默认结算目标账户中。其详细描述及收单接口传参示例参考功能包文档
	 */
	@ApiField("default_settle_rule")
	private DefaultSettleRule defaultSettleRule;

	/**
	 * 授权函。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 二级商户支付宝商户号，进件成功后由支付宝返回。
	 */
	@ApiField("smid")
	private String smid;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public SettleCardInfo getBizCards() {
		return this.bizCards;
	}
	public void setBizCards(SettleCardInfo bizCards) {
		this.bizCards = bizCards;
	}

	public DefaultSettleRule getDefaultSettleRule() {
		return this.defaultSettleRule;
	}
	public void setDefaultSettleRule(DefaultSettleRule defaultSettleRule) {
		this.defaultSettleRule = defaultSettleRule;
	}

	public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}
	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
