package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发起出库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:37:30
 */
public class KoubeiRetailWmsOutboundworkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4669898249332996583L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 对应的通知单id
	 */
	@ApiField("notice_order_id")
	private String noticeOrderId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 与作业相关的外部单据号，如菜鸟发货id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getNoticeOrderId() {
		return this.noticeOrderId;
	}
	public void setNoticeOrderId(String noticeOrderId) {
		this.noticeOrderId = noticeOrderId;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
