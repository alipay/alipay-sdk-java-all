package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 三方码异常订单退款
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:57:54
 */
public class AlipayMarketingThirdpartyOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5351125973865675216L;

	/**
	 * null
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

}
