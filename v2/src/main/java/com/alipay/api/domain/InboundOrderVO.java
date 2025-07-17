package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库通知单查询返回数据
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:55
 */
public class InboundOrderVO extends AlipayObject {

	private static final long serialVersionUID = 6131142785373862712L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 入库通知单id
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	/**
	 * 入库业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库
	 */
	@ApiField("inbound_type")
	private String inboundType;

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
	 * 入库单类型：INIT（初始化）, PROCESSING（处理中）,FINISHED（完成）, CANCELLED（取消）;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInboundOrderId() {
		return this.inboundOrderId;
	}
	public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}

	public String getInboundType() {
		return this.inboundType;
	}
	public void setInboundType(String inboundType) {
		this.inboundType = inboundType;
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
