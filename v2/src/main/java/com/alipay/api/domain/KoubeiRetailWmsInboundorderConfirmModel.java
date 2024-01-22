package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认入库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:40
 */
public class KoubeiRetailWmsInboundorderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3425638166591272325L;

	/**
	 * 入库通知单号
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 入库单最终状态
FINISHED（完成），CANCELLED（取消）
	 */
	@ApiField("status")
	private String status;

	public String getInboundOrderId() {
		return this.inboundOrderId;
	}
	public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
