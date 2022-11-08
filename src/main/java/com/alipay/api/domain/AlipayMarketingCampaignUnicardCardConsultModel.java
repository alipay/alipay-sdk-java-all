package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询联营卡相关信息
 *
 * @author auto create
 * @since 1.0, 2022-07-22 19:55:31
 */
public class AlipayMarketingCampaignUnicardCardConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2547832318577591896L;

	/**
	 * 联营卡-卡模板id。
限制：
1. 卡模板id和PID目前是一对一的关系；
2. 卡模板id与C端页面一一对应；
3. 同一个商户只能查询和操作自己的卡模板id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 城市码，具体的城市码与城市的映射关系需要联系支付宝研发人员确定，可能与公开数据有所出入。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝分配给每个用户的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
