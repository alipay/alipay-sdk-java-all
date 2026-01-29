package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号源统计
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class RegisterNumberCountDTO extends AlipayObject {

	private static final long serialVersionUID = 7511832598773219463L;

	/**
	 * 加号标识，
0：不可加号
1：可加号
	 */
	@ApiField("add_number_flag")
	private String addNumberFlag;

	/**
	 * 剩余数量
	 */
	@ApiField("available_num")
	private String availableNum;

	/**
	 * 号源列表跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 挂号费用，单元：元
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 放号时间 格式：2.28 15:00
	 */
	@ApiField("number_open_time")
	private String numberOpenTime;

	/**
	 * 号源预约状态
1：有号
2: 已约满
3: 停诊
4: 等待放号
	 */
	@ApiField("number_status")
	private String numberStatus;

	/**
	 * 时间段，上午/下午/中午/夜间
	 */
	@ApiField("period")
	private String period;

	/**
	 * 币种符号
	 */
	@ApiField("pre_unit")
	private String preUnit;

	/**
	 * 排班id
	 */
	@ApiField("register_id")
	private String registerId;

	public String getAddNumberFlag() {
		return this.addNumberFlag;
	}
	public void setAddNumberFlag(String addNumberFlag) {
		this.addNumberFlag = addNumberFlag;
	}

	public String getAvailableNum() {
		return this.availableNum;
	}
	public void setAvailableNum(String availableNum) {
		this.availableNum = availableNum;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getNumberOpenTime() {
		return this.numberOpenTime;
	}
	public void setNumberOpenTime(String numberOpenTime) {
		this.numberOpenTime = numberOpenTime;
	}

	public String getNumberStatus() {
		return this.numberStatus;
	}
	public void setNumberStatus(String numberStatus) {
		this.numberStatus = numberStatus;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPreUnit() {
		return this.preUnit;
	}
	public void setPreUnit(String preUnit) {
		this.preUnit = preUnit;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

}
