package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 摩斯营销用户批量发送
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:53:59
 */
public class AnttechMorseMarketingPayinstUserBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 4796926695278441873L;

	/**
	 * 用户信息列表
	 */
	@ApiListField("user_list")
	@ApiField("pay_inst_user")
	private List<PayInstUser> userList;

	public List<PayInstUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<PayInstUser> userList) {
		this.userList = userList;
	}

}
