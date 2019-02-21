package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员模板创建
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:37:25
 */
public class KoubeiMarketingCampaignMemberTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3362146681179155714L;

	/**
	 * 会员模板的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 卡行动点配置； 
行动点，即用户可点击跳转的区块，类似按钮控件的交互； 
最多定制4个行动点。
	 */
	@ApiListField("member_actions")
	@ApiField("member_action_model")
	private List<MemberActionModel> memberActions;

	/**
	 * 会员资产
	 */
	@ApiListField("member_assets")
	@ApiField("member_asset_model")
	private List<MemberAssetModel> memberAssets;

	/**
	 * 权益信息，在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权
	 */
	@ApiListField("member_benefits")
	@ApiField("member_benefit_model")
	private List<MemberBenefitModel> memberBenefits;

	/**
	 * 会员模板下的等级列表
	 */
	@ApiListField("member_levels")
	@ApiField("member_level_model")
	private List<MemberLevelModel> memberLevels;

	/**
	 * 用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
	 */
	@ApiField("member_open_info")
	private MemberOpenInfoModel memberOpenInfo;

	/**
	 * 会员模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部会员模板号
	 */
	@ApiField("out_template_id")
	private String outTemplateId;

	/**
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 卡包详情页面中展现出的卡码（可用于扫码核销）
qrcode: 二维码，扫码得商户开卡传入的external_card_no 
barcode: 条形码，扫码得商户开卡传入的external_card_no
	 */
	@ApiField("write_off_type")
	private String writeOffType;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<MemberActionModel> getMemberActions() {
		return this.memberActions;
	}
	public void setMemberActions(List<MemberActionModel> memberActions) {
		this.memberActions = memberActions;
	}

	public List<MemberAssetModel> getMemberAssets() {
		return this.memberAssets;
	}
	public void setMemberAssets(List<MemberAssetModel> memberAssets) {
		this.memberAssets = memberAssets;
	}

	public List<MemberBenefitModel> getMemberBenefits() {
		return this.memberBenefits;
	}
	public void setMemberBenefits(List<MemberBenefitModel> memberBenefits) {
		this.memberBenefits = memberBenefits;
	}

	public List<MemberLevelModel> getMemberLevels() {
		return this.memberLevels;
	}
	public void setMemberLevels(List<MemberLevelModel> memberLevels) {
		this.memberLevels = memberLevels;
	}

	public MemberOpenInfoModel getMemberOpenInfo() {
		return this.memberOpenInfo;
	}
	public void setMemberOpenInfo(MemberOpenInfoModel memberOpenInfo) {
		this.memberOpenInfo = memberOpenInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutTemplateId() {
		return this.outTemplateId;
	}
	public void setOutTemplateId(String outTemplateId) {
		this.outTemplateId = outTemplateId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWriteOffType() {
		return this.writeOffType;
	}
	public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}

}
