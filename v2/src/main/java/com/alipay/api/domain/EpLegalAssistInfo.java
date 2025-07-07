package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业司法协助明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:54
 */
public class EpLegalAssistInfo extends AlipayObject {

	private static final long serialVersionUID = 1432277614312441175L;

	/**
	 * 受让人
	 */
	@ApiField("assignee")
	private String assignee;

	/**
	 * 冻结期限，单位天
	 */
	@ApiField("djqx")
	private String djqx;

	/**
	 * 股权冻结起始日期
	 */
	@ApiField("djzxzi")
	private String djzxzi;

	/**
	 * 执行事项
	 */
	@ApiField("enforcement_actions")
	private String enforcementActions;

	/**
	 * 执行法院
	 */
	@ApiField("execution_court")
	private String executionCourt;

	/**
	 * 股权冻结状态
	 */
	@ApiField("gqdjzt")
	private String gqdjzt;

	/**
	 * 股权所在企业名称
	 */
	@ApiField("gqszqymc")
	private String gqszqymc;

	/**
	 * 被执行人
	 */
	@ApiField("person_subject_to_enforcement")
	private String personSubjectToEnforcement;

	/**
	 * 公示日期
	 */
	@ApiField("publicity_date")
	private String publicityDate;

	/**
	 * 司法协助类型
	 */
	@ApiField("sfxzlx")
	private String sfxzlx;

	/**
	 * 股权数额，单位万元
	 */
	@ApiField("stock_right_sum")
	private String stockRightSum;

	/**
	 * 股权冻结结束日期
	 */
	@ApiField("zjqxzhi")
	private String zjqxzhi;

	/**
	 * 执行裁定书文号
	 */
	@ApiField("zxcdswh")
	private String zxcdswh;

	/**
	 * 执行通知书文号
	 */
	@ApiField("zxtzswh")
	private String zxtzswh;

	public String getAssignee() {
		return this.assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getDjqx() {
		return this.djqx;
	}
	public void setDjqx(String djqx) {
		this.djqx = djqx;
	}

	public String getDjzxzi() {
		return this.djzxzi;
	}
	public void setDjzxzi(String djzxzi) {
		this.djzxzi = djzxzi;
	}

	public String getEnforcementActions() {
		return this.enforcementActions;
	}
	public void setEnforcementActions(String enforcementActions) {
		this.enforcementActions = enforcementActions;
	}

	public String getExecutionCourt() {
		return this.executionCourt;
	}
	public void setExecutionCourt(String executionCourt) {
		this.executionCourt = executionCourt;
	}

	public String getGqdjzt() {
		return this.gqdjzt;
	}
	public void setGqdjzt(String gqdjzt) {
		this.gqdjzt = gqdjzt;
	}

	public String getGqszqymc() {
		return this.gqszqymc;
	}
	public void setGqszqymc(String gqszqymc) {
		this.gqszqymc = gqszqymc;
	}

	public String getPersonSubjectToEnforcement() {
		return this.personSubjectToEnforcement;
	}
	public void setPersonSubjectToEnforcement(String personSubjectToEnforcement) {
		this.personSubjectToEnforcement = personSubjectToEnforcement;
	}

	public String getPublicityDate() {
		return this.publicityDate;
	}
	public void setPublicityDate(String publicityDate) {
		this.publicityDate = publicityDate;
	}

	public String getSfxzlx() {
		return this.sfxzlx;
	}
	public void setSfxzlx(String sfxzlx) {
		this.sfxzlx = sfxzlx;
	}

	public String getStockRightSum() {
		return this.stockRightSum;
	}
	public void setStockRightSum(String stockRightSum) {
		this.stockRightSum = stockRightSum;
	}

	public String getZjqxzhi() {
		return this.zjqxzhi;
	}
	public void setZjqxzhi(String zjqxzhi) {
		this.zjqxzhi = zjqxzhi;
	}

	public String getZxcdswh() {
		return this.zxcdswh;
	}
	public void setZxcdswh(String zxcdswh) {
		this.zxcdswh = zxcdswh;
	}

	public String getZxtzswh() {
		return this.zxtzswh;
	}
	public void setZxtzswh(String zxtzswh) {
		this.zxtzswh = zxtzswh;
	}

}
