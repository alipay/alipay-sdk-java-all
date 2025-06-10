package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出库作业修改
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:36:37
 */
public class KoubeiRetailWmsOutboundworkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6283427868318858223L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

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

	/**
	 * 出库作业明细列表
	 */
	@ApiListField("work_details")
	@ApiField("work_detail")
	private List<WorkDetail> workDetails;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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

	public List<WorkDetail> getWorkDetails() {
		return this.workDetails;
	}
	public void setWorkDetails(List<WorkDetail> workDetails) {
		this.workDetails = workDetails;
	}

}
