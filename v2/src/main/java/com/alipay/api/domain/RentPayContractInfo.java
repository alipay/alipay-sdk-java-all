package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房直付合同信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 22:32:16
 */
public class RentPayContractInfo extends AlipayObject {

	private static final long serialVersionUID = 4235537786319665618L;

	/**
	 * 本次提取所属结束月，格式yyyy-mm
	 */
	@ApiField("draw_end_month")
	private String drawEndMonth;

	/**
	 * 本次提取所属开始月，格式yyyy-mm
	 */
	@ApiField("draw_starting_month")
	private String drawStartingMonth;

	/**
	 * 租约提取截止月
	 */
	@ApiField("project_closing_month")
	private String projectClosingMonth;

	/**
	 * 租房合同编号
	 */
	@ApiField("rent_contract_no")
	private String rentContractNo;

	/**
	 * 房屋具体地址
	 */
	@ApiField("rent_house_address")
	private String rentHouseAddress;

	/**
	 * 合同结束日期，格式yyyy-mm-dd
	 */
	@ApiField("rent_pay_end_time")
	private String rentPayEndTime;

	/**
	 * 合同开始日期，格式yyyy-mm-dd
	 */
	@ApiField("rent_pay_start_time")
	private String rentPayStartTime;

	/**
	 * 租房项目编号
	 */
	@ApiField("rent_project_no")
	private String rentProjectNo;

	public String getDrawEndMonth() {
		return this.drawEndMonth;
	}
	public void setDrawEndMonth(String drawEndMonth) {
		this.drawEndMonth = drawEndMonth;
	}

	public String getDrawStartingMonth() {
		return this.drawStartingMonth;
	}
	public void setDrawStartingMonth(String drawStartingMonth) {
		this.drawStartingMonth = drawStartingMonth;
	}

	public String getProjectClosingMonth() {
		return this.projectClosingMonth;
	}
	public void setProjectClosingMonth(String projectClosingMonth) {
		this.projectClosingMonth = projectClosingMonth;
	}

	public String getRentContractNo() {
		return this.rentContractNo;
	}
	public void setRentContractNo(String rentContractNo) {
		this.rentContractNo = rentContractNo;
	}

	public String getRentHouseAddress() {
		return this.rentHouseAddress;
	}
	public void setRentHouseAddress(String rentHouseAddress) {
		this.rentHouseAddress = rentHouseAddress;
	}

	public String getRentPayEndTime() {
		return this.rentPayEndTime;
	}
	public void setRentPayEndTime(String rentPayEndTime) {
		this.rentPayEndTime = rentPayEndTime;
	}

	public String getRentPayStartTime() {
		return this.rentPayStartTime;
	}
	public void setRentPayStartTime(String rentPayStartTime) {
		this.rentPayStartTime = rentPayStartTime;
	}

	public String getRentProjectNo() {
		return this.rentProjectNo;
	}
	public void setRentProjectNo(String rentProjectNo) {
		this.rentProjectNo = rentProjectNo;
	}

}
