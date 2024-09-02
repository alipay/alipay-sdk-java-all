package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作人数据模型
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class OperaPersonVO extends AlipayObject {

	private static final long serialVersionUID = 8312429792293179949L;

	/**
	 * 员工姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 员工花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 员工编号
	 */
	@ApiField("worker_no")
	private String workerNo;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getWorkerNo() {
		return this.workerNo;
	}
	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}

}
