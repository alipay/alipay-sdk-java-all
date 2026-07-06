package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 删除医生端首页缓存
 *
 * @author auto create
 * @since 1.0, 2026-06-15 16:47:56
 */
public class AlipayCommerceMedicalDoctorgwHomecacheDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6593937184656579854L;

	/**
	 * 是否删除全部模块缓存
	 */
	@ApiField("delete_all")
	private Boolean deleteAll;

	/**
	 * null
	 */
	@ApiListField("module_codes")
	@ApiField("string")
	private List<String> moduleCodes;

	/**
	 * 外部业务唯一id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务唯一id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 外部用户类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	public Boolean getDeleteAll() {
		return this.deleteAll;
	}
	public void setDeleteAll(Boolean deleteAll) {
		this.deleteAll = deleteAll;
	}

	public List<String> getModuleCodes() {
		return this.moduleCodes;
	}
	public void setModuleCodes(List<String> moduleCodes) {
		this.moduleCodes = moduleCodes;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

}
