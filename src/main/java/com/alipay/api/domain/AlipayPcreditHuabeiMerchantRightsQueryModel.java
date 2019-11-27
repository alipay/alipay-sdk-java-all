package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询信息
 *
 * @author auto create
 * @since 1.0, 2018-12-24 15:44:36
 */
public class AlipayPcreditHuabeiMerchantRightsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3142951376112861483L;

	/**
	 * 名字
	 */
	@ApiField("aiouniya_name")
	private String aiouniyaName;

	/**
	 * 数字
	 */
	@ApiField("aiouniya_number")
	private String aiouniyaNumber;

	public String getAiouniyaName() {
		return this.aiouniyaName;
	}
	public void setAiouniyaName(String aiouniyaName) {
		this.aiouniyaName = aiouniyaName;
	}

	public String getAiouniyaNumber() {
		return this.aiouniyaNumber;
	}
	public void setAiouniyaNumber(String aiouniyaNumber) {
		this.aiouniyaNumber = aiouniyaNumber;
	}

}
