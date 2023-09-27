package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改入库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:40:47
 */
public class KoubeiRetailWmsInboundworkModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1733136549756766934L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

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

	/**
	 * 入库作业明细列表
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

	public List<WorkDetail> getWorkDetails() {
		return this.workDetails;
	}
	public void setWorkDetails(List<WorkDetail> workDetails) {
		this.workDetails = workDetails;
	}

}
