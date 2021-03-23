package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.groupshopping.newbie.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserGroupshoppingNewbieQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6673334273216896196L;

	/** 
	 * 是否可参与一元团
	 */
	@ApiField("access")
	private Boolean access;

	/** 
	 * 输出的文案信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 当前用户状态，未被邀请，未绑定手机号等
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 返回传入用户下的user_id列表，查询整个列表中的user_id是否有一元拼的记录。
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
