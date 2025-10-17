package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灰黑产人群中删除用户
 *
 * @author auto create
 * @since 1.0, 2025-02-24 10:54:56
 */
public class AlipayMerchantQipanGreyblackcrowduserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8665372821456343928L;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群包中需剔除的用户列表 单次上传用户数上限为1000，若用户量过大可分批上传
	 */
	@ApiListField("user_list")
	@ApiField("qipan_grey_black_crowd_user")
	private List<QipanGreyBlackCrowdUser> userList;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public List<QipanGreyBlackCrowdUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<QipanGreyBlackCrowdUser> userList) {
		this.userList = userList;
	}

}
