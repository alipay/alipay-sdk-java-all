package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景保险用工场景批量预下单
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:30:27
 */
public class AlipayInsSceneEmploymentBatchpreorderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8742729148211549172L;

	/**
	 * 被保人信息
	 */
	@ApiListField("employee_list")
	@ApiField("ins_employee")
	private List<InsEmployee> employeeList;

	/**
	 * 投保人信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 外部业务幂等单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部方案ID
	 */
	@ApiField("out_plan_id")
	private String outPlanId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * D天 M月 Y年，比如1天则是1D
	 */
	@ApiField("period")
	private String period;

	/**
	 * 产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<InsEmployee> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<InsEmployee> employeeList) {
		this.employeeList = employeeList;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutPlanId() {
		return this.outPlanId;
	}
	public void setOutPlanId(String outPlanId) {
		this.outPlanId = outPlanId;
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
