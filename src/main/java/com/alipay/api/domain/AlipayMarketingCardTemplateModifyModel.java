package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡模板修改
 *
 * @author auto create
 * @since 1.0, 2020-10-23 15:19:20
 */
public class AlipayMarketingCardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4633963241887289233L;

	/**
	 * 业务卡号前缀，由商户指定
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/**
	 * 卡行动点配置；
行动点，即用户可点击跳转的区块，类似按钮控件的交互；
单张卡最多定制4个行动点。
	 */
	@ApiListField("card_action_list")
	@ApiField("template_action_info_d_t_o")
	private List<TemplateActionInfoDTO> cardActionList;

	/**
	 * 卡级别配置
	 */
	@ApiListField("card_level_conf")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConf;

	/**
	 * 卡特定标签，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("card_spec_tag")
	private String cardSpecTag;

	/**
	 * 栏位信息（卡包详情页面展现的栏位）
	 */
	@ApiListField("column_info_list")
	@ApiField("template_column_info_d_t_o")
	private List<TemplateColumnInfoDTO> columnInfoList;

	/**
	 * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
注意：商户会员卡场景不支持修改该内容。

	 */
	@ApiListField("field_rule_list")
	@ApiField("template_field_rule_d_t_o")
	private List<TemplateFieldRuleDTO> fieldRuleList;

	/**
	 * 商户动态码通知参数配置：
当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
	 */
	@ApiField("mdcode_notify_conf")
	private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

	/**
	 * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
	 */
	@ApiField("open_card_conf")
	private TemplateOpenCardConfDTO openCardConf;

	/**
	 * 卡模板投放渠道
	 */
	@ApiListField("pub_channels")
	@ApiField("pub_channel_d_t_o")
	private List<PubChannelDTO> pubChannels;

	/**
	 * 请求 ID，商户自定义且需确保每次请求唯一。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会员卡上架门店 id（支付宝门店id），即发放会员卡的商家门店id。不传则保持创建模板时信息。
注意：不支持删除已有shop_id，仅支持新增。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 权益信息，
1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

	/**
	 * 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板样式信息
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	/**
	 * 卡包详情页面中展现出的卡码（可用于扫码核销）

(1) 静态码
qrcode: 二维码，扫码得商户开卡传入的external_card_no
barcode: 条形码，扫码得商户开卡传入的external_card_no

(2) 动态码-支付宝生成码值(动态码会在2分钟左右后过期)
dqrcode: 动态二维码，扫码得到的码值可配合会员卡查询接口使用
dbarcode: 动态条形码，扫码得到的码值可配合会员卡查询接口使用

(3) 动态码-商家自主生成码值（码值、时效性都由商户控制）
mdqrcode: 商户动态二维码，扫码得商户自主传入的码值
mdbarcode: 商户动态条码，扫码得商户自主传入的码值。
如需使用商户动态码，请联系支付宝技术支持获取相关文档。
	 */
	@ApiField("write_off_type")
	private String writeOffType;

	public String getBizNoPrefix() {
		return this.bizNoPrefix;
	}
	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

	public List<TemplateActionInfoDTO> getCardActionList() {
		return this.cardActionList;
	}
	public void setCardActionList(List<TemplateActionInfoDTO> cardActionList) {
		this.cardActionList = cardActionList;
	}

	public List<TemplateCardLevelConfDTO> getCardLevelConf() {
		return this.cardLevelConf;
	}
	public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
		this.cardLevelConf = cardLevelConf;
	}

	public String getCardSpecTag() {
		return this.cardSpecTag;
	}
	public void setCardSpecTag(String cardSpecTag) {
		this.cardSpecTag = cardSpecTag;
	}

	public List<TemplateColumnInfoDTO> getColumnInfoList() {
		return this.columnInfoList;
	}
	public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}

	public List<TemplateFieldRuleDTO> getFieldRuleList() {
		return this.fieldRuleList;
	}
	public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}

	public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
		return this.mdcodeNotifyConf;
	}
	public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
		this.mdcodeNotifyConf = mdcodeNotifyConf;
	}

	public TemplateOpenCardConfDTO getOpenCardConf() {
		return this.openCardConf;
	}
	public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}

	public List<PubChannelDTO> getPubChannels() {
		return this.pubChannels;
	}
	public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
		return this.templateBenefitInfo;
	}
	public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public TemplateStyleInfoDTO getTemplateStyleInfo() {
		return this.templateStyleInfo;
	}
	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}

	public String getWriteOffType() {
		return this.writeOffType;
	}
	public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}

}
