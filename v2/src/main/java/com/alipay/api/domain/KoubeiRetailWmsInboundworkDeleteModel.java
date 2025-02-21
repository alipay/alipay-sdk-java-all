package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除入库作业记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:37:39
 */
public class KoubeiRetailWmsInboundworkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1515835249541582141L;

	/**
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	/**
	 * 操作者上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

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

}
