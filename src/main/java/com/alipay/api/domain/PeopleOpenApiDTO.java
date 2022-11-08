package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户模型DTO
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:28:31
 */
public class PeopleOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 3157641554511216793L;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 真名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
