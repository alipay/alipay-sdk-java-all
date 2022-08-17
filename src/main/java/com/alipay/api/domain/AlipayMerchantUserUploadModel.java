package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商机数CRM用户信息上传
 *
 * @author auto create
 * @since 1.0, 2022-07-14 11:44:58
 */
public class AlipayMerchantUserUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2651242561481536914L;

	/**
	 * 商家用户列表，注意：上传数量不能大于1000
	 */
	@ApiListField("user_list")
	@ApiField("mrch_crm_user")
	private List<MrchCrmUser> userList;

	public List<MrchCrmUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<MrchCrmUser> userList) {
		this.userList = userList;
	}

}
