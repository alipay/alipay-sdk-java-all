package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动模型
 *
 * @author auto create
 * @since 1.0, 2018-01-23 18:13:57
 */
public class IntelligentPromo extends AlipayObject {

	private static final long serialVersionUID = 1743565326814139798L;

	/**
	 * 是否允许自动续期
	 */
	@ApiField("allow_auto_delay")
	private Boolean allowAutoDelay;

	/**
	 * 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；（注意：修改接口无需传递审批状态）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 请求幂等控制请求参数，该参数尽量比较复杂，建议使用uuid，否则触发幂等返回。
	 */
	@ApiField("create_request_no")
	private String createRequestNo;

	/**
	 * 当前创建人信息，如服务商替商户创建，则为服务商信息，销售小二创建，则为销售小二信息，商户小二创建，则为商户小二信息。（为了追溯创建人信息，请务必仔细填写）
	 */
	@ApiField("creator_info")
	private PromoOperatorInfo creatorInfo;

	/**
	 * 智能活动描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动扩展信息，通过《koubei.marketing.campaign.intelligent.promo.consult智能方案咨询接口》推荐出的方案扩展信息字段，调用《koubei.marketing.campaign.intelligent.promo.create创建智能方案》接口必须要原路带回，不能删减字段。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 方案级别的效果预测，《koubei.marketing.campaign.intelligent.promo.create》创建接口中不需要传递
	 */
	@ApiField("forecast_effect")
	private IntelligentPromoEffect forecastEffect;

	/**
	 * 智能营销活动下架的时间
	 */
	@ApiField("gmt_closed")
	private Date gmtClosed;

	/**
	 * 智能营销活动的生效时间
	 */
	@ApiField("gmt_enabled")
	private Date gmtEnabled;

	/**
	 * 智能营销活动的结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 智能营销活动开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 智能营销商户子活动列表
	 */
	@ApiListField("merchant_promos")
	@ApiField("inteligent_merchant_promo")
	private List<InteligentMerchantPromo> merchantPromos;

	/**
	 * 智能营销活动对应的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 智能活动对应的归属人信息，商户活动对应商户信息
	 */
	@ApiField("owner_info")
	private PromoOperatorInfo ownerInfo;

	/**
	 * 智能营销方案父id，如果需要续签智能营销活动，则会对于原有智能营销方案的id
	 */
	@ApiField("parent_promo_id")
	private String parentPromoId;

	/**
	 * 智能营销活动对应的方案编号
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 智能营销方案id。《koubei.marketing.campaign.intelligent.promo.create》创建接口中这个参数不必传递，仅在查询接口中返回
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 营销活动详情列表，注意：（该参数20180125开始已不在维护，替代参数详见merchant_promos，如需接入替代参数，接之前先找开发负责人申请appid白名单）
	 */
	@ApiListField("promos")
	@ApiField("intelligent_promo_detail")
	private List<IntelligentPromoDetail> promos;

	/**
	 * 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结；DISABLED:已失效（有两种情况会是失效状态，一种是服务商创建方案，商户驳回，一种是服务商创建方案，商户未确认，活动到期。）（注意：修改方案的动作不需要传递方案状态）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 该智能营销方案如果续签多次，则会返回该方案对应的所有智能营销子方案的promo_id
	 */
	@ApiListField("sub_promo_ids")
	@ApiField("string")
	private List<String> subPromoIds;

	/**
	 * 活动展示状态。已创建：CREATED；
REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSING：下架中；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）；MODIFYING：修改中；MODIFY_WAIT_CONFIRM：修改待确认；DISABLED：已失效
（注意：修改接口子状态参数不能传递）
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 智能营销活动对应的方案中的模板编号
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名。在创建时，这个字段需要ISV自己进行决策，在推荐接口会返回优惠力度，比如代金券面额等信息，ISV判断如果优惠力度比这个大或者相同，就用RECOMMENDATION，其他情况用REGISTRATION，如推荐力度大于实际创建传过来的优惠力度，则创建的时候系统会自动将RECOMMENDATION改为REGISTRATION
	 */
	@ApiField("type")
	private String type;

	public Boolean getAllowAutoDelay() {
		return this.allowAutoDelay;
	}
	public void setAllowAutoDelay(Boolean allowAutoDelay) {
		this.allowAutoDelay = allowAutoDelay;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCreateRequestNo() {
		return this.createRequestNo;
	}
	public void setCreateRequestNo(String createRequestNo) {
		this.createRequestNo = createRequestNo;
	}

	public PromoOperatorInfo getCreatorInfo() {
		return this.creatorInfo;
	}
	public void setCreatorInfo(PromoOperatorInfo creatorInfo) {
		this.creatorInfo = creatorInfo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public IntelligentPromoEffect getForecastEffect() {
		return this.forecastEffect;
	}
	public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
		this.forecastEffect = forecastEffect;
	}

	public Date getGmtClosed() {
		return this.gmtClosed;
	}
	public void setGmtClosed(Date gmtClosed) {
		this.gmtClosed = gmtClosed;
	}

	public Date getGmtEnabled() {
		return this.gmtEnabled;
	}
	public void setGmtEnabled(Date gmtEnabled) {
		this.gmtEnabled = gmtEnabled;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public List<InteligentMerchantPromo> getMerchantPromos() {
		return this.merchantPromos;
	}
	public void setMerchantPromos(List<InteligentMerchantPromo> merchantPromos) {
		this.merchantPromos = merchantPromos;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public PromoOperatorInfo getOwnerInfo() {
		return this.ownerInfo;
	}
	public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	public String getParentPromoId() {
		return this.parentPromoId;
	}
	public void setParentPromoId(String parentPromoId) {
		this.parentPromoId = parentPromoId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public List<IntelligentPromoDetail> getPromos() {
		return this.promos;
	}
	public void setPromos(List<IntelligentPromoDetail> promos) {
		this.promos = promos;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getSubPromoIds() {
		return this.subPromoIds;
	}
	public void setSubPromoIds(List<String> subPromoIds) {
		this.subPromoIds = subPromoIds;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
