package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询入库、出库作业详情
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:37
 */
public class KoubeiRetailWmsWorkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4358735747465178587L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
