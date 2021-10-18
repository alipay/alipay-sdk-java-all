package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作业列表模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:18
 */
public class WorkListVO extends AlipayObject {

	private static final long serialVersionUID = 3228192342964983322L;

	/**
	 * 作业完成时间
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

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
	 * 操作员id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 作业状态，INIT=待提交，SUCCEED=已完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

	/**
	 * 作业类型，INBOUND-入库，OUTBOUND-出库
	 */
	@ApiField("work_type")
	private String workType;

	public Date getGmtFinished() {
		return this.gmtFinished;
	}
	public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getWorkType() {
		return this.workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}

}
