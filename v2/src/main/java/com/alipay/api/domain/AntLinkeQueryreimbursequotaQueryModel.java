package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询报销额度列表
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class AntLinkeQueryreimbursequotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5325384778427224244L;

	/**
	 * null
	 */
	@ApiListField("months")
	@ApiField("string")
	private List<String> months;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public List<String> getMonths() {
		return this.months;
	}
	public void setMonths(List<String> months) {
		this.months = months;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
