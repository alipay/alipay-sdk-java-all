package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约通用查询接口
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:43
 */
public class AntProdpaasArrangementCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2568586559289837243L;

	/**
	 * 合约基本信息选择器，根据产品编码，合约状态编码来过滤合约
	 */
	@ApiField("arrangement_base_selector")
	private ArrangementBaseSelector arrangementBaseSelector;

	/**
	 * 合约条件组选择器，筛选合约条件
	 */
	@ApiField("arrangement_condition_group_selector")
	private ArrangementConditionGroupSelector arrangementConditionGroupSelector;

	/**
	 * 合约参与者选择器，根据参与者查询合约编号,与合约号选择器二选一
	 */
	@ApiField("arrangement_involved_party_querier")
	private ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier;

	/**
	 * 合约号查询器，与参与者查询器二选一
	 */
	@ApiField("arrangement_no_querier")
	private ArrangementNoQuerier arrangementNoQuerier;

	public ArrangementBaseSelector getArrangementBaseSelector() {
		return this.arrangementBaseSelector;
	}
	public void setArrangementBaseSelector(ArrangementBaseSelector arrangementBaseSelector) {
		this.arrangementBaseSelector = arrangementBaseSelector;
	}

	public ArrangementConditionGroupSelector getArrangementConditionGroupSelector() {
		return this.arrangementConditionGroupSelector;
	}
	public void setArrangementConditionGroupSelector(ArrangementConditionGroupSelector arrangementConditionGroupSelector) {
		this.arrangementConditionGroupSelector = arrangementConditionGroupSelector;
	}

	public ArrangementInvolvedPartyQuerier getArrangementInvolvedPartyQuerier() {
		return this.arrangementInvolvedPartyQuerier;
	}
	public void setArrangementInvolvedPartyQuerier(ArrangementInvolvedPartyQuerier arrangementInvolvedPartyQuerier) {
		this.arrangementInvolvedPartyQuerier = arrangementInvolvedPartyQuerier;
	}

	public ArrangementNoQuerier getArrangementNoQuerier() {
		return this.arrangementNoQuerier;
	}
	public void setArrangementNoQuerier(ArrangementNoQuerier arrangementNoQuerier) {
		this.arrangementNoQuerier = arrangementNoQuerier;
	}

}
