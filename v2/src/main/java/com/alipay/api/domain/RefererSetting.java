package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * refer配置
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:18:14
 */
public class RefererSetting extends AlipayObject {

	private static final long serialVersionUID = 2781427349741163143L;

	/**
	 * 是否开启配置
	 */
	@ApiField("enabled")
	private Boolean enabled;

	/**
	 * 是否允许空refer
	 */
	@ApiField("no_refer_access")
	private Boolean noReferAccess;

	/**
	 * refer配置列表
	 */
	@ApiListField("refer_list")
	@ApiField("string")
	private List<String> referList;

	/**
	 * refer类型
	 */
	@ApiField("refer_type")
	private String referType;

	public Boolean getEnabled() {
		return this.enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getNoReferAccess() {
		return this.noReferAccess;
	}
	public void setNoReferAccess(Boolean noReferAccess) {
		this.noReferAccess = noReferAccess;
	}

	public List<String> getReferList() {
		return this.referList;
	}
	public void setReferList(List<String> referList) {
		this.referList = referList;
	}

	public String getReferType() {
		return this.referType;
	}
	public void setReferType(String referType) {
		this.referType = referType;
	}

}
