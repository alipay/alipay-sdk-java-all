package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加签约人请求入参对象
 *
 * @author auto create
 * @since 1.0, 2023-02-28 15:42:03
 */
public class AntlcSignerRequest extends AlipayObject {

	private static final long serialVersionUID = 8693617992355444156L;

	/**
	 * 协议签约人员工名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 协议签约人员工号
	 */
	@ApiField("staff_id")
	private String staffId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}
