package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateActionInfoDTO;
import com.alipay.api.domain.TemplateCardLevelConfDTO;
import com.alipay.api.domain.TemplateColumnInfoDTO;
import com.alipay.api.domain.TemplateFieldRuleDTO;
import com.alipay.api.domain.TemplateMdcodeNotifyConfDTO;
import com.alipay.api.domain.TemplateOpenCardConfDTO;
import com.alipay.api.domain.PaidOuterCardTemplateConfDTO;
import com.alipay.api.domain.PubChannelDTO;
import com.alipay.api.domain.TemplateBenefitInfoDTO;
import com.alipay.api.domain.TemplateStyleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 23:11:57
 */
public class AlipayMarketingCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4384958337121389848L;

	/** 
	 * 业务卡号前缀，由商户指定
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/** 
	 * 业务卡号后缀的长度
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/** 
	 * 卡行动点配置；
行动点，即用户可点击跳转的区块，类似按钮控件的交互；
单张卡最多4个行动点。
	 */
	@ApiListField("card_action_list")
	@ApiField("template_action_info_d_t_o")
	private List<TemplateActionInfoDTO> cardActionList;

	/** 
	 * 卡等级配置
	 */
	@ApiListField("card_level_confs")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConfs;

	/** 
	 * 卡特定标签，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("card_spec_tag")
	private String cardSpecTag;

	/** 
	 * 会员卡类型：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 栏位信息（卡包详情页面展现的栏位）
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
当write_off_type指定为商户动态码mdbarcode或mdqrcode时不为空；
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
	 * 服务标签列表
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/** 
	 * 门店ids
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * spi_app_id：若使用openspi模式开卡，该字段为创建模版时，设置的实现spi.alipay.user.opencard.get接口的app_id
	 */
	@ApiField("spi_app_id")
	private String spiAppId;

	/** 
	 * 权益信息，
1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

	/** 
	 * 模板样式信息(钱包展现效果)
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}
	public String getBizNoPrefix( ) {
		return this.bizNoPrefix;
	}

	public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
	}
	public String getBizNoSuffixLen( ) {
		return this.bizNoSuffixLen;
	}

	public void setCardActionList(List<TemplateActionInfoDTO> cardActionList) {
		this.cardActionList = cardActionList;
	}
	public List<TemplateActionInfoDTO> getCardActionList( ) {
		return this.cardActionList;
	}

	public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
		this.cardLevelConfs = cardLevelConfs;
	}
	public List<TemplateCardLevelConfDTO> getCardLevelConfs( ) {
		return this.cardLevelConfs;
	}

	public void setCardSpecTag(String cardSpecTag) {
		this.cardSpecTag = cardSpecTag;
	}
	public String getCardSpecTag( ) {
		return this.cardSpecTag;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}
	public List<TemplateColumnInfoDTO> getColumnInfoList( ) {
		return this.columnInfoList;
	}

	public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}
	public List<TemplateFieldRuleDTO> getFieldRuleList( ) {
		return this.fieldRuleList;
	}

	public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
		this.mdcodeNotifyConf = mdcodeNotifyConf;
	}
	public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf( ) {
		return this.mdcodeNotifyConf;
	}

	public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}
	public TemplateOpenCardConfDTO getOpenCardConf( ) {
		return this.openCardConf;
	}

	public void setPaidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
		this.paidOuterCardConf = paidOuterCardConf;
	}
	public PaidOuterCardTemplateConfDTO getPaidOuterCardConf( ) {
		return this.paidOuterCardConf;
	}

	public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}
	public List<PubChannelDTO> getPubChannels( ) {
		return this.pubChannels;
	}

	public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
	}
	public List<String> getServiceLabelList( ) {
		return this.serviceLabelList;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	public void setSpiAppId(String spiAppId) {
		this.spiAppId = spiAppId;
	}
	public String getSpiAppId( ) {
		return this.spiAppId;
	}

	public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}
	public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo( ) {
		return this.templateBenefitInfo;
	}

	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}
	public TemplateStyleInfoDTO getTemplateStyleInfo( ) {
		return this.templateStyleInfo;
	}

}
