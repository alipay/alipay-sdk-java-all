package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通进件关系
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:16:32
 */
public class ZftIndirectRelation extends AlipayObject {

	private static final long serialVersionUID = 2791449981154271993L;

	/**
	 * 申请单处理失败时，通过此此段返回具体的失败理由
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 进件申请单中的二级商户openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/**
	 * 进件申请单中的二级商户uid
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/**
	 * 进件状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级商户确认状态
	 */
	@ApiField("sub_confirm")
	private String subConfirm;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRelationOpenid() {
		return this.relationOpenid;
	}
	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}

	public String getRelationUid() {
		return this.relationUid;
	}
	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubConfirm() {
		return this.subConfirm;
	}
	public void setSubConfirm(String subConfirm) {
		this.subConfirm = subConfirm;
	}

}
