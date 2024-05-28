package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡查询
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:30:51
 */
public class AlipayMarketingCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1367626689415174174L;

	/**
	 * 用户信息 填写则作为附加条件查询
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 扩展信息，暂时没有
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作卡号。
若target_card_no_type为  BIZ_CARD，则该值为业务卡号，即alipay.marketing.card.open(会员卡开卡)返回结果中的card_info#biz_card_no。
若target_card_no_type为 D_QR_CODE 或D_BAR_CODE，则该值为动态码值。
若target_card_no_type为 EXTERNAL_CARD，则该值为外部卡号。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * 会员卡模板id。调用<a href="https://opendocs.alipay.com/open/03sx80?scene=common&pathHash=04270a28" target="_blank">alipay.marketing.card.template.create</a>（会员卡模板创建接口）创建模板后同步返回。
	 */
	@ApiField("template_id")
	private String templateId;

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
