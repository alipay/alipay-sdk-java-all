package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡模板创建
 *
 * @author auto create
 * @since 1.0, 2022-02-15 10:43:58
 */
public class AlipayMarketingCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7742925394457823935L;

	/**
	 * 业务卡号前缀，由商户指定
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/**
	 * 业务卡号后缀的长度，取值范围为[8,32]
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
由于业务卡号最长不超过32位，所以biz_no_suffix_len <= 32 - biz_no_prefix的位数。注：biz_no_suffix_len一旦指定，在模板修改时不支持修改。
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/**
	 * 卡行动点配置；
行动点，即用户可点击跳转的区块，类似按钮控件的交互；
单张卡最多定制3个行动点。如果各项的配置内容完全一样，展示时会进行去重。
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
	 * 卡类型。可选类型如下：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 栏位信息
	 */
	@ApiListField("column_info_list")
	@ApiField("template_column_info_d_t_o")
	private List<TemplateColumnInfoDTO> columnInfoList;

	/**
	 * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
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
	 * 付费外卡配置。只供特定业务使用，通常接入无需关注
	 */
	@ApiField("paid_outer_card_conf")
	private PaidOuterCardTemplateConfDTO paidOuterCardConf;

	/**
	 * 卡模板投放渠道
	 */
	@ApiListField("pub_channels")
	@ApiField("pub_channel_d_t_o")
	private List<PubChannelDTO> pubChannels;

	/**
	 * 请求ID，商家自定义且并保证唯一性。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务Code
HUABEI_FUWU：花呗服务（只有需要花呗服务时，才需要加入该标识）
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/**
	 * 会员卡上架门店id（支付宝门店id），即发放会员卡的商家门店id
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 权益信息，
1、在卡包的卡详情页面会自动添加“会员权益”栏位，展现此字段配置的会员卡权益信息，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

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
mdbarcode: 商户动态条码，扫码得商户自主传入的码值
如需使用商户动态码，对接详情参见 <a href="https://opendocs.alipay.com/open/02y7gt">商户动态发码</a>。
	 */
	@ApiField("write_off_type")
	private String writeOffType;

	public String getBizNoPrefix() {
		return this.bizNoPrefix;
	}
	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

	public String getBizNoSuffixLen() {
		return this.bizNoSuffixLen;
	}
	public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
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

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public PaidOuterCardTemplateConfDTO getPaidOuterCardConf() {
		return this.paidOuterCardConf;
	}
	public void setPaidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
		this.paidOuterCardConf = paidOuterCardConf;
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

	public List<String> getServiceLabelList() {
		return this.serviceLabelList;
	}
	public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
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
