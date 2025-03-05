package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝积分库查询结果，包含积分库ID，名称，余额等
 *
 * @author auto create
 * @since 1.0, 2019-08-21 14:35:01
 */
public class PointLibResult extends AlipayObject {

	private static final long serialVersionUID = 6482481159541574646L;

	/**
	 * 仓库剩余积分数
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 积分库ID
	 */
	@ApiField("library_id")
	private String libraryId;

	/**
	 * 积分库名称
	 */
	@ApiField("library_name")
	private String libraryName;

	/**
	 * 积分库状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库积分总数
	 */
	@ApiField("sum_point")
	private String sumPoint;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return this.libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSumPoint() {
		return this.sumPoint;
	}
	public void setSumPoint(String sumPoint) {
		this.sumPoint = sumPoint;
	}

}
