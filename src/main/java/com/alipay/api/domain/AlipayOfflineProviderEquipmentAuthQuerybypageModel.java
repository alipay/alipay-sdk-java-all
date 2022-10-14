package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解绑查询接口
 *
 * @author auto create
 * @since 1.0, 2015-12-04 12:12:54
 */
public class AlipayOfflineProviderEquipmentAuthQuerybypageModel extends AlipayObject {

	private static final long serialVersionUID = 6471543463738654911L;

	/**
	 * 解绑起始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 机具类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 解绑截止时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，传json格式的字符串，包含operator=操作人；operator_id =操作人ID
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 机具厂商PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 当前页，***注意页数从1开始***
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页容量：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
