package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单用户信息
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:45:10
 */
public class UserDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2369744147284758635L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户其他详细信息列表，比如商户或者其他平台的信息。
	 */
	@ApiListField("ext_profile_list")
	@ApiField("user_profile_detail")
	private List<UserProfileDetail> extProfileList;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public List<UserProfileDetail> getExtProfileList() {
		return this.extProfileList;
	}
	public void setExtProfileList(List<UserProfileDetail> extProfileList) {
		this.extProfileList = extProfileList;
	}

}
