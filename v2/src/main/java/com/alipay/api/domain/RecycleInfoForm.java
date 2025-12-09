package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收账号信息
 *
 * @author auto create
 * @since 1.0, 2025-11-28 14:44:08
 */
public class RecycleInfoForm extends AlipayObject {

	private static final long serialVersionUID = 8819619224436988686L;

	/**
	 * 回收账号设置，一旦设定，后续逆向退款的资金流向该账号
	 */
	@ApiField("recycle_memo")
	private String recycleMemo;

	/**
	 * 回收账号UID
	 */
	@ApiField("recycle_user_id")
	private String recycleUserId;

	public String getRecycleMemo() {
		return this.recycleMemo;
	}
	public void setRecycleMemo(String recycleMemo) {
		this.recycleMemo = recycleMemo;
	}

	public String getRecycleUserId() {
		return this.recycleUserId;
	}
	public void setRecycleUserId(String recycleUserId) {
		this.recycleUserId = recycleUserId;
	}

}
