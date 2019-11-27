package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联用户模型
 *
 * @author auto create
 * @since 1.0, 2017-07-04 14:25:58
 */
public class UserDishRelationDO extends AlipayObject {

	private static final long serialVersionUID = 1474974177116918765L;

	/**
	 * 用户ID行为类型 
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的realtionUserList对象的type 字段
pay : 支付者；
pushOrder : 推送到厨房；
normal : 普通；
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户ID
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口
中上传用户点菜菜单中的realtionUserList对象的userId 字段
	 */
	@ApiField("user_id")
	private String userId;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
