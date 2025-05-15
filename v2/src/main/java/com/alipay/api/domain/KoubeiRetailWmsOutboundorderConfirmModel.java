package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:53
 */
public class KoubeiRetailWmsOutboundorderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8547689564369461593L;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库通知单id
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 出库单最终状态：FINISHED（完成），CANCELLED（取消）
	 */
	@ApiField("status")
	private String status;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getOutboundOrderId() {
		return this.outboundOrderId;
	}
	public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
