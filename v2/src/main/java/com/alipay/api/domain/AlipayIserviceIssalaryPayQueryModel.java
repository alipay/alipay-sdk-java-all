package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询小二发薪结果
 *
 * @author auto create
 * @since 1.0, 2025-09-23 15:16:34
 */
public class AlipayIserviceIssalaryPayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2326753944252788463L;

	/**
	 * 小二薪酬编号列表, user_bill_no的列表
	 */
	@ApiListField("user_bill_no_list")
	@ApiField("string")
	private List<String> userBillNoList;

	public List<String> getUserBillNoList() {
		return this.userBillNoList;
	}
	public void setUserBillNoList(List<String> userBillNoList) {
		this.userBillNoList = userBillNoList;
	}

}
