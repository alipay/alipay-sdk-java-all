package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 特种卡信息模型对象
 *
 * @author auto create
 * @since 1.0, 2025-08-04 17:01:51
 */
public class SpecialCardInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3648154165565199361L;

	/**
	 * 按钮的跳转链接
	 */
	@ApiField("action_link")
	private String actionLink;

	/**
	 * 点击的按钮文案
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 描述是否可用信息
	 */
	@ApiField("card_business_types_full_name")
	private String cardBusinessTypesFullName;

	/**
	 * 描述卡片业务类型
	 */
	@ApiListField("card_business_types_key")
	@ApiField("string")
	private List<String> cardBusinessTypesKey;

	/**
	 * 卡片的描述信息
	 */
	@ApiField("card_desc")
	private String cardDesc;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡标题信息
	 */
	@ApiField("card_title")
	private String cardTitle;

	/**
	 * 卡类型参数
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 不同用户特种码的不同状态类型
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 用来描述已经认证的特种类型
	 */
	@ApiListField("effective_dentification_types")
	@ApiField("string")
	private List<String> effectiveDentificationTypes;

	/**
	 * 卡面链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	public String getActionLink() {
		return this.actionLink;
	}
	public void setActionLink(String actionLink) {
		this.actionLink = actionLink;
	}

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getCardBusinessTypesFullName() {
		return this.cardBusinessTypesFullName;
	}
	public void setCardBusinessTypesFullName(String cardBusinessTypesFullName) {
		this.cardBusinessTypesFullName = cardBusinessTypesFullName;
	}

	public List<String> getCardBusinessTypesKey() {
		return this.cardBusinessTypesKey;
	}
	public void setCardBusinessTypesKey(List<String> cardBusinessTypesKey) {
		this.cardBusinessTypesKey = cardBusinessTypesKey;
	}

	public String getCardDesc() {
		return this.cardDesc;
	}
	public void setCardDesc(String cardDesc) {
		this.cardDesc = cardDesc;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardTitle() {
		return this.cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCodeStatus() {
		return this.codeStatus;
	}
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public List<String> getEffectiveDentificationTypes() {
		return this.effectiveDentificationTypes;
	}
	public void setEffectiveDentificationTypes(List<String> effectiveDentificationTypes) {
		this.effectiveDentificationTypes = effectiveDentificationTypes;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
