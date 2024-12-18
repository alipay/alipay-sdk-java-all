package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申报策略
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:27
 */
public class ResponseDeclare extends AlipayObject {

	private static final long serialVersionUID = 5516191722448113993L;

	/**
	 * 申报的目标运行负荷
	 */
	@ApiListField("target_adjustment")
	@ApiField("load_info_node")
	private List<LoadInfoNode> targetAdjustment;

	public List<LoadInfoNode> getTargetAdjustment() {
		return this.targetAdjustment;
	}
	public void setTargetAdjustment(List<LoadInfoNode> targetAdjustment) {
		this.targetAdjustment = targetAdjustment;
	}

}
