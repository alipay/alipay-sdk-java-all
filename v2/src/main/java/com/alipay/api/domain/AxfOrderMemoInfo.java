package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单备注信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:17:39
 */
public class AxfOrderMemoInfo extends AlipayObject {

	private static final long serialVersionUID = 7736731956413693382L;

	/**
	 * 销售人员姓名
	 */
	@ApiField("bd_name")
	private String bdName;

	/**
	 * 其他备注
	 */
	@ApiField("other_memo")
	private String otherMemo;

	public String getBdName() {
		return this.bdName;
	}
	public void setBdName(String bdName) {
		this.bdName = bdName;
	}

	public String getOtherMemo() {
		return this.otherMemo;
	}
	public void setOtherMemo(String otherMemo) {
		this.otherMemo = otherMemo;
	}

}
