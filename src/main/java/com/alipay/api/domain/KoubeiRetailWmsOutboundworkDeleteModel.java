package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除出库作业记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:34:11
 */
public class KoubeiRetailWmsOutboundworkDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7197762332825547364L;

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

}
