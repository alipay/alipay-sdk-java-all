package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预发03150725
 *
 * @author auto create
 * @since 1.0, 2021-12-21 16:00:17
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7318832573451232836L;

	/**
	 * 省份编码，国标码
	 */
	@ApiListField("province_code")
	@ApiField("string")
	private List<String> provinceCode;

	public List<String> getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(List<String> provinceCode) {
		this.provinceCode = provinceCode;
	}

}
