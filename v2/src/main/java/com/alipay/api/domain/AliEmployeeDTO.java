package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传人
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:18:30
 */
public class AliEmployeeDTO extends AlipayObject {

	private static final long serialVersionUID = 5421356465494193944L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

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

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
