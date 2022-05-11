package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询作业列表
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:18
 */
public class KoubeiRetailWmsWorkBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5359251936251391831L;

	/**
	 * 完成时间范围开始时间
	 */
	@ApiField("gmt_finished_from")
	private Date gmtFinishedFrom;

	/**
	 * 完成时间范围结束时间
	 */
	@ApiField("gmt_finished_to")
	private Date gmtFinishedTo;

	/**
	 * 作业对应的入库/出库通知单的外部业务单据号，这个单据可能是采购单、补货单等
	 */
	@ApiField("notice_out_biz_no")
	private String noticeOutBizNo;

	/**
	 * 作业对应的通知单的外部业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库，CGCK=采购出库，DDCK=订单出库，PDCK=盘点出库，BHCK=补货出库
	 */
	@ApiField("notice_out_biz_type")
	private String noticeOutBizType;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 操作者id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 页码，从1开始，不传默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，不传默认20，不能超过100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 作业状态，INIT=待提交，FINISHED=已完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业类型，INBOUND=入库，OUTBOUND=出库
	 */
	@ApiField("work_type")
	private String workType;

	public Date getGmtFinishedFrom() {
		return this.gmtFinishedFrom;
	}
	public void setGmtFinishedFrom(Date gmtFinishedFrom) {
		this.gmtFinishedFrom = gmtFinishedFrom;
	}

	public Date getGmtFinishedTo() {
		return this.gmtFinishedTo;
	}
	public void setGmtFinishedTo(Date gmtFinishedTo) {
		this.gmtFinishedTo = gmtFinishedTo;
	}

	public String getNoticeOutBizNo() {
		return this.noticeOutBizNo;
	}
	public void setNoticeOutBizNo(String noticeOutBizNo) {
		this.noticeOutBizNo = noticeOutBizNo;
	}

	public String getNoticeOutBizType() {
		return this.noticeOutBizType;
	}
	public void setNoticeOutBizType(String noticeOutBizType) {
		this.noticeOutBizType = noticeOutBizType;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWorkType() {
		return this.workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}

}
