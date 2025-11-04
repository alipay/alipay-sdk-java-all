package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快递状态通知接口
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:30:49
 */
public class XingheLendassistCarfinExpressstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5848341629396917691L;

	/**
	 * 快递异常原因
	 */
	@ApiField("alert_reason")
	private String alertReason;

	/**
	 * 快递员信息
	 */
	@ApiField("courier_info")
	private CarfinCourier courierInfo;

	/**
	 * 预计送达时间
	 */
	@ApiField("estimated_delivery_date")
	private String estimatedDeliveryDate;

	/**
	 * 星河侧快递订单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 快递服务商回传文件使用
	 */
	@ApiListField("file_list")
	@ApiField("carfin_express_file")
	private List<CarfinExpressFile> fileList;

	/**
	 * 通知类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 外部快递订单号
	 */
	@ApiField("out_express_no")
	private String outExpressNo;

	/**
	 * 快递状态
	 */
	@ApiField("status")
	private String status;

	public String getAlertReason() {
		return this.alertReason;
	}
	public void setAlertReason(String alertReason) {
		this.alertReason = alertReason;
	}

	public CarfinCourier getCourierInfo() {
		return this.courierInfo;
	}
	public void setCourierInfo(CarfinCourier courierInfo) {
		this.courierInfo = courierInfo;
	}

	public String getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public List<CarfinExpressFile> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<CarfinExpressFile> fileList) {
		this.fileList = fileList;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getOutExpressNo() {
		return this.outExpressNo;
	}
	public void setOutExpressNo(String outExpressNo) {
		this.outExpressNo = outExpressNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
