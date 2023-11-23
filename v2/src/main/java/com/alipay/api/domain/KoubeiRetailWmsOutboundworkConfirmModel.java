package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认出库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:05
 */
public class KoubeiRetailWmsOutboundworkConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5674167946779938491L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getOutboundWorkId() {
		return this.outboundWorkId;
	}
	public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
