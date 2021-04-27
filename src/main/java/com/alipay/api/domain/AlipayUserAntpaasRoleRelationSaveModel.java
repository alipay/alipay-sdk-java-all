package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存账号绑定关系
 *
 * @author auto create
 * @since 1.0, 2020-08-24 20:03:36
 */
public class AlipayUserAntpaasRoleRelationSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5467271312776817456L;

	/**
	 * 需要绑定的支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * true/false，若支付宝用户已被同一userSource下其他外部用户绑定，则自动删除已有关系，仅在opType=enable时有效
	 */
	@ApiField("alipay_user_occupied_auto_delete")
	private Boolean alipayUserOccupiedAutoDelete;

	/**
	 * 可为enable/delete, 表示存储/删除绑定关系
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 外部用户id唯一标识, 例如高德用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * true/false, 默认false, 若用户已被其它支付宝用户绑定，则自动删除已有关系, 仅在opType=enable时有效
	 */
	@ApiField("user_occupied_auto_delete")
	private Boolean userOccupiedAutoDelete;

	/**
	 * 用户来源, 接入时会分配给接入方
	 */
	@ApiField("user_source")
	private String userSource;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getAlipayUserOccupiedAutoDelete() {
		return this.alipayUserOccupiedAutoDelete;
	}
	public void setAlipayUserOccupiedAutoDelete(Boolean alipayUserOccupiedAutoDelete) {
		this.alipayUserOccupiedAutoDelete = alipayUserOccupiedAutoDelete;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getUserOccupiedAutoDelete() {
		return this.userOccupiedAutoDelete;
	}
	public void setUserOccupiedAutoDelete(Boolean userOccupiedAutoDelete) {
		this.userOccupiedAutoDelete = userOccupiedAutoDelete;
	}

	public String getUserSource() {
		return this.userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

}
