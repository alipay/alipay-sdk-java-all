package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工新增或更新接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:07:32
 */
public class AlipayCommercePropertyStaffSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4149999528953166212L;

	/**
	 * 执行动作
新增：ADD
更新：UPDATE
	 */
	@ApiField("action")
	private String action;

	/**
	 * null
	 */
	@ApiListField("list")
	@ApiField("staff_info_v_o")
	private List<StaffInfoVO> list;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<StaffInfoVO> getList() {
		return this.list;
	}
	public void setList(List<StaffInfoVO> list) {
		this.list = list;
	}

}
