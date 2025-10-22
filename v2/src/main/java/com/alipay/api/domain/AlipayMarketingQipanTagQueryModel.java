package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘标签圈选值查询
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:22:39
 */
public class AlipayMarketingQipanTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5195574529957472984L;

	/**
	 * 圈选标签编码
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
