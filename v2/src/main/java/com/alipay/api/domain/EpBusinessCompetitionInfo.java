package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业业务竞争明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:18:31
 */
public class EpBusinessCompetitionInfo extends AlipayObject {

	private static final long serialVersionUID = 8235743138274363926L;

	/**
	 * 线索来源
	 */
	@ApiField("clue_source")
	private String clueSource;

	/**
	 * 招投标公告数
	 */
	@ApiField("clue_total")
	private Long clueTotal;

	/**
	 * 经营状态
	 */
	@ApiField("manager_state")
	private String managerState;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 注册资本
	 */
	@ApiField("register_capital")
	private String registerCapital;

	/**
	 * 成立日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 识别关系
	 */
	@ApiField("relation")
	private String relation;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("tyshxydm")
	private String tyshxydm;

	public String getClueSource() {
		return this.clueSource;
	}
	public void setClueSource(String clueSource) {
		this.clueSource = clueSource;
	}

	public Long getClueTotal() {
		return this.clueTotal;
	}
	public void setClueTotal(Long clueTotal) {
		this.clueTotal = clueTotal;
	}

	public String getManagerState() {
		return this.managerState;
	}
	public void setManagerState(String managerState) {
		this.managerState = managerState;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterCapital() {
		return this.registerCapital;
	}
	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRelation() {
		return this.relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getTyshxydm() {
		return this.tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

}
