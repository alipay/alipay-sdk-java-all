package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品模型信息
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRewardInfo extends AlipayObject {

	private static final long serialVersionUID = 8589775992432795262L;

	/**
	 * 奖品编号
	 */
	@ApiField("id")
	private String id;

	/**
	 * 外部奖品编号，由业务运营定义
	 */
	@ApiField("out_right_id")
	private String outRightId;

	/**
	 * 奖品列表
	 */
	@ApiListField("right_list")
	@ApiField("benefit_right")
	private List<BenefitRight> rightList;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOutRightId() {
		return this.outRightId;
	}
	public void setOutRightId(String outRightId) {
		this.outRightId = outRightId;
	}

	public List<BenefitRight> getRightList() {
		return this.rightList;
	}
	public void setRightList(List<BenefitRight> rightList) {
		this.rightList = rightList;
	}

}
