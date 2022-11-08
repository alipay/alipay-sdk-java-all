package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部机构账户相关要素
 *
 * @author auto create
 * @since 1.0, 2022-05-20 17:22:19
 */
public class InstAccountElementsDTO extends AlipayObject {

	private static final long serialVersionUID = 1531228952292887738L;

	/**
	 * 请款相关要素
	 */
	@ApiField("advance_elements")
	private AdvanceElementsDTO advanceElements;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 子卡户名
	 */
	@ApiField("sub_account_name")
	private String subAccountName;

	/**
	 * 子户类型
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

	public AdvanceElementsDTO getAdvanceElements() {
		return this.advanceElements;
	}
	public void setAdvanceElements(AdvanceElementsDTO advanceElements) {
		this.advanceElements = advanceElements;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSubAccountName() {
		return this.subAccountName;
	}
	public void setSubAccountName(String subAccountName) {
		this.subAccountName = subAccountName;
	}

	public String getSubAccountType() {
		return this.subAccountType;
	}
	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}

}
