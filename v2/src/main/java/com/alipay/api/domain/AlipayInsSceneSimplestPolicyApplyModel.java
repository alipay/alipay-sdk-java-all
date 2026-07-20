package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 极简模式承保
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:55:25
 */
public class AlipayInsSceneSimplestPolicyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8163293396261492995L;

	/**
	 * 定制参数
	 */
	@ApiField("custom_param")
	private InsOpenSimplestIssueCustomParamDTO customParam;

	/**
	 * 保障止期
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 保障起期
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 投保人信息
	 */
	@ApiField("holder")
	private InsOpenUserDTO holder;

	/**
	 * 被保人列表
	 */
	@ApiListField("insureds")
	@ApiField("ins_open_user_d_t_o")
	private List<InsOpenUserDTO> insureds;

	/**
	 * 外部业务幂等单号，同 partner_org_id 下唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作伙伴组织ID
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保障期限,示例：1D，表示一天
	 */
	@ApiField("period")
	private String period;

	/**
	 * 指定产品方案 ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public InsOpenSimplestIssueCustomParamDTO getCustomParam() {
		return this.customParam;
	}
	public void setCustomParam(InsOpenSimplestIssueCustomParamDTO customParam) {
		this.customParam = customParam;
	}

	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public InsOpenUserDTO getHolder() {
		return this.holder;
	}
	public void setHolder(InsOpenUserDTO holder) {
		this.holder = holder;
	}

	public List<InsOpenUserDTO> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsOpenUserDTO> insureds) {
		this.insureds = insureds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
