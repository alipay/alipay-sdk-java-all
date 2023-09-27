package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商机数CRM用户信息上传
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:57:16
 */
public class AlipayMerchantUserUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8845525389825781726L;

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
