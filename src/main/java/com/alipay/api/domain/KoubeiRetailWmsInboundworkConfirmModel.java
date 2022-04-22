package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认入库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:40:09
 */
public class KoubeiRetailWmsInboundworkConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3288295422726585876L;

	/**
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public String getInboundWorkId() {
		return this.inboundWorkId;
	}
	public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
