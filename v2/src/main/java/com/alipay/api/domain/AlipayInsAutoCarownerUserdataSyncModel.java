package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险用户数据同步
 *
 * @author auto create
 * @since 1.0, 2022-12-16 15:38:25
 */
public class AlipayInsAutoCarownerUserdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7275234569911726129L;

	/**
	 * 发动机号
	 */
	@ApiField("car_engine_no")
	private String carEngineNo;

	/**
	 * 车架号
	 */
	@ApiField("car_frame_no")
	private String carFrameNo;

	/**
	 * 车辆品牌型号
	 */
	@ApiField("car_model")
	private String carModel;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * md5加密后的证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 保险公司标识
	 */
	@ApiField("com_id")
	private String comId;

	/**
	 * 注册日期
	 */
	@ApiField("first_register_date")
	private Date firstRegisterDate;

	/**
	 * 外部名单id
	 */
	@ApiField("out_leads_id")
	private String outLeadsId;

	/**
	 * 数据发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	public String getCarEngineNo() {
		return this.carEngineNo;
	}
	public void setCarEngineNo(String carEngineNo) {
		this.carEngineNo = carEngineNo;
	}

	public String getCarFrameNo() {
		return this.carFrameNo;
	}
	public void setCarFrameNo(String carFrameNo) {
		this.carFrameNo = carFrameNo;
	}

	public String getCarModel() {
		return this.carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getComId() {
		return this.comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}

	public Date getFirstRegisterDate() {
		return this.firstRegisterDate;
	}
	public void setFirstRegisterDate(Date firstRegisterDate) {
		this.firstRegisterDate = firstRegisterDate;
	}

	public String getOutLeadsId() {
		return this.outLeadsId;
	}
	public void setOutLeadsId(String outLeadsId) {
		this.outLeadsId = outLeadsId;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

}
