package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 零工扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-12-08 14:33:15
 */
public class CardExtendParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 1639165763567353178L;

	/**
	 * 银行机构id
	 */
	@ApiListField("inst_id")
	@ApiField("string")
	private List<String> instId;

	/**
	 * 银行机构名称
	 */
	@ApiListField("inst_name")
	@ApiField("string")
	private List<String> instName;

	/**
	 * 是否需要开通钱包
	 */
	@ApiField("open_wallet")
	private String openWallet;

	public List<String> getInstId() {
		return this.instId;
	}
	public void setInstId(List<String> instId) {
		this.instId = instId;
	}

	public List<String> getInstName() {
		return this.instName;
	}
	public void setInstName(List<String> instName) {
		this.instName = instName;
	}

	public String getOpenWallet() {
		return this.openWallet;
	}
	public void setOpenWallet(String openWallet) {
		this.openWallet = openWallet;
	}

}
