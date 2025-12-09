package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车联数据同步
 *
 * @author auto create
 * @since 1.0, 2022-11-18 21:47:14
 */
public class AlipayEcoMycarVehicleVehicleiovSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6843825882983315596L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 车联数据列表
	 */
	@ApiListField("iov_datas")
	@ApiField("vehicle_iov_data")
	private List<VehicleIovData> iovDatas;

	/**
	 * 车联数据业务流水号
	 */
	@ApiField("iov_seq_no")
	private String iovSeqNo;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 当前系统时间戳
	 */
	@ApiField("system_timestamp")
	private String systemTimestamp;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车企openid
	 */
	@ApiField("vehicle_open_id")
	private String vehicleOpenId;

	/**
	 * 车辆id
	 */
	@ApiField("vi_id")
	private String viId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<VehicleIovData> getIovDatas() {
		return this.iovDatas;
	}
	public void setIovDatas(List<VehicleIovData> iovDatas) {
		this.iovDatas = iovDatas;
	}

	public String getIovSeqNo() {
		return this.iovSeqNo;
	}
	public void setIovSeqNo(String iovSeqNo) {
		this.iovSeqNo = iovSeqNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSystemTimestamp() {
		return this.systemTimestamp;
	}
	public void setSystemTimestamp(String systemTimestamp) {
		this.systemTimestamp = systemTimestamp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehicleOpenId() {
		return this.vehicleOpenId;
	}
	public void setVehicleOpenId(String vehicleOpenId) {
		this.vehicleOpenId = vehicleOpenId;
	}

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
