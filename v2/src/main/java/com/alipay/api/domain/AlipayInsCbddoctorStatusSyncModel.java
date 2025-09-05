package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医CBD医生状态同步接口
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:38:19
 */
public class AlipayInsCbddoctorStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7464498422352637922L;

	/**
	 * 医院内部分配给医生并且提前录入到蚂蚁系统内的工号，用于唯一标识一位医生
	 */
	@ApiField("inst_doctor_id")
	private String instDoctorId;

	/**
	 * 分配给互医的机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 对医生执行的状态操作
ONLINE-上线
OFFLINE-下线
	 */
	@ApiField("operate")
	private String operate;

	public String getInstDoctorId() {
		return this.instDoctorId;
	}
	public void setInstDoctorId(String instDoctorId) {
		this.instDoctorId = instDoctorId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

}
