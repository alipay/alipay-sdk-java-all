package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换码生成
 *
 * @author auto create
 * @since 1.0, 2022-07-22 19:55:41
 */
public class AlipayMarketingCampaignUnicardExcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2552585279229555217L;

	/**
	 * 联营卡-卡模板id。 限制： 1. 卡模板id和PID目前是一对一的关系； 2. 卡模板id与C端页面一一对应； 3. 同一个商户只能查询和操作自己的卡模板id
来源：商户在B站配置后分配
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 城市码，具体的城市码与城市的映射关系需要联系支付宝研发人员确定，可能与公开数据有所出入。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 参数名：外部业务单号
应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询
如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
