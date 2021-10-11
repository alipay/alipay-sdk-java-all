package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投保受理
 *
 * @author auto create
 * @since 1.0, 2019-08-28 13:59:53
 */
public class AlipayInsSceneApplicationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2466922775815564257L;

	/**
	 * 用户参与的活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险产品销售单元编码
	 */
	@ApiField("csu_no")
	private String csuNo;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 标的信息， 保险标的物，产品责任信息
	 */
	@ApiListField("ins_objects")
	@ApiField("ins_object")
	private List<InsObject> insObjects;

	/**
	 * 被保险人
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 实际保费，询价接口获取的保费通过投保接口传递进来。投保接口会对传入的保费进行验证。传入的保费和核价的值不一样投保失败
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 推荐流水号
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 跟保单相关的干系人
	 */
	@ApiListField("stake_holders")
	@ApiField("ins_person")
	private List<InsPerson> stakeHolders;

	/**
	 * 保额值,保额类型为枚举的时候是一个枚举值,当为金额类型时单位为分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getBillTitle() {
		return this.billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCsuNo() {
		return this.csuNo;
	}
	public void setCsuNo(String csuNo) {
		this.csuNo = csuNo;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public List<InsObject> getInsObjects() {
		return this.insObjects;
	}
	public void setInsObjects(List<InsObject> insObjects) {
		this.insObjects = insObjects;
	}

	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getRecomFlowNo() {
		return this.recomFlowNo;
	}
	public void setRecomFlowNo(String recomFlowNo) {
		this.recomFlowNo = recomFlowNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public List<InsPerson> getStakeHolders() {
		return this.stakeHolders;
	}
	public void setStakeHolders(List<InsPerson> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
