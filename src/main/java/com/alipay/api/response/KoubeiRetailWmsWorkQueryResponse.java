package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WorkDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.work.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsWorkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3775766161633828242L;

	/** 
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 作业完成时间，未完成则该值为空
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
	 * 作业单状态 INIT=初始状态，FINISHED=完成状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/** 
	 * 作业明细模型列表
	 */
	@ApiListField("work_details")
	@ApiField("work_detail")
	private List<WorkDetail> workDetails;

	/** 
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
	}
	public Date getGmtFinished( ) {
		return this.gmtFinished;
	}

	public void setNoticeOutBizNo(String noticeOutBizNo) {
		this.noticeOutBizNo = noticeOutBizNo;
	}
	public String getNoticeOutBizNo( ) {
		return this.noticeOutBizNo;
	}

	public void setNoticeOutBizType(String noticeOutBizType) {
		this.noticeOutBizType = noticeOutBizType;
	}
	public String getNoticeOutBizType( ) {
		return this.noticeOutBizType;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator( ) {
		return this.operator;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseCode( ) {
		return this.warehouseCode;
	}

	public void setWorkDetails(List<WorkDetail> workDetails) {
		this.workDetails = workDetails;
	}
	public List<WorkDetail> getWorkDetails( ) {
		return this.workDetails;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}
	public String getWorkId( ) {
		return this.workId;
	}

}
