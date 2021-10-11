package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动玩法详细信息配置对象
 *
 * @author auto create
 * @since 1.0, 2018-11-28 15:32:15
 */
public class MPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 7265263432214425937L;

	/**
	 * 活动预算信息
	 */
	@ApiField("budget")
	private MBudgetInfo budget;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint")
	private MPromoConstraint constraint;

	/**
	 * 活动发送的权益信息
	 */
	@ApiField("equity_info")
	private MEquityInfo equityInfo;

	/**
	 * 扩展信息字段
	 */
	@ApiListField("ext_info")
	@ApiField("m_ext_info")
	private List<MExtInfo> extInfo;

	/**
	 * 外部活动业务id，注意：修改的时候会通过指定id进行修改，如果指定out_promo_id口碑本地无数据，进行新增，否则进行修改，如果要删除对应promo_info数据，则不需要传递promo_info数据即可。
	 */
	@ApiField("out_promo_id")
	private String outPromoId;

	public MBudgetInfo getBudget() {
		return this.budget;
	}
	public void setBudget(MBudgetInfo budget) {
		this.budget = budget;
	}

	public MPromoConstraint getConstraint() {
		return this.constraint;
	}
	public void setConstraint(MPromoConstraint constraint) {
		this.constraint = constraint;
	}

	public MEquityInfo getEquityInfo() {
		return this.equityInfo;
	}
	public void setEquityInfo(MEquityInfo equityInfo) {
		this.equityInfo = equityInfo;
	}

	public List<MExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<MExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutPromoId() {
		return this.outPromoId;
	}
	public void setOutPromoId(String outPromoId) {
		this.outPromoId = outPromoId;
	}

}
