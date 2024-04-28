package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单返回数据
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:32
 */
public class OutboundOrderVO extends AlipayObject {

	private static final long serialVersionUID = 3838233398845846824L;

	/**
	 * 取消原因
ORDER_CANCEL("订单取消"),
INVENTORY_OCCUPY_FAIL("库存占用失败")
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 通知日期
	 */
	@ApiField("notice_date")
	private Date noticeDate;

	/**
	 * 操作者id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型，PROVIDER:服务商,PROVIDER_STAFF:服务商员工,MER:商户,MER_STAFF:商户员工,SALES:阿里销售小二,SYSTEM:系统
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 出库通知单id
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	/**
	 * CGCK("采购出库"),
DDCK("订单出库"),
PDCK("盘点出库"),;
	 */
	@ApiField("outbound_type")
	private String outboundType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 状态
INIT,
PROCESSING,
FINISHED,
CANCELLED;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getNoticeDate() {
		return this.noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutboundOrderId() {
		return this.outboundOrderId;
	}
	public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}

	public String getOutboundType() {
		return this.outboundType;
	}
	public void setOutboundType(String outboundType) {
		this.outboundType = outboundType;
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

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
