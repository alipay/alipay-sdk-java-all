package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class BrandTrademarkInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 3268178981916823615L;

	/**
	 * 商标注册地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 商标国际分类代码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 商标有效结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商标名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商标持有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 商标注册号，中国商标
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 商标有效开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 商标状态
VALID：生效
INVALID：失效
	 */
	@ApiField("status")
	private String status;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
