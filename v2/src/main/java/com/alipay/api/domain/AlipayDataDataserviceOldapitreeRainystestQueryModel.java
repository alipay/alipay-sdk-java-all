package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 老流程创建测试01
 *
 * @author auto create
 * @since 1.0, 2024-12-16 19:23:28
 */
public class AlipayDataDataserviceOldapitreeRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6492778811462544579L;

	/**
	 * 引用复杂类型
	 */
	@ApiField("complex_ref")
	private RainyComplexTypesTheFourth complexRef;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiListField("idjson_open_ids")
	@ApiField("string")
	private List<String> idjsonOpenIds;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("idtype_open_id")
	private String idtypeOpenId;

	/**
	 * 支付宝用户的userId。-- idType
	 */
	@ApiField("idtype_user_id")
	private String idtypeUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id_idtype")
	private String userIdIdtype;

	public RainyComplexTypesTheFourth getComplexRef() {
		return this.complexRef;
	}
	public void setComplexRef(RainyComplexTypesTheFourth complexRef) {
		this.complexRef = complexRef;
	}

	public List<String> getIdjsonOpenIds() {
		return this.idjsonOpenIds;
	}
	public void setIdjsonOpenIds(List<String> idjsonOpenIds) {
		this.idjsonOpenIds = idjsonOpenIds;
	}

	public String getIdtypeOpenId() {
		return this.idtypeOpenId;
	}
	public void setIdtypeOpenId(String idtypeOpenId) {
		this.idtypeOpenId = idtypeOpenId;
	}

	public String getIdtypeUserId() {
		return this.idtypeUserId;
	}
	public void setIdtypeUserId(String idtypeUserId) {
		this.idtypeUserId = idtypeUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdIdtype() {
		return this.userIdIdtype;
	}
	public void setUserIdIdtype(String userIdIdtype) {
		this.userIdIdtype = userIdIdtype;
	}

}
